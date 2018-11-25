/*
 * CRUD-USUARIO
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
public class crudUsuario {
    
    //CONEXION BD
    conexion con=new conexion(); 
    Connection cnn=con.conexiondb();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    //METODO GUARDAR-ingresodatos
    public void guardar_usuario(usuarioSG ing){
        try {
            ps=cnn.prepareStatement("INSERT INTO usuario VALUES(?,?,?,?,?,?,?,?)");
            ps.setInt(1,ing.getUsudoc());
            ps.setString(2,ing.getUsunom());
            ps.setString(3,ing.getUsuape());
            ps.setInt(4,ing.getUsucel());
            ps.setString(5,ing.getUsuemail());
            ps.setString(6,ing.getUsufoto());
            ps.setString(7,ing.getUsuclave());
            ps.setString(8,ing.getUsurol());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos insertados");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No fueron insertados los datos" +e);
        }
    }
    
    
    
    //METODO MODIFICAR
    public int modificar_usuario(usuarioSG ing){
        int dat=0;

        try {
            ps=cnn.prepareStatement("UPDATE usuario SET usu_documento='"+ing.getUsudoc()+"',  usu_nombre='"+ing.getUsunom()+"', usu_apellido='"+ing.getUsuape()+"', usu_celular='"+ing.getUsucel()+"', usu_email='"+ing.getUsuemail()+"', usu_foto='"+ing.getUsufoto()+"', usu_password='"+ing.getUsuclave()+"', usu_tipo='"+ing.getUsurol()+"'  WHERE usu_documento='"+ing.getUsudoc()+"' ");
            dat=ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Aca hay un bug Error!! " +e);
        }
        
        return dat;
    }
    
    
    
    
    //METODO ELIMINAR 
    public int eliminar_usuario(usuarioSG ing){
        int dat=0;

        try {
            ps=cnn.prepareStatement("DELETE FROM usuario WHERE usu_documento=? ");
            ps.setInt(1,ing.getUsudoc());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos eliminados");
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error!!" +e);
        }
        
        return dat;
    
    }
    
    

    
    
}
