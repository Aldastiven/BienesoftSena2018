
package modelo;

import controlador.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class crudPermisos {
 
    conexion con=new conexion();
    Connection cnn=con.conexiondb();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    //GUARDAR 
    public void guardar_permiso(permisoSG ing){
        try{          
            ps=cnn.prepareStatement("INSERT INTO permiso VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");   
            ps.setInt(1, ing.getPer_ID());
            ps.setInt(2, ing.getPer_Aprendiz_Apr_documento());
            ps.setString(3, ing.getPer_tipo());
            ps.setString(4, ing.getPer_fecha_salida());
            ps.setString(5, null);
            ps.setString(6, ing.getPer_hora_Salida());
            ps.setString(7, ing.getPer_hora_ingreso());
            ps.setString(8, null);
            ps.setString(9, null);
            ps.setString(10,null);
            ps.setString(11,null);
            ps.setString(12, ing.getPer_observacion_permiso_llegada());
            ps.setString(13, ing.getPer_motivo());
            ps.setString(14, ing.getPer_estado());
            ps.setString(15, ing.getPer_autoriza());
            ps.setString(16, ing.getPer_evidenciaAdjunta());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro realizado");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"no se pudo desde crud permiso " +e );
        }
    }
    
    
    //ACTUALIZAR 
    public int actualizar_permiso(permisoSG ing){
        try {
            ps=cnn.prepareStatement("UPDATE permiso SET per_Aprendiz_Apr_documento= '"+ing.getPer_Aprendiz_Apr_documento()+"', per_tipo= '"+ing.getPer_tipo()+"', per_fecha_salida= '"+ing.getPer_fecha_salida()+"', per_fecha_ingreso= '"+ing.getPer_fecha_ingreso()+"', per_hora_Salida= '"+ing.getPer_hora_Salida()+"', per_hora_ingreso= '"+ing.getPer_hora_ingreso()+"', per_motivo= '"+ing.getPer_motivo()+"', per_estado= '"+ing.getPer_estado()+"', per_autoriza= '"+ing.getPer_autoriza()+"', per_evidenciaAdjunta= '"+ing.getPer_evidenciaAdjunta()+"' WHERE   per_Aprendiz_Apr_documento= '"+ing.getPer_Aprendiz_Apr_documento()+"' ");
            ps.executeUpdate();           
            JOptionPane.showMessageDialog(null,"Registro actualizado");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"no se pudo actualizar desde crud permiso " +e);
        }
        return 0;       
    } 
    
    
    
    //ELIMINAR 
   /* public int eliminar_permiso(permisoSG ing){
        
        int x=0;
        
        try {
            ps=cnn.prepareStatement("DELETE FROM permiso WHERE  per_ID=?");
            ps.setInt(1,ing.getPer_ID());        
            x=ps.executeUpdate();          
            JOptionPane.showMessageDialog(null,"Registro eliminado");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"NO se pudo eliminar desde crud permisos "+e);
        }
        return x;
    }*/

    
    public int eliminar_permiso(permisoSG ing){
                try {
                    ps=cnn.prepareStatement("DELETE FROM permiso WHERE per_ID=?");
                    ps.setInt(1,ing.getPer_ID());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Registro eliminado");
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"no se pudo eliminar desde el crud" +e);
                }
        return 0;
            }
    
   
    
}
   

