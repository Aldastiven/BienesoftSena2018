package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import modelo.aprendizSG;
import modelo.consultas;
import modelo.fichaSG;
import modelo.permisoSG;
import modulo_permisos.Autorizacion;

@WebServlet(name = "servBuscarPermisos", urlPatterns = {"/servBuscarPermisos"})
public class servBuscarPermisos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        String tipoPermiso = request.getParameter("tipo");
        String perId = request.getParameter("perId");
        String ventana = request.getParameter("ventana");
        
        String rol = request.getParameter("rol"), estado="";
         if(rol.equals("Coordinador")){
            estado =  "Pendiente";
//            JOptionPane.showMessageDialog(null, rol);
         
        }else{ 
             estado = "Autorizado";
//             JOptionPane.showMessageDialog(null, rol);
         }
        
        if(ventana != null && ventana.equals("abrir")) {
            //BUSCAR DATOS DEL PERMISO SELECCIONADO
            Autorizacion con = new Autorizacion();
            ArrayList<permisoSG> permiso = new ArrayList<>();
            
            //GuargarID EN LOS GETTER Y SETTER
            permisoSG id = new permisoSG(Integer.parseInt(perId));
            
            //llamar consulta
            permiso = con.consultaperID(id);
            
            permisoSG per = new permisoSG();
            //GUARDAR DATOS QUE TRAJO EL ARREGLO EN LOS GETTER Y SETTER
            per = permiso.get(0);
            
            //CONSULTAR NOMBRE DEL APRENDIZ
            consultas con_ap = new consultas();
            ArrayList<aprendizSG> aprendiz = new ArrayList<>();
            
            //Consulta de datos de aprendiz (ID)
            aprendiz = con_ap.consultarAprendizID(per.getPer_Aprendiz_Apr_documento());

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
                    per.getPer_ID()+ //0
                "|"+aprendizNom+ //1
                "|"+per.getPer_Aprendiz_Apr_documento()+ //2
                "|"+per.getPer_tipo()+ //3
                "|"+per.getPer_fecha_salida()+ //4
                "|"+per.getPer_fecha_ingreso()+ //5
                "|"+per.getPer_hora_Salida()+ //6
                "|"+per.getPer_hora_ingreso()+ //7
                "|"+per.getPer_motivo()+ //8
                "|"+per.getPer_estado()+ //9
                "|"+per.getPer_autoriza()+ //10
                "|"+per.getPer_evidenciaAdjunta()+ //11
                "|"+fichaApr+//12
                "|"+fichaNom//13
            );

        } else { 
            int doc=Integer.parseInt(request.getParameter("documento")); //Documento aprendiz

            ArrayList<permisoSG> lisdat = new ArrayList<>();
            consultas con = new consultas();
            try {
                lisdat = con.consultarPermiso(tipoPermiso, estado, doc, rol);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            permisoSG x = new permisoSG();
            int i=0;
            for(i=0; i<lisdat.size(); i++){
                x = lisdat.get(i);

        out.print(
                "<div class='tar_info'>"+
                    "<p class='tar_input_hidden'>id del aprendiz:</p>"+"<input class='tar_input_doc_apr browser-default' type='text' value="+x.getPer_Aprendiz_Apr_documento()+">"+
                    "<p class='tar_txt_id'>id:</p>"+"<input class='tar_input_id browser-default' type='number' id=id"+i+" value="+x.getPer_ID()+">"+                    
                    "<p class='tar_txt'>Fecha de salida:</p>"+"<input class='tar_input browser-default' type='text' value="+x.getPer_fecha_salida()+">"+
                    "<p class='tar_txt'>Hora de salida:</p>"+"<input class='tar_input browser-default' type='text-area' value="+x.getPer_hora_Salida()+">"+
                    "<hr>"+
                    "<img id=p"+i+" class='ver' src='icon_acciones/ver.png'/>"+"<p class='txt_ver_mas'> ver mas </p>"+
                "</div>"
        );
        
       
            }


            out.print("<script src='js/modal/modal.js'></script>");
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