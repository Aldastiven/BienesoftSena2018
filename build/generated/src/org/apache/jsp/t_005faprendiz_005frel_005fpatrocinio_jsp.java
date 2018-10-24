package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.consultas;
import java.util.ArrayList;
import modelo.aprendiz_rel_patrocinioSG;

public final class t_005faprendiz_005frel_005fpatrocinio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>t_aprendiz_rel_patrocinio</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Tabla Aprendiz-rel-Patrocinio</h1>\n");
      out.write("        <table>\n");
      out.write("            <tr bgcolor=\"#A9CCE3\" border=\"1\">\n");
      out.write("                <th colspan=\"9\" class=\"center\">Tabla habitacion</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr bgcolor=\"skyblue\">\n");
      out.write("                <th class=\"center\">Pat id</th>\n");
      out.write("                <th class=\"center\">Documento</th>\n");
      out.write("                <th class=\"center\">Numero contrato</th>\n");
      out.write("                <th class=\"center\">Estado</th>\n");
      out.write("                <th class=\"center\">Fecha de contrato</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                ArrayList<aprendiz_rel_patrocinioSG> listdat = new ArrayList<>();
                consultas con=new consultas();
                listdat = con.consultaAprendiz_rel_Patricinio();
                aprendiz_rel_patrocinioSG x= new aprendiz_rel_patrocinioSG();
                
                for (int i = 0; i< listdat.size(); i++ ){
                    x = listdat.get(i);
                
            
      out.write("\n");
      out.write("            \n");
      out.write("            <form action=\"ServletAprendiz_rel_Patrocinio\">\n");
      out.write("                <td><input name=\"t_patrocinio_pat_id\" value=\"");
      out.print(x.getPatrocinio_Pat_ID());
      out.write("\"></td>\n");
      out.write("                <td><input name=\"t_aprendiz_apr_documento\" value=\"");
      out.print(x.getPat_Aprendiz_Apr_documento());
      out.write("\"></td>\n");
      out.write("                <td><input name=\"t_numeroContrato\" value=\"");
      out.print(x.getPat_numeroContrato());
      out.write("\"></td>\n");
      out.write("                <td><input name=\"t_estado\" value=\"");
      out.print(x.getPat_estado());
      out.write("\" ></td>\n");
      out.write("                <td><input name=\"t_fechaContrato\" value=\"");
      out.print(x.getPat_fechaContrato());
      out.write("\"></td>\n");
      out.write("                \n");
      out.write("                <td><input type=\"submit\" name=\"btn_actualizar\" value=\"Actualizar\"></td>\n");
      out.write("                <td><input type=\"submit\" name=\"btn_eliminar\" value=\"Eliminar\"></td>\n");
      out.write("                \n");
      out.write("            </form> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            ");

                }
            
      out.write("\n");
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
