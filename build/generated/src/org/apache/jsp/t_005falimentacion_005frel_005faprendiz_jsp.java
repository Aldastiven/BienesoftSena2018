package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Alimento_rel_AprendizSG;
import modelo.consultas;
import java.util.ArrayList;

public final class t_005falimentacion_005frel_005faprendiz_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Tabla Alimentacion-relacion-aprendiz</h1>\n");
      out.write("        \n");
      out.write("            <tr bgcolor=\"#A9CCE3\" border=\"1\">\n");
      out.write("                <th colspan=\"9\" class=\"center\">Tabla habitacion-Rel-Apr</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr bgcolor=\"skyblue\">\n");
      out.write("                <th class=\"center\">Id</th>\n");
      out.write("                <th class=\"center\">Tipo</th>\n");
      out.write("                <th class=\"center\">Documento</th>\n");
      out.write("                <th class=\"center\">Fecha</th>\n");
      out.write("                <th class=\"center\">Estado</th>\n");
      out.write("                <th class=\"center\">Conteo</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                ArrayList<Alimento_rel_AprendizSG> consulta = new ArrayList<>();
                consultas con=new consultas();
                consulta = con.consultaAlimentacionRelApr();
                Alimento_rel_AprendizSG Alimen = new Alimento_rel_AprendizSG();
                for (int i = 0; i< consulta.size(); i++ ){
                Alimen = consulta.get(i);
            
            
      out.write("\n");
      out.write("            \n");
      out.write("    \n");
      out.write("            <form action=\"ServletAlimento_rel_Aprendiz\" method=\"post\">\n");
      out.write("        <tr>\n");
      out.write("            <td><input  name=\"t_id\"      value=\"");
      out.print(Alimen.getApid());
      out.write("\" type=\"number\"></td>\n");
      out.write("            <td><input  name=\"t_tipo\"    value=\"");
      out.print(Alimen.getAptipo());
      out.write("\" type=\"number\"></td>\n");
      out.write("            <td><input  name=\"t_doc\"     value=\"");
      out.print(Alimen.getAprdoc());
      out.write("\" type=\"number\"></td>\n");
      out.write("            <td><input  name=\"t_fecha\"   value=\"");
      out.print(Alimen.getApfecha());
      out.write("\" type=\"date\"></td>\n");
      out.write("            <td><input  name=\"t_estado\"  value=\"");
      out.print(Alimen.getApestado());
      out.write("\" type=\"text\"></td>\n");
      out.write("            <td><input  name=\"t_conteo\"  value=\"");
      out.print(Alimen.getApconteo());
      out.write("\" type=\"number\"></td>\n");
      out.write("            \n");
      out.write("            <td><input type=\"submit\" name=\"btn-modificar\" value=\"Actualizar\"></td>\n");
      out.write("            <td><input type=\"submit\" name=\"btn-eliminar\" value=\"Eliminar\"></td>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        ");

            }
        
      out.write("    \n");
      out.write("       \n");
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
