<%-- 
    Document   : aprendiz
    Created on : Sep 23, 2018, 3:21:24 PM
    Author     : Stefany
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
            <!--Let browser know website is optimized for mobile-->
            <meta name="viewport" content="width=device-width, initial-scale=1.0"/> 
            
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

            <!--importando imagen y texto en pestaña-->
            <link rel="shortcut icon" type="image/x-icon" href="materialize/icons/black/ver_lista.png" />
            <title>BieneSoft | Home Aprendiz</title>

            <!--estilo body-->
            <link type="text/css" rel="stylesheet" href="css/body.css" media="screen,projection"/>
            
            <!--estilo encabezado-->
            <link type="text/css" rel="stylesheet" href="css/encabezado.css"  media="screen,projection"/>

            <!--estilo modulo busqueda-->
            <link type="text/css" rel="stylesheet" href="css/modulo_busqueda.css" media="screen,projection"/>
            
            <!--estilo de la tabla--> 
            <link type="text/css" rel="stylesheet" href="css/tabla.css"  media="screen,projection"/>
            
            <!--estilo del panel mensaje--> 
            <link type="text/css" rel="stylesheet" href="css/panel_mensaje.css"  media="screen,projection"/>
            
            <!--estilo modulo busqueda-->
            <link type="text/css" rel="stylesheet" href="css/login.css" media="screen,projection"/>
            
            <!--estilo modulo usuario index panel-->
            <link type="text/css" rel="stylesheet" href="css/user_index.css" media="screen,projection"/>
            
            <!--estilo cards menu-->
            <link type="text/css" rel="stylesheet" href="css/cards.css" media="screen,projection"/>
            
            <!--estilo footer---->
            <link type="text/css" rel="stylesheet" href="css/footer.css" media="screen,projection"/>
            
 
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

                <a id="logo_encab"  href="#" class="brand-logo hide-on-small-only black-text">Biene-Soft</a>
                
                <a href="#" data-target="menu-responsive" class="sidenav-trigger"> 
                    <i>
                        <img style="width: 25px; margin-top: 10px;" src="materialize/icons/white/menu.png" />
                    </i>
                    
                        <ul class="right hide-on-med-and-down">
                        <lu id="li" title="cerrar cesion"><a href=""><img style="width: 25px; margin-top: 10px;" src="materialize/icons/white/menu.png" /></a></lu>
                        </ul>
                </a>
                
                    <a href="#" data-target="menu-responsive" class="sidenav-trigger"> 
                        <ul  class="right hide-on-med-and-down">
                            <lu id="li" title="cerrar cesion"><a href=""><img style="width: 25px; margin-top: 10px;" src="materialize/icons/white/menu.png" /></a></lu>
                        </ul>
                    </a>
                
                    <a href="#" data-target="menu-responsive" class="sidenav-trigger"> 
                        <ul  class="right hide-on-med-and-down">
                            <lu id="li" title="cerrar cesion"><a href=""><img style="width: 25px; margin-top: 10px;" src="materialize/icons/white/menu.png" /></a></lu>
                        </ul>
                    </a>
            </div>  
        </nav> 
        
        <!--menu response-->
        
        <ul class="sidenav" id="menu-responsive">
                    
            <li><a href="#">Solicitar permiso</a></li>
      
        </ul>
        
        <!--------------------------------------------------->

        <!--**************************************************************************************************-->
          
        <!--PANEL VISTA USER--->
 
                <div class="row">
                    
                    <div class="col s12 m12 l12">
                        <div class="card-separetor-left" id="card-separetor-left ">
                            <div class="card-container" id="card-container">
                                
                                
                                <div class="panel-left" id="panel-left">
                                    
                                    <p class="header-panel-left" id="header-panel-left">
                                    </p>
                                    
                                    <%
                                        HttpSession rnombre=request.getSession();
                                        String nom=(String)rnombre.getAttribute("datico");
                                        String fot=(String)rnombre.getAttribute("fotico");
                                     %>
                                     
                                     <img id="img_user_index" class="img_user_index" src="<%=fot%>" />
                                     
                                     <label id="user_text_index_tipo" class="user_text_index_tipo hide-on-small-only">Aprendiz</label>
                                            
                                    <p id="user_text_index_nombre" class="user_text_index_nombre hide-on-small-only"><%=nom%></p>
                                    
                                    <div class="footer-user-index" id="footer-user-index">
                                        
                                        <div class="btn_consultar_perfil" id="btn_consultar_perfil">
                                            <p id="txt-btn-perfil" class="txt-btn-perfil">ver perfil usuario</p>
                                        </div>
                                        
                                        <div class="btn_consultar_aprendiz" id="btn_consultar_aprendiz">
                                            <p id="txt-btn-perfil" class="txt-btn-perfil">ver perfil aprendiz</p>
                                        </div>
                                        
                                    </div>
                                 
                                </div>
                                    
                                    
                                    <!-------------------------------------------------------------------------------------------->
                                   <div class="panel-right" id="panel-right">                               
                                            <p class="header-panel-right" id="header-panel-right">
                                            </p>

                                            <div class="contenedor_menu" id="contenedor_menu"> 
                                                
                  <!---******************************************PANEL DE OPCION PRINCIPAL***************************************----->                              
                                                <div class="opcion-menu-1-aprendiz" id="opcion-menu-1-aprendiz">
                                                    
                                                    <div  class="infomacion-card" id="informacion-card"><!--**INFORMACION**-->
                                                        <p style="color: white; background: transparent; text-align: center; font-size: 15px;" >
                                                            Aqui puedes crear tu permiso de salida semanal y fin de semana
                                                        </p>
                                                        <img style="width: 100%; height: 73%;" src="icon_acciones/crear permiso.jpg" />
                                                    </div>
                                                    
                                                        <div class="footer-user-index" id="footer-user-index"> <!--**BOTON**-->
                                                            <div class="btn_crear_permiso" id="btn_crear_permiso">
                                                                <p id="txt-btn-crear" class="txt-btn-crear">Crear</p>
                                                            </div>-
                                                        </div>
                                                </div>
                   <!--*******************************************PANELES DE OPCION SECUNDARIOS********************************-->                             
                                                <div class="opcion-menu-2-aprendiz" id="opcion-menu-2-aprendiz">
                                                    <div class="img_option" id="img_option"></div>
                                                    <div class="information_option" id="information_option"></div>
                                                    <div class="btn_option" id="btn_option"></div>
                                                </div>
                                                
                                                <div class="opcion-menu-3-aprendiz" id="opcion-menu-3-aprendiz">
                                                    <div class="img_option" id="img_option"></div>
                                                    <div class="information_option" id="information_option"></div>
                                                    <div class="btn_option" id="btn_option"></div>
                                                </div>
                                                
                                                <div class="opcion-menu-4-aprendiz" id="opcion-menu-4-aprendiz">
                                                    <div class="img_option" id="img_option"></div>
                                                    <div class="information_option" id="information_option"></div>
                                                    <div class="btn_option" id="btn_option"></div>
                                                </div>

                                            </div>
                                    </div>
                                
                                    
                                
                            </div>
                        </div>
                                    
            
                    </div>
   
                </div>

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
        
            <!--JavaScript at end of body for optimized loading-->
            <script type="text/javascript" src="materialize/js/materialize.min.js"></script>

        
    </body>
</html>
