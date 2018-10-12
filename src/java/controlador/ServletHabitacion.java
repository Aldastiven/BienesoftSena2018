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
import javax.swing.JOptionPane;
import modelo.crudHabitacion;
import modelo.habitacionSG;

/**
 *
 * @author Stefany
 */
@WebServlet(name = "ServletHabitacion", urlPatterns = {"/ServletHabitacion"})
public class ServletHabitacion extends HttpServlet {
    //vars globales
    public static int numHabitacion, camTotal, camDispon;
    public String genHab;
    
    
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
        //GUARDAR DATOS HABITACION
        if(request.getParameter("btn-guardar") != null){
         this.guardarHabitacion(request,response);
        }
        //MODIFICAR DATOS HABITACION
        if(request.getParameter("btn-modificar") != null){
         this.modificarHabitacion(request,response);
        }
        //ELIMINAR DATOS HABITACION
        if(request.getParameter("btn-eliminar") != null){
         this.eliminarHabitacion(request,response);
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
    private void guardarHabitacion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
                
        numHabitacion=Integer.parseInt(request.getParameter("f_numero"));//integer
        camTotal=Integer.parseInt(request.getParameter("f_c_total"));
        camDispon=Integer.parseInt(request.getParameter("f_c_disponibles"));
        genHab=request.getParameter("f_g_habitacion");
        
        habitacionSG setget=new habitacionSG(numHabitacion, camTotal, camDispon,genHab); 
        crudHabitacion crud=new crudHabitacion();
        crud.guardar_habitacion(setget);
        response.sendRedirect("f_habitacion.jsp");
    }
    
    //METODO MODIFICAR
    private void modificarHabitacion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        numHabitacion=Integer.parseInt(request.getParameter("t_numero"));//integer
        camTotal=Integer.parseInt(request.getParameter("t_c_total"));
        camDispon=Integer.parseInt(request.getParameter("t_c_disponibles"));
        genHab=request.getParameter("t_g_habitacion");
        
        habitacionSG setget=new habitacionSG(numHabitacion, camTotal, camDispon, genHab); 
        crudHabitacion crud=new crudHabitacion();
        crud.modificar_habitacion(setget);
        response.sendRedirect("t_habitacion.jsp");
    }
    
    
    //METODO ELIMINAR HABITACION
    private void eliminarHabitacion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        numHabitacion=Integer.parseInt(request.getParameter("t_numero"));//integer
        camTotal=Integer.parseInt(request.getParameter("t_c_total"));//integer
        camDispon=Integer.parseInt(request.getParameter("t_c_disponibles"));//integer
        genHab=request.getParameter("t_g_habitacion");//String
        
        
        habitacionSG setget=new habitacionSG(numHabitacion, camTotal, camDispon, genHab); 
        crudHabitacion crud=new crudHabitacion();
        crud.eliminar_habitacion(setget);
        response.sendRedirect("t_habitacion.jsp");
    }
    
    
    
    
    
    
    
    
    
}
