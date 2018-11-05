package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modulo_permisos.tipopermiso;
import modelo.aprendizSG;
import java.util.ArrayList;

public final class f_005fpermiso_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <!--Let browser know website is optimized for mobile-->\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/> \n");
      out.write("            \n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("            <!--importando imagen y texto en pestaña-->\n");
      out.write("            <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"materialize/icons/black/ver_lista.png\" />\n");
      out.write("            <title>BieneSoft | Permiso</title>\n");
      out.write("\n");
      out.write("            <!--estilo body-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/body.css\" media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo encabezado-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/encabezado.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("            <!--estilo modulo busqueda-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/modulo_busqueda.css\" media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo de la tabla--> \n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/tabla.css\"  media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo de la botones--> \n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/buttons.css\"  media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo de la registro--> \n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/formulario.css\"  media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo footer-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/footer.css\"  media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo watch(Reloj)-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/timePicker.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("            <!--estilo materialize.css-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"materialize/css/materialize.min.css\"  media=\"screen,projection\"/>    \n");
      out.write("            \n");
      out.write("            <!--importando--->\n");
      out.write("            <script src=\"js/jquery.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("  \n");
      out.write("        <!--*******************************OBJETO NAV RESPONSIVE***************************-->\n");
      out.write("        \n");
      out.write("        <!--nav principal--->\n");
      out.write("        \n");
      out.write("        <nav class=\"nav-wrapper\" id=\"nav_principal\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <a id=\"logo_encab\"  href=\"#\" class=\"brand-logo hide-on-small-only black-text\">Biene-Soft</a>\n");
      out.write("                \n");
      out.write("                <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \n");
      out.write("                    <i>\n");
      out.write("                        <img style=\"width: 25px; margin-top: 10px;\" src=\"materialize/icons/white/menu.png\" />\n");
      out.write("                    </i>\n");
      out.write("                    \n");
      out.write("                        <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                        <lu id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"materialize/icons/white/menu.png\" /></a></lu>\n");
      out.write("                        </ul>\n");
      out.write("                </a>\n");
      out.write("                \n");
      out.write("                    <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \n");
      out.write("                        <ul  class=\"right hide-on-med-and-down\">\n");
      out.write("                            <lu id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"materialize/icons/white/menu.png\" /></a></lu>\n");
      out.write("                        </ul>\n");
      out.write("                    </a>\n");
      out.write("                \n");
      out.write("                    <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \n");
      out.write("                        <ul  class=\"right hide-on-med-and-down\">\n");
      out.write("                            <lu id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"materialize/icons/white/menu.png\" /></a></lu>\n");
      out.write("                        </ul>\n");
      out.write("                    </a>\n");
      out.write("            </div>  \n");
      out.write("        </nav> \n");
      out.write("        \n");
      out.write("        <!--menu response-->\n");
      out.write("        \n");
      out.write("        <ul class=\"sidenav\" id=\"menu-responsive\">\n");
      out.write("                    \n");
      out.write("            <li><a href=\"#\"> Aprendizes</a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"#\"> Alimentacion</a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"#\"> Permisos</a></li>        \n");
      out.write("        </ul>\n");
      out.write("        \n");
      out.write("        <!--------------------------------------------------->\n");
      out.write("        <!--nav secundario (opciones)--->\n");
      out.write("        \n");
      out.write("        <nav id=\"nav_menu\" class=\"hide-on-med-and-down\" >\n");
      out.write("                        <a href=\"aprendiz.jsp\">\n");
      out.write("                            <input id=\"opc_menu_2\" type=\"submit\" value=\"Inicio\"/>\n");
      out.write("                            <img src=\"iconos_nav_bar/home.png\" style=\"width: 19px; position: relative; left: -40px; top: -8px;\"/>\n");
      out.write("                        </a>   \n");
      out.write("        </nav>\n");
      out.write("        <!--**************************************************************************************************-->\n");
      out.write("\n");
      out.write("<!--**************************************************************************************************-->\n");
      out.write("        \n");
      out.write("        <!--MODULO INFORMACION USUARIO-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <label id=\"user_text\" class=\"user_text hide-on-med-and-down\">Aprendiz</label> \n");
      out.write("            ");

                HttpSession rnombre=request.getSession();
                String nom=(String)rnombre.getAttribute("datico");
     
             
      out.write("\n");
      out.write("        <p id=\"user_text\" class=\"user_text hide-on-med-and-down\">");
      out.print(nom);
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write(" <!--*********************************************************-->    \n");
      out.write("        \n");
      out.write("        <!--------FORMULARIO------------------------------------->\n");
      out.write("        \n");
      out.write("        <div class=\"container\" style=\"margin-bottom:15px;\">\n");
      out.write("            \n");
      out.write("            <div class=\"container_form_small\">\n");
      out.write("                <h1 id=\"title_container\">REGISTRO PERMISO</h1>\n");
      out.write("\n");
      out.write("                <form action=\"ServletPermiso\" enctype=\"multipart/form-data\" method=\"post\"> \n");
      out.write("                    \n");
      out.write("        ");

            int id=(int)rnombre.getAttribute("iden");

        
      out.write("\n");
      out.write("                    \n");
      out.write("                                        <div class=\"row\" id=\"container_form_small\"  style=\"height: 420px;\">\n");
      out.write("                                                           <div class=\"input-field col s12 m6 l6\">\n");
      out.write("                                                               <p id=\"input_msg\">Documento del aprendiz</p>\n");
      out.write("                                                               <br>\n");
      out.write("                                                               <input id=\"input_txt\" type=\"number\" name=\"f_numerodocumento\" placeholder=\"documento del aprendiz\" value=\"");
      out.print(id);
      out.write("\" readonly>\n");
      out.write("                                                           </div>   \n");
      out.write("\n");
      out.write("                                                                <div class=\"row\">\n");
      out.write("                                                                    <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                                        <select name=\"tipoper\" class=\"browser-default\">\n");
      out.write("                                                                            <option >elige el tipo de permiso</option>\n");
      out.write("                                                                            <option value=\"semana morning\">semana mañana</option>\n");
      out.write("                                                                            <option value=\"semana tarde\">semana tarde</option>\n");
      out.write("                                                                            <option value=\"fin de semana\">fin de semana</option>\n");
      out.write("                                                                            <option value=\"Extra\">Extra</option>\n");
      out.write("                                                                         </select>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                           \n");
      out.write("                                            \n");
      out.write("                                                            <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                               <p id=\"input_msg\">Fecha de salida</p>\n");
      out.write("                                                               <br>\n");
      out.write("                                                               <input id=\"input_txt\" type=\"date\" name=\"f_fechsal\" placeholder=\"Fecha salida\">\n");
      out.write("                                                           </div>\n");
      out.write("                                            \n");
      out.write("                                                            <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                               <p id=\"input_msg\">Fecha de ingreso</p>\n");
      out.write("                                                               <br>\n");
      out.write("                                                               <input id=\"input_txt\" type=\"date\" name=\"f_fechingre\" placeholder=\"Fecha ingreso\">\n");
      out.write("                                                           </div>\n");
      out.write("                                                           \n");
      out.write("                                                           <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                               <p id=\"input_msg\">Hora de salida</p>\n");
      out.write("                                                               <br>\n");
      out.write("                                                               <input id=\"input_txt\" type=\"time\" name=\"f_horasal\" class=\"time-picker form-control\" name=\"3\" placeholder=\"Hora salida\" value=\"08:00\">\n");
      out.write("                                                           </div>\n");
      out.write("                                            \n");
      out.write("                                                           <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                               <p id=\"input_msg\">Hora de ingreso</p>\n");
      out.write("                                                               <br>\n");
      out.write("                                                               <input id=\"input_txt\" type=\"time\" name=\"f_horaingre\" class=\"time-picker form-control\" name=\"3\" placeholder=\"Hora ingreso\" value=\"11:00\">\n");
      out.write("                                                           </div>\n");
      out.write("                                            \n");
      out.write("                                                           <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                               <p id=\"input_msg\">Motivo</p>\n");
      out.write("                                                               <br>\n");
      out.write("                                                               <input id=\"input_txt\" type=\"text\" name=\"f_moti\" placeholder=\"Motivo\">\n");
      out.write("                                                           </div>\n");
      out.write("                                            \n");
      out.write("                                                           <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                               <p id=\"input_msg\">Evidencia</p>\n");
      out.write("                                                               <br>\n");
      out.write("                                                               <input type=\"file\" name=\"f_evidenciaAdjunta\" accept=\"imagen/*\">\n");
      out.write("                                                           </div>\n");
      out.write("                                       </div>\n");
      out.write("                               \n");
      out.write("                               \n");
      out.write("<!----------------------------***********ESTILOS DE LOS BOTONES EN (buttons.css)*******************************---------------------------------------------------------->\n");
      out.write("\n");
      out.write("                                       <div id=\"div_buttom\" class=\"div_buttom col  s12\">\n");
      out.write("                                           \n");
      out.write("                                               <div id=\"btn_container\" class=\"btn_container row \">                                               \n");
      out.write("                                                    <button type=\"submit\" name=\"btn-guardar\" id=\"btn_action_guardar\" class=\"btn_action_guardar l12  m12 s12\">\n");
      out.write("                                                        <p id=\"txt_buttom\" class=\"txt_buttom\">\n");
      out.write("                                                            Enviar\n");
      out.write("                                                            <img id=\"img_buttom\" class=\"img_buttom\" src=\"icon_acciones/enviar.png\" />\n");
      out.write("                                                        </p>   \n");
      out.write("                                                    </button>  \n");
      out.write("\n");
      out.write("                                                   <a>\n");
      out.write("                                                       <button type=\"submit\" name=\"\" id=\"btn_action_eliminar\" class=\"btn_action_eliminar l12  m12 s12\">\n");
      out.write("                                                                <p id=\"txt_buttom\" class=\"txt_buttom\">\n");
      out.write("                                                                    Cancelar\n");
      out.write("                                                                    <img id=\"img_buttom\" class=\"img_buttom\" src=\"icon_acciones/cancelar.png\" />\n");
      out.write("                                                                </p>   \n");
      out.write("                                                            </button> \n");
      out.write("                                                   </a>\n");
      out.write("                                                                                                 \n");
      out.write("                                               </div>\n");
      out.write("                                           \n");
      out.write("                                         </div> \n");
      out.write("<!----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->\n");
      out.write("                           </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("               </div>   \n");
      out.write("        <!--------------------------------------------------------------------------------------------------->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <!--***************FOOTER*********************-->\n");
      out.write("       <footer class=\"page-footer\" id=\"footer_form\">\n");
      out.write("\n");
      out.write("                    <div class=\"container white-text center\">\n");
      out.write("                    © 2018 Biene-Soft\n");
      out.write("                    <br>\n");
      out.write("                    Todos los derechos reservados\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("        </footer>\n");
      out.write("        <!------------------------------------------------------------------------------------------------------>\n");
      out.write("        \n");
      out.write("                <!--importando funciones para los objetos-->    \n");
      out.write("            <script>\n");
      out.write("                document.addEventListener('DOMContentLoaded', function() {\n");
      out.write("                    M.AutoInit();\n");
      out.write("                });\n");
      out.write("            </script>  \n");
      out.write("        \n");
      out.write("            <!--JavaScript at end of body for optimized loading-->\n");
      out.write("            <script type=\"text/javascript\" src=\"materialize/js/materialize.min.js\"></script>\n");
      out.write("            <!--JS plugin Reloj-->\n");
      out.write("            <script type=\"text/javascript\" src=\"js/watch/jquery-timepicker.js\"></script>\n");
      out.write("                \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
