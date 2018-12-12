<%-- 
    Document   : mi_perfil
    Created on : 01-nov-2018, 4:44:11
    Author     : equipo
--%>
<%@page import="modelo.consultas"%>
<%@page import="modelo.usuarioSG"%>
<%@page import="java.util.ArrayList"%>
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

        
        <link type="text/css" rel="stylesheet" href="css/footer.css"  media="screen,projection"/>
 
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
        
        <link type="text/css" rel="stylesheet" href="css/section.css"  media="screen,projection"/>
        
        <link type="text/css" rel="stylesheet" href="css/Style_formulario.css"  media="screen,projection"/>
        
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lobster">
        
    </head>
    <body>
        

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
        
        <nav id="nav_menu" class="hide-on-med-and-down" style="display: none;">
            <a href="">
                <input id="opc_menu_2" type="submit" value="Inicio"/>
                <img class="icon-h" src="iconos_nav_bar/profile.png"/>
            </a>
            <a href="">
                <input id="opc_menu_2" type="submit" value="Perfil"/>
                <img class="icon-home" src="iconos_nav_bar/home.png"/>
            </a>
        </nav>
        
        <!--MODULO INFORMACION USUARIO-->
        <label id="user_text" class="user_text hide-on-med-and-down">Usuario</label> 
        <%                                
            ArrayList<usuarioSG> listdat=new ArrayList<>(); 
            consultas con=new consultas();
            listdat=con.consultaUsuario();
            usuarioSG igs=new usuarioSG();
            
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

        
        <section class="section">
            
                <h1 id="title_container">Mi perfil</h1>

                        <div class="contenedor_form">

                            <form action="ServletUsuario" enctype="multipart/form-data" method="post"> 
                                
                                
                                
                                <div class="row" class="containedor_form">
                                    <div class="encabezado_form">
                                            <div class="foto_perfil">                                            
                                                <img class="f_perfil" src="<%=foto%>"/>                                            
                                            </div>

                                                <div class="image-upload">
                                                    <label for="file-input">
                                                        <img src="css/acciones/camara.png" alt ="Click aquí para subir tu foto" title ="Click aquí para subir tu foto" > 
                                                    </label>
                                                        <input id="file-input" type="file" name="f_fot" accept="img/*" />
                                                </div>         
                                    </div>
                                    
                                    <div class=" cont_info_perfil">
                                        <p class="txt_tit_info">ID</p>                   <input type="text" class=" info_perfil_only browser-default" value="<%=id%>" readonly>
                                        <p class="txt_tit_info">Nombres</p>              <input type="text" class=" info_perfil_only browser-default" value="<%=nom%>" readonly>
                                        <p class="txt_tit_info">Apellidos</p>            <input type="text" class=" info_perfil_only browser-default" value="<%=ape%>" readonly>
                                        <p class="txt_tit_info">Numero De Contacto</p>   <input type="text" class=" info_perfil_only browser-default" value="<%=cel%>" readonly>
                                        <p class="txt_tit_info">E-mail</p>               <input type="text" class=" info_perfil_only browser-default" value="<%=mail%>" readonly>
                                        <p class="txt_tit_info">Contraseña</p>           <input type="password" class=" info_perfil_only browser-default" value="<%=pass%>" readonly>
                                    </div>
                                    <div  class="div_cambiar_datos"> 
                                        <div class="center_cam">
                                            <p class="txt_actualizar_datos">Actualiza tus datos</p>
                                            <img class="img_actualizar_datos" src="css/acciones/editar_perfil.png">
                                        </div>
                                    </div>   
                                    <div class="div_editar" id="div_editar">                                                                                        
                                                            <div class="hide">
                                                                <p id="input_msg">tu numero de identificacion</p>
                                                                <br>
                                                                <input id="input_txt" name="t_doc" value="<%=id%>" type="number">
                                                            </div>   

                                                             <div class="hide">
                                                                <p id="input_msg">Nombres</p>
                                                                <br>
                                                                <input id="input_txt" name="t_nom" value="<%=nom%>"  placeholder="<%=nom%>" type="text">
                                                            </div>

                                                             <div class="hide">
                                                                <p id="input_msg">Apellidos</p>
                                                                <br>
                                                                <input id="input_txt" name="t_ape" value="<%=ape%>" type="text">
                                                            </div>

                                                            <div class="input-field col s12 m6 l6">
                                                                <p id="input_msg">numero telefonico</p>
                                                                <br>
                                                                <input id="input_txt" name="t_cel" value="<%=cel%>" type="number">
                                                            </div>

                                                            <div class="input-field col s12 l6 m6">
                                                                <p id="input_msg">Correo electronico</p>
                                                                <br>
                                                                <input id="input_txt" name="t_ema" value="<%=mail%>" type="email">
                                                            </div>

                                                            <div class="input-field col s12 l6 m6">
                                                                <p id="input_msg">Contraseña</p>
                                                                <br>
                                                                <input id="input_txt" name="t_pas" value="<%=pass%>" type="text">
                                                            </div>

                                                            <div class="hide">
                                                                <p id="input_msg">Tipo de usuario</p>
                                                                <br>
                                                                <input id="input_txt" name="t_rol" value="<%=rol%>" type="text">
                                                            </div>

                                                    <div id="" class="" title="consultar aprendiz">
                                                        <button name="btn-modificarPerfil" id="btn_action_guardar" class="btn_action_guardar" type="submit" style="position: inherit;display: block;margin-left: auto;margin-right: auto;">
                                                            <p id="txt_buttom" >actualizar</p>
                                                        </button>
                                                    </div>
                                    </div>
                            </form>
                        </div>   
                    </div>
            
        </section>
   
                
       
                
    <!--***************FOOTER*********************-->
        <div id="footer_style_2">
            <div id="footer_p_1" >
                <img id="img_foot_1" src="img_footer/Logo4.png" />
                <img id="img_foot_2" src="img_footer/Logo1.png" />
            </div>
            <div id="footer_p_2" > 
                <p id="text_foot">BieneSoft</p>
                <p id="text_foot">Todos los derechos reservados</p>
                <p id="text_foot">2018</p>
            </div>
            <div id="footer_p_3" >
                <img id="img_foot_3" src="img_footer/Logo2.png" />
                <img id="img_foot_4" src="img_footer/Logo3.png" />
            </div>
        </div>
    <!------------------------------------------------------------------------------------------------------>
              
               

               
        <!--importando funciones para los objetos-->    
            <script>
                document.addEventListener('DOMContentLoaded', function() {
                    M.AutoInit();
                });
            </script>  
        
            <!--JavaScript at end of body for optimized loading-->
            <script type="text/javascript" src="materialize/js/materialize.min.js"></script>
            <script type="text/javascript" src="js/Acordion/perfil_editar.js"></script>
               
    </body>
</html>
