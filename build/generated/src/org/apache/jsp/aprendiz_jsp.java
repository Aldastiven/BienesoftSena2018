package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.permiso_historialSG;
import jdk.nashorn.internal.runtime.ListAdapter;
import modelo.usuarioSG;
import javax.swing.JOptionPane;
import modelo.patrocinioSG;
import controlador.ServletPermiso;
import modelo.crudPermisos;
import modelo.consultas;
import modelo.permisoSG;
import java.util.ArrayList;

public final class aprendiz_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <title>Bienesoft | Home aprendiz</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"main.css\" />\r\n");
      out.write("    <script src=\"main.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("    <!--estilo body-->\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css/body.css\" media=\"screen,projection\"/>\r\n");
      out.write("\r\n");
      out.write("    <!--estilo encabezado-->\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css/encabezado.css\"  media=\"screen,projection\"/>\r\n");
      out.write("    \r\n");
      out.write("    <!--estilo materialize.css-->\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"materialize/css/materialize.min.css\"  media=\"screen,projection\"/>    \r\n");
      out.write("\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css/notificaciones.css\"  media=\"screen,projection\"/>\r\n");
      out.write("    <!--importando--->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css/footer.css\"  media=\"screen,projection\"/>\r\n");
      out.write("    \r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css/section.css\"  media=\"screen,projection\"/>\r\n");
      out.write("    \r\n");
      out.write("     <!--stilo para las nuevas tarjetas de menu-->\r\n");
      out.write("     <link type=\"text/css\" rel=\"stylesheet\" href=\"css/Style_index_apr.css\"  media=\"screen,projection\"/>\r\n");
      out.write("     \r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Lobster\">\r\n");
      out.write("      <link href=\"https://fonts.googleapis.com/css?family=Raleway\" rel=\"stylesheet\">\r\n");
      out.write("      \r\n");
      out.write("    <script src=\"js/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>    \r\n");
      out.write("        \r\n");
      out.write("    <!--estilo footer-->\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css_index_user/footer.css\"  media=\"screen,projection\"/>\r\n");
      out.write("\r\n");
      out.write("    <!--importando--->\r\n");
      out.write("    <script src=\"js/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("        <!--*******************************OBJETO NAV RESPONSIVE***************************-->\r\n");
      out.write("        \r\n");
      out.write("        <!--nav principal--->\r\n");
      out.write("        \r\n");
      out.write("        <nav class=\"nav-wrapper\" id=\"nav_principal\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \r\n");
      out.write("                    <i>\r\n");
      out.write("                        <img style=\"width: 25px; margin-top: 10px;\" src=\"materialize/icons/white/menu.png\" />\r\n");
      out.write("                    </i>\r\n");
      out.write("                    \r\n");
      out.write("                    <ul class=\"right hide-on-med-and-down\">\r\n");
      out.write("                        <lu id=\"li\" title=\"cerrar cesion\"><a href=\"index.jsp\"><img style=\"width: 25px; margin-top: 10px;\" src=\"icon_acciones/salida.png\" /></a></lu>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </a>\r\n");
      out.write("                \r\n");
      out.write("                    <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \r\n");
      out.write("                        <ul  class=\"right hide-on-med-and-down\">\r\n");
      out.write("                            <lu id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"\" /></a></lu>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </a>\r\n");
      out.write("                \r\n");
      out.write("                    <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \r\n");
      out.write("                        <ul  class=\"right hide-on-med-and-down\">\r\n");
      out.write("                            <lu id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"\" /></a></lu>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </a>\r\n");
      out.write("            </div>  \r\n");
      out.write("        </nav> \r\n");
      out.write("        \r\n");
      out.write("        <!--menu response-->\r\n");
      out.write("        \r\n");
      out.write("        <ul class=\"sidenav\" id=\"menu-responsive\">\r\n");
      out.write("                    \r\n");
      out.write("            <li><a href=\"#\"> Aprendizes</a></li>\r\n");
      out.write("\r\n");
      out.write("            <li><a href=\"#\"> Alimentacion</a></li>\r\n");
      out.write("\r\n");
      out.write("            <li><a href=\"#\"> Permisos</a></li>        \r\n");
      out.write("        </ul>\r\n");
      out.write("        \r\n");
      out.write("        <!--------------------------------------------------->\r\n");
      out.write("\r\n");
      out.write("            <!--------------------objeto perfil--------------------------------------------------->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row contenedor-perfil hide-on-med-and-down\">\r\n");
      out.write("                ");

                   HttpSession rnombre=request.getSession();
                   String nom=(String)rnombre.getAttribute("nombre");
                   String fot=(String)rnombre.getAttribute("foto");
                   int id=(int)rnombre.getAttribute("iden");
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <img id=\"img_foto\" class=\"img_foto\" src=\"");
      out.print(fot);
      out.write("\" />\r\n");
      out.write("\r\n");
      out.write("                <div id=\"cont_name\" class=\"cont_name\">\r\n");
      out.write("                    <label id=\"msg_user\" class=\"msg_user\">Aprendiz</label>\r\n");
      out.write("\r\n");
      out.write("                    <p id=\"user_text_nombre\" class=\"user_text_nombre\">");
      out.print(nom);
      out.write("</p>\r\n");
      out.write("                    <p id=\"user_text_nombre\" class=\"user_text_nombre\">");
      out.print(id);
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                             \r\n");
      out.write("            </div>\r\n");
      out.write("                             \r\n");
      out.write("    <!----------------------botones de usuario---------------------------------->                 \r\n");
      out.write("            \r\n");
      out.write("            <div class=\"contenedor_btn_apr hide-on-med-and-down\"  id=\"contenedor_btn_apr\">\r\n");
      out.write("                <a href=\"mi_perfil.jsp\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn_mi_perfil\">                        \r\n");
      out.write("                        <img class=\"img_btn_perfil\"  src=\"css/menus_index/menu_Apr/img_btn_perfil.png\">\r\n");
      out.write("                        Mi perfil\r\n");
      out.write("                    </button>\r\n");
      out.write("                </a>                \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("    <!------------------objeto opciones-------------------------------------------->\r\n");
      out.write("    <div class=\"cont_principal\">\r\n");
      out.write("        \r\n");
      out.write("        <p class=\"header_titulo\"> Menu </p>    \r\n");
      out.write("        <hr class=\"separator\">\r\n");
      out.write("\r\n");
      out.write("                <a href=\"f_permiso.jsp\">\r\n");
      out.write("                    <div class=\"options\">\r\n");
      out.write("                        <img class=\"img_option\" src=\"css/menus_index/menu_Apr/img_diligenciar_permiso.png\" /> \r\n");
      out.write("                        <p class=\"txt_option\">Permisos</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                                                                                           \r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <a href=\"info_aprendiz.jsp\">\r\n");
      out.write("                    <div class=\"options\">                        \r\n");
      out.write("                        <img class=\"img_option\" src=\"css/menus_index/menu_Apr/img_perfil_aprendiz.png\" />\r\n");
      out.write("                       <p class=\"txt_option\">Perfil Aprendiz</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"cont_noti_pro\">\r\n");
      out.write("        \r\n");
      out.write("        <p class=\"noti_head\">Notificaciones <img class=\"head_img_campana\" src=\"css/notificaciones/campana_normal.png\"></p>\r\n");
      out.write("        <hr class=\"separator_noti\">\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"contenedor_noti\">\r\n");
      out.write("        \r\n");
      out.write("        <div>\r\n");
      out.write("        ");
                                
            ArrayList<usuarioSG> listdatusu=new ArrayList<>(); 
            consultas con=new consultas();
            listdatusu=con.consultaUsuario();
      
            int idper=(int)rnombre.getAttribute("iden");
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");

            ArrayList<permisoSG> listdat=new ArrayList<>(); 
            int u=idper;
            listdat=con.consulta_notificacion(u);
            permisoSG x=new permisoSG();

            for(int i=0; i<listdat.size(); i++){
            x=listdat.get(i);
        
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        <div class=\"cont_indi_noti_good\">        \r\n");
      out.write("            <input class=\"browser-default txt_noti\" value=\"tu permiso esta  ");
      out.print(x.getPer_estado());
      out.write("\" type=\"text\">\r\n");
      out.write("            <input class=\"browser-default txt_noti\" value=\"fecha de creacion ");
      out.print(x.getPer_fecha_Creacion());
      out.write("\" type=\"text\">\r\n");
      out.write("        </div>\r\n");
      out.write("    ");

        }
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>  \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div>\r\n");
      out.write("            \r\n");
      out.write("        ");

            ArrayList<permiso_historialSG> listdathis=new ArrayList<>(); 
            int uhis = idper;
            listdathis=con.consulta_notificacion_his(uhis);
            //JOptionPane.showMessageDialog(null,"consulta el ID" +uhis);
            permiso_historialSG e=new permiso_historialSG();

            for(int i=0; i<listdathis.size(); i++){
            e=listdathis.get(i);
            
            //JOptionPane.showMessageDialog(null, e.getHis_per_ID());
        
      out.write("\r\n");
      out.write("        <div class=\"cont_indi_noti_bad\">        \r\n");
      out.write("            <input class=\"browser-default txt_noti\" value=\"tu permiso esta  ");
      out.print(e.getHis_per_estado());
      out.write("\" type=\"text\">\r\n");
      out.write("            <input class=\"browser-default txt_noti\" value=\"fecha de creacion ");
      out.print(e.getHis_per_fechaCreacion());
      out.write("\" type=\"text\">\r\n");
      out.write("        </div>\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("     \r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("        \r\n");
      out.write("         \r\n");
      out.write("   \r\n");
      out.write("<!--importando funciones para los objetos-->    \r\n");
      out.write("<script>\r\n");
      out.write("    document.addEventListener('DOMContentLoaded', function() {\r\n");
      out.write("        M.AutoInit();\r\n");
      out.write("    });\r\n");
      out.write("</script>    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!--JavaScript at end of body for optimized loading-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"materialize/js/materialize.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("    <!--***************FOOTER*********************-->\r\n");
      out.write("        <div id=\"footer_style_1\">\r\n");
      out.write("            <div id=\"footer_p_1\" >\r\n");
      out.write("                <img id=\"img_foot_1\" src=\"img_footer/Logo4.png\" />\r\n");
      out.write("                <img id=\"img_foot_2\" src=\"img_footer/Logo1.png\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"footer_p_2\" > \r\n");
      out.write("                <p id=\"text_foot\">BieneSoft</p>\r\n");
      out.write("                <p id=\"text_foot\">Todos los derechos reservados</p>\r\n");
      out.write("                <p id=\"text_foot\">2018</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"footer_p_3\" >\r\n");
      out.write("                <img id=\"img_foot_3\" src=\"img_footer/Logo2.png\" />\r\n");
      out.write("                <img id=\"img_foot_4\" src=\"img_footer/Logo3.png\" />\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    <!------------------------------------------------------------------------------------------------------>\r\n");
      out.write("\r\n");
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
