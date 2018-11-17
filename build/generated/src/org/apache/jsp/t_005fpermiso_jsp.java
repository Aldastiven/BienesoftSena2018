package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.consultas;
import modelo.permisoSG;
import java.util.ArrayList;

public final class t_005fpermiso_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>\n");
      out.write("            Permisos\n");
      out.write("        </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table>\n");
      out.write("            <tr bgcolor=\"#A9CCE3\" border=\"1\">\n");
      out.write("                <th colspan=\"9\" class=\"center\">Tabla permisos</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr bgcolor=\"skyblue\">\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th class=\"center\">Numero de documento del aprendiz</th>\n");
      out.write("                <th class=\"center\">Tipo de permiso</th>\n");
      out.write("                <th class=\"center\">Fecha de salida</th>\n");
      out.write("                <th class=\"center\">Fecha de ingreso</th>\n");
      out.write("                <th class=\"center\">Hora de salida</th>\n");
      out.write("                <th class=\"center\">Hora de ingreso</th>\n");
      out.write("                <!--<th class=\"center\">Fecha de ingreso real</th>-->\n");
      out.write("                <!--<th class=\"center\">Hora ingreso real</th>-->\n");
      out.write("                <!--<th class=\"center\">Fecha de salida real</th>-->\n");
      out.write("                <!--<th class=\"center\">Hora de salida real</th>-->\n");
      out.write("                <!--<th class=\"center\">Observacion</th>>-->\n");
      out.write("                <th class=\"center\">Motivo</th>\n");
      out.write("                <th class=\"center\">Estado</th>\n");
      out.write("                <th class=\"center\">Autoriza</th>\n");
      out.write("                <th class=\"center\">Evidencia</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                ArrayList <permisoSG> listdat = new ArrayList<>();
                consultas con = new consultas();
                listdat = con.consultarPermiso();
                permisoSG x = new permisoSG();
                
                for(int i = 0; i< listdat.size(); i++){
                x = listdat.get(i);
            
      out.write("\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            <form action=\"ServletPermiso\" enctype=\"multipart/form-data\" method=\"post\">\n");
      out.write("                <tr>\n");
      out.write("                <td><input type=\"number\" name=\"t_Id\" value=\"");
      out.print(x.getPer_ID());
      out.write("\" readonly></td>\n");
      out.write("                <td><input type=\"number\" name=\"t_numerodocumento\" value=\"");
      out.print(x.getPer_Aprendiz_Apr_documento());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_tipo\" value=\"");
      out.print(x.getPer_tipo());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"date\" name=\"t_fechsal\" value=\"");
      out.print(x.getPer_fecha_salida());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"date\" name=\"t_fechingre\" value=\"");
      out.print(x.getPer_fecha_ingreso());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"time\" name=\"t_horasal\" value=\"");
      out.print(x.getPer_hora_Salida());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"time\" name=\"t_horaingre\" value=\"");
      out.print(x.getPer_hora_ingreso());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_moti\" value=\"");
      out.print(x.getPer_motivo());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_estado\" value=\"");
      out.print(x.getPer_estado());
      out.write("\" readonly></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_autoriza\" value=\"");
      out.print(x.getPer_autoriza());
      out.write("\"></td> \n");
      out.write("                <th><img src=\"");
      out.print(x.getPer_evidenciaAdjunta());
      out.write("\" width=\"60\" height=\"60\"/></th>\n");
      out.write("                <td style=\"display: none;\"><input type=\"text\" value=\"");
      out.print(x.getPer_evidenciaAdjunta());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"file\" name=\"t_evidenciaAdjunta\" accept=\"imagen/*\"></td>\n");
      out.write("                \n");
      out.write("                <td><input type=\"submit\" name=\"btn-actualizar\" value=\"Actualizar\"></td>\n");
      out.write("                <td><input type=\"submit\" name=\"btn-eliminar\" value=\"Eliminar\"></td>\n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("            </form>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            \n");
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
