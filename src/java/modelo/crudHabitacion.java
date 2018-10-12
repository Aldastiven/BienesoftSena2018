/*
 * CRUD-HABITACION
 */
package modelo;

import com.mysql.jdbc.Connection;
import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Stefany
 */
public class crudHabitacion {
    
    //CONEXION BD
    conexion con=new conexion(); 
    Connection cnn=con.conexiondb();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    
    //METODO GUARDAR-ingresodatos
    public void guardar_habitacion(habitacionSG ing){
        try {
            ps=cnn.prepareStatement("INSERT INTO habitacion VALUES(?,?,?,?)");
            ps.setInt(1,ing.getNumeroHabitacion());
            ps.setInt(2,ing.getHab_camasTotal());
            ps.setInt(3,ing.getHab_camasDisponibles());
            ps.setString(4,ing.getHab_generoHabitacion());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos insertados de habitacion");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No fueron insertados los datos");
        }
    }
    
    
    
    //METODO MODIFICAR
    public int modificar_habitacion(habitacionSG ing){
        
        int dat=0;

        try {
            ps=cnn.prepareStatement("UPDATE habitacion SET Hab_camasTotal='"+ing.getHab_camasTotal()+"', Hab_camasDisponibles='"+ing.getHab_camasDisponibles()+"', Hab_generoHabitacion='"+ing.getHab_generoHabitacion()+"'  WHERE Hab_numeroHabitacion ='"+ing.getNumeroHabitacion()+"' ");
            dat=ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos actualizados");
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error!!" +e);
        }
        
        return dat;
    
    }
    
    
    
    
    //ELIMINAR HABITACION
    public int eliminar_habitacion(habitacionSG ing){
        int dat=0;

        try {
            ps=cnn.prepareStatement("DELETE FROM habitacion WHERE Hab_numeroHabitacion=? ");
            ps.setInt(1,ing.getNumeroHabitacion());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos eliminados");
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error!!" +e);
        }
        
        return dat;
    
    }
    
    
    
    
    
    
    
    
    
    
    
}
