package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import modelo.consultas;
import modelo.usuarioSG;

public final class coordinador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("            <!--Let browser know website is optimized for mobile-->\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/> \n");
      out.write("            \n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("            <!--importando imagen y texto en pestaña-->\n");
      out.write("            <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"materialize/icons/black/ver_lista.png\" />\n");
      out.write("            <title>BieneSoft | Home Coordinador</title>\n");
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
      out.write("            <!--estilo de la tabla--> \n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"\"  media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo modulo busqueda-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/login.css\" media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo cards menu-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/cards.css\" media=\"screen,projection\"/>\n");
      out.write(" \n");
      out.write("            <!--estilo materialize.css-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"materialize/css/materialize.min.css\"  media=\"screen,projection\"/>    \n");
      out.write("            \n");
      out.write("            <!--importando--->\n");
      out.write("            <script src=\"js/jquery.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--*******************************OBJETO NAV RESPONSIVE***************************-->\n");
      out.write("        \n");
      out.write("        <!--nav principal--->\n");
      out.write("        \n");
      out.write("        <nav class=\"nav-wrapper\" id=\"nav_principal\">     \n");
      out.write("\n");
      out.write("            <div id=\"foto-icon\" class=\"foto-icon\">\n");
      out.write("  \n");
      out.write("                    ");

                        HttpSession rfoto=request.getSession();
                        String fot=(String)rfoto.getAttribute("fotico");
                     
      out.write("\n");
      out.write("                     \n");
      out.write("                      <p id=\"user_text\" class=\"user_text\">");
      out.print(fot);
      out.write("</p>\n");
      out.write("                      <img src=\"");
      out.print(fot);
      out.write("\" width=\"60\" height=\"60\"/>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write("            <div class=\"container\">   \n");
      out.write("  \n");
      out.write("                <a id=\"logo_encab\"  href=\"#\" class=\"brand-logo hide-on-small-only\">Biene-Soft</a>\n");
      out.write("\n");
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
      out.write("        <ul class=\"sidenav\" id=\"menu-responsive\">              \n");
      out.write("            <li><a href=\"#\"> Aprendizes</a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"#\"> Alimentacion</a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"#\"> Permisos</a></li>        \n");
      out.write("        </ul>\n");
      out.write("        \n");
      out.write("        <!--------------------------------------------------->\n");
      out.write("        \n");
      out.write("        <!--MODULO INFORMACION USUARIO-->\n");
      out.write("         \n");
      out.write("    \n");
      out.write("                <label id=\"user_text\" class=\"user_text\">Coordinador</label> \n");
      out.write("                    ");

                        HttpSession rnombre=request.getSession();
                        String nom=(String)rnombre.getAttribute("datico");
                     
      out.write("\n");
      out.write("                <p id=\"user_text\" class=\"user_text\">");
      out.print(nom);
      out.write("</p>\n");
      out.write("    \n");
      out.write("          \n");
      out.write("          <!--*********************************************************-->\n");
      out.write("       \n");
      out.write("        <!--*****************************CARDS MENU************************************-->\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col s12 m10 l4\">\n");
      out.write("                        <div id=\"cards\" class=\"cards card small\">\n");
      out.write("                            <div class=\"card-image\">\n");
      out.write("                                <img src=\"imagenes/man.png\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"card-content\">\n");
      out.write("                                <p>Conoce la informacion acerca de los aprendizes</p>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"card-action center\">\n");
      out.write("                                <a href=\"#\" class=\"center\">Ver lista</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col s12 m10 l4\">\n");
      out.write("                        <div id=\"cards\" class=\"cards card small\">\n");
      out.write("                                <div class=\"card-image\">\n");
      out.write("                                    <img src=\"imagenes/comida.png\" class=\"responsive-img\">\n");
      out.write("                                </div>\n");
      out.write("    \n");
      out.write("                                <div class=\"card-content\">\n");
      out.write("                                    <p>Conoce la informacion acerca de la alimentacion</p>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"footer-card card-action center\">\n");
      out.write("                                    <a href=\"#\" class=\"center\">Ver lista</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col s12 m10 l4\">\n");
      out.write("                                <div id=\"cards\" class=\" cards card small\">\n");
      out.write("                                    <div class=\"card-image\">\n");
      out.write("                                        <img src=\"imagenes/icono_permisos.png\" class=\"responsive-img\">\n");
      out.write("                                    </div>\n");
      out.write("        \n");
      out.write("                                    <div class=\"card-content\">\n");
      out.write("                                        <p>Conoce la informacion acerca de los permisos</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"card-action center\">\n");
      out.write("                                        <a href=\"#\" class=\"center\">Ver lista</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>    \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        <!--**************************************************************************************************-->\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
