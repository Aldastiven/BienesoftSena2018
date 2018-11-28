//DATOS APRENDIZ
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


@WebServlet(name = "servBuscarAprendiz", urlPatterns = {"/servBuscarAprendiz"})
public class servBuscarAprendiz extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        String tipoAprendiz = request.getParameter("tipo");
        String docId = request.getParameter("documento");
        String ventana = request.getParameter("ventana");
        
       
        if(ventana != null && ventana.equals("abrir")) {
            
            //CONSULTAR NOMBRE DEL APRENDIZ
            consultas con_ap = new consultas();
            ArrayList<aprendizSG> aprendiz = new ArrayList<>();
            
            //Consulta de datos de aprendiz (ID)
            //aprendiz = con_ap.consultarAprendizID(0);

            aprendizSG ap = new aprendizSG();
            ap = aprendiz.get(0);
            
            //Impresion de datos del permiso
            out.print(
                    ap.getApr_documento()+ //0
                "|"+ap.getApr_documentoTipo()+//1
                "|"+ap.getApr_nombres()+ //2
                "|"+ap.getApr_apellidos()+ //3
                "|"+ap.getApr_fechaNacimiento()+ //4
                "|"+ap.getApr_edad()+ //5
                "|"+ap.getApr_sexo()+ //6
                "|"+ap.getApr_celular()+ //7
                "|"+ap.getApr_eps()+ //8
                "|"+ap.getApr_rh()+ //9
                "|"+ap.getApr_tipoAprendiz()+ //10
                "|"+ap.getApr_nombrePadre()+ //11
                "|"+ap.getApr_telefonoPadre()+ //10
                "|"+ap.getApr_nombreMadre()+ //10
                "|"+ap.getApr_telefonoMadre()+ //10
                "|"+ap.getApr_departamento()+ //10
                "|"+ap.getApr_ciudad()+ //10
                "|"+ap.getApr_barrio()+ //10
                "|"+ap.getApr_direccion()+ //10
                "|"+ap.getApr_antecedente_medico()+
                "|"+ap.getApr_email()+
                "|"+ap.getApr_hojaDeVida()+
                "|"+ap.getApr_actaCompromiso()+
                "|"+ap.getApr_llamadosDeAtencion()+
                "|"+ap.getApr_numero_habitacion()+
                "|"+ap.getApr_ficha_fic_numero());

        } else { 
         
            int doc=Integer.parseInt(request.getParameter("documento")); //Documento aprendiz
            out.print(
                "<thead class='thead_t'>"+                    
                    "<tr>"+
                    "<th id='thead_opt'>NUMERO DE DOCUMENTO</th>"+
                    "<th id='thead_opt'>TIPO DE DOCUMENTO</th>"+
                    "<th id='thead_opt'>NOMBRES</th>"+
                    "<th id='thead_opt'>APELLIDOS</th>"+
                    "<th id='thead_opt'>TIPO APRENDIZ</th>"+
                    "<th id='thead_opt'>NUMERO DE FICHA</th>"+
                    "<th id='thead_opt'>ACCIONES</th>"+                 
                    "</tr>"+
                "</thead>");

            ArrayList<aprendizSG> lisdat = new ArrayList<>();
            consultas con = new consultas();
            lisdat = con.consultarAprendizDocTipo(tipoAprendiz, doc);
            aprendizSG x = new aprendizSG();
            int i=0;
            for(i=0; i<lisdat.size(); i++){
                x = lisdat.get(i);

        out.print(
                "<tr>"+
                    "<form action='ServletPermiso' enctype='multipart/form-data' method='post'>"+
                        "<td><input  class='browser-default input_t' id='' readonly type='number' name='t_numerodocumento' value="+x.getApr_documento()+"></td>"+
                        "<td><input class='hide-on-med-and-down input_t' readonly type='text' name='t_tipo' value="+x.getApr_documentoTipo()+"></td>"+
                        "<td><input class='hide-on-med-and-down input_t' readonly type='text' name='t_tipo' value="+x.getApr_nombres()+"></td>"+
                        "<td><input class='hide-on-med-and-down input_t' readonly type='text' name='t_moti' value="+x.getApr_apellidos()+"></td>"+
                        "<td><input class='hide-on-med-and-down input_t' readonly type='text' name='t_fechsal' value="+x.getApr_tipoAprendiz()+"></td>"+
                        "<td><input class='hide-on-med-and-down input_t' readonly type='number' name='t_fechsal' value="+x.getApr_ficha_fic_numero()+"></td>"+        
                        "<td>"+ 
                        "<div  class='btn-ver-permiso-coordinador'>"+                
                        "<img id=p"+i+" class='ver' src='icon_acciones/ver.png' style='padding-left: 15px'/>"+     
                        "</div>"+
                        "</td>"+        
                "</tr>"
        );
            }


            //out.print("<script src='js/modal/modal.js'></script>");
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