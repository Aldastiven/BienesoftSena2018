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
import javax.swing.JOptionPane;
import modelo.crudPermisos;
import modelo.permisoSG;

@WebServlet(name = "ServletPermiso", urlPatterns = {"/ServletPermiso"})
@MultipartConfig
public class ServletPermiso extends HttpServlet {

protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //GUARDAR DATOS APRENDIZ
        
        if(request.getParameter("guardar") != null){
            JOptionPane.showMessageDialog(null,"Guardandojiji");
           this.guardarPermiso(request,response);

        }else if(request.getParameter("btn_actualizar")!=null){
          this.actualizarPermiso(request,response);
          
        }else if(request.getParameter("btn_eliminar")!=null){
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

    
    //METODO PARA GUARDAR
    
    private void guardarPermiso(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            
            int Id, documento;
            
            String tipo, fecha_salida, fecha_ingreso,hora_Salida, hora_ingreso, Fecha_ingresoReal,Hora_ingresoReal, observacion_permiso_llegada,motivo,
                      estado, autoriza;
            Id=Integer.parseInt(request.getParameter("f_Id"));
            documento=Integer.parseInt(request.getParameter("f_NumeroDocumento"));
            tipo=request.getParameter("f_Tipo");
            fecha_salida=request.getParameter("f_Fechsal");
            fecha_ingreso=request.getParameter("f_Fechingre");
            hora_Salida=request.getParameter("f_Horasal");
            hora_ingreso=request.getParameter("f_Horaingre");
            Fecha_ingresoReal=request.getParameter("f_Hfreal");
            Hora_ingresoReal=request.getParameter("f_Hfreal");
            observacion_permiso_llegada=request.getParameter("f_Obser");
            motivo=request.getParameter("f_Moti");
            estado=request.getParameter("f_Estado");
            autoriza=request.getParameter("f_Atoriza");
            
            String evidenciaAdjunta="";
            
           Part fot =request.getPart("f_evidenciaAdjunta");
        String nomfoto=fot.getSubmittedFileName();
        
            int i = nomfoto.lastIndexOf("\\");
            nomfoto = nomfoto.substring(i+1);
            String nombre=documento+"_"+nomfoto;
            String Url="C:\\Users\\lenovo\\Documents\\NetBeansProjects\\BieneSoft_Aldair_ultimo\\web\\img\\"+nombre;
            evidenciaAdjunta="img/"+nombre;
            InputStream file=fot.getInputStream();
            File f=new File(Url);
            FileOutputStream sal = new FileOutputStream(f);
            int num=file.read();
            while(num != -1){
                sal.write(num);
                num=file.read();
            }    
            permisoSG setget = new permisoSG(Id, documento, tipo, fecha_salida, fecha_ingreso, hora_Salida, hora_ingreso, Fecha_ingresoReal,Hora_ingresoReal, observacion_permiso_llegada, motivo, estado, autoriza, evidenciaAdjunta);
            crudPermisos crud = new crudPermisos();
            crud.guardar_permiso(setget);
            request.getRequestDispatcher("f_Permisos.jsp").forward(request, response);
    }

    
    //METODO PARA ACTUALIZAR
    
     private void actualizarPermiso(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
           
         int Id, documento;
            
            String tipo, fecha_salida, fecha_ingreso,hora_Salida, hora_ingreso, Fecha_ingresoReal,Hora_ingresoReal, observacion_permiso_llegada,motivo,
                      estado, autoriza;
            
            Id=Integer.parseInt(request.getParameter("Id"));
            documento=Integer.parseInt(request.getParameter("NumeroDocumento"));
            tipo=request.getParameter("Tipo");
            fecha_salida=request.getParameter("Fechsal");
            fecha_ingreso=request.getParameter("Fechingre");
            hora_Salida=request.getParameter("Horasal");
            hora_ingreso=request.getParameter("Horaingre");
            Fecha_ingresoReal=request.getParameter("freal");
            Hora_ingresoReal=request.getParameter("Hreal");
            observacion_permiso_llegada=request.getParameter("Obser");
            motivo=request.getParameter("Moti");
            estado=request.getParameter("Estado");
            autoriza=request.getParameter("Atoriza");
            
            String evidenciaAdjunta="";
            
           Part fot =request.getPart("EvidenciaAdjunta");
        String nomfoto=fot.getSubmittedFileName();
        if(!nomfoto.equals("")) {
            int i = nomfoto.lastIndexOf("\\");
            nomfoto = nomfoto.substring(i+1);
            String nombre=documento+"_"+nomfoto;
            String Url="C:\\Users\\lenovo\\Documents\\NetBeansProjects\\BieneSoft_Aldair_ultimo\\web\\img\\"+nombre;
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
           
            
            permisoSG setget = new permisoSG(Id, documento, tipo, fecha_salida, fecha_ingreso, hora_Salida, hora_ingreso, Fecha_ingresoReal,Hora_ingresoReal, observacion_permiso_llegada, motivo, estado, autoriza, evidenciaAdjunta);
            crudPermisos crud = new crudPermisos();
            crud.actualizar_permisos(setget);
            response.sendRedirect("t_permisos.jsp");
        
            

     
     }
     //METODO PARA ELIMINAR APRENDIZ
     
        private void eliminarPermiso(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
           
        int Id, documento;
            
            String tipo, fecha_salida, fecha_ingreso,hora_Salida, hora_ingreso, Fecha_ingresoReal,Hora_ingresoReal, observacion_permiso_llegada,motivo,
                      estado, autoriza;
            
           Id=Integer.parseInt(request.getParameter("Id"));
            documento=Integer.parseInt(request.getParameter("NumeroDocumento"));
            tipo=request.getParameter("Tipo");
            fecha_salida=request.getParameter("Fechsal");
            fecha_ingreso=request.getParameter("Fechingre");
            hora_Salida=request.getParameter("Horasal");
            hora_ingreso=request.getParameter("Horaingre");
            Fecha_ingresoReal=request.getParameter("Hfreal");
            Hora_ingresoReal=request.getParameter("Hfreal");
            observacion_permiso_llegada=request.getParameter("Obser");
            motivo=request.getParameter("Moti");
            estado=request.getParameter("Estado");
            autoriza=request.getParameter("Atoriza");
            
            String evidenciaAdjunta="";
            
           Part fot =request.getPart("f_evidenciaAdjunta");
        String nomfoto=fot.getSubmittedFileName();
        if(!nomfoto.equals("")) {
            int i = nomfoto.lastIndexOf("\\");
            nomfoto = nomfoto.substring(i+1);
            String nombre=documento+"_"+nomfoto;
            String Url="C:\\Users\\lenovo\\Documents\\NetBeansProjects\\BieneSoft_Aldair_ultimo\\web\\img\\"+nombre;
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
           
            
            permisoSG setget = new permisoSG(Id, documento, tipo, fecha_salida, fecha_ingreso, hora_Salida, hora_ingreso, Fecha_ingresoReal,Hora_ingresoReal, observacion_permiso_llegada, motivo, estado, autoriza, evidenciaAdjunta);
            crudPermisos crud = new crudPermisos();
            crud.eliminar_permisos(setget);
            response.sendRedirect("t_permisos.jsp");
        
        }

   

}



