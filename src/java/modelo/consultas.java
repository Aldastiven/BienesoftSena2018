/*
 * Consultas del aplicativo-BIENESOFT
 */
package modelo;

import com.mysql.jdbc.Connection;
import controlador.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class consultas {
    
    conexion con=new conexion();
    Connection cnn=con.conexiondb();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    
    //CONSULTA HABITACION
    public ArrayList<habitacionSG> consultaHabitacion() {
        ArrayList<habitacionSG> hab = new ArrayList<>();
        
        try {
            ps = cnn.prepareStatement("SELECT * FROM habitacion");
            rs = ps.executeQuery();
            
            while(rs.next()) {
                habitacionSG habitacion = new habitacionSG(rs.getInt(1), rs.getInt(2),rs.getInt(3),rs.getString(4));
                hab.add(habitacion);
            }
            
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"ERROR: "+e);
        }
        return hab;
    }
    
    
    //CONSULTA ALIMENTACION
    public ArrayList<alimentacionSG> consultaAlimentacion() {
        ArrayList<alimentacionSG> ali = new ArrayList<>();
        
        try {
            ps = cnn.prepareStatement("SELECT * FROM alimentacion");
            rs = ps.executeQuery();
            
            while(rs.next()) {
                alimentacionSG alimentacion = new alimentacionSG( rs.getInt(1), rs.getInt(2),rs.getString(3) );
                ali.add(alimentacion);
            }
            
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"ERROR: "+e);
        }
        return ali;
    }
    
    
    
    //CONSULTA USUARIO
    public ArrayList<usuarioSG> consultaUsuario() {
        ArrayList<usuarioSG> user = new ArrayList<>();
        
        try {
            ps = cnn.prepareStatement("SELECT * FROM usuario");
            rs = ps.executeQuery();
            
            while(rs.next()) {
                usuarioSG usuario = new usuarioSG( rs.getInt(1),rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8) );
                user.add(usuario);
            }
            
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"ERROR: "+e);
        }
        return user;
    }
    
    
    //CONSULTA ALIMENTACION-REL-APRENDIZ
    public ArrayList<Alimento_rel_AprendizSG> consultaAlimentacionRelApr() {
        ArrayList<Alimento_rel_AprendizSG> relone = new ArrayList<>();
        
        try {
            ps = cnn.prepareStatement("SELECT * FROM alimentacion_relacion_aprendiz");
            rs = ps.executeQuery();
            
            while(rs.next()) {
                Alimento_rel_AprendizSG alirelapr = new Alimento_rel_AprendizSG( rs.getInt(1), rs.getInt(2),rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6) );
                relone.add(alirelapr);
            }
            
       }catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"ERROR: "+e);
      }
        return relone;
  }
    
  
  //CONSULTA PATROCINIO
    public ArrayList<patrocinioSG>consultarTabla(){
    ArrayList<patrocinioSG>arreglo = new ArrayList<patrocinioSG>(); 
        try {
                ps = cnn.prepareStatement ("SELECT * FROM patrocinio ");
                rs = ps.executeQuery();

                while (rs.next()){
                    patrocinioSG setget = new patrocinioSG (rs.getInt(1), rs.getString(2));
                    arreglo.add(setget);
                  }       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"no se puedo mostar contenido del labla" +e);
        }       
        return arreglo;
    }
    
    //CONSULTA APRENDIZ
    public ArrayList<aprendizSG>consultarTablaAprendiz(){
        ArrayList<aprendizSG> arreglo = new ArrayList<aprendizSG>();
        try {
            ps = cnn.prepareStatement("SELECT * FROM aprendiz");
            rs = ps.executeQuery();
            
            while(rs.next()){
                aprendizSG getset = new aprendizSG( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20),  rs.getString(21), rs.getString(22), rs.getString(23), rs.getInt(24), rs.getInt(25), rs.getInt(26) );
                arreglo.add(getset);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error" +e);
        }
        return arreglo;
    }
    
    
     //CONSULTA aprendiz_rel_patrocinioSG
    public ArrayList<aprendiz_rel_patrocinioSG> consultaAprendiz_rel_Patricinio(){
        ArrayList<aprendiz_rel_patrocinioSG>arreglo= new ArrayList<aprendiz_rel_patrocinioSG>();
        
        try {
            ps=cnn.prepareStatement("select * from patrocinio_relacion_aprendiz");
            rs=ps.executeQuery();
            
            while(rs.next()){
                aprendiz_rel_patrocinioSG setget = new aprendiz_rel_patrocinioSG(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5));
                arreglo.add (setget);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error de consulta" +e);
        }
        return arreglo;
    }
    
    
    
   
    //CONSULTA FICHA
    public ArrayList<fichaSG> consultaFicha() {
        ArrayList<fichaSG> fic = new ArrayList<>();
        
        try {
            ps = cnn.prepareStatement("SELECT * FROM ficha");
            rs = ps.executeQuery();
            
            while(rs.next()) {
                fichaSG ficha = new fichaSG (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                fic.add(ficha);
            }
            
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"ERROR: "+e);
        }
        return fic;
    }
    
    
    //CONSULTAR SALIDAEMERGENCIA
    public ArrayList<emergenciaSG>consultarEmergencia(){
       ArrayList<emergenciaSG>arreglo=new ArrayList<emergenciaSG>();
      
        try {
            ps=cnn.prepareStatement("SELECT*FROM salidaemergencia");
            rs=ps.executeQuery();
            while (rs.next()){
                emergenciaSG setget=new emergenciaSG (rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getString(9),rs.getString(10));
                arreglo.add(setget);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se puede mostrar contenido de la tabla"+e);
        }
        return arreglo;
    }

    
    //CONSULTAR PERMISOS
        public ArrayList<permisoSG>consultarPermiso(String cbx_tipo_per, String documento) {
        ArrayList<permisoSG> arreglo = new ArrayList<permisoSG>();

        try{

            if (cbx_tipo_per.equals("") && documento.equals("")){
                 ps = cnn.prepareStatement("SELECT * FROM permiso");
            }else if(!cbx_tipo_per.equals("")){
                 ps = cnn.prepareStatement("SELECT * FROM permiso where per_tipo = '"+cbx_tipo_per+"'");
            }else {
                ps = cnn.prepareStatement("SELECT * FROM permiso WHERE per_Aprendiz_Apr_documento = LIKE '"+documento+"%' ");
            }


            rs= ps.executeQuery();

            while(rs.next()){
                permisoSG getset = new permisoSG(rs.getInt(1), rs.getInt(2),rs.getString(3) , rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14),rs.getString(15),rs.getString(16));
                arreglo.add(getset);
            }


        }catch (Exception e){
            System.out.println("Error de consulta: "+e);
        }
        return arreglo;

    }
        
        
        
    //CONSULTA DE TABLA CALENDARIO FESTIVOS
    public boolean compararFechaLunes(String fechaLunes){
        boolean festivo=false;
        
        try {
            ps=cnn.prepareStatement("SELECT*FROM festivos WHERE fes_fecha='"+fechaLunes+"'");
            rs = ps.executeQuery();
            
            if(rs.next()) {
                String fechaFest = rs.getString(2);
                festivo=true;
            }else {
                JOptionPane.showMessageDialog(null,"No es festivo");
                festivo=false;
            }
                    
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR de consulta: "+e);
        }
    
        return festivo;
    }
//    public ArrayList<festivoSG>consultarFestivos(festivoSG diaFestsino) {
//        ArrayList<festivoSG> arreglo = new ArrayList<festivoSG>();
//
//        try{
//
//            ps=cnn.prepareStatement("SELECT*FROM festivos WHERE fes_fecha='"+diaFestsino.getFes_fecha()+"'");
//            rs= ps.executeQuery();
//
//            while(rs.next()){
//                festivoSG getset = new festivoSG( rs.getString(1), rs.getString(2) );
//                arreglo.add(getset);
//            }
//
//
//        }catch (Exception e){
//            System.out.println("Error de consulta: "+e);
//        }
//        return arreglo;
//
//    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
