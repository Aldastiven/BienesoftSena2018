package modulo_permisos;
import com.mysql.jdbc.Connection;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import javax.websocket.SendResult;
import modelo.aprendizSG;
import modelo.consultas;
import modelo.crudPermisos;
import modelo.festivoSG;
import modelo.permisoSG;

public class tipopermiso {
    conexion con=new conexion();
    Connection cnn=con.conexiondb();
    PreparedStatement ps= null;
    ResultSet rs=null;    
    
    //METODO SEMANA-->MANEJANDO HORAS GENERALES DE RESTRICCION PARA TODOS LOS PERMISOS
    public boolean metodo_semana(String horaReal,String tipoPermiso ){
        
        String horario[] = horaReal.split(":");
        int hora = Integer.parseInt(horario[0]);
        int minutos = Integer.parseInt(horario[1]);
        
        if(tipoPermiso.equals("semana morning")){
            if( (hora >= 8 && hora < 11)) return true;
            if(hora==11 && minutos <= 10) return true;
        } else if(tipoPermiso.equals("semana tarde")) {
            if( (hora >= 14 && hora < 17)) return true;
            if(hora==17 && minutos <= 10) return true;
            
        } else if(tipoPermiso.equals("fin de semana")) {
            Calendar calendario=Calendar.getInstance();
            int dia = calendario.get(Calendar.DAY_OF_WEEK);
            
            if( (dia==5) || (dia==6)){//dia jueves y viernes 
                if( (hora >= 8 && hora < 18)) return true;
                if(hora==18 && minutos <= 10) return true;
            }else if(dia==7){//dia sabado
                if( (hora >= 6 && hora < 14)) return true;
                if(hora==14 && minutos <= 10) return true;
                
            } else if(dia==1){//dia domingo
                if( (hora >= 14 && hora < 18)) return true;
                if(hora==18 && minutos <= 10) return true;
            }
        }
      return false;
    }
    
    
    //METODO DE INSERCCION DE fechaReal horaReal AL MOMENTO DE LA ACCION
    public boolean metodo_insertpersemana(int id, String fechaReal,String horaReal, String campo1, String campo2){
        
        if(fechaReal.equals(fechaReal) && horaReal.equals(horaReal) ){
            //FECHA Y HORA DE SALIDA para poder salir y al entrar del cba
            try {
                ps = cnn.prepareStatement("UPDATE permiso SET "+campo1+"='"+fechaReal+"' , "+campo2+"='"+horaReal+"'"+
                        " WHERE per_ID='"+id+"' ");
                ps.executeUpdate();               
                JOptionPane.showMessageDialog(null, "se esta actualizado el permiso");  
                
                //Instancia de Fechas y Horas Reales
                crudPermisos cr = new crudPermisos();
                cr.consulta_fecha_hora_ingreso_real(id);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, verifica este bug "+e);
            }        
            return true;
        }
        return false;
        
    }
    
    
    private String fechaDomingo="";
    //METODO FIN DE SEMANA
    public String metodo_finsemana(String fechaReal, String horaReal){
        String FechaEstiFinal="";
        
        //DETERMINAR FECHA DE INGRESO ESTIPULADA
        String fechaLunes = cambiosDeMesAnio(fechaReal);
        JOptionPane.showMessageDialog(null,"Fecha Lunes: "+fechaLunes);
        
        //COMPARAR FECHALUNES CON LAS FECHAS DESTIVAS DE LA BD
        consultas con = new consultas();
        boolean festivo = con.compararFechaLunes(fechaLunes);
        
        //Si retrona TRUE significa que si es festivo y se toma FechaLunes como fecha de ingreso estipulada
        //Si retrona FALSE significa que NO es festivo y se toma FechaDomingo como fecha de ingreso estipulada
        if(festivo) FechaEstiFinal =  fechaLunes;
        else FechaEstiFinal =  fechaDomingo;
        
        JOptionPane.showMessageDialog(null,"Fecha Estipulada de ingreso: "+FechaEstiFinal);
        return FechaEstiFinal;
    }
    
    public String cambiosDeMesAnio(String fechaReal){
        Calendar calendario=Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_WEEK);
        
        String FR[] = fechaReal.split("-");
        
        int a = Integer.parseInt(FR[0]);
        int m = Integer.parseInt(FR[1]);
        int d = Integer.parseInt(FR[2]);
        
        int anioEsti=a, mesEsti=m, diaEsti=d,diaSum=0;
        //SUMAR DÍAS HASTA EL LUNES (PARA SABER SI ES FESTIVO)
        
        if(dia==5) diaSum = 4; //dia jueves
        else if(dia==6) diaSum=3; //dia viernes
        else if(dia==7) diaSum=2; //dia sabado
        
        //Ciclo para aumentar día por día y saber si cambiael mes
        for(int i=1; i<=diaSum; i++) {
            diaEsti+=1;
            String diaMes = limitedeMes(a,mesEsti,diaEsti);
            String est[] = diaMes.split("-");
            mesEsti = Integer.parseInt(est[0]);
            diaEsti = Integer.parseInt(est[1]);
            
            if(diaSum == diaSum-1) fechaDomingo = a+"-"+mesEsti+"-"+diaEsti;
        }
        
        //OBTENER FECHA DEL LUNES
        String fechaLunes = a+"-"+mesEsti+"-"+diaEsti;
        
        return fechaLunes;
    }
    
    public String limitedeMes (int a,int mesEsti, int diaEsti){
    
        if((mesEsti == 1 || mesEsti == 3 || mesEsti == 5 || mesEsti == 7 
                || mesEsti == 8 || mesEsti == 10 || mesEsti == 12) && diaEsti > 31) {
            mesEsti+= 1; diaEsti=1;
        } else if((mesEsti == 4 || mesEsti == 6 || mesEsti == 9 || mesEsti == 11) && diaEsti > 30) {
            mesEsti+= 1; diaEsti=1;
        }else if(mesEsti == 2){
            //Calcular año bisiesto
            int diaFeb=28;
            if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))
                diaFeb=29;
            if(diaEsti>diaFeb) mesEsti+= 1; diaEsti=1;
        }
        
        String diaMes = mesEsti+"-"+diaEsti;
        return diaMes;
    }
}
