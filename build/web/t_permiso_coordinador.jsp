
<%@page import="modelo.consultas"%>
<%@page import="modelo.permisoSG"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <!--Let browser know website is optimized for mobile-->
            <meta name="viewport" content="width=device-width, initial-scale=1.0"/> 
            
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            
            <!--iconos--> 
            <link type="text/css" rel="stylesheet" href="css/styleicons.css"/>

            <!--importando imagen y texto en pestaña-->
            <link rel="shortcut icon" type="image/x-icon" href="materialize/icons/black/ver_lista.png" />
            <title>BieneSoft | Permiso Coordinador</title>

            <!--estilo body-->
            <link type="text/css" rel="stylesheet" href="css/body.css" media="screen,projection"/>
            
            <!--estilo encabezado-->
            <link type="text/css" rel="stylesheet" href="css/encabezado.css"  media="screen,projection"/>

            <!--estilo modulo busqueda-->
            <link type="text/css" rel="stylesheet" href="css/modulo_busqueda.css" media="screen,projection"/>
            
            <!--estilo de la tabla--> 
            <link type="text/css" rel="stylesheet" href="css/tabla.css"  media="screen,projection"/>
            
            <!--estilo de la acordion--> 
            <link type="text/css" rel="stylesheet" href="css/acordion_busqueda.css"  media="screen,projection"/>
            
            <!--estilo modal-->
            <link type="text/css" rel="stylesheet" href="css/modal.css" media="screen,projection"/>
            
            <!--estilo de la botones--> 
            <link type="text/css" rel="stylesheet" href="css/buttons.css"  media="screen,projection"/>
            
            <!--estilo de la registro--> 
            <link type="text/css" rel="stylesheet" href="css/formulario.css"  media="screen,projection"/>
            
            <!--estilo footer-->
            <link type="text/css" rel="stylesheet" href="css/footer.css"  media="screen,projection"/>

            <!--estilo materialize.css-->
            <link type="text/css" rel="stylesheet" href="materialize/css/materialize.min.css"  media="screen,projection"/>

            <!--importando--->
            <script src="js/jquery.js"></script>
            
            <!--buscador-->
            <script src="js/buscadorfacil/BuscadorTabla.js"></script>
