package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.consultas;
import modelo.permisoSG;
import java.util.ArrayList;

public final class t_005fpermiso_005fcoordinador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <title>BieneSoft | Permiso Coordinador</title>\n");
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
      out.write("            <!--estilo de la acordion--> \n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/acordion_busqueda.css\"  media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo modal-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/modal.css\" media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo de la botones--> \n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/buttons.css\"  media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo de la registro--> \n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/formulario.css\"  media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo footer-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/footer.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("            <!--estilo materialize.css-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"materialize/css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("            <!--importando--->\n");
      out.write("            <script src=\"js/jquery.js\"></script>\n");
      out.write("            \n");
      out.write("            <!--buscador-->\n");
      out.write("            <script src=\"js/buscadorfacil/BuscadorTabla.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!--*******************************OBJETO NAV RESPONSIVE***************************-->\n");
      out.write("        \n");
      out.write("        <!--nav principal--->\n");
      out.write("        \n");
      out.write("        <nav class=\"nav-wrapper\" id=\"nav_principal\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \n");
      out.write("                    <i>\n");
      out.write("                        <img style=\"width: 25px; margin-top: 10px;\" src=\"materialize/icons/white/menu.png\" />\n");
      out.write("                    </i>\n");
      out.write("                    <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                        <lu id=\"li\" title=\"cerrar cesion\"><a href=\"index.jsp\"><img style=\"width: 25px; margin-top: 10px;\" src=\"icon_acciones/salida.png\" /></a></lu>\n");
      out.write("                    </ul>\n");
      out.write("                </a>\n");
      out.write("                \n");
      out.write("                <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \n");
      out.write("                    <ul  class=\"right hide-on-med-and-down\">\n");
      out.write("                        <lu id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"\" /></a></lu>\n");
      out.write("                    </ul>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \n");
      out.write("                    <ul  class=\"right hide-on-med-and-down\">\n");
      out.write("                        <lu id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"\" /></a></lu>\n");
      out.write("                    </ul>\n");
      out.write("                </a>\n");
      out.write("            </div>  \n");
      out.write("        </nav> \n");
      out.write("        \n");
      out.write("        <!--menu response-->\n");
      out.write("        <ul class=\"sidenav\" id=\"menu-responsive\">\n");
      out.write("                    \n");
      out.write("            <li><a href=\"t_permiso_coordinador.jsp\">Permisos</a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"t_aprendiz\">Aprendices</a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"t_ficha.jsp\">Fichas</a></li>\n");
      out.write("            \n");
      out.write("            <li><a href=\"t_aprendiz_rel_patrocinio.jsp\">Patrocinios</a></li> \n");
      out.write("            \n");
      out.write("            <li><a href=\"t_habitacion.jsp\">Habitaciones</a></li>        \n");
      out.write("        </ul>\n");
      out.write("        \n");
      out.write("        <!--------------------------------------------------->\n");
      out.write("\n");
      out.write("        <!--nav secundario (opciones)--->\n");
      out.write("        <nav id=\"nav_menu\" class=\"hide-on-med-and-down\" >\n");
      out.write("            <a href=\"coordinador.jsp\">\n");
      out.write("                <input id=\"opc_menu_2\" type=\"submit\" value=\"Inicio\"/>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"t_permiso_coordinador.jsp\">\n");
      out.write("                <input id=\"opc_menu_2\" type=\"submit\" value=\"Permisos\"/>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <a href=\"t_aprendiz.jsp\">\n");
      out.write("                <input id=\"opc_menu_2\" type=\"submit\" value=\"Aprendices\"/>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <a href=\"t_ficha.jsp\">\n");
      out.write("                <input id=\"opc_menu_2\" type=\"submit\" value=\"Fichas\"/>\n");
      out.write("            </a>    \n");
      out.write("\n");
      out.write("            <a href=\"t_aprendiz_rel_patrocinio.jsp\">\n");
      out.write("                <input id=\"opc_menu_2\" type=\"submit\" value=\"Patrocinio\"/>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <a href=\"t_habitacion.jsp\">\n");
      out.write("                <input id=\"opc_menu_2\" type=\"submit\" value=\"Habitaciones\"/>\n");
      out.write("            </a>\n");
      out.write("        </nav>\n");
      out.write("        <!--**************************************************************************************************-->\n");
      out.write("        \n");
      out.write("        <!--MODULO INFORMACION USUARIO-->\n");
      out.write("        <label id=\"user_text\" class=\"user_text hide-on-med-and-down\">Coordinador</label> \n");
      out.write("            ");

                HttpSession rnombre=request.getSession();
                String nom=(String)rnombre.getAttribute("nombre");
            
      out.write("\n");
      out.write("        <p id=\"user_text\" class=\"user_text hide-on-med-and-down\">");
      out.print(nom);
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--*********************************************************-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--*******************************OBJETO  MODULO CONSULTAS------------------------>\n");
      out.write("\n");
      out.write("        <div class=\"container hide-on-small-only\">\n");
      out.write("            <div id=\"search-container\"  class=\"browser-default\">\n");
      out.write("                <!--ComoboBox-->\n");
      out.write("                <form action=\"t_permiso_coordinador.jsp\" method=\"post\">\n");
      out.write("                    \n");
      out.write("                    <!--Filtro busqueda id-->\n");
      out.write("                    <input id=\"searchTerm\" class=\"searchTerm\" type=\"text\" name=\"documento\" onkeyup=\"doSearch()\" placeholder=\"busca\" style=\"border: 1px solid gray; float: left; width: 170px; margin-right: 120px\" class=\"browser-default\"/>\n");
      out.write("                 \n");
      out.write("                    <!--combobox--> \n");
      out.write("                    <select id=\"ComboFiltro\" name=\"cbx_tipo_per\" class=\"browser-default searchTerm\" style=\"width: 170px; float:left; border: 1px solid gray;\">\n");
      out.write("                        <option value=\"\">Todo</option>\n");
      out.write("                        <option value=\"semana morning\">Semana - Mañana</option>\n");
      out.write("                        <option value=\"semana tarde\">Semana - Tarde</option>\n");
      out.write("                        <option value=\"fin de semana\">Fin de semana</option>\n");
      out.write("                        <option value=\"extra\">Extra</option>\n");
      out.write("                    </select>\n");
      out.write("                    \n");
      out.write("                    <button id=\"btn_ver\" type=\"submit\" value=\"Ingresar\" name=\"\" style=\"float: left; background: transparent; cursor: pointer; position:relative; bottom:10px; border:none\">\n");
      out.write("                        <img src=\"icon_acciones/icon_buscar.png\" title=\"Buscar\" style=\" cursor: pointer; width: 30px;\"/>\n");
      out.write("                    </button>\n");
      out.write("                </form> \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"btn-search-principal\" class=\"btn-search-principal hide-on-med-and-up\">\n");
      out.write("            <img src=\"materialize/icons/white/search.png\" />\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"btn-search-close\" class=\"btn-search-close hide-on-med-and-up\">\n");
      out.write("            <img src=\"materialize/icons/white/close.png\" />\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"modal-container\" class=\"modal-container container hide-on-med-and-up\">\n");
      out.write("            <div id=\"search-container-modal\" class=\"col s12\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("         \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--**************************************************************************************************-->\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!--*******************************OBJETO TABLA***************************-->\n");
      out.write("        \n");
      out.write(" <div class=\"container l12 m12 s12 hide-on-small-only\">\n");
      out.write("    <h1 id=\"title_container\">PERMISOS</h1>\n");
      out.write(" \n");
      out.write("         <div id=\"table\"  class=\"table\" style=\"margin-top: -10px;\">\n");
      out.write("     \n");
      out.write("                <table class=\"table scrolling\">\n");
      out.write("                    \n");
      out.write("                    <div id=\"datos\" class=\" col red\">\n");
      out.write("                    \n");
      out.write("                              \n");
      out.write("                    ");

                        ArrayList<permisoSG> lisdat = new ArrayList<>();
                        consultas con = new consultas();

                        String cbx_tipo_per=request.getParameter("cbx_tipo_per");
                        String documento=request.getParameter("documento");
                        
                        if(cbx_tipo_per!=null & documento!=null) {
                            if(cbx_tipo_per.equalsIgnoreCase("elije")) {
                            cbx_tipo_per = null;
                            }
                            if(documento.equalsIgnoreCase("busca")) {
                                documento = null;
                            }
                        }

                        lisdat = con.consultarPermiso(cbx_tipo_per, documento);
                        permisoSG x = new permisoSG();
                        int i;
                        for(i=0; i<lisdat.size(); i++){
                            x = lisdat.get(i);
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                 ");

                   }
                
      out.write("                  \n");
      out.write("               \n");
      out.write("                <div onclick=\"ver_modal()\" id=\"btn-ver-permiso-coordinador\" class=\"btn-ver-permiso-coordinador\" title=\"consultar aprendiz\">\n");
      out.write("                        <img src=\"icon_acciones/ver.png\" style=\"padding-left: 15px\"/>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                </table>  \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</div>  \n");
      out.write("                \n");
      out.write("                <!-----------------------------OBJETO ACORDION------------------------------------------->\n");
      out.write("<div class=\"container div_principal hide-on-med-and-up\" id=\"container\">\n");
      out.write("    <h1 id=\"title\">consultas permisos</h1>\n");
      out.write("            <div id=\"div_principal\" class=\"\">              \n");
      out.write("                ");

                    ArrayList <permisoSG> consulta = new ArrayList<>();
                    consulta = con.consultarPermiso(cbx_tipo_per, documento);
                    for (int e = 0; e< consulta.size(); e++ ){
                    x= consulta.get(e);
                
      out.write("\n");
      out.write("                <div class=\"divuno\" id=\"divuno\">\n");
      out.write("                    <input class=\"browser-default\" id=\"txt\" type=\"text\"  value=\" ");
      out.print(x.getPer_Aprendiz_Apr_documento());
      out.write(" \" readonly>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"divdos\" id=\"divdos\">\n");
      out.write("                    Consultar\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("        ");

            }
        
      out.write("               \n");
      out.write("            </div> \n");
      out.write("</div>\n");
      out.write("<!--------------------------------------------------------------------------------------------------->\n");
      out.write("  \n");
      out.write("    <!--***************FOOTER*********************-->\n");
      out.write("   <footer class=\"page-footer\" id=\"footer_form\">\n");
      out.write("       <div class=\"container white-text center\">\n");
      out.write("       © 2018 Biene-Soft\n");
      out.write("       <br>\n");
      out.write("       Todos los derechos reservados\n");
      out.write("       </div>      \n");
      out.write("   </footer>\n");
      out.write("        <!------------------------------------------------------------------------------------------------------>\n");
      out.write("                \n");
      out.write("\n");
      out.write("    <!--importando funciones para los objetos-->    \n");
      out.write("    <script>\n");
      out.write("        document.addEventListener('DOMContentLoaded', function() {\n");
      out.write("            M.AutoInit();\n");
      out.write("        });\n");
      out.write("    </script>    \n");
      out.write("    \n");
      out.write("    <!--importando la funcion modal resultado-tabla-->\n");
      out.write("    <script src=\"js/modal-tabla/main.js\"></script>\n");
      out.write("  \n");
      out.write("    <!--importando la funcion de modal-busqueda-->\n");
      out.write("    <script src=\"js/modulo-busqueda/main.js\"></script>\n");
      out.write("    \n");
      out.write("    <!--importando la funcion de modal-acordion-->\n");
      out.write("    <script src=\"js/tabla-acordion/main.js\"\n");
      out.write("        \n");
      out.write("    <!--JavaScript at end of body for optimized loading-->\n");
      out.write("    <script type=\"text/javascript\" src=\"materialize/js/materialize.min.js\"></script>\n");
      out.write("\n");
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
