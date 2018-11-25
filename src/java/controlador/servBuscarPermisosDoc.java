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
import modelo.permisoSG;
import modelo.usuarioSG;
import modulo_permisos.Autorizacion;

@WebServlet(name = "servBuscarPermisosDoc", urlPatterns = {"/servBuscarPermisosDoc"})
public class servBuscarPermisosDoc extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        String tipoPermiso = request.getParameter("tipo");
        String perId = request.getParameter("perId");
        String ventana = request.getParameter("ventana");
        
        String rol = request.getParameter("rol"), estado="";
        JOptionPane.showMessageDialog(null,rol);
        if(rol.equals("Coordinador")) estado =  "Pendiente";
        else estado = "Autorizado";
        JOptionPane.showMessageDialog(null,"Estado: "+estado);
        
        //Ventana:Al momento de abrir el permiso
        if(ventana != null && ventana.equals("abrir")) {
            //BUSCAR DATOS DEL PERMISO SELECCIONADO
            Autorizacion con = new Autorizacion();
            ArrayList<permisoSG> permiso = new ArrayList<>();
            
            //CuargarID EN LOS GETTER Y SETTER
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
            //consulta nombre aprendiz
            aprendizSG ap = new aprendizSG();
            ap = aprendiz.get(0);
            String aprendizNom = ap.getApr_nombres();
             
            
            //Impresion de datos del permiso
            out.print(
                    per.getPer_ID()+//0
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
                "|"+per.getPer_evidenciaAdjunta()); //11

        } else { 
            out.print(
                "<thead class='thead_t'>"+                    
                    "<tr>"+
                    "<th id='thead_opt'>ID</th>"+
                    "<th id='thead_opt'>DOCUMENTO APRENDIZ</th>"+
                    "<th id='thead_opt'>TIPO DE PERMISO</th>"+
                    "<th id='thead_opt' class='hide-on-med-and-down'>MOTIVO</th>"+
                    "<th id='thead_opt' class='hide-on-med-and-down'>FECHA DE SALIDA</th>"+
                    "<th id='thead_opt' class='hide-on-med-and-down'>FECHA DE INGRESO</th>"+
                    "<th id='thead_opt'>ACCIONES</th>"+                 
                    "</tr>"+
                "</thead>");

            ArrayList<permisoSG> lisdat = new ArrayList<>();
            consultas con = new consultas();
            lisdat = con.consultarPermiso(tipoPermiso, "", estado);
            permisoSG x = new permisoSG();
            int i=0;
            for(i=0; i<lisdat.size(); i++){
                x = lisdat.get(i);
        
        //BUSCANDO NUMERO DOCUMENTO
//        int num_docu=Integer.parseInt(request.getParameter("val"));
//        lisdat =con.consultarDocAprendiz(num_docu);
                
        
        out.print(
                "<tr>"+
                    "<form action='ServletPermiso' enctype='multipart/form-data' name='vinform' method='post' class='default-browser'>"+
                        "<input id='searchTerm' class='searchTerm' type='text' name='num_docu' onkeyup='searchInfo()' placeholder='Busca document' style='border: 1px solid gray; float: left; width: 170px; margin-right: 120px' class='browser-default'/>"+
                        "<td><input id=id"+i+" class='browser-default input_t' id='' readonly type='number' name='' value="+x.getPer_ID()+"></td>"+
                        "<td><input class='hide-on-med-and-down input_t' readonly type='text' name='t_numerodocumento' value="+x.getPer_Aprendiz_Apr_documento()+"></td>"+        
                        "<td><input class='hide-on-med-and-down input_t' readonly type='text' name='t_tipo' value="+x.getPer_tipo()+"></td>"+
                        "<td><input class='hide-on-med-and-down input_t' readonly type='text' name='t_moti' value="+x.getPer_motivo()+"></td>"+
                        "<td><input class='hide-on-med-and-down input_t' readonly type='date' name='t_fechsal' value="+x.getPer_fecha_salida()+"></td>"+
                        "<td><input class='input_t' readonly type='date' name='t_fechingre' value="+x.getPer_fecha_ingreso()+"></td>"+
                        "<td>"+ 
                        "<div  class='btn-ver-permiso-coordinador'>"+                
                        "<img id=p"+i+" class='ver' src='icon_acciones/ver.png' style='padding-left: 15px'/>"+     
                        "</div>"+
                        "</td>"+        
                "</tr>"
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