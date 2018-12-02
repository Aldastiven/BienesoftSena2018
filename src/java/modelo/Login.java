/**
LOGIN BIENESOFT:: 
**/
package modelo;

import com.mysql.jdbc.Connection;
import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Stefany
 */
public class Login {
    conexion con=new conexion();
    Connection cnn = con.conexiondb();
    PreparedStatement pt = null;
    ResultSet rt=null;
    //variables
    private String c,r;
    private static int u,d;
    private String nom;
    private String rol;
    
    
    //Metodo de consulta datos de la tabla usuario con el dato de usuario y clave
    public ArrayList<usuarioSG> loguin(usuarioSG ing){
        ArrayList<usuarioSG> arr=new ArrayList<usuarioSG>();
        
        try {
            pt=cnn.prepareStatement("SELECT * FROM usuario WHERE usu_documento='"+ing.getUsudoc()+"' and usu_password='"+ing.getUsuclave()+"'");
            rt=pt.executeQuery();

            if(rt.next()){
                usuarioSG usu=new usuarioSG(rt.getInt(1), rt.getString(2), rt.getString(3), rt.getInt(4), rt.getString(5), rt.getString(6), rt.getString(7),rt.getString(8));
                arr.add(usu);
                
                //d=rt.getInt(0);
                r=rt.getString(8);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error "+e);
            
        }
        
        return arr;
    
        
    }
    
   
    
    
    //NOMBRE DEL USUARIO
    public String consultanombreusuario(String n){
        String x="";
        
        try {
            pt=cnn.prepareStatement("SELECT usu_nombre FROM usuario WHERE  usu_nombre='"+n+"' ");
            rt=pt.executeQuery();
            
            while(rt.next()){
                x=rt.getString(1);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return x; 
        
    }
   
    
    
    
    
  
    
    
    
    
}
