
<%@page import="modelo.aprendizSG"%>
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
</head>


    <body>
        
        <!--*******************************OBJETO NAV RESPONSIVE***************************-->
        
        <!--nav principal--->
        
        <nav class="nav-wrapper" id="nav_principal">
            <div class="container">

                
                <a href="menu-responsive" data-target="menu-responsive" class="sidenav-trigger"> 
                    <i>
                        <img style="width: 25px; margin-top: 10px;" src="materialize/icons/white/menu.png" />
                    </i>
                    
                        <ul class="right hide-on-med-and-down">
                        <lu id="li" title="cerrar cesion"><a href=""><img style="width: 25px; margin-top: 10px;" src="" /></a></lu>
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
                    
            <li><a href="t_permiso_coordinador.jsp"> Permisos</a></li>

            <li><a href="t_aprendiz"> Aprendices</a></li>

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
                String nom=(String)rnombre.getAttribute("datico");
             %>
        <p id="user_text" class="user_text hide-on-med-and-down"><%=nom%></p>


          <!--*********************************************************-->
        
        
        <!--*******************************OBJETO  MODULO CONSULTAS***************************-->
        
        <div class="container hide-on-small-only">
            <div id="search-container" >
                
                
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
    <div class="header_conte">
        <figcaption class="vicon">
            <img src="css_index_user/icons/coordinador/vaprendiz.png" height="75px"/> 
        </figcaption>
        <div class="prueba">
            <h1 class="titulonly">APRENDICES</h1>
        </div>
    </div>
 
         <div id="table"  class="table" style="margin-top: -10px;">
     
                <table class="table scrolling">
                    
                    <thead id="thead" class="thead">
                    
                        <th id="th_thead">Numero de documento</th>
                        <th id="th_thead">Tipo de documento</th>
                        <th id="th_thead">Nombres</th>
                        <th id="th_thead">Apellidos</th>
                        <th id="th_thead">Tipo de aprendiz</th>
                        <th id="th_thead">Numero de ficha</th>        
                        <th id="th_thead">Acciones</th>
                       
                    </thead>
                               
                    <%
                        ArrayList <aprendizSG> listdat = new ArrayList<>();
                        consultas con = new consultas();
                        listdat = con.consultarTablaAprendiz();
                        aprendizSG x = new aprendizSG();

                        for(int i = 0; i< listdat.size(); i++){
                        x = listdat.get(i);
                    %>
         
                    <tr style="padding: 0px;">
        <form action="ServletAprendiz" enctype="multipart/form-data" method="post">

                    <td><input class="browser-default" type="number" name="t_NumeroDocumento" value="<%=x.getApr_documento()%>"></td>
                    <td><input class="browser-default" type="text" name="t_TipoDocumento" value="<%=x.getApr_documentoTipo()%>"></td>
                    <td><input class="browser-default" type="text" name="t_Nombres" value="<%=x.getApr_nombres()%>"></td>
                    <td><input class="browser-default" type="text" name="t_Apellidos" value="<%=x.getApr_apellidos()%>"></td>
                    <td><input class="browser-default" type="text" name="t_TipoAprendiz" value="<%=x.getApr_tipoAprendiz()%>"></td>
                    <td><input class="browser-default" type="number" name="t_numeroFicha" value="<%=x.getApr_ficha_fic_numero()%>"></td>
        
                     <td>  
                    <div id="btn-ver-permiso-coordinador" class="btn-ver-permiso-coordinador" title="consultar aprendiz">
                        <img src="icon_acciones/ver.png" style="padding-left: 15px" />
                    </div>
                </td>

            
</tr>


</div>

                        </form>

            </div>
        <%
            }
        %>               
            </div> 
</div>
<!--------------------------------------------------------------------------------------------------->
                
         
         <!--**************************************************************************************************-->
         
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
