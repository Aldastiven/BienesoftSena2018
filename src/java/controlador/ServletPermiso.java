
package controlador;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import modelo.crudPermisos;
import modelo.permisoSG;



@WebServlet(name = "ServletPermiso", urlPatterns = {"/ServletPermiso"})
@MultipartConfig
public class ServletPermiso extends HttpServlet {
        //VARS GLOBAL
        int Id,documento;
        String tipo, fecha_salida, fecha_ingreso,hora_Salida, hora_ingreso, fecha_ingresoReal,hora_ingresoReal, observacion_permiso_llegada,motivo,
                      estado, autoriza;
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
    
    //METODO GUARDAR
    private void guardarPermiso(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
               
        //Id=Integer.parseInt(request.getParameter("f_Id"));
        documento=Integer.parseInt(request.getParameter("f_numerodocumento"));
        tipo=request.getParameter("f_tipo");
        fecha_salida=request.getParameter("f_fechsal");
        fecha_ingreso=request.getParameter("f_fechingre");
        hora_Salida=request.getParameter("f_horasal");
        hora_ingreso=request.getParameter("f_horaingre");
        fecha_ingresoReal=request.getParameter("f_Hfreal");
        hora_ingresoReal=request.getParameter("f_Hfreal");
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
        String Url="C:\\Users\\Stefany\\Documents\\NetBeansProjects\\Bienesoft1.0\\web\\img\\"+nombre;
        evidenciaAdjunta="img/"+nombre;
        InputStream file=fot.getInputStream();
        File f=new File(Url);
        FileOutputStream sal = new FileOutputStream(f);
        int num=file.read();
        while(num != -1){
            sal.write(num);
            num=file.read();
        }
            
        permisoSG setget = new permisoSG(Id,documento, tipo, fecha_salida, fecha_ingreso, hora_Salida, hora_ingreso, fecha_ingresoReal,hora_ingresoReal, observacion_permiso_llegada, motivo, estado, autoriza, evidenciaAdjunta);
        crudPermisos crud = new crudPermisos();
        crud.guardar_permiso(setget);
        request.getRequestDispatcher("f_permiso.jsp").forward(request, response);
    }
    
    
    
    //METODO ACTUALIZAR
    private void actualizarPermiso(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
               
        documento=Integer.parseInt(request.getParameter("t_numerodocumento"));
        tipo=request.getParameter("t_tipo");
        fecha_salida=request.getParameter("t_fechsal");
        fecha_ingreso=request.getParameter("t_fechingre");
        hora_Salida=request.getParameter("t_horasal");
        hora_ingreso=request.getParameter("t_horaingre");
        fecha_ingresoReal=request.getParameter("t_Hfreal");
        hora_ingresoReal=request.getParameter("t_Hfreal");
        observacion_permiso_llegada=request.getParameter("t_obser");
        motivo=request.getParameter("t_moti");
        estado=request.getParameter("t_estado");
        autoriza=request.getParameter("t_autoriza");
        
        String evidenciaAdjunta="";
        
        Part fot =request.getPart("t_evidenciaAdjunta");
        String nomfoto=fot.getSubmittedFileName();

        int i = nomfoto.lastIndexOf("\\");
        nomfoto = nomfoto.substring(i+1);
        String nombre=documento+"_"+nomfoto;
        String Url="C:\\Users\\Stefany\\Documents\\NetBeansProjects\\Bienesoft1.0\\web\\img\\"+nombre;
        evidenciaAdjunta="img/"+nombre;
        InputStream file=fot.getInputStream();
        File f=new File(Url);
        FileOutputStream sal = new FileOutputStream(f);
        int num=file.read();
        while(num != -1){
            sal.write(num);
            num=file.read();
        }
            
        permisoSG setget = new permisoSG(documento, tipo, fecha_salida, fecha_ingreso, hora_Salida, hora_ingreso, fecha_ingresoReal,hora_ingresoReal, observacion_permiso_llegada, motivo, estado, autoriza, evidenciaAdjunta);
        crudPermisos crud = new crudPermisos();
        crud.actualizar_permiso(setget);
        request.getRequestDispatcher("t_permiso.jsp").forward(request, response);
    }
    
    
    
    //METODO PARA ELIMINAR 
        private void eliminarPermiso(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
           
        documento=Integer.parseInt(request.getParameter("t_numerodocumento"));
        tipo=request.getParameter("t_tipo");
        fecha_salida=request.getParameter("t_fechsal");
        fecha_ingreso=request.getParameter("t_fechingre");
        hora_Salida=request.getParameter("t_horasal");
        hora_ingreso=request.getParameter("t_horaingre");
        fecha_ingresoReal=request.getParameter("t_Hfreal");
        hora_ingresoReal=request.getParameter("t_Hfreal");
        observacion_permiso_llegada=request.getParameter("t_obser");
        motivo=request.getParameter("t_moti");
        estado=request.getParameter("t_estado");
        autoriza=request.getParameter("t_autoriza");
            
            String evidenciaAdjunta="";
            
            Part fot =request.getPart("f_evidenciaAdjunta");
            String nomfoto=fot.getSubmittedFileName();
            if(!nomfoto.equals("")) {
                int i = nomfoto.lastIndexOf("\\");
                nomfoto = nomfoto.substring(i+1);
                String nombre=documento+"_"+nomfoto;
                String Url="C:\\Users\\Stefany\\Documents\\NetBeansProjects\\Bienesoft1.0\\web\\img\\"+nombre;
                evidenciaAdjunta="img/"+nombre;
                InputStream file=fot.getInputStream();
                File f=new File(Url);
                FileOutputStream sal = new FileOutputStream(f);
                int num=file.read();
                while(num != -1){
                    sal.write(num);
                    num=file.read();
                }
            }else {
                evidenciaAdjunta = request.getParameter("Evide");
            }
           
            
            permisoSG setget = new permisoSG(Id, documento, tipo, fecha_salida, fecha_ingreso, hora_Salida, hora_ingreso, fecha_ingresoReal,hora_ingresoReal, observacion_permiso_llegada, motivo, estado, autoriza, evidenciaAdjunta);
            crudPermisos crud = new crudPermisos();
            crud.eliminar_permiso(setget);
            response.sendRedirect("t_permiso.jsp");
        
        }
    
    
    
    
    
    
    
    
    
    
    
}
