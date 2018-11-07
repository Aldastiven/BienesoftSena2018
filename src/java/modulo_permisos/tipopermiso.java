
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
import modelo.permisoSG;

/**
 *
 * @author Stefany
 */
public class tipopermiso {
    
    conexion con=new conexion();
    Connection cnn=con.conexiondb();
    PreparedStatement ps= null;
    ResultSet rs=null;
    
    
    
    //METODO SEMANA
    public boolean metodo_semana(String horaReal, String tipoPermiso ){
        
        String horario[] = horaReal.split(":");
        int hora = Integer.parseInt(horario[0]);
        int minutos = Integer.parseInt(horario[1]);
        
        if(tipoPermiso.equals("semana morning")){
            if( (hora >= 8 && hora < 11)) return true;
            if(hora==11 && minutos <= 10) return true;
        } else if(tipoPermiso.equals("semana tarde")) {
            if( (hora >= 14 && hora < 17)) return true;
            if(hora==17 && minutos <= 10) return true;
        }
      return false;
    }
    
    
    //METODO DE INSERCCION DE fechaReal horaReal AL MOMENTO DE LA ACCION
    public boolean metodo_insertpersemana(int id, String fechaReal,String horaReal, String campo1, String campo2){
        
        if(fechaReal.equals(fechaReal) && horaReal.equals(horaReal) ){
            //FECHA Y HORA DE SALIDA para poder salir del cba
            try {
                ps = cnn.prepareStatement("UPDATE permiso SET "+campo1+"='"+fechaReal+"' , "+campo2+"='"+horaReal+"'"+
                        " WHERE per_ID='"+id+"' ");

               ps.executeUpdate();
  
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Error, verifica este bug "+e);
            }
        
        
            return true;

        }
        
        
        
        return false;
        
    }
    
    
    
    //METODO FIN DE SEMANA
    public boolean metodo_finsemana(String fechaReal, String horaReal){
        
        Calendar calendario=Calendar.getInstance();
        
        int dia, mes, ano;
        //OBTENIENDO DATOS
        dia = calendario.get(Calendar.DAY_OF_WEEK);
        
        String FR[] = fechaReal.split("-"); 
        
        //Matriz con fila de mes y fila dias festivos
         //mes y dias festivos colombia
        int[][] festivos = {
            {1, 1, 8},//enero 
            {3, 19, 29, 30},//marzo 
            {5, 1, 14},//mayo
            {6, 4, 11},//junio
            {7, 2, 20},//julio
            {8, 7, 20},//agosto
            {10, 15},//octubre
            {11, 5, 12},//noviembre
            {12, 8, 25},//diciembre
        };
        
        //DIA: dias de salida del aprendiz
        int d= Integer.parseInt(FR[2]);
        if(dia==4){//dia jueves
            d+=4;//aumenta 4 dias
        }else if(dia==6){//dia viernes
            d+=3;
        }else if(dia==7){//dia sabado
            d+=2;
        }
        JOptionPane.showConfirmDialog(null,d);
        //MES: subindice
        int m= Integer.parseInt(FR[1]);
        //Ciclo
        for(int i=0; i<festivos.length; i++){
            for(int j=0; j<festivos[i].length; j++){
                JOptionPane.showMessageDialog(null, "Colombia: "+festivos[i][j]);
            }
        }

        
        
//        if(dia==Calendar.SUNDAY){
//            JOptionPane.showMessageDialog(null, "Domingo");
//        }
//        if(dia==Calendar.MONDAY){
//            JOptionPane.showMessageDialog(null, "Lunes");
//        }
//        if(dia==Calendar.TUESDAY){
//            JOptionPane.showMessageDialog(null, "Martes" );
//        }
//        if(dia==Calendar.WEDNESDAY){
//            JOptionPane.showMessageDialog(null, "Miercoles");
//        }
//        if(dia==Calendar.THURSDAY){
//            JOptionPane.showMessageDialog(null, "Jueves" );
//        }
//        if(dia==Calendar.FRIDAY){
//            JOptionPane.showMessageDialog(null, "Viernes" );
//        }
//        if(dia==Calendar.SATURDAY){
//            JOptionPane.showMessageDialog(null, "Sabado" );
//        }
        
//        if(fechaInApr.equals(fechaTotal)  &&  dia==Calendar.SUNDAY){
//            JOptionPane.showMessageDialog(null, "Domingo");
//        }
//        if(fechaInApr.equals(fechaTotal)  &&  dia==Calendar.MONDAY){
//            JOptionPane.showMessageDialog(null, "Lunes");
//        }
//        if(fechaInApr.equals(fechaTotal)  &&  dia==Calendar.TUESDAY){
//            JOptionPane.showMessageDialog(null, "Martes" );
//        }
//        if(fechaInApr.equals(fechaTotal)  &&  dia==Calendar.WEDNESDAY){
//            JOptionPane.showMessageDialog(null, "Miercoles" );
//        }
//        if(fechaInApr.equals(fechaTotal)  &&  dia==Calendar.THURSDAY){
//            JOptionPane.showMessageDialog(null, "Jueves" );
//        }
//        if(fechaInApr.equals(fechaTotal)  &&  dia==Calendar.FRIDAY){
//            JOptionPane.showMessageDialog(null, "Viernes" );
//        }
//        if(fechaInApr.equals(fechaTotal)  &&  dia==Calendar.SATURDAY){
//            JOptionPane.showMessageDialog(null, "Sabado" );
//        }
        
        return false;
      
    }
    
    
    
    
    
    
    
    
    
    

    
    
    

    
    
    
    
    
    
    
    
    

}
