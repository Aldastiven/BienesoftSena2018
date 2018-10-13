
package controlador;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.aprendiz_rel_patrocinioSG;
import modelo.crudAprendiz_rel_Patrocinio;
import modelo.crudUsuario;
import modelo.usuarioSG;


/**
 *
 * @author Stefany
 */
@WebServlet(name = "ServletAprendiz_rel_Patrocinio", urlPatterns = {"/ServletAprendiz_rel_Patrocinio"})
public class ServletAprendiz_rel_Patrocinio extends HttpServlet {
    //global vars
    int Pat_ID, pat_documento, numeroContrato;
    String estado, fechaContrato;
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
        if(request.getParameter("btn_guardar") != null){
            this.guardarAprendiz_rel_Patrocinio(request, response);
        }
        
        //ACTUALIZAR
        if(request.getParameter("btn_actualizar") != null){
            this.actualizarAprendiz_rel_Patrocinio(request, response);
        }
        
        //ELIMINAR
        if(request.getParameter("btn-eliminar") != null){
            this.eliminarAprRelPatrocinio(request, response);
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
    
    //GUARDAR
    private void guardarAprendiz_rel_Patrocinio(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
                
        Pat_ID=Integer.parseInt(request.getParameter("f_patrocinio_pat_id"));//integer
        pat_documento=Integer.parseInt(request.getParameter("f_aprendiz_apr_documento"));
        numeroContrato=Integer.parseInt(request.getParameter("f_numeroContrato"));
        estado=request.getParameter("f_estado");
        fechaContrato=request.getParameter("f_fechaContrato");
        
        aprendiz_rel_patrocinioSG setget=new aprendiz_rel_patrocinioSG(Pat_ID,pat_documento,numeroContrato,estado,fechaContrato);
        crudAprendiz_rel_Patrocinio crud = new crudAprendiz_rel_Patrocinio();
        crud.guardarAprendiz_rel_Patrocinio(setget);
        response.sendRedirect("f_aprendiz_rel_patrocinio.jsp");
    }
    
    
    
    //METODO ACTUALIZAR
    private void actualizarAprendiz_rel_Patrocinio(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Pat_ID=Integer.parseInt(request.getParameter("t_patrocinio_pat_id"));
        pat_documento=Integer.parseInt(request.getParameter("t_aprendiz_apr_documento"));
        numeroContrato=Integer.parseInt(request.getParameter("t_numeroContrato"));
        estado=request.getParameter("t_estado");
        fechaContrato=request.getParameter("t_fechaContrato");
                
        
        aprendiz_rel_patrocinioSG setget=new aprendiz_rel_patrocinioSG(Pat_ID,pat_documento,numeroContrato,estado,fechaContrato);
        crudAprendiz_rel_Patrocinio crud = new crudAprendiz_rel_Patrocinio();
        crud.actualizarAprendiz_rel_Patrocinio(setget);
        response.sendRedirect("t_aprendiz_rel_patrocinio.jsp");
    }
    
    
    
    
    //METODO ELIMINAR
    private void eliminarAprRelPatrocinio(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Pat_ID=Integer.parseInt(request.getParameter("t_patrocinio_pat_id"));
        pat_documento=Integer.parseInt(request.getParameter("t_aprendiz_apr_documento"));
        numeroContrato=Integer.parseInt(request.getParameter("t_numeroContrato"));
        estado=request.getParameter("t_estado");
        fechaContrato=request.getParameter("t_fechaContrato");
                
        
        aprendiz_rel_patrocinioSG setget=new aprendiz_rel_patrocinioSG(Pat_ID,pat_documento,numeroContrato,estado,fechaContrato);
        crudAprendiz_rel_Patrocinio crud = new crudAprendiz_rel_Patrocinio();
        crud.eliminarAprendiz_rel_Patrocinio(setget);
        response.sendRedirect("t_aprendiz_rel_patrocinio.jsp");
    }
    
    
    
    
    
    
}
