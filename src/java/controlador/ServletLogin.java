/*
 * SERVLETLOGIN-BIENESOFT
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import modelo.Login;
import modelo.usuarioSG;


/**
 *
 * @author Stefany
 */
@WebServlet(name = "ServletLogin", urlPatterns = {"/ServletLogin"})
public class ServletLogin extends HttpServlet {
//variables
private String c,r;
public  int u,d;
private HttpServletRequest user;
private HttpServletResponse pass;
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
        
        //Ingreso app
        if(request.getParameter("btn-entrar") != null){
            this.login(request, response);
        }
    }

    //METODO DE LOGIN CON NOMBRE=USUARIO Y PASS=CLAVE
    private void login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
            //declaracion variables
            int user;
            String pass;
            //captura de datos en form
            user=Integer.parseInt(request.getParameter("user"));
            pass=request.getParameter("pass");
            Boolean estado = false;
            
            usuarioSG in=new usuarioSG(user,pass);
            Login log=new Login();
            ArrayList<usuarioSG> arreglo=new ArrayList<usuarioSG>();
            arreglo=log.loguin(in);
            
            
                        
            if(arreglo.size()>0){
                
                    in = arreglo.get(0);
                    u = in.getUsudoc();
                    c = in.getUsuclave();
                    r=in.getUsurol();
                    JOptionPane.showMessageDialog(null,"Rol: "+ r);
                    
                  //Htttp session para traer nombre
                  String nombre=log.consultanombreusuario(in.getUsunom()); 
                  HttpSession nom=request.getSession();
                  //Muestra nombre en pantalla
                  nom.setAttribute("datico", nombre);
                  //Muestra Rol en pantalla
                  nom.setAttribute("rol", in.getUsurol());
                  
                  //Htttp session para traer datos del perfil
                  String foto=log.consultanombreusuario(in.getUsufoto());
//                  String nomb=log.consultanombreusuario(in.getUsunom());
//                  String ape=log.consultanombreusuario(in.getUsuape());
//                  String email=log.consultanombreusuario(in.getUsuemail());
//                  String cla=log.consultanombreusuario(in.getUsuclave());
//                  String rol=log.consultanombreusuario(in.getUsurol());
                  
                  HttpSession fot=request.getSession();
                  //enviar datos
                  fot.setAttribute("fotico", in.getUsufoto());
                    
                    
                    if(r.equals("Coordinador")){
                        HttpSession session=request.getSession(true);
                        session.setAttribute("Bienvenido", u);
                        request.getRequestDispatcher("coordinador.jsp").forward(request, response);
                    }
                    else if(r.equals("Aprendiz")){
                        request.getRequestDispatcher("aprendiz.jsp").forward(request, response);
                    }else if(r.equals("Monitor")){
                        response.sendRedirect("monitor.jsp");
                    }else if(r.equals("Seguridad")){
                        response.sendRedirect("seguridad.jsp");
                    }else{
                        request.getRequestDispatcher("admin.jsp").forward(request, response);
                    }
 
                    

            } else {
                request.getRequestDispatcher("f_login.jsp").forward(request, response);
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
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

    
    
    
    
    
    
    
    
}
