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
import modelo.aprendizSG;
import modelo.crudAprendiz;

/**
 *
 * @author equipo
 */
@WebServlet(name = "ServletAprendiz", urlPatterns = {"/ServletAprendiz"})
@MultipartConfig
public class ServletAprendiz extends HttpServlet {

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
        
        //GUARDAR DATOS APRENDIZ
        
        if(request.getParameter("btn_guardar") !=null){
           this.guardarAprendiz(request,response);
        }else if(request.getParameter("btn_guardar")!=null){
           this.guardarAprendiz(request,response);
        }
        
        //ACTUALIZAR DATOS APRENDIZ
        
        if(request.getParameter("btn_actualizar")!=null){
          this.actualizarAprendiz(request,response);
        }else if(request.getParameter("btn_actualizar")!=null){
          this.actualizarAprendiz(request,response);
        }
        
        //ELIMINAR DATOS APRENDIZ
        
        if(request.getParameter("btn_eliminar")!=null){
          this.eliminarAprendiz(request,response);
        }else if(request.getParameter("btn_eliminar")!=null){
          this.eliminarAprendiz(request,response);
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

    
    //METODO PARA GUARDAR
    
    private void guardarAprendiz(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        if(request.getParameter("btn_guardar")!=null){
            
           int  documento, edad,  llamadosatencion,numeroFicha, numeroHabitacion;
            
            String tipo_documento, nombres, apellidos,celular, fecha_nacimiento, sexo, eps, rh,
                      tipoAprendiz, nombrePadre,nombreMadre, telefonoPadre, telefonoMadre, departamento, ciudad, barrio, direccion,
                    antecedente,email,acta;
            
            
         
            documento=Integer.parseInt(request.getParameter("f_NumeroDocumento"));
            tipo_documento=request.getParameter("f_TipoDocumento");
            nombres=request.getParameter("f_Nombres");
            apellidos=request.getParameter("f_Apellidos");
            fecha_nacimiento=request.getParameter("f_FechaNacimiento");
            edad=Integer.parseInt(request.getParameter("f_Edad"));
            sexo=request.getParameter("f_sexo");
            celular=request.getParameter("f_celular");
            eps=request.getParameter("f_eps");
            rh=request.getParameter("f_rh");
            tipoAprendiz=request.getParameter("f_TipoAprendiz");
            nombrePadre=request.getParameter("f_NombrePadre");
            telefonoPadre=request.getParameter("f_celularPadre");
            nombreMadre=request.getParameter("f_NombreMadre");
            telefonoMadre=request.getParameter("f_celularMadre");
            departamento=request.getParameter("f_Departamento");
            ciudad=request.getParameter("f_ciudad");
            barrio=request.getParameter("f_barrio");
            direccion=request.getParameter("f_direccion");
            antecedente=request.getParameter("f_AntecedenteMedico");
             
            email=request.getParameter("f_email");
           
            String hojavida="";
            
           Part fot =request.getPart("f_HojaDeVida");
        String nomfoto=fot.getSubmittedFileName();
        if(!nomfoto.equals("")) {
            int i = nomfoto.lastIndexOf("\\");
            nomfoto = nomfoto.substring(i+1);
            String nombre=documento+"_"+nomfoto;
            String Url="C:\\Users\\equipo\\Documents\\NetBeansProjects\\BieneSoft1.0\\web\\img\\"+nombre;
            hojavida="img/"+nombre;
            InputStream file=fot.getInputStream();
            File f=new File(Url);
            FileOutputStream sal = new FileOutputStream(f);
            int num=file.read();
            while(num != -1){
                sal.write(num);
                num=file.read();
            }
        }else {
            hojavida = request.getParameter("Hoja");
        }
            acta=request.getParameter("f_Acta");
            llamadosatencion=Integer.parseInt(request.getParameter("f_llamadosAtencion"));
            numeroHabitacion=Integer.parseInt(request.getParameter("f_numeroHabitacion"));
            numeroFicha=Integer.parseInt(request.getParameter("f_numeroFicha"));
            
            
            
            
            aprendizSG setget = new aprendizSG( documento, tipo_documento, nombres, apellidos, fecha_nacimiento, edad, sexo, celular, eps, rh, tipoAprendiz, nombrePadre, telefonoPadre, nombreMadre, telefonoMadre, departamento, ciudad, barrio, direccion, antecedente, email, hojavida, acta, llamadosatencion, numeroHabitacion, numeroFicha);
            crudAprendiz crud = new crudAprendiz();
            crud.guardar_aprendiz(setget);
            response.sendRedirect("f_aprendiz.jsp");
             }
        
    }

    
    //METODO PARA ACTUALIZAR
    
     private void actualizarAprendiz(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
           
        int  documento, edad,  llamadosatencion,numeroFicha, numeroHabitacion;
            
            String tipo_documento, nombres, apellidos,celular, fecha_nacimiento, sexo, eps, rh,
                      tipoAprendiz, nombrePadre,nombreMadre, telefonoPadre, telefonoMadre, departamento, ciudad, barrio, direccion,
                    antecedente,email,acta;
            
            
         
            documento=Integer.parseInt(request.getParameter("t_NumeroDocumento"));
            tipo_documento=request.getParameter("t_TipoDocumento");
            nombres=request.getParameter("t_Nombres");
            apellidos=request.getParameter("t_Apellidos");
            fecha_nacimiento=request.getParameter("t_FechaNacimiento");
            edad=Integer.parseInt(request.getParameter("t_Edad"));
            sexo=request.getParameter("t_sexo");
            celular=request.getParameter("t_celular");
            eps=request.getParameter("t_eps");
            rh=request.getParameter("t_rh");
            tipoAprendiz=request.getParameter("t_TipoAprendiz");
            nombrePadre=request.getParameter("t_NombrePadre");
            telefonoPadre=request.getParameter("t_celularPadre");
            nombreMadre=request.getParameter("t_NombreMadre");
            telefonoMadre=request.getParameter("t_celularMadre");
            departamento=request.getParameter("t_Departamento");
            ciudad=request.getParameter("t_ciudad");
            barrio=request.getParameter("t_barrio");
            direccion=request.getParameter("t_direccion");
            antecedente=request.getParameter("t_AntecedenteMedico");
             
            email=request.getParameter("t_email");
           
            String hojavida="";
            
           Part fot =request.getPart("HojaDeVida");
        String nomfoto=fot.getSubmittedFileName();
        if(!nomfoto.equals("")) {
            int i = nomfoto.lastIndexOf("\\");
            nomfoto = nomfoto.substring(i+1);
            String nombre=documento+"_"+nomfoto;
            String Url="C:\\Users\\equipo\\Documents\\BIENESOFT 1.0\\Neatbeans\\Bienesoft1.0\\web\\img\\"+nombre;
            hojavida="img/"+nombre;
            InputStream file=fot.getInputStream();
            File f=new File(Url);
            FileOutputStream sal = new FileOutputStream(f);
            int num=file.read();
            while(num != -1){
                sal.write(num);
                num=file.read();
            }
        }else {
            hojavida = request.getParameter("Hoja");
        }
            acta=request.getParameter("t_Acta");
            llamadosatencion=Integer.parseInt(request.getParameter("t_llamadosAtencion"));
            numeroHabitacion=Integer.parseInt(request.getParameter("t_numeroHabitacion"));
            numeroFicha=Integer.parseInt(request.getParameter("t_numeroFicha"));
            
            
            
            
            aprendizSG setget = new aprendizSG( documento, tipo_documento, nombres, apellidos, fecha_nacimiento, edad, sexo, celular, eps, rh, tipoAprendiz, nombrePadre, telefonoPadre, nombreMadre, telefonoMadre, departamento, ciudad, barrio, direccion, antecedente, email, hojavida, acta, llamadosatencion, numeroHabitacion, numeroFicha);
            crudAprendiz crud = new crudAprendiz();
            crud.actualizar_aprendiz(setget);
            response.sendRedirect("t_aprendiz.jsp");
        
            

     
     }
     //METODO PARA ELIMINAR APRENDIZ
     
        private void eliminarAprendiz(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
           
        int  documento, edad,  llamadosatencion,numeroFicha, numeroHabitacion;
            
            String tipo_documento, nombres, apellidos,celular, fecha_nacimiento, sexo, eps, rh,
                      tipoAprendiz, nombrePadre,nombreMadre, telefonoPadre, telefonoMadre, departamento, ciudad, barrio, direccion,
                    antecedente,email,acta;
            
            
            
                documento=Integer.parseInt(request.getParameter("t_NumeroDocumento"));
            tipo_documento=request.getParameter("t_TipoDocumento");
            nombres=request.getParameter("t_Nombres");
            apellidos=request.getParameter("t_Apellidos");
            fecha_nacimiento=request.getParameter("t_FechaNacimiento");
            edad=Integer.parseInt(request.getParameter("t_Edad"));
            sexo=request.getParameter("t_sexo");
            celular=request.getParameter("t_celular");
            eps=request.getParameter("t_eps");
            rh=request.getParameter("t_rh");
            tipoAprendiz=request.getParameter("t_TipoAprendiz");
            nombrePadre=request.getParameter("t_NombrePadre");
            telefonoPadre=request.getParameter("t_celularPadre");
            nombreMadre=request.getParameter("t_NombreMadre");
            telefonoMadre=request.getParameter("t_celularMadre");
            departamento=request.getParameter("t_Departamento");
            ciudad=request.getParameter("t_ciudad");
            barrio=request.getParameter("t_barrio");
            direccion=request.getParameter("t_direccion");
            antecedente=request.getParameter("t_AntecedenteMedico");
             
            email=request.getParameter("t_email");
           
            String hojavida="";
            
           Part fot =request.getPart("HojaDeVida");
        String nomfoto=fot.getSubmittedFileName();
        if(!nomfoto.equals("")) {
            int i = nomfoto.lastIndexOf("\\");
            nomfoto = nomfoto.substring(i+1);
            String nombre=documento+"_"+nomfoto;
            String Url="C:\\Users\\Stefany\\Documents\\NetBeansProjects\\BieneSoft1.0\\web\\img\\"+nombre;
            hojavida="img/"+nombre;
            InputStream file=fot.getInputStream();
            File f=new File(Url);
            FileOutputStream sal = new FileOutputStream(f);
            int num=file.read();
            while(num != -1){
                sal.write(num);
                num=file.read();
            }
        }else {
            hojavida = request.getParameter("Hoja");
        }
            acta=request.getParameter("t_Acta");
            llamadosatencion=Integer.parseInt(request.getParameter("t_llamadosAtencion"));
            numeroHabitacion=Integer.parseInt(request.getParameter("t_numeroHabitacion"));
            numeroFicha=Integer.parseInt(request.getParameter("t_numeroFicha"));
            
            aprendizSG setget = new aprendizSG(documento, tipo_documento, nombres, apellidos, fecha_nacimiento, edad, sexo, celular, eps, rh, tipoAprendiz, nombrePadre, telefonoPadre, nombreMadre, telefonoMadre, departamento, ciudad, barrio, direccion, antecedente, email, hojavida, acta, llamadosatencion, numeroHabitacion, numeroFicha);
            crudAprendiz crud = new crudAprendiz();
            crud.eliminar_aprendiz(setget);
            response.sendRedirect("t_aprendiz.jsp");
        
    }
    
    }


