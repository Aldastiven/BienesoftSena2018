/*
 * AUTORIZACION DE PERMISOS VISTA SEGURIDAD
 */
package modulo_permisos;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.consultas;
import modelo.crudPermisos;
import modelo.permisoSG;

/**
 *
 * @author Stefany
 */
public class Autorizacion {
    
    conexion con=new conexion();
    com.mysql.jdbc.Connection cnn=con.conexiondb();
    PreparedStatement ps= null;
    ResultSet rs=null;
    

    //METODO DE CONSULTA ID DE PERMISO
    public ArrayList<permisoSG> consultaperID(permisoSG id){
        ArrayList<permisoSG> permisoid = new ArrayList<>();
        
        try {
           ps = cnn.prepareStatement("SELECT*FROM permiso WHERE per_ID='"+id.getPer_ID()+"' ");
           rs = ps.executeQuery();
          if(rs.next()){
                permisoSG setget = new permisoSG(rs.getInt(1), rs.getInt(2),rs.getString(3) , rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14),rs.getString(15),rs.getString(16));
                permisoid.add(setget);
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se puede mostra el contenido"+e);
        }
        
        return permisoid;
    
    }
   
    
    //METODO DE AUTORIZACION DE PERMISO ACCION PARA EL GUARDA
    public boolean AutorizaSeguridad(String estado){
        if(estado.equals("Autorizado")){
            return true;        
        }else if(estado.equals("Denegado")){
            return false;
        }
        return false;
        
    }

    
    
    //METODO DE ENTRADA Y SALIDA DE PERMISO FRENTE APRENDIZ 
    
    //PERMISO PARA VERIFICAR SI ES UNA ENTRADA O UNA SALIDA REALES 
    public String PermisoSalidaEntrada(permisoSG setget){
        String fechaSalReal = setget.getPer_fecha_salidaReal();
        String horaSalReal = setget.getPer_hora_salidaReal();
        String fechaInReal = setget.getPer_fecha_ingresoReal();
        String horaInReal = setget.getPer_hora_ingresoReal();
        
        
        if(fechaSalReal == null && horaSalReal == null && fechaInReal == null && horaInReal == null) {
            JOptionPane.showMessageDialog(null, "Es una salida");
            return "Salida";
            
        }else if(fechaSalReal != null && horaSalReal != null && fechaInReal == null && horaInReal == null){
            JOptionPane.showMessageDialog(null, "Es un ingreso");
            return "Ingreso";
        }
        return "Permiso terminado";
    }
    
    
    
    //METODO DE VERIFICACION DE HORAS Y FECHAS ESTIPULADAS DEL APRENDIZ CON REALES----
    public boolean fechaHoraEstipulada(String fechaReal, String horaReal, String fechaEstipulada, String horaEstipulada, String estado){
        //OBTENER ESTADO
        permisoSG est = new permisoSG();
        est.getPer_estado();
        //String state = est.getPer_estado();
        //CONSULTA Y UPDATE ESTADO
        crudPermisos cr=new crudPermisos();
        
        
        
        //Separar fecha en día, mes y año (FR[0]   F[1]   F[2])
        String FR[] = fechaReal.split("-"); 
        String FEap[] = fechaEstipulada.split("-");//fecha estipulada por aprendiz
        
        //Separar hora en hora y minutos (HR[0]   HEap[1] )
        String HR[] = horaReal.split(":");
        String HEap[] = horaEstipulada.split(":");
            
        //Si el año actual es igual al año estipulado
        //Si el mes actual es igual al estipulado
        //Si el día actual es igual al estipulado
        if(Integer.parseInt(HEap[0]) <= 9){
            HEap[0] = HEap[0].substring(1);
            JOptionPane.showMessageDialog(null,HEap[0]);
        }
        if(Integer.parseInt(HEap[1]) <= 9 && Integer.parseInt(HEap[1]) > 0){
            HEap[1] = HEap[1].substring(1);
            JOptionPane.showMessageDialog(null,HEap[1]);
        }
        
        //fecha
        if(Integer.parseInt(FEap[2]) <= 9){
            FEap[2] = FEap[2].substring(1);
            JOptionPane.showMessageDialog(null,"Día: "+FEap[2]);
        }
        if(Integer.parseInt(FEap[1]) <= 9){
            FEap[1] = FEap[1].substring(1);
            JOptionPane.showMessageDialog(null,FEap[1]);
        }
        
        JOptionPane.showMessageDialog(null,"Fecha real: "+FR[0]+"-"+FR[1]+"-"+FR[2]);
        JOptionPane.showMessageDialog(null,"Fecha estipulada: "+FEap[0]+"-"+FEap[1]+"-"+FEap[2]);
        
        JOptionPane.showMessageDialog(null,"Hora real: "+HR[0]+":"+HR[1]);
        JOptionPane.showMessageDialog(null,"Hora estipulada: "+HEap[0]+":"+HEap[1]);

        
        if(FR[0].equals(FEap[0]) && FR[1].equals(FEap[1]) && FR[2].equals(FEap[2])  ) { 
            
            if( Integer.parseInt(HR[0]) ==  Integer.parseInt(HEap[0])) {//mas los 10 minutos
                if(Integer.parseInt(HR[1]) <= Integer.parseInt(HEap[1]) + 10) {
                    JOptionPane.showMessageDialog(null,"Fecha y hora estipulada correcta");
                    return true;
                }
            } else if(Integer.parseInt(HR[0]) <  Integer.parseInt(HEap[0])) {
                    JOptionPane.showMessageDialog(null,"Fecha y hora estipulada correcta");
                    return true;
            }
            JOptionPane.showMessageDialog(null,"La hora no coincide con la estipulada por el aprendiz");
            cr.actualizar_estado_imcompleto_permiso(est);
            
        } else {
            JOptionPane.showMessageDialog(null,"La fecha no coincide con la estipulada por el aprendiz");
             cr.actualizar_estado_imcompleto_permiso(est);
        }
        
        return false;        
    } 
    
    
    
    //UPDATE DE ESTADO DEL PERMISO AL MOMENTO DE INGRESO DEL APRENDIZ AL CBA
    public ArrayList<permisoSG>permisoFinalizado(String estado, int documento) {
    ArrayList<permisoSG> arreglo = new ArrayList<permisoSG>();
        try{
            ps = cnn.prepareStatement("UPDATE permiso SET per_estado='"+estado+"' WHERE per_Aprendiz_Apr_documento='"+documento+"' ");
            rs= ps.executeQuery();

        }catch (Exception e){
            System.out.println("Error de consulta: "+e);
        }
        return arreglo;
    }
    
    
    
    
    
    
    
    
}
