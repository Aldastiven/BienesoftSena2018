<%-- 
    Document   : mi_perfil
    Created on : 01-nov-2018, 4:44:11
    Author     : equipo
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <!--estilo body-->
        <link type="text/css" rel="stylesheet" href="css/body.css" media="screen,projection"/>
            
        <!--estilo perfil-->
        <link type="text/css" rel="stylesheet" href="css/perfil/perfil.css" media="screen,projection"/>
            
        <!--estilo materialize.css-->
            <link type="text/css" rel="stylesheet" href="materialize/css/materialize.min.css"  media="screen,projection"/>    
            
        <!--estilo de la registro--> 
        <link type="text/css" rel="stylesheet" href="css/perfil/perfil.css"  media="screen,projection"/>
 
        <!--importando--->
        <script src="js/jquery.js"></script>
        
        <!--iconos--> 
        <link type="text/css" rel="stylesheet" href="css/styleicons.css"/>
        
        <!--estilo de la tabla--> 
        <link type="text/css" rel="stylesheet" href="css/tabla.css"  media="screen,projection"/>
            
        <!--estilo encabezado-->
        <link type="text/css" rel="stylesheet" href="css/encabezado.css"  media="screen,projection"/>
        
        <!--estilo botones-->
        <link type="text/css" rel="stylesheet" href="css/buttons.css"  media="screen,projection"/>
        
    </head>
    <body>
        
 
        
        <%
            HttpSession rnombre=request.getSession();
            int id=(int)rnombre.getAttribute("iden");
            String nom=(String)rnombre.getAttribute("nombre");
            String ape=(String)rnombre.getAttribute("apellido");
            int cel=(int)rnombre.getAttribute("celular");
            String mail=(String)rnombre.getAttribute("mail");
            String pass=(String)rnombre.getAttribute("clave");
            String foto=(String)rnombre.getAttribute("foto");
            String rol=(String)rnombre.getAttribute("rol");
        %>

<!--*******************************OBJETO NAV RESPONSIVE***************************-->
        
        <!--nav principal--->
        
        <nav class="nav-wrapper" id="nav_principal">
            <div class="container">

                <a id="logo_encab"  href="#" class="brand-logo hide-on-small-only white-text">BieneSoft</a>
                
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
                    
            <li><a href="#">Aprendizes</a></li>

            <li><a href="#">Alimentacion</a></li>

            <li><a href="#">Permisos</a></li>        
        </ul>
        
        <!--------------------------------------------------->
        <!--nav secundario (opciones)--->
        
        <nav id="nav_menu" class="hide-on-med-and-down" >
            <a href="mi_perfil.jsp">
                <input id="opc_menu_2" type="submit" value="Inicio"/>
                <img class="icon-h" src="iconos_nav_bar/profile.png"/>
            </a>
            <a href="f_permiso.jsp">
                <input id="opc_menu_2" type="submit" value="Perfil"/>
                <img class="icon-home" src="iconos_nav_bar/home.png"/>
            </a>
        </nav>

<h1 id="title_container">Mi perfil</h1>
           
<div class="container" style="margin-bottom:15px;">
    <div class="contenedor_blanco">
            <form action="ServletUsuario" enctype="multipart/form-data" method="post"> 
                <div class="row" id="container_form_large">
                    <div class="encab" id="encab" style="alignment-adjust: central;">
                        <img id="img_fotoperfil" class="img_fotoperfil" src="<%=foto%>"/>
                        <input  type="file"  name="t_fot" accept="img/*" placeholder="Tu Foto">
                    </div>

                    <div class="linea" id="linea">
                        <br>
                    </div>


                    <div class="input-field col s12 m6 l6">
                        <p id="input_msg">tu numero de identificacion</p>
                        <br>
                        <input id="input_txt" type="number" name="t_doc" placeholder="" value="<%=id%>" readonly>
                    </div>   

                     <div class="input-field col s12 l6 m6">
                        <p id="input_msg">Nombres</p>
                        <br>
                        <input id="input_txt" type="text" name="t_nom" placeholder="" value="<%=nom%>">
                    </div>

                     <div class="input-field col s12 l6 m6">
                        <p id="input_msg">Apellidos</p>
                        <br>
                        <input id="input_txt" type="text" name="t_ape" placeholder="" value="<%=ape%>">
                    </div>

                    <div class="input-field col s12 m6 l6">
                        <p id="input_msg">numero telefonico</p>
                        <br>
                        <input id="input_txt" type="number" name="t_cel" placeholder="" value="<%=cel%>" readonly>
                    </div>

                    <div class="input-field col s12 l6 m6">
                        <p id="input_msg">Correo electronico</p>
                        <br>
                        <input id="input_txt" type="text" name="" class="" name="t_ema" placeholder="" value="<%=mail%>">
                    </div>

                    <div class="input-field col s12 l6 m6">
                        <p id="input_msg">Contraseña</p>
                        <br>
                        <input id="input_txt" type="text" name="t_pas" placeholder="" value="<%=pass%>">
                    </div>

                    <div class="input-field col s12 l6 m6">
                        <p id="input_msg">Tipo de usuario</p>
                        <br>
                        <input id="input_txt" type="text" name="t_rol" placeholder="" value="<%=rol%>">
                    </div>

                
                    <div id="" class="" title="consultar aprendiz">
                        <button name="btn-modificar" id="btn_action_guardar" class="btn_action_guardar" type="submit" style="position: inherit;display: block;margin-left: auto;margin-right: auto;">
                            <p id="txt_buttom" >actualizar</p>
                        </button>
                    </div>
               
                </div>
            </form>
    </div>   
</div>   
               
               

               
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
