
package modulo_permisos;

import controlador.*;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class conexion {
    
   Connection cnn = null;
   
   public Connection conexiondb(){
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/bienesoft","root","1234");
            
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error de conexion " + e);
            
        }
        return cnn;
    }
}
