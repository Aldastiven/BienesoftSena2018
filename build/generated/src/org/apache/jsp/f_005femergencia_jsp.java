package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class f_005femergencia_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>f_SalidaEmergente</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>formulario Emergencia</h1>  \n");
      out.write("            \n");
      out.write("            <form action=\"ServletEmergencia\" enctype=\"multipart/form-data\" method=\"post\">\n");
      out.write("                <input type=\"number\"   name=\"e_doc\" placeholder=\"Documento\">\n");
      out.write("                <input type=\"text\"     name=\"e_moti\" placeholder=\"Motivo\">\n");
      out.write("                <input type=\"date\" name=\"e_f_sal\" placeholder=\"FechaSalida\">\n");
      out.write("                <!--<input type=\"date\" name=\"e_f_ingre\" placeholder=\"FechaIngreso\">-->\n");
      out.write("                <input type=\"time\" name=\"e_Hs\" placeholder=\"Hora salida\">\n");
      out.write("                <input type=\"number\"   name=\"e_d_acompa\" placeholder=\"DocumentoAcompaniante\">\n");
      out.write("                <input type=\"text\"     name=\"e_autoriza\" placeholder=\"Autoriza\">\n");
      out.write("                <td><input type=\"file\" name=\"e_e_adjun\"  placeholder=\"EvidenciaAdjunta\" accept=\"imagen/*\"><br><br></td>\n");
      out.write("               \n");
      out.write("                <input  type=\"submit\" name=\"btn_guardar\" value=\"Guardar\" >\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
