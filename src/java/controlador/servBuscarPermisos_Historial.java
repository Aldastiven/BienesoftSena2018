/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import javax.swing.JOptionPane;
import modelo.aprendizSG;
import modelo.consultas;
import modelo.fichaSG;
import modelo.permiso_historialSG;
import modulo_permisos.Autorizacion;

@WebServlet(name = "servBuscarPermisos_Historial", urlPatterns = {"/servBuscarPermisos_Historial"})
public class servBuscarPermisos_Historial extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //VARIABLES
        String tipObservacion = request.getParameter("observacion");
        String perId = request.getParameter("perId");
        String ventana = request.getParameter("ventana");        
        
        if(ventana != null && ventana.equals("abrir")) {
            //BUSCAR DATOS DEL PERMISO SELECCIONADO
            Autorizacion con = new Autorizacion();
            ArrayList<permiso_historialSG> permiso = new ArrayList<>();
            
            //GuargarID EN LOS GETTER Y SETTER
            permiso_historialSG id = new permiso_historialSG(Integer.parseInt(perId));
            
            //llamar consulta
            permiso = con.consultaperhisID(id);
       
            
            permiso_historialSG per = new permiso_historialSG();
            //GUARDAR DATOS QUE TRAJO EL ARREGLO EN LOS GETTER Y SETTER
            per = permiso.get(0);
           
            
            //CONSULTAR NOMBRE DEL APRENDIZ
            consultas con_ap = new consultas();
            ArrayList<aprendizSG> aprendiz = new ArrayList<>();
            
            //Consulta de datos de aprendiz (ID)
            aprendiz = con_ap.consultarAprendizID(per.getHis_per_Aprendiz_Apr_documento());

            aprendizSG ap = new aprendizSG();
            ap = aprendiz.get(0);
            String aprendizNom = ap.getApr_nombres();

            /*----------------------------------------------------------*/
            //FICHA
            ArrayList<fichaSG> ficha = new ArrayList<>();
            int fichaApr = ap.getApr_ficha_fic_numero();
            ficha= con_ap.consultarFichaApr(fichaApr);
            fichaSG fc= new fichaSG();
            fc = ficha.get(0);
            String fichaNom = fc.getFic_nombrePrograma();
  
            //Impresion de datos del permiso
            out.print(
                    per.getHis_per_ID()+ //0
                "|"+aprendizNom+ //1
                "|"+per.getHis_per_Aprendiz_Apr_documento()+ //2
                "|"+per.getHis_per_tipo()+ //3
                "|"+per.getHis_per_fecha_salida()+ //4
                "|"+per.getHis_per_fecha_ingreso()+ //5
                "|"+per.getHis_per_hora_Salida()+ //6
                "|"+per.getHis_per_hora_ingreso()+ //7
                "|"+per.getHis_per_motivo()+ //8
                "|"+per.getHis_per_estado()+ //9
                "|"+per.getHis_per_autoriza()+ //10
                "|"+per.getHis_per_evidenciaAdjunta()+ //11
                "|"+fichaApr+//12
                "|"+fichaNom+//13
                "|"+per.getHis_per_fecha_salidaReal()+//14
                "|"+per.getHis_per_hora_salidaReal()+//15
                "|"+per.getHis_per_fecha_ingresoReal()+//16
                "|"+per.getHis_per_hora_ingresoReal()+//17
                "|"+per.getHis_per_observacion_llegada()//18
            );

        } else { 
            int doc =Integer.parseInt(request.getParameter("documento")); //Documento aprendiz
            int mes =Integer.parseInt(request.getParameter("mes")); //Mes


            ArrayList<permiso_historialSG> lisdat = new ArrayList<>();
            consultas con = new consultas();
   
            lisdat = con.consultarPermisoxMes(tipObservacion, doc,mes);


      
            permiso_historialSG x = new permiso_historialSG();
            int i=0;
            for(i=0; i<lisdat.size(); i++){
                x = lisdat.get(i);
             
                out.print(
                "<div class='tar_info'>"+
                    "<p class='tar_input_hidden'>id del aprendiz:</p>"+"<input class='tar_input_doc_apr browser-default' type='text' value="+x.getHis_per_Aprendiz_Apr_documento()+">"+
                    "<p class='tar_txt_id'>id:</p>"+"<input class='tar_input_id browser-default' type='number' id=id"+i+" value="+x.getHis_per_ID()+">"+                    
                    "<p class='tar_txt'>Estado:</p>"+"<input class='tar_input browser-default' type='text' value="+x.getHis_per_estado()+">"+
                    "<p class='tar_txt'>Observacion:</p>"+"<input class='tar_input browser-default' type='text-area' value="+x.getHis_per_observacion_llegada()+">"+
                    "<hr>"+
                    "<img id=p"+i+" class='ver' src='icon_acciones/ver.png'/>"+"<p class='txt_ver_mas'> ver mas </p>"+
                "</div>"
                );
            }
            
            out.print("<script src='js/modal/modalPerHistorial.js'></script>");
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
