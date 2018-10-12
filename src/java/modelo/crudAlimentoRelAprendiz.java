/*
 * CRUD-ALIMENTO-REL-APRENDIZ
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
public class crudAlimentoRelAprendiz {
    
    //CONEXION BD
    conexion con=new conexion(); 
    Connection cnn=con.conexiondb();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    
    //METODO GUARDAR-ingresodatos
    public void guardarAlimentorelapr(Alimento_rel_AprendizSG ing){
        try {
            ps=cnn.prepareStatement("INSERT INTO alimentacion_relacion_aprendiz VALUES(?,?,?,?,?,?)");
            ps.setInt(1,ing.getApid());
            ps.setInt(2,ing.getAptipo());
            ps.setInt(3,ing.getAprdoc());
            ps.setString(4,ing.getApfecha());
            ps.setString(5,ing.getApestado());
            ps.setInt(6,ing.getApconteo());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos insertados");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No fueron insertados desde crud alimentacion relacion aprendiz"+e);
        }
    }
    
    
    //METODO MODIFICAR
    public int actualizar_alimentorelapr(Alimento_rel_AprendizSG ing){
        
        int dat=0;

        try {
            ps=cnn.prepareStatement("UPDATE alimentacion_relacion_aprendiz SET  Alimentacion_Ali_tipo='"+ing.getAptipo()+"', Ali_Aprendiz_Apr_documento='"+ing.getAprdoc()+"', Ali_Apr_Fecha='"+ing.getApfecha()+"', Ali_Apr_Estado='"+ing.getApestado()+"' , Ali_Apr_ConteoxTipoxGeneral='"+ing.getApconteo()+"'  WHERE Ali_Apr_Consecutivo_ID='"+ing.getApid()+"' ");
            dat=ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error!!" +e);
        }
        
        return dat;
    
    }
    
    
    
    //ELIMINAR
    public int eliminar_alimentorelapr(Alimento_rel_AprendizSG ing){
        int delete=0;

        try {
            ps=cnn.prepareStatement("DELETE FROM alimentacion_relacion_aprendiz WHERE Ali_Apr_Consecutivo_ID='"+ing.getApid()+"' ");
            delete = ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos eliminados");
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error!!" +e);
        }
        
        return delete;
    
    }
      
}
