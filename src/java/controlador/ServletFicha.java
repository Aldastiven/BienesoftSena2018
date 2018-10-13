
package controlador;

import static controlador.ServletHabitacion.camDispon;
import static controlador.ServletHabitacion.camTotal;
import static controlador.ServletHabitacion.numHabitacion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.crudFicha;
import modelo.crudHabitacion;
import modelo.fichaSG;
import modelo.habitacionSG;



@WebServlet(name = "ServletFicha", urlPatterns = {"/ServletFicha"})
public class ServletFicha extends HttpServlet {
    //GLOBAL VARS
    String nombre,jornada,inicio_etapa,fin_etapa;
    int numero;

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
        
        
        //GUARDAR FICHA
        if(request.getParameter("btn_guardar")!=null){
            this.guardarFicha(request,response);
        }
        
        //Actualizar Datos Ficha
        if(request.getParameter("btn_actualizar")!=null){
            this.actualizarFicha(request,response);
        }
        
       
        //Eliminar Datos Ficha
        if(request.getParameter("btn_eliminar")!=null){
            this.eliminarFicha(request,response);
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

    
    //GUARDAR FICHA
    private void guardarFicha(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        numero=Integer.parseInt(request.getParameter("f_n_ficha"));
        nombre=request.getParameter("f_nombre");
        jornada=request.getParameter("f_jornada");
        inicio_etapa=request.getParameter("f_Fic_inicio_etapa");
        fin_etapa=request.getParameter("f_Fic_fin_etapa"); 
        
        fichaSG setget=new fichaSG(numero, nombre, jornada, inicio_etapa, fin_etapa); 
        crudFicha crud=new crudFicha();
        crud.guardar_ficha(setget);
        response.sendRedirect("f_ficha.jsp");
        
    }
    
    
    
    //ACTUALIZAR
    private void actualizarFicha(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        numero=Integer.parseInt(request.getParameter("t_n_ficha"));
        nombre=request.getParameter("t_nombre");
        jornada=request.getParameter("t_jornada");
        inicio_etapa=request.getParameter("t_Fic_inicio_etapa");
        fin_etapa=request.getParameter("t_Fic_fin_etapa");
        
        fichaSG setget=new fichaSG(numero, nombre, jornada, inicio_etapa, fin_etapa); 
        crudFicha crud=new crudFicha();
        crud.actualizar_ficha(setget);
        response.sendRedirect("t_ficha.jsp");  
    }
   
    //ELIMINAR
    private void eliminarFicha(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        numero=Integer.parseInt(request.getParameter("t_n_ficha"));
        nombre=request.getParameter("t_nombre");
        jornada=request.getParameter("t_jornada");
        inicio_etapa=request.getParameter("t_Fic_inicio_etapa");
        fin_etapa=request.getParameter("t_Fic_fin_etapa");
        
        fichaSG setget=new fichaSG(numero, nombre, jornada, inicio_etapa, fin_etapa); 
        crudFicha crud=new crudFicha();
        crud.eliminar_ficha(setget);
        response.sendRedirect("t_ficha.jsp");
        
    }




    
    
}
