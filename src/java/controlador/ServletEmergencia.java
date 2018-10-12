/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import modelo.crudEmergencia;
import modelo.emergenciaSG;

/**
 *
 * @author lenovo
 */
@WebServlet(name = "ServletEmergencia", urlPatterns = {"/ServletEmergencia"})
@MultipartConfig
public class ServletEmergencia extends HttpServlet {

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
        
        
        //GUARDAR DATOS Emergencia
        
        if(request.getParameter("btn_guardar")!=null){
        this.guardarEmergencia(request,response);
        }else if(request.getParameter("btn_guardar")!=null){
        this.guardarEmergencia(request,response);   
        }
        
        //Actualizar Datos Emergencia
        if(request.getParameter("btn_actualizar")!=null){
        this.actualizarEmergencia(request,response);
        }else if(request.getParameter("btn_actualizar")!=null){
        this.actualizarEmergencia(request,response); 
        
        }
        
        //Elimunar Datos Emergencia
        if(request.getParameter("btn_eliminar")!=null){
        this.eliminarEmergencia(request,response);
        }else if(request.getParameter("btn_eliminar")!=null){
        this.eliminarEmergencia(request,response); 
        
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

    
    //METODO GUARDAR FICHA
    
    private void guardarEmergencia(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        if(request.getParameter("btn_guardar")!=null){
            
       String MotivoEmergente,FechaSalida,FechaIngreso,Autoriza,HoraSalida,HoraIngreso;
        int Id,Documento,DocumentoAcompaniante;
        Id=Integer.parseInt(request.getParameter("e_Id"));
        Documento=Integer.parseInt(request.getParameter("e_doc"));
        MotivoEmergente=request.getParameter("e_moti");
        FechaSalida=request.getParameter("e_f_sal");
        FechaIngreso=request.getParameter("e_f_ingre");
        HoraSalida=request.getParameter("e_Hs");
        HoraIngreso=request.getParameter("e_Hi");
       
        DocumentoAcompaniante=Integer.parseInt(request.getParameter("e_d_acompa"));
        Autoriza=request.getParameter("e_autoriza");
       
        String Url2="";
            
           Part fot =request.getPart("EvidenciaAdjunta");
        String nomfoto=fot.getSubmittedFileName();
        if(!nomfoto.equals("")) {
            int i = nomfoto.lastIndexOf("\\");
            nomfoto = nomfoto.substring(i+1);
            String nombre=Id+"_"+nomfoto;
            String Url="C:\\Users\\lenovo\\Documents\\NetBeansProjects\\BieneSoft_Edison\\web\\img\\"+nombre;
            Url2="img/"+nombre;
            InputStream file=fot.getInputStream();
            File f=new File(Url);
            FileOutputStream sal = new FileOutputStream(f);
            int num=file.read();
            while(num != -1){
                sal.write(num);
                num=file.read();
            }
        }else {
            Url2 = request.getParameter("Evidencia");
        }
        
        emergenciaSG setget=new emergenciaSG(Id, Documento, MotivoEmergente, FechaSalida, FechaIngreso,HoraSalida,HoraIngreso, DocumentoAcompaniante, Autoriza,Url2);
        crudEmergencia crud=new crudEmergencia();
        crud.guardar_emergencia(setget);
        response.sendRedirect("f_emergencia.jsp");
        }
    }

    
    //METODO ACTUALIZAR FICHA
    
   private void actualizarEmergencia(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        if(request.getParameter("btn_actualizar")!=null){
            
        String MotivoEmergente,FechaSalida,FechaIngreso,Autoriza,HoraSalida,HoraIngreso;
       int Id,Documento,DocumentoAcompaniante;
       
        Id=Integer.parseInt(request.getParameter("t_e_Id"));
        Documento=Integer.parseInt(request.getParameter("t_e_doc"));
       
        MotivoEmergente=request.getParameter("t_e_moti");
        FechaSalida=request.getParameter("t_e_f_sal");
        FechaIngreso=request.getParameter("t_e_f_ingre");
        HoraSalida=request.getParameter("t_e_Hs");
        HoraIngreso=request.getParameter("t_e_Hi");
       
        DocumentoAcompaniante=Integer.parseInt(request.getParameter("t_e_d_acompa"));
        Autoriza=request.getParameter("t_e_autoriza");
       
            String Url2="";
            
           Part fot =request.getPart("EvidenciaAdjunta");
        String nomfoto=fot.getSubmittedFileName();
        if(!nomfoto.equals("")) {
            int i = nomfoto.lastIndexOf("\\");
            nomfoto = nomfoto.substring(i+1);
            String nombre=Id+"_"+nomfoto;
            String Url="C:\\Users\\lenovo\\Documents\\NetBeansProjects\\BieneSoft_Edison\\web\\img\\"+nombre;
            Url2="img/"+nombre;
            InputStream file=fot.getInputStream();
            File f=new File(Url);
            FileOutputStream sal = new FileOutputStream(f);
            int num=file.read();
            while(num != -1){
                sal.write(num);
                num=file.read();
            }
        }else {
            Url2 = request.getParameter("Evidencia");
        }
        
        emergenciaSG setget=new emergenciaSG(Id, Documento, MotivoEmergente, FechaSalida, FechaIngreso,HoraSalida,HoraIngreso, DocumentoAcompaniante, Autoriza,Url2);
        crudEmergencia crud=new crudEmergencia();
        crud.actualizar_emergencia(setget);
        response.sendRedirect("t_emergencia.jsp");
        }
    }
   
   private void eliminarEmergencia(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        if(request.getParameter("btn_eliminar")!=null){
            
        String MotivoEmergente,FechaSalida,FechaIngreso,Autoriza,HoraSalida,HoraIngreso;
       int Id,Documento,DocumentoAcompaniante;
           Id=Integer.parseInt(request.getParameter("t_e_Id"));
        Documento=Integer.parseInt(request.getParameter("t_e_doc"));
       
        MotivoEmergente=request.getParameter("t_e_moti");
        FechaSalida=request.getParameter("t_e_f_sal");
        FechaIngreso=request.getParameter("t_e_f_ingre");
        HoraSalida=request.getParameter("t_e_Hs");
        HoraIngreso=request.getParameter("t_e_Hi");
       
        DocumentoAcompaniante=Integer.parseInt(request.getParameter("t_e_d_acompa"));
        Autoriza=request.getParameter("t_e_autoriza");
        
            String Url2="";
            
           Part fot =request.getPart("EvidenciaAdjunta");
        String nomfoto=fot.getSubmittedFileName();
        if(!nomfoto.equals("")) {
            int i = nomfoto.lastIndexOf("\\");
            nomfoto = nomfoto.substring(i+1);
            String nombre=Id+"_"+nomfoto;
            String Url="C:\\Users\\lenovo\\Documents\\NetBeansProjects\\BieneSoft_Edison\\web\\img\\"+nombre;
            Url2="img/"+nombre;
            InputStream file=fot.getInputStream();
            File f=new File(Url);
            FileOutputStream sal = new FileOutputStream(f);
            int num=file.read();
            while(num != -1){
                sal.write(num);
                num=file.read();
            }
        }else {
            Url2 = request.getParameter("Evidencia");
        }
        
        emergenciaSG setget=new emergenciaSG(Id, Documento, MotivoEmergente, FechaSalida, FechaIngreso,HoraSalida,HoraIngreso, DocumentoAcompaniante, Autoriza,Url2);
        crudEmergencia crud=new crudEmergencia();
        crud.eliminar_emergencia(setget);
        response.sendRedirect("t_emergencia.jsp");
        }
    }

}
