package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.usuarioSG;
import modelo.Alimento_rel_AprendizSG;
import modelo.consultas;
import java.util.ArrayList;
import modelo.aprendizSG;

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <!--Let browser know website is optimized for mobile-->\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/> \n");
      out.write("            \n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("            <!--importando imagen y texto en pestaña-->\n");
      out.write("            <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"materialize/icons/black/ver_lista.png\" />\n");
      out.write("            <title>BieneSoft | Usuarios Coordinador</title>\n");
      out.write("\n");
      out.write("            <!--estilo body-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/body.css\" media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo encabezado-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/encabezado.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("            <!--estilo modulo busqueda-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/modulo_busqueda.css\" media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo de la tabla--> \n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/tabla.css\"  media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <!--estilo modal-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/modal.css\" media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo de la botones--> \n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/buttons.css\"  media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo de la registro--> \n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/formulario.css\"  media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo footer-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/footer.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("            <!--estilo materialize.css-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"materialize/css/materialize.min.css\"  media=\"screen,projection\"/>    \n");
      out.write("            \n");
      out.write("            <!--importando--->\n");
      out.write("            <script src=\"js/jquery.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <!--*******************************OBJETO NAV RESPONSIVE***************************-->\n");
      out.write("        \n");
      out.write("        <!--nav principal--->\n");
      out.write("        \n");
      out.write("        <nav class=\"nav-wrapper\" id=\"nav_principal\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \n");
      out.write("                    <i>\n");
      out.write("                        <img style=\"width: 25px; margin-top: 10px;\" src=\"materialize/icons/white/menu.png\" />\n");
      out.write("                    </i>\n");
      out.write("                    \n");
      out.write("                        <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                        <lu id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"\" /></a></lu>\n");
      out.write("                        </ul>\n");
      out.write("                </a>\n");
      out.write("                \n");
      out.write("                    <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \n");
      out.write("                        <ul  class=\"right hide-on-med-and-down\">\n");
      out.write("                            <lu id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"\" /></a></lu>\n");
      out.write("                        </ul>\n");
      out.write("                    </a>\n");
      out.write("                \n");
      out.write("                    <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \n");
      out.write("                        <ul  class=\"right hide-on-med-and-down\">\n");
      out.write("                            <lu id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"\" /></a></lu>\n");
      out.write("                        </ul>\n");
      out.write("                    </a>\n");
      out.write("            </div>  \n");
      out.write("        </nav> \n");
      out.write("        \n");
      out.write("        <!--menu response-->\n");
      out.write("        \n");
      out.write("        <ul class=\"sidenav\" id=\"menu-responsive\">\n");
      out.write("                    \n");
      out.write("            <li><a href=\"#\"> Aprendizes</a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"#\"> Alimentacion</a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"#\"> Permisos</a></li>        \n");
      out.write("        </ul>\n");
      out.write("        \n");
      out.write("        <!--------------------------------------------------->\n");
      out.write("\n");
      out.write("        <!--nav secundario (opciones)--->\n");
      out.write("        \n");
      out.write("        <nav id=\"nav_menu\" class=\"hide-on-med-and-down\" >\n");
      out.write("                        <a href=\"f agencia.jsp\">\n");
      out.write("                            <input id=\"opc_menu_2\" type=\"submit\" value=\"Aprendices\"/>\n");
      out.write("                        </a>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                        <a href=\"f aspirante.jsp\">\n");
      out.write("                            <input id=\"opc_menu_2\" type=\"submit\" value=\"Alimentacion\"/>\n");
      out.write("                        </a>\n");
      out.write("            \n");
      out.write("                        <a href=\"f agencia.jsp\">\n");
      out.write("                            <input id=\"opc_menu_2\" type=\"submit\" value=\"Aprendices\"/>\n");
      out.write("                        </a>     \n");
      out.write("        </nav>\n");
      out.write("        <!--**************************************************************************************************-->\n");
      out.write("        \n");
      out.write("        <!--MODULO INFORMACION USUARIO-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <label id=\"user_text\" class=\"user_text hide-on-med-and-down\">Coordinador</label> \n");
      out.write("            ");

                HttpSession rnombre=request.getSession();
                String nom=(String)rnombre.getAttribute("datico");
             
      out.write("\n");
      out.write("        <p id=\"user_text\" class=\"user_text hide-on-med-and-down\">");
      out.print(nom);
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("          <!--*********************************************************-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--*******************************OBJETO  MODULO CONSULTAS***************************-->\n");
      out.write("        \n");
      out.write("        <div class=\"container hide-on-small-only\">\n");
      out.write("            <div id=\"search-container\" >\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"btn-search-principal\" class=\"btn-search-principal hide-on-med-and-up\">\n");
      out.write("            <img src=\"materialize/icons/white/search.png\" />\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"btn-search-close\" class=\"btn-search-close hide-on-med-and-up\">\n");
      out.write("            <img src=\"materialize/icons/white/close.png\" />\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"modal-container\" class=\"modal-container container hide-on-med-and-up\">\n");
      out.write("            <div id=\"search-container-modal\" class=\"col s12\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("         \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <!--**************************************************************************************************-->\n");
      out.write("\n");
      out.write("    <!----********************OBJETO TABLA****************---->\n");
      out.write("        \n");
      out.write("<div class=\"container l12 m12 s12\">\n");
      out.write("     <h1 id=\"title_container\">TABLA APRENDIZ_ALIMENTACION(Coordinador)</h1>\n");
      out.write(" \n");
      out.write("         <div id=\"table\"  class=\"table\" style=\"margin-top: -10px;\">\n");
      out.write("     \n");
      out.write("                <table class=\"responsive-table scrolling\">\n");
      out.write("            \n");
      out.write("            <thead id=\"thead\" class=\"thead\">\n");
      out.write("                <th id=\"th_thead\">ID</th>\n");
      out.write("                <th id=\"th_thead\">Nombre</th>\n");
      out.write("                <th id=\"th_thead\">Apellido</th>\n");
      out.write("                <th id=\"th_thead\">Celular</th>\n");
      out.write("                <th id=\"th_thead\">E-mail</th>  \n");
      out.write("                <th id=\"th_thead\">Foto</th> \n");
      out.write("                <th id=\"th_thead\">Pasword</th> \n");
      out.write("                <th id=\"th_thead\">Rol</th>    \n");
      out.write("                <th id=\"th_thead\">Acciones</th>  \n");
      out.write("            </thead>\n");
      out.write("            \n");
      out.write("            ");
                                
                ArrayList<usuarioSG> listdat=new ArrayList<>(); 
                consultas con=new consultas();
                listdat=con.consultaUsuario();
                usuarioSG igs=new usuarioSG();
                
                for(int i=0; i<listdat.size(); i++){
                    igs=listdat.get(i);
                    String photo=igs.getUsufoto();
            
      out.write(" \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("            <form action=\"ServletUsuario\" method=\"post\">\n");
      out.write("        <tr>\n");
      out.write("            <td><input class=\"browser-default\" name=\"t_doc\" value=\"");
      out.print(igs.getUsudoc());
      out.write("\" type=\"number\"></td>\n");
      out.write("            <td><input class=\"browser-default\" name=\"t_nom\" value=\"");
      out.print(igs.getUsunom());
      out.write("\"  type=\"text\"></td>\n");
      out.write("            <td><input class=\"browser-default\" name=\"t_ape\" value=\"");
      out.print(igs.getUsuape());
      out.write("\" type=\"text\"></td>\n");
      out.write("            <td><input class=\"browser-default\" name=\"t_cel\" value=\"");
      out.print(igs.getUsucel());
      out.write("\" type=\"number\"></td>\n");
      out.write("            <td><input class=\"browser-default\" name=\"t_ema\" value=\"");
      out.print(igs.getUsuemail());
      out.write("\" type=\"email\"></td>\n");
      out.write("            <td>\n");
      out.write("            <img src=\"");
      out.print(igs.getUsufoto());
      out.write("\" width=\"60\" height=\"60\"/>\n");
      out.write("            <input  type=\"file\"   name=\"f_fot\" accept=\"img/*\" placeholder=\"Tu Foto\">\n");
      out.write("            </td>\n");
      out.write("            <td><input class=\"browser-default\" name=\"t_pas\" value=\"");
      out.print(igs.getUsuclave());
      out.write("\" type=\"text\"></td>\n");
      out.write("            <td><input class=\"browser-default\" name=\"t_rol\" value=\"");
      out.print(igs.getUsurol());
      out.write("\" type=\"text\"></td>\n");
      out.write("        \n");
      out.write("            <td>\n");
      out.write("            <input type=\"submit\" name=\"btn-modificar\" value=\"Modificar\">\n");
      out.write("            <input type=\"submit\" name=\"btn-eliminar\" value=\"Eliminar\"></td>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("        </form>                        \n");
      out.write("</div>\n");
      out.write("<!---------------------------------------------------------------------------->\n");
      out.write("                 ");

                   }
                
      out.write("                  \n");
      out.write("               \n");
      out.write("                </table>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("</div> \n");
      out.write("\n");
      out.write("\n");
      out.write("         <!--***************FOOTER*********************-->\n");
      out.write("        <footer class=\"page-footer\" id=\"footer_form\">\n");
      out.write("\n");
      out.write("                    <div class=\"container white-text center\">\n");
      out.write("                    © 2018 Biene-Soft\n");
      out.write("                    <br>\n");
      out.write("                    Todos los derechos reservados\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("        </footer>\n");
      out.write("<!------------------------------------------------------------------------------------------------------>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--importando funciones para los objetos-->    \n");
      out.write("    <script>\n");
      out.write("        document.addEventListener('DOMContentLoaded', function() {\n");
      out.write("            M.AutoInit();\n");
      out.write("        });\n");
      out.write("    </script>    \n");
      out.write("    \n");
      out.write("    <!--importando la funcion modal resultado-tabla-->\n");
      out.write("    <script src=\"js/modal-tabla/main.js\"></script>\n");
      out.write("  \n");
      out.write("    <!--importando la funcion de modal-busqueda-->\n");
      out.write("    <script src=\"js/modulo-busqueda/main.js\"></script>\n");
      out.write("        \n");
      out.write("    <!--JavaScript at end of body for optimized loading-->\n");
      out.write("    <script type=\"text/javascript\" src=\"materialize/js/materialize.min.js\"></script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>");
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
