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
                <input id="opc_menu_2" type="submit" value="Inicio"/>
            </a>
            <a href="t_permiso_coordinador.jsp">
                <input id="opc_menu_2" type="submit" value="Permisos"/>
            </a>

            <a href="t_aprendiz.jsp">
                <input id="opc_menu_2" type="submit" value="Aprendices"/>
            </a>

            <a href="t_ficha.jsp">
                <input id="opc_menu_2" type="submit" value="Fichas"/>
            </a>    

            <a href="t_aprendiz_rel_patrocinio.jsp">
                <input id="opc_menu_2" type="submit" value="Patrocinio"/>
            </a>

            <a href="t_habitacion.jsp">
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
                        <div id="datos" class="col">
                    
                        </div>
                </table>
             
  </div>

                    
                    
</div>
           
  
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
    <!--<script>
        document.addEventListener('DOMContentLoaded', function() {
            M.AutoInit();
        });
    </script>    

    <script src="js/modal-tabla/main.js"></script>
 
    <script src="js/modulo-busqueda/main.js"></script>
    
    <script src="js/tabla-acordion/main.js">
    
    <script type="text/javascript" src="materialize/js/materialize.min.js"></script>-->

    </body>
</html>
