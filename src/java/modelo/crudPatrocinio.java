
package modelo;

import controlador.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Aldair
 */
public class crudPatrocinio {
    conexion con=new conexion();
    Connection cnn=con.conexiondb();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    //GUARDAR REGISTRO PATROCINIO
    
    public void guardar_patrocinio(patrocinioSG ing){
        try{          
            ps=cnn.prepareStatement("INSERT INTO patrocinio VALUES (?,?)");   
            ps.setInt(1, ing.getPat_ID());
            ps.setString(2, ing.getPat_nombreEmpresa());               
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro realizado");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"no se pudo desde crud patrocinio " +e );
        }
    }
    
    
    //ACTUALIZAR REGISTRO PATROCINIO
    
    public int actualizar_patrocinio(patrocinioSG ing){
        try {
            ps=cnn.prepareStatement("UPDATE patrocinio SET Pat_ID='"+ing.getPat_ID()+"', Pat_nombreEmpresa= '"+ing.getPat_nombreEmpresa()+"' WHERE   Pat_ID='"+ing.getPat_ID()+"' ");
            ps.executeUpdate();           
            JOptionPane.showMessageDialog(null,"Registro actualizado");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"no se pudo actualizar desde crud patrocinio " +e);
        }
        return 0;       
    } 
    
    //ELIMINAR REGISTRO PATROCINIO
    
    public int eliminar_patrocinio(patrocinioSG ing){
        try {
            ps=cnn.prepareStatement("DELETE FROM patrocinio WHERE Pat_ID=?");
            ps.setInt(1, ing.getPat_ID());
            ps.executeUpdate();           
            JOptionPane.showMessageDialog(null,"Registro eliminado");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"no se pudo eliminar desde crud patrocinio"+e);
        }
        return 0;
    }
    
}


 