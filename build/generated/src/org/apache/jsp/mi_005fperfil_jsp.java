package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mi_005fperfil_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <!--estilo body-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/body.css\" media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("         <!--estilo perfil-->\n");
      out.write("         <link type=\"text/css\" rel=\"stylesheet\" href=\"css/perfil/perfil.css\" media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("        <!--estilo materialize.css-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"materialize/css/materialize.min.css\"  media=\"screen,projection\"/>    \n");
      out.write("            \n");
      out.write("          <!--estilo de la registro--> \n");
      out.write("          <link type=\"text/css\" rel=\"stylesheet\" href=\"css/perfil/perfil.css\"  media=\"screen,projection\"/>\n");
      out.write("               \n");
      out.write("            \n");
      out.write("        <!--importando--->\n");
      out.write("            <script src=\"js/jquery.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write(" \n");
      out.write("        \n");
      out.write("        ");

            HttpSession rnombre=request.getSession();
            int id=(int)rnombre.getAttribute("iden");
            String nom=(String)rnombre.getAttribute("nombre");
            String ape=(String)rnombre.getAttribute("apellido");
            int cel=(int)rnombre.getAttribute("celular");
            String mail=(String)rnombre.getAttribute("mail");
            String pass=(String)rnombre.getAttribute("clave");
            String foto=(String)rnombre.getAttribute("foto");
            String rol=(String)rnombre.getAttribute("rol");
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h1 id=\"title_container\">Mi perfil</h1>\n");
      out.write("           \n");
      out.write("           <div class=\"container\" style=\"margin-bottom:15px;\">\n");
      out.write("                        <div class=\"contenedor_blanco\">\n");
      out.write("                                            <form action=\"ServletPermiso\" enctype=\"multipart/form-data\" method=\"post\"> \n");
      out.write("                                                        <div class=\"row\" id=\"container_form_large\">\n");
      out.write("                                                                    <div class=\"encab\" id=\"encab\" style=\"alignment-adjust: central;\">\n");
      out.write("                                                                        <img id=\"img_fotoperfil\" class=\"img_fotoperfil\" src=\"");
      out.print(foto);
      out.write("\"/>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    \n");
      out.write("                                                                    <div class=\"linea\" id=\"linea\">\n");
      out.write("                                                                        <br>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    \n");
      out.write("\n");
      out.write("                                                                    <div class=\"input-field col s12 m6 l6\">\n");
      out.write("                                                                        <p id=\"input_msg\">tu numero de identificacion</p>\n");
      out.write("                                                                        <br>\n");
      out.write("                                                                        <input id=\"input_txt\" type=\"number\" name=\"\" placeholder=\"\" value=\"");
      out.print(id);
      out.write("\" readonly>\n");
      out.write("                                                                    </div>   \n");
      out.write("\n");
      out.write("                                                                     <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                                        <p id=\"input_msg\">Nombres</p>\n");
      out.write("                                                                        <br>\n");
      out.write("                                                                        <input id=\"input_txt\" type=\"text\" name=\"\" placeholder=\"\" value=\"");
      out.print(nom);
      out.write("\">\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("                                                                     <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                                        <p id=\"input_msg\">Apellidos</p>\n");
      out.write("                                                                        <br>\n");
      out.write("                                                                        <input id=\"input_txt\" type=\"text\" name=\"\" placeholder=\"\" value=\"");
      out.print(ape);
      out.write("\">\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("                                                                    <div class=\"input-field col s12 m6 l6\">\n");
      out.write("                                                                        <p id=\"input_msg\">numero telefonico</p>\n");
      out.write("                                                                        <br>\n");
      out.write("                                                                        <input id=\"input_txt\" type=\"number\" name=\"\" placeholder=\"\" value=\"");
      out.print(cel);
      out.write("\" readonly>\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("                                                                    <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                                        <p id=\"input_msg\">Correo electronico</p>\n");
      out.write("                                                                        <br>\n");
      out.write("                                                                        <input id=\"input_txt\" type=\"text\" name=\"\" class=\"\" name=\"\" placeholder=\"\" value=\"");
      out.print(mail);
      out.write("\">\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("                                                                    <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                                        <p id=\"input_msg\">Contraseña</p>\n");
      out.write("                                                                        <br>\n");
      out.write("                                                                        <input id=\"input_txt\" type=\"text\" name=\"\" placeholder=\"\" value=\"");
      out.print(pass);
      out.write("\">\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("                                                                    <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                                        <p id=\"input_msg\">Tipo de usuario</p>\n");
      out.write("                                                                        <br>\n");
      out.write("                                                                        <input id=\"input_txt\" type=\"text\" name=\"\" placeholder=\"\" value=\"");
      out.print(rol);
      out.write("\">\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    \n");
      out.write("                                                                    <div class=\"col s12 l6 m6\" >\n");
      out.write("                                                                        <img src=\"icon_acciones/icons8-lápiz-64.png\">\n");
      out.write("                                                                    </div>\n");
      out.write("                                                       </div>\n");
      out.write("                                           </form>\n");
      out.write("                            </div>   \n");
      out.write("               </div>   \n");
      out.write("               \n");
      out.write("               \n");
      out.write("\n");
      out.write("               \n");
      out.write("        <!--importando funciones para los objetos-->    \n");
      out.write("            <script>\n");
      out.write("                document.addEventListener('DOMContentLoaded', function() {\n");
      out.write("                    M.AutoInit();\n");
      out.write("                });\n");
      out.write("            </script>  \n");
      out.write("        \n");
      out.write("            <!--JavaScript at end of body for optimized loading-->\n");
      out.write("            <script type=\"text/javascript\" src=\"materialize/js/materialize.min.js\"></script>\n");
      out.write("               \n");
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
