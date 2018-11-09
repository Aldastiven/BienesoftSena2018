package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.consultas;
import modelo.permisoSG;
import java.util.ArrayList;

public final class t_005fpermiso_005fcoordinador_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("    <!--Let browser know website is optimized for mobile-->\r\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/> \r\n");
      out.write("            \r\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("            <!--importando imagen y texto en pestaña-->\r\n");
      out.write("            <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"materialize/icons/black/ver_lista.png\" />\r\n");
      out.write("            <title>BieneSoft | Permiso Coordinador</title>\r\n");
      out.write("\r\n");
      out.write("            <!--estilo body-->\r\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/body.css\" media=\"screen,projection\"/>\r\n");
      out.write("            \r\n");
      out.write("            <!--estilo encabezado-->\r\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/encabezado.css\"  media=\"screen,projection\"/>\r\n");
      out.write("\r\n");
      out.write("            <!--estilo modulo busqueda-->\r\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/modulo_busqueda.css\" media=\"screen,projection\"/>\r\n");
      out.write("            \r\n");
      out.write("            <!--estilo de la tabla--> \r\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/tabla.css\"  media=\"screen,projection\"/>\r\n");
      out.write("            \r\n");
      out.write("            <!--estilo de la acordion--> \r\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/acordion_busqueda.css\"  media=\"screen,projection\"/>\r\n");
      out.write("            \r\n");
      out.write("            <!--estilo modal-->\r\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/modal.css\" media=\"screen,projection\"/>\r\n");
      out.write("            \r\n");
      out.write("            <!--estilo de la botones--> \r\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/buttons.css\"  media=\"screen,projection\"/>\r\n");
      out.write("            \r\n");
      out.write("            <!--estilo de la registro--> \r\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/formulario.css\"  media=\"screen,projection\"/>\r\n");
      out.write("            \r\n");
      out.write("            <!--estilo footer-->\r\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/footer.css\"  media=\"screen,projection\"/>\r\n");
      out.write("\r\n");
      out.write("            <!--estilo materialize.css-->\r\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"materialize/css/materialize.min.css\"  media=\"screen,projection\"/>\r\n");
      out.write("\r\n");
      out.write("            <!--importando--->\r\n");
      out.write("            <script src=\"js/jquery.js\"></script>\r\n");
      out.write("            \r\n");
      out.write("            <!--buscador-->\r\n");
      out.write("            <script src=\"js/buscadorfacil/BuscadorTabla.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <!--*******************************OBJETO NAV RESPONSIVE***************************-->\r\n");
      out.write("        \r\n");
      out.write("        <!--nav principal--->\r\n");
      out.write("        \r\n");
      out.write("        <nav class=\"nav-wrapper\" id=\"nav_principal\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \r\n");
      out.write("                    <i>\r\n");
      out.write("                        <img style=\"width: 25px; margin-top: 10px;\" src=\"materialize/icons/white/menu.png\" />\r\n");
      out.write("                    </i>\r\n");
      out.write("                    <ul class=\"right hide-on-med-and-down\">\r\n");
      out.write("                        <lu id=\"li\" title=\"cerrar cesion\"><a href=\"index.jsp\"><img style=\"width: 25px; margin-top: 10px;\" src=\"icon_acciones/salida.png\" /></a></lu>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </a>\r\n");
      out.write("                \r\n");
      out.write("                <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \r\n");
      out.write("                    <ul  class=\"right hide-on-med-and-down\">\r\n");
      out.write("                        <lu id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"\" /></a></lu>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \r\n");
      out.write("                    <ul  class=\"right hide-on-med-and-down\">\r\n");
      out.write("                        <lu id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"\" /></a></lu>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>  \r\n");
      out.write("        </nav> \r\n");
      out.write("        \r\n");
      out.write("        <!--menu response-->\r\n");
      out.write("        <ul class=\"sidenav\" id=\"menu-responsive\">\r\n");
      out.write("                    \r\n");
      out.write("            <li><a href=\"t_permiso_coordinador.jsp\">Permisos</a></li>\r\n");
      out.write("\r\n");
      out.write("            <li><a href=\"t_aprendiz\">Aprendices</a></li>\r\n");
      out.write("\r\n");
      out.write("            <li><a href=\"t_ficha.jsp\">Fichas</a></li>\r\n");
      out.write("            \r\n");
      out.write("            <li><a href=\"t_aprendiz_rel_patrocinio.jsp\">Patrocinios</a></li> \r\n");
      out.write("            \r\n");
      out.write("            <li><a href=\"t_habitacion.jsp\">Habitaciones</a></li>        \r\n");
      out.write("        </ul>\r\n");
      out.write("        \r\n");
      out.write("        <!--------------------------------------------------->\r\n");
      out.write("\r\n");
      out.write("        <!--nav secundario (opciones)--->\r\n");
      out.write("        <nav id=\"nav_menu\" class=\"hide-on-med-and-down\" >\r\n");
      out.write("            <a href=\"coordinador.jsp\">\r\n");
      out.write("                <input id=\"opc_menu_2\" type=\"submit\" value=\"Inicio\"/>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"t_permiso_coordinador.jsp\">\r\n");
      out.write("                <input id=\"opc_menu_2\" type=\"submit\" value=\"Permisos\"/>\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <a href=\"t_aprendiz.jsp\">\r\n");
      out.write("                <input id=\"opc_menu_2\" type=\"submit\" value=\"Aprendices\"/>\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <a href=\"t_ficha.jsp\">\r\n");
      out.write("                <input id=\"opc_menu_2\" type=\"submit\" value=\"Fichas\"/>\r\n");
      out.write("            </a>    \r\n");
      out.write("\r\n");
      out.write("            <a href=\"t_aprendiz_rel_patrocinio.jsp\">\r\n");
      out.write("                <input id=\"opc_menu_2\" type=\"submit\" value=\"Patrocinio\"/>\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <a href=\"t_habitacion.jsp\">\r\n");
      out.write("                <input id=\"opc_menu_2\" type=\"submit\" value=\"Habitaciones\"/>\r\n");
      out.write("            </a>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!--**************************************************************************************************-->\r\n");
      out.write("        \r\n");
      out.write("        <!--MODULO INFORMACION USUARIO-->\r\n");
      out.write("        <label id=\"user_text\" class=\"user_text hide-on-med-and-down\">Coordinador</label> \r\n");
      out.write("            ");

                HttpSession rnombre=request.getSession();
                String nom=(String)rnombre.getAttribute("nombre");
            
      out.write("\r\n");
      out.write("        <p id=\"user_text\" class=\"user_text hide-on-med-and-down\">");
      out.print(nom);
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--*********************************************************-->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!--*******************************OBJETO  MODULO CONSULTAS------------------------>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container hide-on-small-only\">\r\n");
      out.write("            <div id=\"search-container\"  class=\"browser-default\">\r\n");
      out.write("                <!--ComoboBox-->\r\n");
      out.write("                <form action=\"t_permiso_coordinador.jsp\" method=\"post\">\r\n");
      out.write("                    \r\n");
      out.write("                    <!--Filtro busqueda id-->\r\n");
      out.write("                    <input id=\"searchTerm\" class=\"searchTerm\" type=\"text\" name=\"documento\" onkeyup=\"doSearch()\" placeholder=\"busca\" style=\"border: 1px solid gray; float: left; width: 170px; margin-right: 120px\" class=\"browser-default\"/>\r\n");
      out.write("                 \r\n");
      out.write("                    <!--combobox--> \r\n");
      out.write("                    <select id=\"ComboFiltro\" name=\"cbx_tipo_per\" class=\"browser-default searchTerm\" style=\"width: 170px; float:left; border: 1px solid gray;\">\r\n");
      out.write("                        <option value=\"\">Todo</option>\r\n");
      out.write("                        <option value=\"semana morning\">Semana - Mañana</option>\r\n");
      out.write("                        <option value=\"semana tarde\">Semana - Tarde</option>\r\n");
      out.write("                        <option value=\"fin de semana\">Fin de semana</option>\r\n");
      out.write("                        <option value=\"extra\">Extra</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    \r\n");
      out.write("                    <button id=\"btn_ver\" type=\"submit\" value=\"Ingresar\" name=\"\" style=\"float: left; background: transparent; cursor: pointer; position:relative; bottom:10px; border:none\">\r\n");
      out.write("                        <img src=\"icon_acciones/icon_buscar.png\" title=\"Buscar\" style=\" cursor: pointer; width: 30px;\"/>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </form> \r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"btn-search-principal\" class=\"btn-search-principal hide-on-med-and-up\">\r\n");
      out.write("            <img src=\"materialize/icons/white/search.png\" />\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"btn-search-close\" class=\"btn-search-close hide-on-med-and-up\">\r\n");
      out.write("            <img src=\"materialize/icons/white/close.png\" />\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"modal-container\" class=\"modal-container container hide-on-med-and-up\">\r\n");
      out.write("            <div id=\"search-container-modal\" class=\"col s12\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            \r\n");
      out.write("         \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!--**************************************************************************************************-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!--*******************************OBJETO TABLA***************************-->\r\n");
      out.write("        \r\n");
      out.write(" <div class=\"container l12 m12 s12 hide-on-small-only\">\r\n");
      out.write("    <h1 id=\"title_container\">PERMISOS</h1>\r\n");
      out.write(" \r\n");
      out.write("         <div id=\"table\"  class=\"table\" style=\"margin-top: -10px;\">\r\n");
      out.write("     \r\n");
      out.write("                <table class=\"table scrolling\">\r\n");
      out.write("                    \r\n");
      out.write("                    <div id=\"datos\" class=\" col red\">\r\n");
      out.write("                    \r\n");
      out.write("                              \r\n");
      out.write("                    ");

                        ArrayList<permisoSG> lisdat = new ArrayList<>();
                        consultas con = new consultas();

                        String cbx_tipo_per=request.getParameter("cbx_tipo_per");
                        String documento=request.getParameter("documento");
                        
                        if(cbx_tipo_per!=null & documento!=null) {
                            if(cbx_tipo_per.equalsIgnoreCase("elije")) {
                            cbx_tipo_per = null;
                            }
                            if(documento.equalsIgnoreCase("busca")) {
                                documento = null;
                            }
                        }

                        lisdat = con.consultarPermiso(cbx_tipo_per, documento);
                        permisoSG x = new permisoSG();
                        int i;
                        for(i=0; i<lisdat.size(); i++){
                            x = lisdat.get(i);
                    
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                    \r\n");
      out.write("                 ");

                   }
                
      out.write("                  \r\n");
      out.write("               \r\n");
      out.write("                <div onclick=\"ver_modal()\" id=\"btn-ver-permiso-coordinador\" class=\"btn-ver-permiso-coordinador\" title=\"consultar aprendiz\">\r\n");
      out.write("                        <img src=\"icon_acciones/ver.png\" style=\"padding-left: 15px\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                \r\n");
      out.write("                </table>  \r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</div>  \r\n");
      out.write("                \r\n");
      out.write("                <!-----------------------------OBJETO ACORDION------------------------------------------->\r\n");
      out.write("<div class=\"container div_principal hide-on-med-and-up\" id=\"container\">\r\n");
      out.write("    <h1 id=\"title\">consultas permisos</h1>\r\n");
      out.write("            <div id=\"div_principal\" class=\"\">              \r\n");
      out.write("                ");

                    ArrayList <permisoSG> consulta = new ArrayList<>();
                    consulta = con.consultarPermiso(cbx_tipo_per, documento);
                    for (int e = 0; e< consulta.size(); e++ ){
                    x= consulta.get(e);
                
      out.write("\r\n");
      out.write("                <div class=\"divuno\" id=\"divuno\">\r\n");
      out.write("                    <input class=\"browser-default\" id=\"txt\" type=\"text\"  value=\" ");
      out.print(x.getPer_Aprendiz_Apr_documento());
      out.write(" \" readonly>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"divdos\" id=\"divdos\">\r\n");
      out.write("                    Consultar\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("<<<<<<< HEAD\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                        <div class=\"input-field col s12 l6 m6\">\r\n");
      out.write("                            <p id=\"input_msg_modal\">Hora de ingreso real</p>   <!--falta-->\r\n");
      out.write("                            <input id=\"input_txt_modal\" readonly type=\"time\" name=\"t_hreal\" value=\"");
      out.print(x.getPer_fecha_ingreso());
      out.write("\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                            \r\n");
      out.write("                        <div class=\"input-field col s12 l6 m6\">\r\n");
      out.write("                            <p id=\"input_msg_modal\">Fecha de ingreso real</p>\r\n");
      out.write("                            <input id=\"input_txt_modal\" readonly type=\"date\" name=\"t_freal\" value=\"");
      out.print(x.getPer_fecha_ingresoReal());
      out.write("\">\r\n");
      out.write("                        </div>                      \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                        <div class=\"input-field col s12 l6 m6\">\r\n");
      out.write("                            <p id=\"input_msg_modal\">Hora de salida real</p>\r\n");
      out.write("                            <input id=\"input_txt_modal\" readonly type=\"time\" name=\"t_hsreal\" value=\"");
      out.print(x.getPer_hora_salidaReal());
      out.write("\">\r\n");
      out.write("                        </div>  \r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"input-field col s12 l6 m6\">\r\n");
      out.write("                            <p id=\"input_msg_modal\">Fecha de salida real</p>   <!--falta-->\r\n");
      out.write("                            <input id=\"input_txt_modal\" readonly type=\"date\" name=\"t_fsreal\" value=\"");
      out.print(x.getPer_hora_Salida());
      out.write("\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                 \r\n");
      out.write("                <div class=\"row\">                 \r\n");
      out.write("                        <div class=\"input-field col s12 l6 m6\">\r\n");
      out.write("                            <p id=\"input_msg_modal\">Observacion</p>\r\n");
      out.write("                            <input id=\"input_txt_modal\" readonly type=\"text\" name=\"t_obser\" value=\"");
      out.print(x.getPer_observacion_permiso_llegada());
      out.write("\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"input-field col s12 l6 m6\">\r\n");
      out.write("                            <p id=\"input_msg_modal\">Motivo</p>\r\n");
      out.write("                            <input id=\"input_txt_modal\" readonly type=\"text\" name=\"t_moti\" value=\"");
      out.print(x.getPer_motivo());
      out.write("\">\r\n");
      out.write("                        </div>                     \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"row\">                    \r\n");
      out.write("                        <div class=\"input-field col s12 l6 m6\">\r\n");
      out.write("                            <p id=\"input_msg_modal\">Estado</p>\r\n");
      out.write("                            <input id=\"input_txt_modal\" type=\"text\" name=\"t_estado\" value=\"");
      out.print(x.getPer_estado());
      out.write("\" readonly>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    \r\n");
      out.write("                        <div class=\"input-field col s12 l6 m6\">\r\n");
      out.write("                            <p id=\"input_msg_modal\">Autoriza</p>\r\n");
      out.write("                            <input id=\"input_txt_modal\" type=\"text\" name=\"t_autoriza\" value=\"");
      out.print(x.getPer_autoriza());
      out.write("\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                        \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                        <div class=\"input-field col s12 l6 m6\">\r\n");
      out.write("                            <p id=\"input_msg_modal\">Evidencia adjunta</p>\r\n");
      out.write("                            <img src=\"");
      out.print(x.getPer_evidenciaAdjunta());
      out.write("\" width=\"240\" height=\"280\"/>\r\n");
      out.write("                            <input id=\"input_txt_modal\" type=\"text\" value=\"");
      out.print(x.getPer_evidenciaAdjunta());
      out.write("\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-----**************************FOOTER MODAL*********************----------->\r\n");
      out.write("            <div id=\"div_buttom\" class=\"div_buttom col  s12\">\r\n");
      out.write("\r\n");
      out.write("                <div id=\"btn_container\" class=\"btn_container row \">                                               \r\n");
      out.write("                    <button type=\"submit\" name=\"btn_actualizar\" id=\"btn_action_salida\" class=\"btn_action_salida l12  m12 s12\">\r\n");
      out.write("                        <p id=\"txt_buttom\" class=\"txt_buttom\">\r\n");
      out.write("                            Enviar\r\n");
      out.write("                        </p>   \r\n");
      out.write("                    </button>   \r\n");
      out.write("\r\n");
      out.write("                    <button type=\"submit\" name=\"btn-eliminar\" id=\"btn_action_eliminar\" class=\"btn_action_salida l12  m12 s12\">\r\n");
      out.write("                        <p id=\"txt_buttom\" class=\"txt_buttom\">\r\n");
      out.write("                            Eliminar\r\n");
      out.write("                        </p>   \r\n");
      out.write("                    </button> \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("=======\r\n");
      out.write(">>>>>>> watch\r\n");
      out.write("        ");

            }
        
      out.write("               \r\n");
      out.write("            </div> \r\n");
      out.write("</div>\r\n");
      out.write("<!--------------------------------------------------------------------------------------------------->\r\n");
      out.write("  \r\n");
      out.write("    <!--***************FOOTER*********************-->\r\n");
      out.write("   <footer class=\"page-footer\" id=\"footer_form\">\r\n");
      out.write("       <div class=\"container white-text center\">\r\n");
      out.write("       © 2018 Biene-Soft\r\n");
      out.write("       <br>\r\n");
      out.write("       Todos los derechos reservados\r\n");
      out.write("       </div>      \r\n");
      out.write("   </footer>\r\n");
      out.write("        <!------------------------------------------------------------------------------------------------------>\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("    <!--importando funciones para los objetos-->    \r\n");
      out.write("    <script>\r\n");
      out.write("        document.addEventListener('DOMContentLoaded', function() {\r\n");
      out.write("            M.AutoInit();\r\n");
      out.write("        });\r\n");
      out.write("    </script>    \r\n");
      out.write("    \r\n");
      out.write("    <!--importando la funcion modal resultado-tabla-->\r\n");
      out.write("    <script src=\"js/modal-tabla/main.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("    <!--importando la funcion de modal-busqueda-->\r\n");
      out.write("    <script src=\"js/modulo-busqueda/main.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!--importando la funcion de modal-acordion-->\r\n");
      out.write("    <script src=\"js/tabla-acordion/main.js\"\r\n");
      out.write("        \r\n");
      out.write("    <!--JavaScript at end of body for optimized loading-->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"materialize/js/materialize.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
