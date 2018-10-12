/*
 * CRUD-ALIMENTACION
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
public class crudAlimentacion {
    
    //CONEXION BD
    conexion con=new conexion(); 
    Connection cnn=con.conexiondb();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    
    //METODO GUARDAR-ingresodatos
    public void guardar_alimentacion(alimentacionSG ing){
        try {
            ps=cnn.prepareStatement("INSERT INTO alimentacion VALUES(?,?,?)");
            ps.setInt(1,ing.getId());
            ps.setInt(2,ing.getTipo());
            ps.setString(3,ing.getDescrip());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos insertados");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No fueron insertados los datos");
        }
    }
    
    
    //METODO MODIFICAR
    public int modificar_alimentacion(alimentacionSG ing){
        
        int dat=0;

        try {
            ps=cnn.prepareStatement("UPDATE alimentacion SET Ali_ID='"+ing.getId()+"' , Ali_tipo='"+ing.getTipo()+"', Ali_descripcion='"+ing.getDescrip()+"'  WHERE Ali_ID ='"+ing.getId()+"' ");
            dat=ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error!!" +e);
        }
        
        return dat;
    
    }
    
    
    
    //METODO ELIMINAR 
    public int eliminar_alimentacion(alimentacionSG ing){
        int dat=0;

        try {
            ps=cnn.prepareStatement("DELETE FROM alimentacion WHERE Ali_ID=? ");
            ps.setInt(1,ing.getId());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos eliminados");
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error!!" +e);
        }
        
        return dat;
    
    }
    
    
    
    
    
}
