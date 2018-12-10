<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Bienesoft | Home Coordinador</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css" />
    <script src="main.js"></script>
    
    <!--estilo body-->
    <link type="text/css" rel="stylesheet" href="css/body.css"  media="screen,projection"/>

    <!--estilo materialize.css-->
    <link type="text/css" rel="stylesheet" href="materialize/css/materialize.min.css"  media="screen,projection"/>    

    <!--estilo encabezado-->
    <link type="text/css" rel="stylesheet" href="css/encabezado.css"  media="screen,projection"/>

    <!--estilo footer-->
    <link type="text/css" rel="stylesheet" href="css/footer.css"  media="screen,projection"/>

    <!--estilo menu tajetas-->
    <link type="text/css" rel="stylesheet" href="css_index_user/cards-prueba.css"  media="screen,projection"/>
    
    <!--stilo para las nuevas tarjetas de menu-->
    <link type="text/css" rel="stylesheet" href="css/Style_Index.css"  media="screen,projection"/>

    <link href="https://fonts.googleapis.com/css?family=Abel" rel="stylesheet">
            
            
    <!--importando--->
    <script src="js/jquery.js"></script>

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
            </div>  
        </nav> 
            
<!------------------------------------------------------------------------------------------------------>

            <!--------------------objeto perfil--------------------------------------------------->

        <div class="row contenedor-perfil hide-on-med-and-down">
            <%
               HttpSession rnombre=request.getSession();
               String nom=(String)rnombre.getAttribute("nombre");
               String fot=(String)rnombre.getAttribute("foto");
            %>

            <img id="img_foto" class="img_foto" src="<%=fot%>" />

            <div id="cont_name" class="cont_name">
                   <label id="msg_user" class="msg_user">Coordinador</label>

                   <p id="user_text_nombre" class="user_text_nombre"><%=nom%></p>
            </div>             
        </div>
                             
            <!----------------------botones de usuario---------------------------------->                 
            
        <div class="contenedor_btn hide-on-med-and-down"  id="contenedor_btn">
            <a href="mi_perfil.jsp">
                <div class="btn_ver_perfil" id="btn_ver_perfil">
                ver perfil
                <img style="width: 20px;" src="css_index_user/icons/coordinador/btn_user.png" />
                </div>

            </a>

            <div class="btn_ver_usuarios" id="btn_ver_usuarios">
                <a href="t_usuario.jsp">
                    consultar usuarios
                    <!--<img style="width: 20px;" src="css_index_user/icons/coordinador/btn_users.png" />-->
                </a>
            </div>

        </div>

            <!------------------objeto opciones-------------------------------------------->
            
            <div class="cont_info"></div>    
            
        <div class="cont_principal">

                <a href="t_permiso_coordinador.jsp">
                    <div class="options">
                        <img class="img_option" src="css_index_user/icons/coordinador/menu_permiso.png" /> 
                        <p class="txt_option">Permisos</p>
                    </div>
                                                                                           
                </a>

                <a href="t_aprendiz.jsp">
                    <div class="options">                        
                       <img class="img_option" src="css_index_user/icons/coordinador/menu_aprendiz.png" />
                       <p class="txt_option">Aprendices</p>
                    </div>
                </a>

                <a href="t_ficha.jsp">
                    <div class="options">                        
                        <img class="img_option" src="css_index_user/icons/coordinador/menu_fichas.png" />
                        <p class="txt_option">Fichas</p>
                    </div>
                </a>

                <a href="t_habitacion.jsp">
                    <div class="options">                        
                        <img class="img_option" src="css_index_user/icons/coordinador/menu_habitacion.png" />
                        <p class="txt_option">Habitaciones</p>
                    </div>
                </a>

        </div>

<!--***************FOOTER*********************-->
        <div id="footer_style">
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
        
    
</body>
</html>