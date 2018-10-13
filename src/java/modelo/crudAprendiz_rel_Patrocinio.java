
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
public class crudAprendiz_rel_Patrocinio {
    conexion con = new conexion();
    Connection cnn = con.conexiondb();
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    //GUARDAR REGISTRO APRENDIZ-REL-PATROCINIO
    public void guardarAprendiz_rel_Patrocinio(aprendiz_rel_patrocinioSG ing){
        try {
            ps=cnn.prepareStatement("INSERT INTO patrocinio_relacion_aprendiz VALUES (?,?,?,?,?)");
            
            ps.setInt(1,ing.getPatrocinio_Pat_ID());
            ps.setInt(2,ing.getPat_Aprendiz_Apr_documento());
            ps.setInt(3, ing.getPat_numeroContrato());
            ps.setString(4, ing.getPat_estado());
            ps.setString(5, ing.getPat_fechaContrato());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro realizado");
         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"no se pudo desde crud rel" +e);
        }
    }
    
    
    
    //METODO MODIFICAR
    public int actualizarAprendiz_rel_Patrocinio(aprendiz_rel_patrocinioSG ing){
        
        int dat=0;

        try {
            ps=cnn.prepareStatement("UPDATE  patrocinio_relacion_aprendiz  SET  Pat_numeroContrato='"+ing.getPat_numeroContrato()+"', Pat_estado='"+ing.getPat_estado()+"', Pat_fechaContrato='"+ing.getPat_fechaContrato()+"' WHERE Patrocinio_Pat_ID='"+ing.getPatrocinio_Pat_ID()+"' AND  pat_Aprendiz_Apr_documento='"+ing.getPat_Aprendiz_Apr_documento()+"' " );
            dat=ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos actualizados");
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error!!" +e);
        }
        
        return dat;
    
    }
    
    
    
    
    //ELIMINAR
    public int eliminarAprendiz_rel_Patrocinio (aprendiz_rel_patrocinioSG ing){
        try {
            //ps=cnn.prepareStatement("DELETE FROM  patrocinio_relacion_aprendiz WHERE pat_Aprendiz_Apr_documento=?");
            ps=cnn.prepareStatement("DELETE FROM patrocinio_relacion_aprendiz WHERE Patrocinio_Pat_ID=? ");
            ps.setInt(1, ing.getPatrocinio_Pat_ID());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Registro eliminado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"no se elimino   " +e);
        }
        return 0;
    }
}
