package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--LOGIN BIENESOFT-->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("            <!--Let browser know website is optimized for mobile-->\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/> \n");
      out.write("            \n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("            <!--importando imagen y texto en pestaña-->\n");
      out.write("            <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"materialize/icons/black/ver_lista.png\" />\n");
      out.write("            <title>BieneSoft | Inicio</title>\n");
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
      out.write("\n");
      out.write("            <!--estilo materialize.css-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"materialize/css/materialize.min.css\"  media=\"screen,projection\"/>    \n");
      out.write("            \n");
      out.write("            <!--importando--->\n");
      out.write("            <script src=\"js/jquery.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body> \n");
      out.write("        \n");
      out.write("        <!--*******************************OBJETO NAV RESPONSIVE***************************-->\n");
      out.write("        \n");
      out.write("        <!--nav principal--->\n");
      out.write("        \n");
      out.write("        <nav class=\"nav-wrapper\" id=\"nav_principal\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <a id=\"logo_encab\"  href=\"#\" class=\"brand-logo hide-on-small-only\">Biene-Soft</a>\n");
      out.write("\n");
      out.write("                    <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \n");
      out.write("                        <ul  class=\"right hide-on-med-and-down\">\n");
      out.write("                            <lu id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"\" /></a></lu>\n");
      out.write("                        </ul>\n");
      out.write("                    </a>\n");
      out.write("                \n");
      out.write("                    <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \n");
      out.write("                        <ul  class=\"right hide-on-med-and-down\">\n");
      out.write("                            <lu id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"\" /></a></lu>\n");
      out.write("                        </ul>\n");
      out.write("                    </a>\n");
      out.write("                \n");
      out.write("                    <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \n");
      out.write("                        <ul  class=\"right hide-on-med-and-down\">\n");
      out.write("                            <lu id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"\" /></a></lu>\n");
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
      out.write("\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    \n");
      out.write(" <div class=\"container l12 m12 s12 \">\n");
      out.write("                <br>\n");
      out.write("                <br>   \n");
      out.write("                    <div class=\"row l12 m12 s12\">\n");
      out.write("\n");
      out.write("                        <div class=\"col l6 m7 s12\">\n");
      out.write("\n");
      out.write("                            <form action=\"ServletLogin\">\n");
      out.write("\n");
      out.write("                             <div id=\"container-login\" class=\"container-login l12 m12 s12\">\n");
      out.write("                                 <h4 class=\"header-login\" id=\"header-login\" >ingresa</h4>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                           <div class=\"col l12 m12 s12\">\n");
      out.write("                               <p id=\"login_input_msg\" class=\"login_input_msg\">Usuario</p>\n");
      out.write("                                <br>\n");
      out.write("                                <input id=\"txt_user\" type=\"text\" class=\" s12 l612 m12\" name=\"user\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col l12 m12 s12\">\n");
      out.write("                                <p id=\"login_input_msg\" class=\"txt_user login_input_msg\">Contraseña</p>\n");
      out.write("                                <br>\n");
      out.write("                                <input id=\"txt_user\" type=\"password\" class=\"txt_user s12 l6 m12\" name=\"pass\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                                \n");
      out.write("                                    <button id=\"btn-Ingreso\" class=\"btn-Ingreso\" name=\"btn-entrar\" >\n");
      out.write("                                    <p id=\"msg-btn\" class=\"msg-btn\">entrar</p>\n");
      out.write("                                    </button>\n");
      out.write("                            \n");
      out.write("                                \n");
      out.write("                            <p href=\"#recover\" id=\"msg-remember\" class=\"msg-remember\">No recuerdas tu contraseña?</p>\n");
      out.write("                            \n");
      out.write("                            </div> \n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col l6 m5 s12\">\n");
      out.write("                        <img src=\"img-login/index.jpg\" class=\" responsive-img hide-on-small-only\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("            <!--importando funciones para los objetos-->    \n");
      out.write("            <script>\n");
      out.write("                document.addEventListener('DOMContentLoaded', function() {\n");
      out.write("                    M.AutoInit();\n");
      out.write("                });\n");
      out.write("            </script>    \n");
      out.write("\n");
      out.write("            <!--importando la funcion modal resultado-tabla-->\n");
      out.write("            <script src=\"js/modal-tabla/main.js\"></script>\n");
      out.write("\n");
      out.write("            <!--importando la funcion de modal-busqueda-->\n");
      out.write("            <script src=\"js/modulo-busqueda/main.js\"></script>\n");
      out.write("\n");
      out.write("            <!--JavaScript at end of body for optimized loading-->\n");
      out.write("            <script type=\"text/javascript\" src=\"materialize/js/materialize.min.js\"></script>\n");
      out.write("    \n");
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
