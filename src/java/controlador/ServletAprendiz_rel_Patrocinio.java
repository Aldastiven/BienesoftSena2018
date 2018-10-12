
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

/**
 *
 * @author Aldair
 */
@WebServlet(name = "ServletAprendiz_rel_Patrocinio", urlPatterns = {"/ServletAprendiz_rel_Patrocinio"})
public class ServletAprendiz_rel_Patrocinio extends HttpServlet {

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
        
        //GUARDAR APRENDIZ_REL_PATROCINIO
        if(request.getParameter("btn_guardar")!=null){
            this.guardarAprendiz_rel_Patrocinio(request,response);
        }else if(request.getParameter("btn_guardar")!=null){
            this.guardarAprendiz_rel_Patrocinio(request,response);
        }
        
        //ACTUALIZAR APRENDIZ_REL_PATROCINIO
        if(request.getParameter("btn_actualizar")!=null){
            this.actualizarAprendiz_rel_Patrocinio(request,response);
        }else if(request.getParameter("btn_actualizar")!=null){
            this.actualizarAprendiz_rel_Patrocinio(request,response);
        }
        
        //ELIMINAR APRENDIZ_REL_PATROCINIO
        if(request.getParameter("btn_eliminar")!=null){
            this.eliminarAprendiz_rel_Patrocinio(request,response);
        }else if(request.getParameter("btn_eliminar")!=null){
            this.eliminarAprendiz_rel_Patrocinio(request,response);
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

    //METODO GUARDAR APRENDIZ_REL_PATROCINIO
    private void guardarAprendiz_rel_Patrocinio(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException,IOException{
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            if(request.getParameter("btn_guardar")!=null){
                int  aprendiz_ID, numero_Contrato;
                String estado_Contrato, fecha_Contrato;
                
              
                aprendiz_ID=Integer.parseInt(request.getParameter("f_aprendiz_apr_documento"));
                numero_Contrato=Integer.parseInt(request.getParameter("f_numeroContrato"));
                fecha_Contrato=request.getParameter("f_estado");
                estado_Contrato=request.getParameter("f_fechaContrato");
                
                aprendiz_rel_patrocinioSG setget=new aprendiz_rel_patrocinioSG(  aprendiz_ID, numero_Contrato, fecha_Contrato, estado_Contrato);
                crudAprendiz_rel_Patrocinio crud = new crudAprendiz_rel_Patrocinio();
                crud.guardarAprendiz_rel_Patrocinio(setget);
                response.sendRedirect("f_aprendiz_rel_patrocinio.jsp");
            }
    }

    //METODO ACTUALIZAR APRENDIZ_REL_PATROCINIO
    private void actualizarAprendiz_rel_Patrocinio(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            int ID, patrocinio_ID, aprendiz_ID, numero_Contrato;
           
            String estado_Contrato, fecha_Contrato;
               
                
                patrocinio_ID=Integer.parseInt(request.getParameter("t_patrocinio_pat_id"));
                aprendiz_ID=Integer.parseInt(request.getParameter("t_aprendiz_apr_documento"));
                numero_Contrato=Integer.parseInt(request.getParameter("t_numeroContrato"));
                fecha_Contrato=request.getParameter("t_estado");
                estado_Contrato=request.getParameter("t_fechaContrato");
                
                //aprendiz_rel_patrocinioSG setget=new aprendiz_rel_patrocinioSG(patrocinio_ID, aprendiz_ID, numero_Contrato, fecha_Contrato, estado_Contrato);
                crudAprendiz_rel_Patrocinio crud = new crudAprendiz_rel_Patrocinio();
                //crud.actualizarAprendiz_rel_Patrocinio(setget);
                response.sendRedirect("t_aprendiz_rel_patrocinio.jsp");
             
            }
    
    
    //METODO ELIMINAR APRENDIZ_REL_PATROCINIO
    
    private void eliminarAprendiz_rel_Patrocinio(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            

            int ID, patrocinio_ID, aprendiz_ID, numero_Contrato;
                String estado_Contrato, fecha_Contrato;
               
                ID=Integer.parseInt(request.getParameter("t_ID"));
                patrocinio_ID=Integer.parseInt(request.getParameter("t_patrocinio_pat_id"));
                aprendiz_ID=Integer.parseInt(request.getParameter("t_aprendiz_apr_documento"));
                numero_Contrato=Integer.parseInt(request.getParameter("t_numeroContrato"));
                fecha_Contrato=request.getParameter("t_estado");
                estado_Contrato=request.getParameter("t_fechaContrato");
                
                //aprendiz_rel_patrocinioSG setget=new aprendiz_rel_patrocinioSG(ID, patrocinio_ID, aprendiz_ID, numero_Contrato, fecha_Contrato, estado_Contrato);
                crudAprendiz_rel_Patrocinio crud = new crudAprendiz_rel_Patrocinio();
                //crud.eliminarAprendiz_rel_Patrocinio(setget);
                response.sendRedirect("t_aprendiz_rel_patrocinio.jsp");
             
    }
}