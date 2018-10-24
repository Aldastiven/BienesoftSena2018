package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.consultas;
import java.util.ArrayList;
import modelo.emergenciaSG;
import javax.swing.JOptionPane;

public final class t_005femergencia_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>t_emergencia</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Documento</th>\n");
      out.write("                    <th>Motivo Emergente</th>\n");
      out.write("                    <th>Fecha  Salida</th>\n");
      out.write("                    <th>Fecha  Ingreso</t> \n");
      out.write("                    <th>Hora Salida</th>\n");
      out.write("                    <th>Hora Ingreso</t> \n");
      out.write("                    <th>DocumentoAcompaniante</th>\n");
      out.write("                    <th>Autoriza</th>\n");
      out.write("                    <th>EvidenciaAdjunta </th>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("              ");

                  ArrayList <emergenciaSG> consultas=new ArrayList<>();
                  consultas con=new consultas();
                  consultas=con.consultarEmergencia();
                  emergenciaSG x=new emergenciaSG();
                  
                    for(int i=0; i<consultas.size();i++){
                        x=consultas.get(i);
                       
                    
              
      out.write("  \n");
      out.write("              \n");
      out.write("              <tr>\n");
      out.write("              <form action=\"ServletEmergencia\" enctype=\"multipart/form-data\" method=\"post\">\n");
      out.write("                  <td><input type=\"number\" name=\"t_e_Id\" value=\"");
      out.print(x.getSal_ID());
      out.write("\" readonly></td>\n");
      out.write("                  <td><input type=\"number\" name=\"t_e_doc\" value=\"");
      out.print(x.getSal_Aprendiz_Apr_documento());
      out.write("\"></td>\n");
      out.write("                  <td><input type=\"text\" name=\"t_e_moti\" value=\"");
      out.print(x.getSal_motivoEmergente());
      out.write("\"></td>\n");
      out.write("                  <td><input type=\"date\" name=\"t_e_f_sal\" value=\"");
      out.print(x.getSal_fechaSalida());
      out.write("\"></td>\n");
      out.write("                  <td><input type=\"date\" name=\"t_e_f_ingre\" value=\"");
      out.print(x.getSal_fechaIngreso());
      out.write("\"></td> \n");
      out.write("                  <td><input type=\"time\" name=\"t_e_Hs\" value=\"");
      out.print(x.getSal_horaSalida());
      out.write("\"></td>\n");
      out.write("                  <td><input type=\"time\" name=\"t_e_Hi\" value=\"");
      out.print(x.getSal_horaIngreso());
      out.write("\"></td> \n");
      out.write("                  <td><input type=\"number\" name=\"t_e_d_acompa\" value=\"");
      out.print(x.getSal_documentoAcompaniante());
      out.write("\"></td>\n");
      out.write("                  <td><input type=\"text\" name=\"t_e_autoriza\" value=\"");
      out.print(x.getSal_autoriza());
      out.write("\"></td>\n");
      out.write("                  <th><img src=\"");
      out.print(x.getSal_evidenciaAdjunta());
      out.write("\" width=\"60\" height=\"60\"/></th>\n");
      out.write("                  <td style=\"display: none;\"><input type=\"text\" name=\"Evidencia\" value=\"");
      out.print(x.getSal_evidenciaAdjunta());
      out.write("\"></td>\n");
      out.write("                  <td><input type=\"file\" name=\"EvidenciaAdjunta\" accept=\"imagen/*\"></td>\n");
      out.write("                  \n");
      out.write("                  <td>\n");
      out.write("                    <input type=\"submit\" name=\"btn_actualizar\" value=\"Actualizar\">\n");
      out.write("                    <input type=\"submit\" name=\"btn_eliminar\" value=\"Eliminar\">\n");
      out.write("                  </td>\n");
      out.write("               </form>\n");
      out.write("            \n");
      out.write("                </tr> \n");
      out.write("                \n");
      out.write("                ");

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
      out.write("   \n");
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
