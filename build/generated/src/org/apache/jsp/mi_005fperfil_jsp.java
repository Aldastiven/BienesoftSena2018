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
      out.write("        <!--importando--->\n");
      out.write("            <script src=\"js/jquery.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            HttpSession rnombre=request.getSession();
            int id=(int)rnombre.getAttribute("iden");
            String nom=(String)rnombre.getAttribute("datico");
            String ape=(String)rnombre.getAttribute("apellido");
            int cel=(int)rnombre.getAttribute("celular");
            String mail=(String)rnombre.getAttribute("mail");
            String pass=(String)rnombre.getAttribute("clave");
            String foto=(String)rnombre.getAttribute("foto");
            String rol=(String)rnombre.getAttribute("rol");
        
      out.write("\n");
      out.write("\n");
      out.write("     \n");
      out.write("               <div class=\"container l12 m12 s12\">\n");
      out.write("                   <div class=\"div_container\" id=\"div_container\">\n");
      out.write("                       \n");
      out.write("                    <p>Numero de documento<input id=\"\" class=\"input_dato\" value=\"");
      out.print(id);
      out.write("\" ></p>\n");
      out.write("                      <p id=\"user_text_nombre\" class=\"user_text_nombre\"> Nombre ");
      out.print(nom);
      out.write("</p>\n");
      out.write("                       <p id=\"user_text_nombre\" class=\"user_text_nombre\">Apellido ");
      out.print(ape);
      out.write("</p>\n");
      out.write("                        <p id=\"user_text_nombre\" class=\"user_text_nombre\">Numero telefonico ");
      out.print(cel);
      out.write("</p>\n");
      out.write("                         <p id=\"user_text_nombre\" class=\"user_text_nombre\">Correo electronico");
      out.print(mail);
      out.write("</p>\n");
      out.write("                           <p id=\"user_text_nombre\" class=\"user_text_nombre\">contraseña ");
      out.print(pass);
      out.write("</p>\n");
      out.write("                            <img id=\"img_foto\" class=\"img_foto\" src=\"");
      out.print(foto);
      out.write("\" style=\"width: 80px;\"/>\n");
      out.write("                              <p id=\"user_text_nombre\" class=\"user_text_nombre\">Tipo de usuario ");
      out.print(rol);
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("               </div>\n");
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
