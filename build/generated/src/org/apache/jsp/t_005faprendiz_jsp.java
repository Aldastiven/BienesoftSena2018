package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.consultas;
import java.util.ArrayList;
import modelo.aprendizSG;

public final class t_005faprendiz_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>t_aprendiz</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <table>\n");
      out.write("            \n");
      out.write("            <thead>\n");
      out.write("            <th>Numero de documento</th>\n");
      out.write("            <th>Tipo de documento</th>\n");
      out.write("            <th>Nombres</th>\n");
      out.write("            <th>Apellidos</th>\n");
      out.write("            <th>Fecha de nacimiento</th>\n");
      out.write("            <th>Edad</th>\n");
      out.write("            <th>Sexo</th>\n");
      out.write("            <th>Numero de contacto</th>\n");
      out.write("            <th>eps</th>\n");
      out.write("            <th>rh</th>\n");
      out.write("            <th>Tipo de aprendiz</th>\n");
      out.write("            <th>Nombre del padre</th>\n");
      out.write("            <th> Telefono </th>\n");
      out.write("            <th>Nombre da la madre</th>\n");
      out.write("            <th>Telefono</th>\n");
      out.write("            <th>Departamento</th>\n");
      out.write("            <th>Ciudad</th>\n");
      out.write("            <th>Barrio</th>\n");
      out.write("            <th>Direccion</th>\n");
      out.write("            <th>E-mail</th>\n");
      out.write("            <th>Hoja de vida</th>\n");
      out.write("            <th></th>\n");
      out.write("            <th></th>\n");
      out.write("            <th>Acta de compromiso</th>\n");
      out.write("            <th>Llamados de atencion</th>\n");
      out.write("            <th>Numero de habitacion</th>\n");
      out.write("            <th>Numero de ficha</th>         \n");
      out.write("            </thead>\n");
      out.write("            \n");
      out.write("            ");

                ArrayList <aprendizSG> consultas = new ArrayList<>();
                consultas con = new consultas();
                consultas = con.consultarTablaAprendiz();
                aprendizSG x = new aprendizSG();
                
                for (int i = 0; i< consultas.size(); i++){
                x = consultas.get(i);
             
            
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("            <form action=\"ServletAprendiz\" enctype=\"multipart/form-data\" method=\"post\">\n");
      out.write("                \n");
      out.write("              \n");
      out.write("                <td><input type=\"number\" name=\"t_NumeroDocumento\" value=\"");
      out.print(x.getApr_documento());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_TipoDocumento\" value=\"");
      out.print(x.getApr_documentoTipo());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_Nombres\" value=\"");
      out.print(x.getApr_nombres());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_Apellidos\" value=\"");
      out.print(x.getApr_apellidos());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_FechaNacimiento\" value=\"");
      out.print(x.getApr_fechaNacimiento());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"number\" name=\"t_Edad\" value=\"");
      out.print(x.getApr_edad());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_sexo\" value=\"");
      out.print(x.getApr_sexo());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_celular\" value=\"");
      out.print(x.getApr_celular());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_eps\" value=\"");
      out.print(x.getApr_eps());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_rh\" value=\"");
      out.print(x.getApr_rh());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_TipoAprendiz\" value=\"");
      out.print(x.getApr_tipoAprendiz());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_NombrePadre\" value=\"");
      out.print(x.getApr_nombrePadre());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"number\" name=\"t_celularPadre\" value=\"");
      out.print(x.getApr_telefonoPadre());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_NombreMadre\" value=\"");
      out.print(x.getApr_nombreMadre());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"number\" name=\"t_celularMadre\" value=\"");
      out.print(x.getApr_telefonoMadre());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_Departamento\" value=\"");
      out.print(x.getApr_departamento());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_ciudad\" value=\"");
      out.print(x.getApr_ciudad());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_barrio\" value=\"");
      out.print(x.getApr_barrio());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_direccion\" value=\"");
      out.print(x.getApr_direccion());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_AntecedenteMedico\" value=\"");
      out.print(x.getApr_antecedente_medico());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_email\" value=\"");
      out.print(x.getApr_email());
      out.write("\"></td>\n");
      out.write("                <th><img src=\"");
      out.print(x.getApr_hojaDeVida());
      out.write("\" width=\"60\" height=\"60\"/></th>\n");
      out.write("                <td style=\"display: none;\"><input type=\"text\" name=\"Hoja\" value=\"");
      out.print(x.getApr_hojaDeVida());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"file\" name=\"HojaDeVida\" accept=\"imagen/*\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"t_Acta\" value=\"");
      out.print(x.getApr_actaCompromiso());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"number\" name=\"t_llamadosAtencion\" value=\"");
      out.print(x.getApr_llamadosDeAtencion());
      out.write("\" readonly></td>\n");
      out.write("                <td><input type=\"number\" name=\"t_numeroHabitacion\" value=\"");
      out.print(x.getApr_numero_habitacion());
      out.write("\"></td>\n");
      out.write("                <td><input type=\"number\" name=\"t_numeroFicha\" value=\"");
      out.print(x.getApr_ficha_fic_numero());
      out.write("\"></td>\n");
      out.write("                \n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" name=\"btn_actualizar\" value=\"Actualizar\">\n");
      out.write("                    <input type=\"submit\" name=\"btn_eliminar\" value=\"Eliminar\">\n");
      out.write("                </td>\n");
      out.write("            </form>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("    \n");
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