</head>


    <body>
        
        <!--*******************************OBJETO NAV RESPONSIVE***************************-->
        
        <!--nav principal--->
        
        <nav class="nav-wrapper" id="nav_principal">
            <div class="container">

                <a href="#" data-target="menu-responsive" class="sidenav-trigger"> 
                    <i>
                        <img style="width: 25px; margin-top: 10px;" src="materialize/icons/white/menu.png" />
                    </i>
                    <ul class="right hide-on-med-and-down">
                        <lu id="li" title="cerrar cesion"><a href="index.jsp"><img style="width: 25px; margin-top: 10px;" src="icon_acciones/salida.png" /></a></lu>
                    </ul>
                </a>
                
                <a href="#" data-target="menu-responsive" class="sidenav-trigger"> 
                    <ul  class="right hide-on-med-and-down">
                        <lu id="li" title="cerrar cesion"><a href=""><img style="width: 25px; margin-top: 10px;" src="" /></a></lu>
                    </ul>
                </a>

                <a href="#" data-target="menu-responsive" class="sidenav-trigger"> 
                    <ul  class="right hide-on-med-and-down">
                        <lu id="li" title="cerrar cesion"><a href=""><img style="width: 25px; margin-top: 10px;" src="" /></a></lu>
                    </ul>
                </a>
            </div>  
        </nav> 
        
        <!--menu response-->
        <ul class="sidenav" id="menu-responsive">
                    
            <li><a href="t_permiso_coordinador.jsp">Permisos</a></li>

            <li><a href="t_aprendiz">Aprendices</a></li>

            <li><a href="t_ficha.jsp">Fichas</a></li>
            
            <li><a href="t_aprendiz_rel_patrocinio.jsp">Patrocinios</a></li> 
            
            <li><a href="t_habitacion.jsp">Habitaciones</a></li>        
        </ul>
        
        <!--------------------------------------------------->

        <!--nav secundario (opciones)--->
        <nav id="nav_menu" class="hide-on-med-and-down" >
            <a href="coordinador.jsp">
                <img class="icon-a" src="iconos_nav_bar/home.png"/>
                <input id="opc_menu_2" type="submit" value="Inicio"/>
            </a>
            <a href="t_permiso_coordinador.jsp">
                <!--<span class="icon-office"></span>-->
                <img class="icon-b" src="iconos_nav_bar/permisos.png"/>
                <input id="opc_menu_2" type="submit" value="Permisos"/>
            </a>

            <a href="t_aprendiz.jsp">
                <img class="icon-c" src="iconos_nav_bar/aprendiz.png"/>
                <input id="opc_menu_2" type="submit" value="Aprendices"/>
            </a>

            <a href="t_ficha.jsp">
                <img class="icon-d" src="iconos_nav_bar/fichas.png"/>
                <input id="opc_menu_2" type="submit" value="Fichas"/>
            </a>    

            <a href="t_aprendiz_rel_patrocinio.jsp">
                <img class="icon-e" src="iconos_nav_bar/patrocinio.png"/>
                <input id="opc_menu_2" type="submit" value="Patrocinio"/>
            </a>

            <a href="t_habitacion.jsp">
                <img class="icon-f" src="iconos_nav_bar/habitaciones.png"/>
                <input id="opc_menu_2" type="submit" value="Habitaciones"/>
            </a>
        </nav>
        <!--**************************************************************************************************-->
        
        <!--MODULO INFORMACION USUARIO-->
        <label id="user_text" class="user_text hide-on-med-and-down">Coordinador</label> 
            <%
                HttpSession rnombre=request.getSession();
                String nom=(String)rnombre.getAttribute("nombre");
            %>
        <p id="user_text" class="user_text hide-on-med-and-down"><%=nom%></p>


        <!--*********************************************************-->
        
        
        <!--*******************************OBJETO  MODULO CONSULTAS------------------------>

        <div class="container hide-on-small-only">
            <div id="search-container"  class="browser-default">
                <!--ComoboBox-->
                <form action="t_permiso_coordinador.jsp" method="post">
                    
                    <!--Filtro busqueda id-->
                    <input id="searchTerm" class="searchTerm" type="text" name="documento" onkeyup="doSearch()" placeholder="busca" style="border: 1px solid gray; float: left; width: 170px; margin-right: 120px" class="browser-default"/>
                 
                    <!--combobox--> 
                    <select id="ComboFiltro" name="cbx_tipo_per" class="browser-default searchTerm" style="width: 170px; float:left; border: 1px solid gray;">
                        <option value="">Todo</option>
                        <option value="semana morning">Semana - Mañana</option>
                        <option value="semana tarde">Semana - Tarde</option>
                        <option value="fin de semana">Fin de semana</option>
                        <option value="extra">Extra</option>
                    </select>
                    
                    <button id="btn_ver" type="submit" value="Ingresar" name="" style="float: left; background: transparent; cursor: pointer; position:relative; bottom:10px; border:none">
                        <img src="icon_acciones/icon_buscar.png" title="Buscar" style=" cursor: pointer; width: 30px;"/>
                    </button>
                </form> 
                
            </div>
        </div>
        
        <div id="btn-search-principal" class="btn-search-principal hide-on-med-and-up">
            <img src="materialize/icons/white/search.png" />
        </div>
        
        <div id="btn-search-close" class="btn-search-close hide-on-med-and-up">
            <img src="materialize/icons/white/close.png" />
        </div>
        
        <div id="modal-container" class="modal-container container hide-on-med-and-up">
            <div id="search-container-modal" class="col s12">
            </div>
        </div>
            
         
        
        
        <!--**************************************************************************************************-->


  <!--*******************************OBJETO TABLA***************************-->
        
 <div class="container l12 m12 s12 hide-on-small-only">
    <h1 id="title_container">PERMISOS</h1>
 
         <div id="table"  class="table" style="margin-top: -10px;">
     
                <table class="table scrolling">
                    
                    <div id="datos" class=" col red">
                    
                              
                    <%
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
                    %>
                    
                    
                    
                        </div>
                        
                    
                 <%
                   }
                %>                  
               
                <div onclick="ver_modal()" id="btn-ver-permiso-coordinador" class="btn-ver-permiso-coordinador" title="consultar aprendiz">
                        <img src="icon_acciones/ver.png" style="padding-left: 15px"/>
                    </div>
                
                </table>  
  </div>

</div>  
                
                <!-----------------------------OBJETO ACORDION------------------------------------------->
