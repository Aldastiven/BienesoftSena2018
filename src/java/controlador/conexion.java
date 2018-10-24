
package controlador;


import com.mysql.jdbc.Connection;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


//conexion a bd--bancaflash
public class conexion {
   public static PreparedStatement prest=null;
    public static CallableStatement cllst=null;
    public static java.sql.Connection conec=null;
    public static Statement st=null;
    public static ResultSet rt=null;
    public static String usu;
    public static String contra;
    public static String host;
    public static String db;
    
    Connection cnn;
    
    //metodo de conexion
 public Connection conexiondb(){
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/bienesoft","root","0000");
            //JOptionPane.showMessageDialog(null, "conexion ok");
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error de conexion " + e);
            
        }
        return cnn;
    }

    
    
 public void Conectar(){
        try{
            usu="root"; contra="0000"; host="localhost"; db="bienesoft";
            String url="jdbc:mysql://"+host+"/"+db;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conec=DriverManager.getConnection(url,usu,contra);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
 
}


/**
 * public class conexion {
    
   Connection cnn = null;
   
   public Connection conexiondb(){
 */
 