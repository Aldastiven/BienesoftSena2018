
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.crudPatrocinio;
import modelo.patrocinioSG;

/**
 *
 * @author Aldair
 */
@WebServlet(name = "ServletPatrocinio", urlPatterns = {"/ServletPatrocinio"})
public class ServletPatrocinio extends HttpServlet {

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
        
        //GUARDAR DATOS PATROCINIO
        
        if(request.getParameter("btn_guardar") !=null){
            this.guardarPatricinio(request,response);
            }else if(request.getParameter("btn_guardar") != null){
            this.guardarPatricinio(request, response);
         }
        
        //ACTUALIZAR DATOS PATROCINIO
        
        if(request.getParameter("btn_actualizar") !=null){
           this.actualizarPatrocinio(request,response);
           }else if(request.getParameter("btn_actualizar") !=null){
           this.actualizarPatrocinio(request,response);
         }
        
        //ELIMINAR DATOS PATROCINO
        
        if(request.getParameter("btn_eliminar") !=null){
           this.eliminarPatrocinio(request,response);           
        }else if(request.getParameter("btn_eliminar") !=null){
          this.eliminarPatrocinio(request,response);
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

    
//GUARDAR METODO
    
 private void guardarPatricinio(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        if(request.getParameter("btn_guardar") !=null){
            
            String nombre;
              
            nombre=request.getParameter("f_nombre");
            
            patrocinioSG setget = new patrocinioSG(nombre);
            crudPatrocinio crud = new crudPatrocinio();
            crud.guardar_patrocinio(setget);
            response.sendRedirect("f_patrocinio.jsp");           
        }
}

 //ACTUALIZAR METODO
 
    private void actualizarPatrocinio(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException,IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        if(request.getParameter("btn_actualizar")!=null){
        
            int id;
            String nombre;
            
            id=Integer.parseInt(request.getParameter("t_id"));
            nombre=request.getParameter("t_nombre");
                       
            patrocinioSG setget = new patrocinioSG(id, nombre);
            crudPatrocinio crud = new crudPatrocinio();
            crud.actualizar_patrocinio(setget);
            response.sendRedirect("t_patrocinio.jsp");         
        }
}

    //ELIMINAR METODO
    
    private void eliminarPatrocinio(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException,IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        if(request.getParameter("btn_eliminar")!=null){
        
            int id;
            String nombre;
            
            nombre=request.getParameter("t_nombre");
            id=Integer.parseInt(request.getParameter("t_id"));
            
            patrocinioSG setget = new patrocinioSG(id, nombre);
            crudPatrocinio crud = new crudPatrocinio();
            crud.eliminar_patrocinio(setget);
            response.sendRedirect("t_patrocinio.jsp");         
        }
}

}
