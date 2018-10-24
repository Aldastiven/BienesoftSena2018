<!--LOGIN BIENESOFT-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
            <!--Let browser know website is optimized for mobile-->
            <meta name="viewport" content="width=device-width, initial-scale=1.0"/> 
            
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

            <!--importando imagen y texto en pestaña-->
            <link rel="shortcut icon" type="image/x-icon" href="materialize/icons/black/ver_lista.png" />
            <title>BieneSoft | Inicio</title>

            <!--estilo body-->
            <link type="text/css" rel="stylesheet" href="css/body.css" media="screen,projection"/>
            
            <!--estilo encabezado-->
            <link type="text/css" rel="stylesheet" href="css/encabezado.css"  media="screen,projection"/>

            <!--estilo modulo busqueda-->
            <link type="text/css" rel="stylesheet" href="css/modulo_busqueda.css" media="screen,projection"/>
            
            <!--estilo de la tabla--> 
            <link type="text/css" rel="stylesheet" href="css/tabla.css"  media="screen,projection"/>
            
            <!--estilo de la tabla--> 
            <link type="text/css" rel="stylesheet" href=""  media="screen,projection"/>
            
            <!--estilo modulo busqueda-->
            <link type="text/css" rel="stylesheet" href="css/login.css" media="screen,projection"/>

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

                
                <a id="logo_encab"  href="#" class="brand-logo hide-on-small-only">Biene-Soft</a>

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
                
                    <a href="#" data-target="menu-responsive" class="sidenav-trigger"> 
                        <ul  class="right hide-on-med-and-down">
                            <lu id="li" title="cerrar cesion"><a href=""><img style="width: 25px; margin-top: 10px;" src="materialize/icons/white/menu.png" /></a></lu>
                        </ul>
                    </a>
            </div>  
        </nav> 
        
        <!--menu response-->
        
        <ul class="sidenav" id="menu-responsive">              
            <li><a href="#"> Aprendizes</a></li>

            <li><a href="#"> Alimentacion</a></li>

            <li><a href="#"> Permisos</a></li>        
        </ul>
        
        <!--------------------------------------------------->

  
    
    
 <div class="container l12 m12 s12 ">
                <br>
                <br>   
                    <div class="row l12 m12 s12">

                        <div class="col l6 m7 s12">

                            <form action="ServletLogin">

                             <div id="container-login" class="container-login l12 m12 s12">
                                 <h4 class="header-login" id="header-login" >ingresa</h4>

                            
                           <div class="col l12 m12 s12">
                               <p id="login_input_msg" class="login_input_msg">Usuario</p>
                                <br>
                                <input id="txt_user" type="text" class=" s12 l612 m12" name="user">
                            </div>

                            <div class="col l12 m12 s12">
                                <p id="login_input_msg" class="txt_user login_input_msg">Contraseña</p>
                                <br>
                                <input id="txt_user" type="password" class="txt_user s12 l6 m12" name="pass">
                            </div>

                                
                                    <button id="btn-Ingreso" class="btn-Ingreso" name="btn-entrar" >
                                    <p id="msg-btn" class="msg-btn">entrar</p>
                                    </button>
                            
                                
                            <p href="#recover" id="msg-remember" class="msg-remember">Forgot your password?</p>
                            
                            </div> 
                            </form>

                        </div>

                        <div class="col l6 m5 s12">
                        <img src="img-login/index.jpg" class=" responsive-img hide-on-small-only">
                        </div>

    </div>
    </div>
    
    
    
    
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

            <!--JavaScript at end of body for optimized loading-->
            <script type="text/javascript" src="materialize/js/materialize.min.js"></script>
    
    </body>
</html>
