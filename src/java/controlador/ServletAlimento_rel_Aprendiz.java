/*
 * CRUD-ALIMENTACION-REL-APRENDIZ
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Alimento_rel_AprendizSG;
import modelo.crudAlimentoRelAprendiz;


/**
 *
 * @author Lenovo
 */
@WebServlet(name = "ServletAlimento_rel_Aprendiz", urlPatterns = {"/ServletAlimento_rel_Aprendiz"})
public class ServletAlimento_rel_Aprendiz extends HttpServlet {
    
    //vars globales
    public int apid;
    public int aptipo;
    public int apdoc;
    public String apfecha;
    public String apestado;
    public int apconteo;
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        
        //GUARDAR 
        if(request.getParameter("btn-guardar") != null){
         this.guardarAlirelApr(request,response);
        }
        //MODIFICAR 
        if(request.getParameter("btn-modificar") != null){
         this.Actualizaralimentacion(request,response);
        }
        //ELIMINAR 
        if(request.getParameter("btn-eliminar") != null){
         this.eliminaralimentacion(request,response);
        }
        
        
    }

   
    
    //METODO INGRESO DE GUARDAR
    private void guardarAlirelApr(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
                
       
        aptipo=Integer.parseInt(request.getParameter("f_tipo"));
        apdoc=Integer.parseInt(request.getParameter("f_doc"));
        apfecha=request.getParameter("f_fecha");
        apestado=request.getParameter("f_estado");
        apconteo=Integer.parseInt(request.getParameter("f_conteo"));
        
       Alimento_rel_AprendizSG setget=new Alimento_rel_AprendizSG(apid,aptipo,apdoc,apfecha,apestado,apconteo);
      crudAlimentoRelAprendiz crud=new crudAlimentoRelAprendiz();
        crud.guardarAlimentorelapr(setget);
        response.sendRedirect("f_alimentacion_rel_aprendiz.jsp");
    }

   private void Actualizaralimentacion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
                
        apid=Integer.parseInt(request.getParameter("t_id"));//integer
        aptipo=Integer.parseInt(request.getParameter("t_tipo"));
        apdoc=Integer.parseInt(request.getParameter("t_doc"));
        apfecha=request.getParameter("t_fecha");
        apestado=request.getParameter("t_estado");
        apconteo=Integer.parseInt(request.getParameter("t_conteo"));
        
       Alimento_rel_AprendizSG setget=new Alimento_rel_AprendizSG(apid,aptipo,apdoc,apfecha,apestado,apconteo);
      crudAlimentoRelAprendiz crud=new crudAlimentoRelAprendiz();
        crud.actualizar_alimentorelapr(setget);
        response.sendRedirect("t_alimentacion_rel_aprendiz.jsp");

}
   private void eliminaralimentacion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
                
       apid=Integer.parseInt(request.getParameter("t_id"));//integer
        aptipo=Integer.parseInt(request.getParameter("t_tipo"));
        apdoc=Integer.parseInt(request.getParameter("t_doc"));
        apfecha=request.getParameter("t_fecha");
        apestado=request.getParameter("t_estado");
        apconteo=Integer.parseInt(request.getParameter("t_conteo"));
        
       Alimento_rel_AprendizSG setget=new Alimento_rel_AprendizSG(apid,aptipo,apdoc,apfecha,apestado,apconteo);
      crudAlimentoRelAprendiz crud=new crudAlimentoRelAprendiz();
        crud.eliminar_alimentorelapr(setget);
        response.sendRedirect("t_alimentacion_rel_aprendiz.jsp");

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
}


