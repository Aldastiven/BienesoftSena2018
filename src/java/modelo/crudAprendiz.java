
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
public class crudAprendiz {
    conexion con = new conexion();
    Connection cnn = con.conexiondb();
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    //GUARDAR REGISTRO APRENDIZ
    
    public void guardar_aprendiz(aprendizSG ing){
        try {
            ps=cnn.prepareStatement("INSERT INTO aprendiz VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            ps.setInt(1, ing.getApr_documento());
            ps.setString(2, ing.getApr_documentoTipo());
            ps.setString(3,ing.getApr_nombres());
            ps.setString(4,ing.getApr_apellidos());
            ps.setString(5,ing.getApr_fechaNacimiento());
            ps.setInt(6,ing.getApr_edad());
            ps.setString(7,ing.getApr_sexo());
            ps.setString(8, ing.getApr_celular());
            ps.setString(9,ing.getApr_eps());
            ps.setString(10, ing.getApr_rh());
            ps.setString(11, ing.getApr_tipoAprendiz());
            ps.setString(12, ing.getApr_nombrePadre());
            ps.setString(13,ing.getApr_telefonoPadre());
            ps.setString(14,ing.getApr_nombreMadre());
            ps.setString(15, ing.getApr_telefonoMadre());
            ps.setString(16, ing.getApr_departamento());
            ps.setString(17,ing.getApr_ciudad());
            ps.setString(18,ing.getApr_barrio());
            ps.setString(19,ing.getApr_direccion());
            ps.setString(20, ing.getApr_antecedente_medico());
            ps.setString(21,ing.getApr_email());
            ps.setString(22,ing.getApr_hojaDeVida());
            ps.setString(23,ing.getApr_actaCompromiso());
            ps.setInt(24,ing.getApr_llamadosDeAtencion());
            ps.setInt(25,ing.getApr_numero_habitacion());
            ps.setInt(26,ing.getApr_ficha_fic_numero());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Registro realizado");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"no se pudo guardar desde crud aprendiz" +e);
        }
    }
            
            public int actualizar_aprendiz (aprendizSG ing){
            
                try {
                    ps=cnn.prepareStatement("UPDATE aprendiz SET  apr_documento='"+ing.getApr_documento()+"', apr_documentoTipo='"+ing.getApr_documentoTipo()+"', apr_nombres='"+ing.getApr_nombres()+"', apr_apellidos='"+ing.getApr_apellidos()+"', apr_fechaNacimiento='"+ing.getApr_fechaNacimiento()+"', apr_edad='"+ing.getApr_edad()+"', apr_sexo='"+ing.getApr_sexo()+"', apr_celular='"+ing.getApr_celular()+"', apr_eps='"+ing.getApr_eps()+"', apr_rh='"+ing.getApr_rh()+"', apr_tipoAprendiz='"+ing.getApr_tipoAprendiz()+"' , apr_nombrePadre='"+ing.getApr_nombrePadre()+"', apr_telefonoPadre='"+ing.getApr_telefonoPadre()+"', apr_nombreMadre='"+ing.getApr_nombreMadre()+"', apr_telefonoMadre='"+ing.getApr_telefonoMadre()+"', apr_departamento='"+ing.getApr_departamento()+"', apr_ciudad_pueblo='"+ing.getApr_ciudad()+"', apr_barrio_vereda='"+ing.getApr_barrio()+"', apr_direccion='"+ing.getApr_direccion()+"', apr_antecedente_medico='"+ing.getApr_antecedente_medico()+"', apr_email='"+ing.getApr_email()+"',  apr_hojaDeVida='"+ing.getApr_hojaDeVida()+"', apr_actaCompromiso='"+ing.getApr_actaCompromiso()+"', apr_llamadosDeAtencion='"+ing.getApr_llamadosDeAtencion()+"', apr_numero_habitacion='"+ing.getApr_numero_habitacion()+"', apr_ficha_fic_numero='"+ing.getApr_ficha_fic_numero()+"' WHERE apr_documento='"+ing.getApr_documento()+"' ");
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Registro actualizado");
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"no se pudo actualizar desde crud aprendiz"+ e);
                }
        return 0;
        }
            
            public int eliminar_aprendiz(aprendizSG ing){
                try {
                    ps=cnn.prepareStatement("DELETE FROM aprendiz WHERE apr_documento=?");
                    ps.setInt(1,ing.getApr_documento());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Registro eliminado");
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"no se pudo eliminar desde el crud" +e);
                }
        return 0;
            }
   
   }
