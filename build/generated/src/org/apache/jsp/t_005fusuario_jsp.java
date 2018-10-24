package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.consultas;
import modelo.usuarioSG;
import java.util.ArrayList;

public final class t_005fusuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Tabla usuario</h1>\n");
      out.write("        <table align=\"center\" border=\"1\" width=\"800\">\n");
      out.write("            <tr bgcolor=\"#A9CCE3\" border=\"1\">\n");
      out.write("                <th colspan=\"9\" class=\"center\">Tabla usuario</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr bgcolor=\"skyblue\">\n");
      out.write("                <th class=\"center\">Numero documento</th>\n");
      out.write("                <th class=\"center\">Nombre</th>\n");
      out.write("                <th class=\"center\">Apellido</th>\n");
      out.write("                <th class=\"center\">Celular</th>\n");
      out.write("                <th class=\"center\">Email</th>\n");
      out.write("                <th class=\"center\">Foto perfil</th>\n");
      out.write("                <th class=\"center\">Password</th>\n");
      out.write("                <th class=\"center\">Tipo rol</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                ArrayList<usuarioSG> listdat=new ArrayList<>(); 
                consultas con=new consultas();
                listdat=con.consultaUsuario();
                usuarioSG igs=new usuarioSG();
                
                for(int i=0; i<listdat.size(); i++){
                    igs=listdat.get(i);
                    String photo=igs.getUsufoto();
            
      out.write("\n");
      out.write("            \n");
      out.write("        <form action=\"ServletUsuario\">\n");
      out.write("        <tr>\n");
      out.write("            <td><input  name=\"t_doc\" value=\"");
      out.print(igs.getUsudoc());
      out.write("\" type=\"number\"></td>\n");
      out.write("            <td><input  name=\"t_nom\" value=\"");
      out.print(igs.getUsunom());
      out.write("\"  type=\"text\"></td>\n");
      out.write("            <td><input  name=\"t_ape\" value=\"");
      out.print(igs.getUsuape());
      out.write("\" type=\"text\"></td>\n");
      out.write("            <td><input  name=\"t_cel\" value=\"");
      out.print(igs.getUsucel());
      out.write("\" type=\"number\"></td>\n");
      out.write("            <td><input  name=\"t_ema\" value=\"");
      out.print(igs.getUsuemail());
      out.write("\" type=\"email\"></td>\n");
      out.write("            <td><img src=\"");
      out.print(igs.getUsufoto());
      out.write("\" width=\"60\" height=\"60\"/></td>\n");
      out.write("            <td><input  name=\"t_pas\" value=\"");
      out.print(igs.getUsuclave());
      out.write("\" type=\"text\"></td>\n");
      out.write("            <td><input  name=\"t_rol\" value=\"");
      out.print(igs.getUsurol());
      out.write("\" type=\"text\"></td>\n");
      out.write("        \n");
      out.write("            <td><input type=\"submit\" name=\"btn-modificar\" value=\"Modificar\"></td>\n");
      out.write("            <td><input type=\"submit\" name=\"btn-eliminar\" value=\"Eliminar\"></td>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        ");

            }
        
      out.write("    \n");
      out.write("        </table>\n");
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
