/*
 * SERVLETUSUARIO-BIENESOFT
 */
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
import modelo.crudUsuario;
import modelo.usuarioSG;


/**
 *
 * @author Stefany
 */
@WebServlet(name = "ServletUsuario", urlPatterns = {"/ServletUsuario"})
@MultipartConfig//servidor espera este tipo de formatos img
public class ServletUsuario extends HttpServlet {
    //vars globales
    public int userdoc, usercel;
    public String unom, uape, ucel, uema, ufoto, upass, urol;
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
         this.guardarUsuario(request,response);
        }
        //MODIFICAR
        if(request.getParameter("btn-modificar") != null){
         this.modificarUsuario(request,response);
        }
        
        //MODIFICAR VISTA MI-PERFIL
        if(request.getParameter("btn-modificarPerfil") != null){
         this.modificarUsuarioPerfil(request,response);
        }
        
        //ELIMINAR
        if(request.getParameter("btn-eliminar") != null){
         this.eliminarUsuario(request,response);
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
    
    //METODO INGRESO DE GUARDAR-USUARIO
    private void guardarUsuario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
               
        userdoc=Integer.parseInt(request.getParameter("f_doc"));
        unom=request.getParameter("f_nom");
        uape=request.getParameter("f_ape");
        usercel=Integer.parseInt(request.getParameter("f_cel"));
        uema=request.getParameter("f_ema");
        upass=request.getParameter("f_pas");
        urol=request.getParameter("f_rol");
        
        Part ufoto=request.getPart("f_fot");//fotoperfil
        //Upload foto
        String nomfoto=ufoto.getSubmittedFileName();
        String nombre=unom+"_"+nomfoto;
        String Url="C:\\Users\\Stefany\\Documents\\NetBeansProjects\\Bienesoft1.0\\web\\img\\"+nombre;
        String imageurl="img/"+nombre;
        //Upload foto
        InputStream file = ufoto.getInputStream();
        File f=new File(Url);
        FileOutputStream sal = new FileOutputStream(f);
        int num=file.read();
            while(num != -1){
              sal.write(num);
              num=file.read();
            }
        JOptionPane.showMessageDialog(null, imageurl);
            
        usuarioSG setget=new usuarioSG(userdoc,unom,uape,usercel,uema,imageurl,upass,urol);
        crudUsuario crud=new crudUsuario();
        crud.guardar_usuario(setget);
        response.sendRedirect("f_usuario.jsp");
    }
    
    
    
    //METODO MODIFICAR 
    private void modificarUsuario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        userdoc=Integer.parseInt(request.getParameter("t_doc"));
        unom=request.getParameter("t_nom");
        uape=request.getParameter("t_ape");
        usercel=Integer.parseInt(request.getParameter("t_cel"));
        uema=request.getParameter("t_ema");
        ufoto=request.getParameter("t_fot");
        upass=request.getParameter("t_pas");
        urol=request.getParameter("t_rol");
                
        
        usuarioSG setget=new usuarioSG(userdoc,unom,uape,usercel,uema,ufoto,upass,urol); 
        crudUsuario crud=new crudUsuario();
        crud.modificar_usuario(setget);
        response.sendRedirect("t_usuario.jsp");
    }
    
    
    
    //METODO MODIFICAR MI PERFIL
    private void modificarUsuarioPerfil(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        userdoc=Integer.parseInt(request.getParameter("t_doc"));
        unom=request.getParameter("t_nom");
        uape=request.getParameter("t_ape");
        usercel=Integer.parseInt(request.getParameter("t_cel"));
        uema=request.getParameter("t_ema");
        //ufoto=request.getParameter("f_fot");
        upass=request.getParameter("t_pas");
        urol=request.getParameter("t_rol");
        
        Part ufoto=request.getPart("f_fot");//fotoperfil
        //Upload foto
        String nomfoto=ufoto.getSubmittedFileName();
        String nombre=unom+"_"+nomfoto;
        String Url="C:\\Users\\Stefany\\Documents\\NetBeansProjects\\Bienesoft1.0\\web\\img\\"+nombre;
        String imageurl="img/"+nombre;
        //Upload foto
        InputStream file = ufoto.getInputStream();
        File f=new File(Url);
        FileOutputStream sal = new FileOutputStream(f);
        int num=file.read();
            while(num != -1){
              sal.write(num);
              num=file.read();
            }
        JOptionPane.showMessageDialog(null, imageurl);
                
        
        usuarioSG setget=new usuarioSG(userdoc,unom,uape,usercel,uema,imageurl,upass,urol); 
        crudUsuario crud=new crudUsuario();
        crud.modificar_usuario(setget);
        response.sendRedirect("mi_perfil.jsp");
        
    }
    
    
    
    
    //METODO ELIMINAR
    private void eliminarUsuario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        userdoc=Integer.parseInt(request.getParameter("t_doc"));
        unom=request.getParameter("t_nom");
        uape=request.getParameter("t_ape");
        usercel=Integer.parseInt(request.getParameter("t_cel"));
        uema=request.getParameter("t_ema");
        ufoto=request.getParameter("t_fot");
        upass=request.getParameter("t_pas");
        urol=request.getParameter("t_rol");
                
        
        usuarioSG setget=new usuarioSG(userdoc,unom,uape,usercel,uema,ufoto,upass,urol); 
        crudUsuario crud=new crudUsuario();
        crud.eliminar_usuario(setget);
        response.sendRedirect("t_usuario.jsp");
    }
    
    
    
    
    

}
