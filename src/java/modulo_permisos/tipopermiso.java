
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
//    public boolean metodo_finsemana(String fechaReal, String horaReal, String tipoPermiso){
//        
//        String pfinsemana="";
//        JOptionPane.showMessageDialog(null,"metodo fin de semana, ENTRO A metodo FIN DE SEMANA");
//        
//        return pfinsemana;
//        
//      
//    }
    
    
    
    
    
    
    
    
    
    

    
    
    

    
    
    
    
    
    
    
    
    

}
