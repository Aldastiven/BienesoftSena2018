
package controlador;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import javax.swing.JOptionPane;
import modelo.consultas;
import modelo.crudPermisos;
import modelo.permisoSG;
import modulo_permisos.Autorizacion;
import modulo_permisos.tipopermiso;



@WebServlet(name = "ServletPermiso", urlPatterns = {"/ServletPermiso"})
@MultipartConfig//servidor espera este tipo de formatos img
public class ServletPermiso extends HttpServlet {
    //VARS GLOBAL
    int Id,documento;
    String tipo, fecha_salida, fecha_ingreso,hora_Salida, hora_ingreso, fecha_ingresoReal,hora_ingresoReal, fecha_salidaReal, hora_salidaReal,observacion_permiso_llegada,motivo,
    estado, autoriza,evidenciaAdjunta;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        //GUARDAR
        if(request.getParameter("btn-guardar") != null){
         this.guardarPermiso(request,response);
        }
        //ACTUALIZAR
        if(request.getParameter("btn-actualizar") != null){
         this.actualizarPermiso(request,response);
        }
       
        //ELIMINAR
        if(request.getParameter("btn-eliminar") != null){
         this.eliminarPermiso(request,response);
        }
   
        //SEGURIDAD
        if(request.getParameter("btn-autorizado") != null){
         this.permisoAutorizado(request,response);
        }
        
