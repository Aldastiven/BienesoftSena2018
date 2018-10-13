
package modelo;

import controlador.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class crudFicha {
    conexion con=new conexion();
    Connection cnn=con.conexiondb();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    
    //GUARDAR
    public void guardar_ficha(fichaSG ing){
        try{
           ps=cnn.prepareStatement("INSERT INTO ficha VALUES(?,?,?,?,?)");
           
         
           ps.setInt(1,ing.getFic_numero());
           ps.setString(2,ing.getFic_nombrePrograma());
           ps.setString(3,ing.getFic_jornada());
           ps.setString(4,ing.getFic_inicio_etapa());
           ps.setString(5,ing.getFic_fin_etapa());
           ps.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Registro Realizado");
                        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Los datos no fueron Ingresados desde crudFicha ");
        }
    }
    
    
    
    //METODO ACTUALIZAR
    public int actualizar_ficha(fichaSG ing) {
    
        try {
           ps=cnn.prepareStatement("UPDATE ficha SET  Fic_numero= ' " +ing.getFic_numero()+ " ' , Fic_nombrePrograma= ' "+ing.getFic_nombrePrograma()+" ' ,  Fic_jornada=' "+ing.getFic_jornada()+" ',  Fic_inicio_etapa_electiva=' "+ing.getFic_inicio_etapa()+" ',  Fic_fin_etapa_electiva=' "+ing.getFic_fin_etapa()+" ' WHERE Fic_numero= ' " +ing.getFic_numero()+ " '   ");
           ps.executeUpdate(); 
           JOptionPane.showMessageDialog(null, "Datos actualizados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Los datos no fueron actualizados desde crudFicha" +e);
        }
        return 0;
}
    
    
    //METODO ELIMINAR
        public int eliminar_ficha(fichaSG ing) {
    
        try {
           ps=cnn.prepareStatement("DELETE FROM ficha WHERE Fic_numero=?");
           ps.setInt(1,ing.getFic_numero());
           ps.executeUpdate(); 
           JOptionPane.showMessageDialog(null, "Datos eliminados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Los datos no fueron eliminados desde crudFicha" +e);
        }
        return 0;
}
}


