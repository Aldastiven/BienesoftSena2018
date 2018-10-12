/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class crudEmergencia {
   conexion con=new conexion();
    Connection cnn=con.conexiondb();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    
    public void guardar_emergencia(emergenciaSG ing){
        try{
           ps=cnn.prepareStatement("INSERT INTO salidaemergencia VALUES(?,?,?,?,?,?,?,?,?,?)");
           
           ps.setInt(1,ing.getSal_ID());
           ps.setInt(2,ing.getSal_Aprendiz_Apr_documento()); 
           ps.setString(3,ing.getSal_motivoEmergente());
           ps.setString(4,ing.getSal_fechaSalida());
           ps.setString(5,ing.getSal_fechaIngreso());
           ps.setString(6,ing.getSal_horaSalida());
           ps.setString(7,ing.getSal_horaIngreso());
           ps.setInt(8,ing.getSal_documentoAcompaniante());
           ps.setString(9,ing.getSal_autoriza());
           ps.setString(10,ing.getSal_evidenciaAdjunta());
          
           ps.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Registro Realizado");
                        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Los datos no fueron Ingresados desde crudEmergencia ");
        }
    }
    
    
    
    //METODO ACTUALIZAR
    public int actualizar_emergencia(emergenciaSG ing) {
    
        try {
        ps=cnn.prepareStatement("UPDATE salidaemergencia SET sal_ID =' " +ing.getSal_ID()+ " ' , Sal_Aprendiz_Apr_documento = ' " +ing.getSal_Aprendiz_Apr_documento()+ " ' ,  sal_motivoEmergente =' "+ing.getSal_motivoEmergente()+ " ',  sal_fechaEmergencia_salida =' "+ing.getSal_fechaSalida()+" ',  sal_fechaEmergencia_ingreso =' "+ing.getSal_fechaIngreso()+" ', sal_HoraEmergencia_salida =' " +ing.getSal_horaSalida()+ " '  , sal_HoraEmergencia_ingreso =' " +ing.getSal_horaIngreso()+ " '  ,  sal_documentoAcompaniante=' "+ing.getSal_documentoAcompaniante()+" ',  sal_autoriza=' "+ing.getSal_autoriza()+" ',  Sal_evidenciaAdjunta=' "+ing.getSal_evidenciaAdjunta()+" ' WHERE sal_ID=' " +ing.getSal_ID()+ "'");
           ps.executeUpdate(); 
           JOptionPane.showMessageDialog(null, "Datos actualizados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Los datos no fueron actualizados desde crudEmergencia" +e);
        }
        return 0;
}
    
    
    //METODO ELIMINAR
        public int eliminar_emergencia(emergenciaSG ing) {
    
        try {
           ps=cnn.prepareStatement("DELETE FROM salidaemergencia WHERE sal_ID =?");
           ps.setInt(1,ing.getSal_ID());
           ps.executeUpdate(); 
           JOptionPane.showMessageDialog(null, "Datos eliminados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Los datos no fueron eliminados desde crudEmergencia" +e);
        }
        return 0;
} 
}
