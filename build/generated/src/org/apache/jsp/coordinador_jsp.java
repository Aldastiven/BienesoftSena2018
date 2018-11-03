package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>Bienesoft | home Coordinador</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"main.css\" />\n");
      out.write("    <script src=\"main.js\"></script>\n");
      out.write("    \n");
      out.write("    <!--estilo body-->\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css/body.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("    <!--estilo materialize.css-->\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"materialize/css/materialize.min.css\"  media=\"screen,projection\"/>    \n");
      out.write("\n");
      out.write("    <!--estilo encabezado-->\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css_index_user/encabezado.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("    <!--estilo footer-->\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css_index_user/footer.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("    <!--estilo menu tajetas-->\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css_index_user/cards-prueba.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("    <!--importando--->\n");
      out.write("            <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!--*******************************OBJETO NAV RESPONSIVE***************************-->\n");
      out.write("        \n");
      out.write("        <!--nav principal--->\n");
      out.write("        \n");
      out.write("        <nav class=\"nav-wrapper\" id=\"nav_principal\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("    \n");
      out.write("                    <a id=\"logo_encab\"  href=\"#\" class=\"brand-logo hide-on-small-only black-text\">Biene-Soft</a>\n");
      out.write("                    \n");
      out.write("                    <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \n");
      out.write("                        <i>\n");
      out.write("                            <!--<img style=\"width: 25px; margin-top: 10px;\" src=\"materialize/icons/white/menu.png\" />-->\n");
      out.write("                        </i>\n");
      out.write("                        \n");
      out.write("                            <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                            <!--<ul id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"\" /></a></lu>-->\n");
      out.write("                            </ul>\n");
      out.write("                    </a>\n");
      out.write("                    \n");
      out.write("                        <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \n");
      out.write("                            <ul  class=\"right hide-on-med-and-down\">\n");
      out.write("                                <!--<ul id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"\" /></a></lu>-->\n");
      out.write("                            </ul>\n");
      out.write("                        </a>\n");
      out.write("                    \n");
      out.write("                        <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \n");
      out.write("                            <ul  class=\"right hide-on-med-and-down\">\n");
      out.write("                                <!--<ul id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"\" /></a></lu>-->\n");
      out.write("                            </ul>\n");
      out.write("                        </a>\n");
      out.write("                </div>  \n");
      out.write("            </nav> \n");
      out.write("            \n");
      out.write("<!------------------------------------------------------------------------------------------------------>\n");
      out.write("\n");
      out.write("            <!--------------------objeto perfil--------------------------------------------------->\n");
      out.write("\n");
      out.write("            <div class=\"row contenedor-perfil hide-on-med-and-down\">\n");
      out.write("                             ");

                                HttpSession rnombre=request.getSession();
                                String nom=(String)rnombre.getAttribute("datico");
                                String fot=(String)rnombre.getAttribute("foto");
                             
      out.write("\n");
      out.write("\n");
      out.write("                             <img id=\"img_foto\" class=\"img_foto\" src=\"");
      out.print(fot);
      out.write("\" />\n");
      out.write("                             \n");
      out.write("                             <div id=\"cont_name\" class=\"cont_name\">\n");
      out.write("                                    <label id=\"msg_user\" class=\"msg_user\">Coordinador</label>\n");
      out.write("\n");
      out.write("                                    <p id=\"user_text_nombre\" class=\"user_text_nombre\">");
      out.print(nom);
      out.write("</p>\n");
      out.write("                             </div>\n");
      out.write("                             \n");
      out.write("            </div>\n");
      out.write("                             \n");
      out.write("            <!----------------------botones de usuario---------------------------------->                 \n");
      out.write("            \n");
      out.write("            <div class=\"contenedor_btn hide-on-med-and-down\"  id=\"contenedor_btn\">\n");
      out.write("                \n");
      out.write("                <div class=\"btn_ver_perfil\" id=\"btn_ver_perfil\">\n");
      out.write("                    ver perfil\n");
      out.write("                    <img style=\"width: 20px;\" src=\"css_index_user/icons/coordinador/btn_user.png\" />\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("                <div class=\"btn_ver_usuarios\" id=\"btn_ver_usuarios\">\n");
      out.write("                    consultar usuarios\n");
      out.write("                    <img style=\"width: 20px;\" src=\"css_index_user/icons/coordinador/btn_users.png\" />\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!------------------objeto opciones-------------------------------------------->\n");
      out.write("            <div class=\" contenedor-principal container row l12 m12 s12\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    \n");
      out.write("                    <a href=\"t_permiso_coordinador.jsp\">\n");
      out.write("                        <div class=\"option_menu col s12 l2 m12\">\n");
      out.write("                            <p class=\"head_info\" id=\"head_info\"> permisos </p>\n");
      out.write("                            <img src=\"css_index_user/icons/coordinador/menu_permiso.png\" />\n");
      out.write("                            <p class=\"info_text_menu\" id=\"info_text_menu\">Quieres tener informacion acerca de los permisos, ingresa aqui</p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    \n");
      out.write("                    <a href=\"t_aprendiz.jsp\">\n");
      out.write("                        <div class=\"option_menu col s12 l2 m12\">\n");
      out.write("                            <p class=\"head_info\" id=\"head_info\"> aprendices </p>\n");
      out.write("                            <img src=\"css_index_user/icons/coordinador/menu_aprendiz.png\" />\n");
      out.write("                            <p class=\"info_text_menu\" id=\"info_text_menu\">Quieres tener informacion acerca de los aprendices, ingresa aqui</p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    \n");
      out.write("                    <a href=\"t_ficha.jsp\">\n");
      out.write("                        <div class=\"option_menu col s12 l2 m12\">\n");
      out.write("                            <p class=\"head_info\" id=\"head_info\"> fichas </p>\n");
      out.write("                            <img src=\"css_index_user/icons/coordinador/menu_fichas.png\" />\n");
      out.write("                            <p class=\"info_text_menu\" id=\"info_text_menu\">Quieres tener informacion acerca de las fichas, ingresa aqui</p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    \n");
      out.write("                    <a href=\"t_patrocinio.jsp\">\n");
      out.write("                        <div class=\"option_menu col s12 l2 m12\">\n");
      out.write("                            <p class=\"head_info\" id=\"head_info\"> patrocinios </p>\n");
      out.write("                            <img src=\"css_index_user/icons/coordinador/menu_patrocino.png\" />\n");
      out.write("                            <p class=\"info_text_menu\" id=\"info_text_menu\">Quieres tener informacion acerca de los patrocinios, ingresa aqui</p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    \n");
      out.write("                    <a href=\"t_habitacion.jsp\">\n");
      out.write("                        <div class=\"option_menu col s12 l2 m12\">\n");
      out.write("                            <p class=\"head_info\" id=\"head_info\"> habitaciones </p>\n");
      out.write("                            <img src=\"css_index_user/icons/coordinador/menu_habitacion.png\" />\n");
      out.write("                            <p class=\"info_text_menu\" id=\"info_text_menu\">Quieres tener informacion acerca de las habitaciones, ingresa aqui</p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("<!--***************FOOTER*********************-->\n");
      out.write("\n");
      out.write("        <footer class=\"page-footer\" id=\"footer_form\">\n");
      out.write("                <div class=\"text_footer\">\n");
      out.write("                © 2018 Biene-Soft\n");
      out.write("                <br>\n");
      out.write("                Todos los derechos reservados\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("        </footer>\n");
      out.write("<!------------------------------------------------------------------------------------------------------>\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("<!--importando funciones para los objetos-->    \n");
      out.write("<script>\n");
      out.write("    document.addEventListener('DOMContentLoaded', function() {\n");
      out.write("        M.AutoInit();\n");
      out.write("    });\n");
      out.write("</script>    \n");
      out.write("\n");
      out.write("    \n");
      out.write("<!--JavaScript at end of body for optimized loading-->\n");
      out.write("<script type=\"text/javascript\" src=\"materialize/js/materialize.min.js\"></script>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>");
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
