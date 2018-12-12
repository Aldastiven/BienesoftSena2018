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
import java.util.Calendar;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import modulo_permisos.Autorizacion;
//import org.apache.tomcat.jni.Time;


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
    
    
    //CONSULTAR DATOS DEL APRENDIZ POR EL ID
    public ArrayList<aprendizSG>consultarAprendizID(int doc){
        ArrayList<aprendizSG> arreglo = new ArrayList<aprendizSG>();

        try {
            ps = cnn.prepareStatement("SELECT * FROM aprendiz WHERE apr_documento='"+doc+"' ");
            rs = ps.executeQuery();

            if(rs.next()){
                aprendizSG getset = new aprendizSG( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20),  rs.getString(21), rs.getString(22), rs.getString(23), rs.getInt(24), rs.getInt(25), rs.getInt(26) );
                arreglo.add(getset);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error" +e);
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
    

    
    //CONSULTAR APRENDIZ CON SU TIPO: ALQUERIA... 
        public ArrayList<aprendizSG>consultarAprendizDocTipo(String cbx_tipo_apr ,int documento) {
        ArrayList<aprendizSG> arreglo = new ArrayList<aprendizSG>();

        try{
            //consulta por todo
            if(cbx_tipo_apr.equals("") && documento==0 ){
                 ps = cnn.prepareStatement("SELECT * FROM aprendiz ");
            //consulta por el tipo de apr
            }else if(!cbx_tipo_apr.equals("") && documento==0 ){
                 ps = cnn.prepareStatement(" SELECT * FROM aprendiz WHERE apr_tipoAprendiz='"+cbx_tipo_apr+"' ");
            //consulta por documento
            }else if(documento!=0 && cbx_tipo_apr.equals("")){     
                ps = cnn.prepareStatement(" SELECT * FROM aprendiz WHERE apr_documento LIKE '"+documento+"%' ");
            //consulta por documento y tipo    
            }else if(documento!=0 && !cbx_tipo_apr.equals("")){
                ps=cnn.prepareStatement(" SELECT * FROM aprendiz WHERE apr_documento LIKE '"+documento+"%' AND  apr_tipoAprendiz='"+cbx_tipo_apr+"'  ");
            }else {
                ps = cnn.prepareStatement("SELECT * FROM aprendiz ");
            }
            

            rs= ps.executeQuery();

            while(rs.next()){
                aprendizSG getset = new aprendizSG( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20),  rs.getString(21), rs.getString(22), rs.getString(23), rs.getInt(24), rs.getInt(25), rs.getInt(26) );
                arreglo.add(getset);
            }


        }catch (Exception e){
            System.out.println("Error de consulta: "+e);
        }
        return arreglo;

    }

    
    //CONSULTAR PERMISOS COORDINADOR
        public ArrayList<permisoSG>consultarPermiso(String cbx_tipo_per ,String estado, int documento, String rol) throws SQLException {
        ArrayList<permisoSG> arreglo = new ArrayList<permisoSG>();
//        JOptionPane.showMessageDialog(null, "se consulta permiso coordinador");
            

        try{

            if (cbx_tipo_per.equals("") && documento==0){
                 ps = cnn.prepareStatement("SELECT * FROM permiso WHERE per_estado='"+estado+"' ");                        
                 rs=ps.executeQuery();
                    if(rol.equals("Seguridad")){
                           if(rs.next()){
                               int id = rs.getInt(1);
//                       
                               //Instancia del metodo de los permisos vencidos
                               consultaperIDVencidos(id);
                           }
                    }
            }else if(!cbx_tipo_per.equals("")  && documento !=0 ){
                 ps = cnn.prepareStatement("SELECT * FROM permiso where per_tipo = '"+cbx_tipo_per+"' AND per_Aprendiz_Apr_documento LIKE '"+documento+"%' AND per_estado='"+estado+"' ");
            }else if(!cbx_tipo_per.equals("")){
                 ps = cnn.prepareStatement(" SELECT * FROM permiso WHERE per_tipo = '"+cbx_tipo_per+"' AND per_estado='"+estado+"' ");
            }else if(documento!=0){
                 ps = cnn.prepareStatement(" SELECT * FROM permiso WHERE per_Aprendiz_Apr_documento LIKE '"+documento+"%' AND per_estado='"+estado+"' ");
            }
            

            rs= ps.executeQuery();

            while(rs.next()){
                permisoSG getset = new permisoSG(rs.getInt(1), rs.getInt(2),rs.getString(3) , rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18),rs.getString(19));
                arreglo.add(getset);
            }


        }catch (Exception e){
            System.out.println("Error de consulta: "+e);
        }
        return arreglo;

    }
        

    //CONSULTAR PERMISOS SEGURIDAD
    public ArrayList<permisoSG>consultarPermisoSeguridad(String cbx_tipo_per, String documento) {
    ArrayList<permisoSG> arreglo = new ArrayList<permisoSG>();

    
        try{
         
            if (cbx_tipo_per.equals("") && documento.equals("")){
//                JOptionPane.showMessageDialog(null, "se consulta");
                 ps = cnn.prepareStatement("select * from permiso where per_estado = 'Autorizado'"); 
                 
                 //para permisos vencidos
                 if(rs.next()){
                    int id = rs.getInt(1);
//                    JOptionPane.showMessageDialog(null, "Este es el que trae " +id);
                    //Instancia del metodo de los permisos vencidos
                    consultaperIDVencidos(id);
                }
                 
                 
                 
            }else if(!cbx_tipo_per.equals("")){
                 ps = cnn.prepareStatement("SELECT * FROM permiso where per_tipo = '"+cbx_tipo_per+"'");
            }else {
                ps = cnn.prepareStatement("SELECT * FROM permiso WHERE per_Aprendiz_Apr_documento = LIKE '"+documento+"%' ");
            }


            rs= ps.executeQuery();

            while(rs.next()){
                permisoSG getset = new permisoSG(rs.getInt(1), rs.getInt(2),rs.getString(3) , rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18),rs.getString(19));
                arreglo.add(getset);
            }


        }catch (Exception e){
            System.out.println("Error de consulta: "+e);
        }
        return arreglo;

    }
    
        
     public int consultarFecha(int mes) {
        int x=0;
        
        
        JOptionPane.showMessageDialog(null, mes);
        
        return x;
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

    
    //CONSULTA DE NUMERO DOCUMENTO APRENDIZ
    public ArrayList<permisoSG>consultarDocAprendiz(int documento) {
    ArrayList<permisoSG> arreglo = new ArrayList<permisoSG>();

        try{

            ps = cnn.prepareStatement("select per_ID, per_Aprendiz_Apr_documento, per_tipo, per_motivo, per_estado  from permiso where per_Aprendiz_Apr_documento='"+documento+"' ");

            rs= ps.executeQuery();

            while(rs.next()){
                permisoSG getset = new permisoSG(rs.getInt(1), rs.getInt(2), rs.getString(3) , rs.getString(13), rs.getString(14) );
                arreglo.add(getset);
            }


        }catch (Exception e){
            System.out.println("Error de consulta: "+e);
        }
        return arreglo;

    }
    
    //CONSULTA DE NOMBRE DEL PROGRAMA ACADEMICO
    public ArrayList<fichaSG>consultarFichaApr(int fichaApr) {
    ArrayList<fichaSG> arreglo = new ArrayList<fichaSG>();
        try{
            ps = cnn.prepareStatement("select * from ficha where Fic_numero = '"+fichaApr+"' ");
            rs= ps.executeQuery();

            if(rs.next()){
                fichaSG getset = new fichaSG(rs.getString(2));
                arreglo.add(getset);
            }


        }catch (Exception e){
            System.out.println("Error de consulta: "+e);
        }
        return arreglo;
    }
    
    
    
    //METODO DE CONSULTA ID DE PERMISO PARA EL ESTADO
    public int consultaperIDestado(int id){
        int id2=0;
        
        try {
           ps = cnn.prepareStatement("SELECT*FROM permiso WHERE per_ID='"+id+"' ");
           
           rs = ps.executeQuery();
          if(rs.next()){
                id2 = rs.getInt(1);
            }
            
        } catch (Exception e) {            
            JOptionPane.showMessageDialog(null, "No se puede mostra el contenido"+e);
        }
        
        return id2;
    
    }
    

    
    public ArrayList<permisoSG> consulta_notificacion(int u){
        ArrayList<permisoSG> arreglo = new ArrayList<>();
         //JOptionPane.showMessageDialog(null,"esto se trae de la consulta" +u);

        try{
          ps = cnn.prepareStatement("select * from permiso per_Aprendiz_Apr_documento  where per_estado='Autorizado'  AND  per_Aprendiz_Apr_documento='"+u+"' ");
           rs = ps.executeQuery();            
           //JOptionPane.showMessageDialog(null, "ENTRO AL TRY");

           while(rs.next()){
                permisoSG getset = new permisoSG(rs.getInt(1), rs.getInt(2),rs.getString(3) , rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18),rs.getString(19));
               arreglo.add(getset);

               //JOptionPane.showMessageDialog(null, rs.getString(3));
           }

        }catch(Exception e){
         //JOptionPane.showMessageDialog(null, "PAILAS" +e);
        }
         
        return arreglo; 
     
    }
    
    
    
    public ArrayList<permiso_historialSG> consulta_notificacion_his(int uhis){
        ArrayList<permiso_historialSG> arreglo = new ArrayList<>();
       //JOptionPane.showMessageDialog(null,"esto se trae de la consulta" +uhis);

        try{
          ps = cnn.prepareStatement("select * from permiso_historial  where his_per_estado='Denegado'  AND his_per_Aprendiz_Apr_documento='"+uhis+"' ");
           rs = ps.executeQuery();            
           //JOptionPane.showMessageDialog(null, "ENTRO AL TRY");

           while(rs.next()){
               permiso_historialSG gt = new permiso_historialSG(rs.getInt(1), rs.getInt(2),rs.getString(3) , rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18),rs.getString(19));
               arreglo.add(gt);

             //JOptionPane.showMessageDialog(null, rs.getString(13));
           }

        }catch(Exception e){
         JOptionPane.showMessageDialog(null, "PAILAS" +e);
        }
         
        return arreglo; 
     
    }
    
    
    
    
    //CONSULTA PERMISOS HISTORIAL
      public ArrayList<permiso_historialSG>consultarPermisoxMes(String cbx_tipo_per_his,  int documento, int mes_cbx) {
        ArrayList<permiso_historialSG> arreglo = new ArrayList<permiso_historialSG>();

        try{
           
            //consulta toda la tabla
            if (cbx_tipo_per_his.equals("") && documento==0 && mes_cbx == 0){       
//                JOptionPane.showMessageDialog(null, "busca todo con1");
                ps = cnn.prepareStatement("SELECT * FROM permiso_historial ");                
            
            //consulta por el documento
            }else if(documento!=0){
//                JOptionPane.showMessageDialog(null, "busca por documento con2");
                ps = cnn.prepareStatement("SELECT * FROM permiso_historial where his_per_Aprendiz_Apr_documento LIKE '"+documento+"%'");
            
            //consulta por el tipo           
            }else if(!cbx_tipo_per_his.equals("")){
//                JOptionPane.showMessageDialog(null, "busca por el tipo de permiso con3");
                ps = cnn.prepareStatement("SELECT * FROM permiso_historial where his_per_observacion_llegada = '"+cbx_tipo_per_his+"'");
             
            //consulta por mes    
            }else if(mes_cbx!=0){
//                JOptionPane.showMessageDialog(null, "busca por el mes con4");
                ps = cnn.prepareStatement("SELECT * FROM permiso_historial WHERE MONTH(his_per_fechaCreacion) = '"+mes_cbx+"' ");
           
            //consulta por fecha y documento
            }else if(mes_cbx!=0 && documento!=0 ){   
//                JOptionPane.showMessageDialog(null, "busca por el mes y docu con5");
                ps = cnn.prepareStatement("SELECT * FROM permiso_historial WHERE MONTH(his_per_fechaCreacion) = '"+mes_cbx+"' AND his_per_Aprendiz_Apr_documento LIKE '"+documento+"%' ");
           
            //consulta por todo
            }else {
//                JOptionPane.showMessageDialog(null, "busca por el mes conULT");
//                JOptionPane.showMessageDialog(null, mes_cbx);
                ps = cnn.prepareStatement("SELECT * FROM permiso_historial ");                        
            }
            
            
        rs= ps.executeQuery();

            while(rs.next()){
                permiso_historialSG gt = new permiso_historialSG(rs.getInt(1), rs.getInt(2),rs.getString(3) , rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18),rs.getString(19));
                arreglo.add(gt);
            }


        }catch (Exception e){
            System.out.println("Error de consulta: "+e);
        }
        return arreglo;

    }
      
      
    
      
    //CONSULTA PARA ID-PERMISO VENCIDO
    public int consultaperIDVencidos(int id){
//        JOptionPane.showMessageDialog(null,"Este es un ID VENCIDO " + id);
        int IDven=0;
        
        try {
           ps = cnn.prepareStatement("SELECT*FROM permiso WHERE per_ID='"+id+"' ");
           
           rs = ps.executeQuery();
           if(rs.next()){
                IDven = rs.getInt(1);
//                JOptionPane.showMessageDialog(null, "Este es el que trae " + IDven);
                consulta_per_vencidos(IDven);
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se puede mostra el contenido"+e);
        }
        
        return IDven;
    
    }
      
      
      
       
     
    public int consulta_per_vencidos(int IDven) {
        

       
        int DatoID = IDven;
        
        int x=0;
        int dia, mes, year;
//        JOptionPane.showMessageDialog(null, "captura el id " +DatoID);
        
        Calendar calendario = Calendar.getInstance();
        dia=calendario.get(Calendar.DATE);
        mes=calendario.get(Calendar.MONTH);
        year=calendario.get(Calendar.YEAR);
        
        if(dia <= 9){
            dia = Integer.parseInt("0"+dia);
        }
        if(mes <= 9){
            mes = Integer.parseInt("0"+mes);
        }
        
        String fechaAtrapada = year+"-"+(mes+1)+"-"+dia;        
//        JOptionPane.showMessageDialog(null,"esta es la fecha actual:  " +fechaAtrapada);
        
        
        
        try{
        ps=cnn.prepareStatement("select * from permiso where per_estado='Autorizado' " );
        rs = ps.executeQuery();
        
                //se recoge el resultado de la fecha con relacion a las fechas de salidas estipuladas        
                if(rs.next()){
                    String  fechaRecogida = rs.getString(4);
//                    JOptionPane.showMessageDialog(null, "Este es la que trae estipulada  " +fechaRecogida);
                    
                    // año     mes     dia
                    //(FR[0]   F[1]   F[2])
                    String FR[] = fechaAtrapada.split("-"); 
                    String FEap[] = fechaRecogida.split("-");//fecha estipulada por aprendiz

//                    JOptionPane.showMessageDialog(null , "FECHA REAL CONCATENADA  " +FR[2]);
//                    JOptionPane.showMessageDialog(null , "FECHA ESTIPULADA CONCATENADA  " +FEap[2]);
                    
                    //compara por año
                    if(Integer.parseInt(FEap[0]) > Integer.parseInt(FR[0])){
//                       JOptionPane.showMessageDialog(null, "hay permisos vencidos año");
                       //se instancia el estado para que lo ponga en "Vencido"
                            DatoID = consultaperIDestado(DatoID);
                            crudPermisos crud = new crudPermisos();
                            permisoSG ing = new permisoSG();
                            crud.actualizar_estado_vencido_permiso(DatoID, ing);
                    }

                    //compara por mes
                    else if(Integer.parseInt(FEap[1]) >= Integer.parseInt(FR[1])){
//                        JOptionPane.showMessageDialog(null, "entro a mes");
                            //compara por dia
                            if(Integer.parseInt(FR[2]) > Integer.parseInt(FEap[2])){
//                              JOptionPane.showMessageDialog(null, "entro al dia");
                              JOptionPane.showMessageDialog(null, " Hay permisos vencidos");
                              
                                DatoID = consultaperIDestado(DatoID);
                                crudPermisos crud = new crudPermisos();
                                permisoSG ing = new permisoSG();
                                crud.actualizar_estado_vencido_permiso(DatoID, ing);
                              
                            //compara dia
                            }else{    
//                              JOptionPane.showMessageDialog(null, "sigue estando en el mes pero no hay permisos vencidos x dia"); 
                            }
                      
                    }else{
                        JOptionPane.showMessageDialog(null, "nose obtuvieron permisos vencidos");
                    }
                }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        return x;   
    }
        
    
    
    
    
    
    
    
    
    
    
    
    

}