<div class="container div_principal hide-on-med-and-up" id="container">
    <h1 id="title">consultas permisos</h1>
            <div id="div_principal" class="">              
                <%
                    ArrayList <permisoSG> consulta = new ArrayList<>();
                    consulta = con.consultarPermiso(cbx_tipo_per, documento);
                    for (int e = 0; e< consulta.size(); e++ ){
                    x= consulta.get(e);
                %>
                <div class="divuno" id="divuno">
                    <input class="browser-default" id="txt" type="text"  value=" <%=x.getPer_Aprendiz_Apr_documento()%> " readonly>
                </div>

                <div class="divdos" id="divdos">
                    Consultar
                </div>

                

                <div class="row">
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Hora de ingreso real</p>   <!--falta-->
                            <input id="input_txt_modal" readonly type="time" name="t_hreal" value="<%=x.getPer_fecha_ingreso()%>">
                        </div>
                            
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Fecha de ingreso real</p>
                            <input id="input_txt_modal" readonly type="date" name="t_freal" value="<%=x.getPer_fecha_ingresoReal()%>">
                        </div>                      
                </div>

                <div class="row">
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Hora de salida real</p>
                            <input id="input_txt_modal" readonly type="time" name="t_hsreal" value="<%=x.getPer_hora_salidaReal()%>">
                        </div>  
                        
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Fecha de salida real</p>   <!--falta-->
                            <input id="input_txt_modal" readonly type="date" name="t_fsreal" value="<%=x.getPer_hora_Salida()%>">
                        </div>
                </div>
                 
                <div class="row">                 
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Observacion</p>
                            <input id="input_txt_modal" readonly type="text" name="t_obser" value="<%=x.getPer_observacion_permiso_llegada()%>">
                        </div>
                        
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Motivo</p>
                            <input id="input_txt_modal" readonly type="text" name="t_moti" value="<%=x.getPer_motivo()%>">
                        </div>                     
                </div>
                
                <div class="row">                    
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Estado</p>
                            <input id="input_txt_modal" type="text" name="t_estado" value="<%=x.getPer_estado()%>" readonly>
                        </div>
                    
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Autoriza</p>
                            <input id="input_txt_modal" type="text" name="t_autoriza" value="<%=x.getPer_autoriza()%>">
                        </div>
                </div>
                        
                <div class="row">
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Evidencia adjunta</p>
                            <img src="<%=x.getPer_evidenciaAdjunta()%>" width="240" height="280"/>
                            <input id="input_txt_modal" type="text" value="<%=x.getPer_evidenciaAdjunta()%>">
                        </div>
                </div>



        </div>
    </div>

    <!-----**************************FOOTER MODAL*********************----------->
            <div id="div_buttom" class="div_buttom col  s12">

                <div id="btn_container" class="btn_container row ">                                               
                    <button type="submit" name="btn_actualizar" id="btn_action_salida" class="btn_action_salida l12  m12 s12">
                        <p id="txt_buttom" class="txt_buttom">
                            Enviar
                        </p>   
                    </button>   

                    <button type="submit" name="btn-eliminar" id="btn_action_eliminar" class="btn_action_salida l12  m12 s12">
                        <p id="txt_buttom" class="txt_buttom">
                            Eliminar
                        </p>   
                    </button> 
                </div>

            </div>

</div>

                        </form>

            </div>
        <%
            }
        %>               
            </div> 
</div>
<!--------------------------------------------------------------------------------------------------->
  
    <!--***************FOOTER*********************-->
   <footer class="page-footer" id="footer_form">
       <div class="container white-text center">
       © 2018 Biene-Soft
       <br>
       Todos los derechos reservados
       </div>      
   </footer>
        <!------------------------------------------------------------------------------------------------------>
                

    <!--importando funciones para los objetos-->    
    <script>
        document.addEventListener('DOMContentLoaded', function() {
            M.AutoInit();
        });
    </script>    
    
    <!--importando la funcion modal resultado-tabla-->
    <script src="js/modal-tabla/main.js"></script>
  
    <!--importando la funcion de modal-busqueda-->
    <script src="js/modulo-busqueda/main.js"></script>
    
    <!--importando la funcion de modal-acordion-->
    <script src="js/tabla-acordion/main.js"
        
    <!--JavaScript at end of body for optimized loading-->
    <script type="text/javascript" src="materialize/js/materialize.min.js"></script>

    </body>
</html>
