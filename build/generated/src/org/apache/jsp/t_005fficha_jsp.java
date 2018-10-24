package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.consultas;
import java.sql.Date;
import java.util.ArrayList;
import modelo.fichaSG;

public final class t_005fficha_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>t_ficha</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table align=\"center\" border=\"1\" width=\"800\">\n");
      out.write("            <tr bgcolor=\"#A9CCE3\" border=\"1\">\n");
      out.write("                <th colspan=\"9\" class=\"center\">Tabla ficha</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr bgcolor=\"skyblue\">\n");
      out.write("                <th>Numero</th>\n");
      out.write("                <th>Nombre Programa</th>\n");
      out.write("                <th>Jornada</th>\n");
      out.write("                <th>Fic_inicio_etapa_electiva</th>\n");
      out.write("                <th>Fic_fin_etapa_electiva</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                
                
                ArrayList<fichaSG> listdat=new ArrayList<>(); 
                consultas con=new consultas();
                listdat=con.consultaFicha();
                fichaSG igs=new fichaSG();
                
                for(int i=0; i<listdat.size(); i++){
                    igs=listdat.get(i);

            
      out.write("  \n");
      out.write("              \n");
      out.write("              \n");
      out.write("            <form action=\"ServletFicha\">\n");
      out.write("\n");
      out.write("                <td><input  name=\"t_n_ficha\" value=\"");
      out.print(igs.getFic_numero());
      out.write("\"></td>\n");
      out.write("                <td><input  name=\"t_nombre\" value=\"");
      out.print(igs.getFic_nombrePrograma());
      out.write("\"></td>\n");
      out.write("                <td><input  name=\"t_jornada\" value=\"");
      out.print(igs.getFic_jornada());
      out.write("\"></td>\n");
      out.write("                <td><input  name=\"Fic_inicio_etapa\" value=\"");
      out.print(igs.getFic_inicio_etapa());
      out.write("\"></td>\n");
      out.write("                <td><input  name=\"Fic_fin_etapa\" value=\"");
      out.print(igs.getFic_fin_etapa());
      out.write("\"></td>\n");
      out.write("                \n");
      out.write("                <td><input type=\"submit\" name=\"btn_actualizar\" value=\"Actualizar\"></td>\n");
      out.write("                <td><input type=\"submit\" name=\"btn_eliminar\" value=\"Eliminar\"></td>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("                 \n");
      out.write("                \n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
