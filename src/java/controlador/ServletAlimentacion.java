/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.alimentacionSG;
import modelo.crudAlimentacion;

/**
 *
 * @author Stefany
 */
@WebServlet(name = "ServletAlimentacion", urlPatterns = {"/ServletAlimentacion"})
public class ServletAlimentacion extends HttpServlet {
    //vars globales
    public static int IDAlimentacion, tipo;
    public String descripcion;
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
         this.guardarAlimentacion(request,response);
        }
        //MODIFICAR 
        if(request.getParameter("btn-modificar") != null){
         this.modificarAlimentacion(request,response);
        }
        //ELIMINAR 
        if(request.getParameter("btn-eliminar") != null){
         this.eliminarAlimentacion(request,response);
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
    
    
    //METODO INGRESO DE GUARDAR-HABITACION
    private void guardarAlimentacion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
               
        tipo=Integer.parseInt(request.getParameter("f_tipo"));
        descripcion=request.getParameter("f_descp");
        
        alimentacionSG setget=new alimentacionSG(tipo, descripcion); 
        crudAlimentacion crud=new crudAlimentacion();
        crud.guardar_alimentacion(setget);
        response.sendRedirect("f_alimentacion.jsp");
    }
    
    
    //METODO MODIFICAR
    private void modificarAlimentacion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        IDAlimentacion=Integer.parseInt(request.getParameter("t_aid"));
        tipo=Integer.parseInt(request.getParameter("t_tipo"));
        descripcion=request.getParameter("t_descp");
        
        alimentacionSG setget=new alimentacionSG(IDAlimentacion,tipo, descripcion); 
        crudAlimentacion crud=new crudAlimentacion();
        crud.modificar_alimentacion(setget);
        response.sendRedirect("t_alimentacion.jsp");
    }
    
    
    //METODO ELIMINAR
    private void eliminarAlimentacion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        IDAlimentacion=Integer.parseInt(request.getParameter("t_aid"));       
        tipo=Integer.parseInt(request.getParameter("t_tipo"));
        descripcion=request.getParameter("t_descp");
        
        alimentacionSG setget=new alimentacionSG(IDAlimentacion, tipo, descripcion); 
        crudAlimentacion crud=new crudAlimentacion();
        crud.eliminar_alimentacion(setget);
        response.sendRedirect("t_alimentacion.jsp");
    }
    
    
    
    
    
    
}