        //BTN CANCELAR PERMISO
        if(request.getParameter("btn-cancel") != null){
          this.cancelPermiso(request,response);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    //METODO GUARDAR VISTA APRENDIZ
    private void guardarPermiso(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
               
        documento=Integer.parseInt(request.getParameter("f_numerodocumento"));
        tipo=request.getParameter("tipoper");
        fecha_salida=request.getParameter("f_fechsal");
        fecha_ingreso=request.getParameter("f_fechingre");
        hora_Salida=request.getParameter("f_horasal");
        hora_ingreso=request.getParameter("f_horaingre");
        fecha_ingresoReal=request.getParameter("f_fireal");
        hora_ingresoReal=request.getParameter("f_hireal");
        fecha_salidaReal=request.getParameter("f_fsreal");
        hora_salidaReal=request.getParameter("f_hsreal");
        observacion_permiso_llegada=request.getParameter("f_obser");
        motivo=request.getParameter("f_moti");
        estado=request.getParameter("f_estado");
        autoriza=request.getParameter("f_autoriza");
        
        String evidenciaAdjunta="";
        
        Part fot =request.getPart("f_evidenciaAdjunta");
        String nomfoto=fot.getSubmittedFileName();

        int i = nomfoto.lastIndexOf("\\");
        nomfoto = nomfoto.substring(i+1);
        String nombre=documento+"_"+nomfoto;
        String Url="C:\\Users\\equipo\\Documents\\BIENESOFT1.0\\Neatbeans\\Bienesoft1.0\\web\\img\\"+nombre;
        evidenciaAdjunta="img/"+nombre;
        InputStream file=fot.getInputStream();
        File f=new File(Url);
        FileOutputStream sal = new FileOutputStream(f);
        int num=file.read();
        while(num != -1){
            sal.write(num);
            num=file.read();
        }
            
        permisoSG setget = new permisoSG( Id,documento, tipo, fecha_salida, fecha_ingreso, hora_Salida, hora_ingreso, fecha_ingresoReal,hora_ingresoReal, fecha_salidaReal, hora_salidaReal ,observacion_permiso_llegada, motivo, estado, autoriza, evidenciaAdjunta);
        crudPermisos crud = new crudPermisos();
        crud.guardar_permiso(setget);
        request.getRequestDispatcher("f_permiso.jsp").forward(request, response);

        
        
    }
    
    
    
    //METODO ACTUALIZAR VISTA COORDINADOR
    private void actualizarPermiso(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Id=Integer.parseInt(request.getParameter("t_Id"));   
        documento=Integer.parseInt(request.getParameter("t_numerodocumento"));
        tipo=request.getParameter("tipoper");
        fecha_salida=request.getParameter("t_fechsal");
        fecha_ingreso=request.getParameter("t_fechingre");
        hora_Salida=request.getParameter("t_horasal");
        hora_ingreso=request.getParameter("t_horaingre");
        fecha_ingresoReal=request.getParameter("f_fireal");
        hora_ingresoReal=request.getParameter("f_hireal");
        fecha_salidaReal=request.getParameter("f_fsreal");
        hora_salidaReal=request.getParameter("f_hsreal");
        observacion_permiso_llegada=request.getParameter("t_obser");
        motivo=request.getParameter("t_moti");
        estado=request.getParameter("t_estado");
        autoriza=request.getParameter("t_autoriza");
        evidenciaAdjunta=request.getParameter("t_evidenciaAdjunta");
            
        permisoSG setget = new permisoSG( Id,documento, tipo, fecha_salida, fecha_ingreso, hora_Salida, hora_ingreso, fecha_ingresoReal,hora_ingresoReal, fecha_salidaReal, hora_salidaReal ,observacion_permiso_llegada, motivo, estado, autoriza, evidenciaAdjunta);
        crudPermisos crud = new crudPermisos();
        crud.actualizar_permiso(setget);
        request.getRequestDispatcher("t_permiso_coordinador.jsp").forward(request, response);
    }
    
    
    
    //METODO PARA ELIMINAR VISTA COORDINADOR 
        private void eliminarPermiso(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Id=Integer.parseInt(request.getParameter("t_Id"));
        documento=Integer.parseInt(request.getParameter("t_numerodocumento"));
        tipo=request.getParameter("t_tipo");
        fecha_salida=request.getParameter("t_fechsal");
        fecha_ingreso=request.getParameter("t_fechingre");
        hora_Salida=request.getParameter("t_horasal");
        hora_ingreso=request.getParameter("t_horaingre");
        fecha_ingresoReal=request.getParameter("f_fireal");
        hora_ingresoReal=request.getParameter("f_hireal");
        fecha_salidaReal=request.getParameter("f_fsreal");
        hora_salidaReal=request.getParameter("f_hsreal");
        observacion_permiso_llegada=request.getParameter("t_obser");
        motivo=request.getParameter("t_moti");
        estado=request.getParameter("t_estado");
        autoriza=request.getParameter("t_autoriza");
        evidenciaAdjunta=request.getParameter("t_evidenciaAdjunta");
     
        
        permisoSG setget = new permisoSG(Id,documento, tipo, fecha_salida, fecha_ingreso, hora_Salida, hora_ingreso, fecha_ingresoReal,hora_ingresoReal, fecha_salidaReal, hora_salidaReal ,observacion_permiso_llegada, motivo, estado, autoriza, evidenciaAdjunta);
        crudPermisos crud = new crudPermisos();
        crud.eliminar_permiso(setget);
        response.sendRedirect("t_permiso_coordinador.jsp");
        
        }
        
        
        //CANCELA PERMISO
        private void cancelPermiso(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

            response.sendRedirect("f_permiso.jsp");
        
        }
        
        
       
    
        //AUTORIZACION DE SEGURIDAD---------------------******PERMISOS SALIDA/ENTRADA***************************
        
        private void permisoAutorizado(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        int id= Integer.parseInt(request.getParameter("t_Id"));
        fecha_salida=request.getParameter("t_fechsal");
        fecha_ingreso=request.getParameter("t_fechingre");
        hora_Salida=request.getParameter("t_horasal");
        hora_ingreso=request.getParameter("t_horaingre");
        fecha_ingresoReal=request.getParameter("f_fireal");
        hora_ingresoReal=request.getParameter("f_hireal");
        fecha_salidaReal=request.getParameter("f_fsreal");
        hora_salidaReal=request.getParameter("f_hsreal");
        
        //Autorizacion de seguridad
        //consulta ID
        permisoSG setget = new permisoSG(id);
        Autorizacion autorz=new Autorizacion();
        ArrayList<permisoSG> permiso=new  ArrayList<>();//GUARDA ELEMENTOS 
        
        permiso=autorz.consultaperID(setget);
        setget = permiso.get(0);//MUESTRA ELEMENTOS
        
        
        if( autorz.AutorizaSeguridad(setget.getPer_estado()) ){ //SI RETORNA TRUE (AUTORIZADO)
            JOptionPane.showMessageDialog(null, "AUTORIZADO");
            
            //LLAMAR MÉTODO PARA DETERMINAR SI ES UN INGRESO O UNA SALIDA
            //PERMISO ENTRADA y SALIDA
            Calendar calendario = Calendar.getInstance();
            int hora, minutos, segundos, dia, mes, ano;
            
            //FECHA REAL DE SALIDA/INGRESO
            dia = calendario.get(Calendar.DATE);
            mes = calendario.get(Calendar.MONTH);
            ano = calendario.get(Calendar.YEAR);
            
            if(dia <= 9){
                dia = Integer.parseInt("0"+dia);
            }
            if(mes <= 9){
                mes = Integer.parseInt("0"+mes);
            }
            
            String fechaReal = ano+"-"+(mes+1)+"-"+dia;
            
            //HORA REAL DE SALIDA/INGRESO
            hora =calendario.get(Calendar.HOUR_OF_DAY);
            minutos = calendario.get(Calendar.MINUTE);
            segundos = calendario.get(Calendar.SECOND);
            
            String horaReal = hora+":"+minutos+":"+segundos;
            
            
            permisoSG pser = new permisoSG(fecha_ingresoReal, hora_ingresoReal, fecha_salidaReal, hora_salidaReal);//REAL
            ArrayList<permisoSG> persalent=new  ArrayList<>();
            String EntradaSalida =autorz.PermisoSalidaEntrada(setget); //Se guarda "Ingreso" o "Salida"
            
            //Fecha y hora estipuladas por aprendiz
            String fechaEstipulada="", horaEstipulada="", campo1="",campo2="";
            //Si es una entrada o una salida del aprendiz
            if(EntradaSalida.equals("Salida")) { 
                fechaEstipulada = setget.getPer_fecha_salida();
                horaEstipulada = setget.getPer_hora_Salida();
                //Campos de fechay hora real a actualizar 
                campo1 = "per_fecha_salidaReal";
                campo2 = "per_hora_salidaReal";
            } else if(EntradaSalida.equals("Ingreso")) {
                fechaEstipulada = setget.getPer_fecha_ingreso();
                horaEstipulada = setget.getPer_hora_ingreso();
                campo1 = "per_fecha_ingresoReal";
                campo2 = "per_hora_ingresoReal"; 
            }
            
            
            tipopermiso tipoper=new tipopermiso();//INSTANCIA TIPOPERMISO
            boolean verifica=autorz.fechaHoraEstipulada(fechaReal, horaReal, fechaEstipulada, horaEstipulada);
            
            //RESTRICCIONES GENERALES DE HORARIOS
            if(verifica){
                JOptionPane.showMessageDialog(null,setget.getPer_tipo());
                if(setget.getPer_tipo().equals("semana morning") || setget.getPer_tipo().equals("semana tarde") ){
                    boolean autorizado = tipoper.metodo_semana(horaReal,setget.getPer_tipo());//horareal y tipopermiso
                    if(autorizado) {
                        JOptionPane.showMessageDialog(null, "Puede salir");
                        //Enviar fechaReal horaReal al método de inserción
                        tipoper.metodo_insertpersemana(setget.getPer_ID(), fechaReal, horaReal,campo1, campo2);//update para campos
                        //Termina proceso de salida o de entrada
                        //guardar hora de fecha y salidaReal a la BD
                        response.sendRedirect("t_permiso_seguridad.jsp");
                    } else {
                        JOptionPane.showMessageDialog(null, "No puede salir");
                    }
                }else if(setget.getPer_tipo().equals("fin de semana")){
                    //tipoper.metodo_finsemana(fechaReal, horaReal,setget.getPer_tipo());//fechaReal,horaReal y tipopermiso
                    boolean findesemana = tipoper.metodo_finsemana(fechaReal,horaReal);
                    
                }
            }
            
            
        } else {
            JOptionPane.showMessageDialog(null, "No esta autorizado para salir");
        }

        
        
        

        }
        
        
        
        
        //FIN DE SEMANA
//        private void finDeSemana(HttpServletRequest request, HttpServletResponse response) 
//        throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        
//        
//            
//            int id= Integer.parseInt(request.getParameter("t_Id"));
//            fecha_salida=request.getParameter("t_fechsal");
//            fecha_ingreso=request.getParameter("t_fechingre");
//            hora_Salida=request.getParameter("t_horasal");
//            hora_ingreso=request.getParameter("t_horaingre");
//            fecha_ingresoReal=request.getParameter("f_fireal");
//            hora_ingresoReal=request.getParameter("f_hireal");
//            fecha_salidaReal=request.getParameter("f_fsreal");
//            hora_salidaReal=request.getParameter("f_hsreal");
//            response.sendRedirect("f_permiso.jsp");
//            
//            permisoSG setget = new permisoSG();
//            tipopermiso fs=new tipopermiso();
//            
//            //Llamar al metodo de finsemana
//            if(fs.metodo_finsemana(setget.getPer_fecha_ingreso() )){
//                JOptionPane.showMessageDialog(null, fs);
//            }
//        
//        }
        
    
    
    
    
    
}
