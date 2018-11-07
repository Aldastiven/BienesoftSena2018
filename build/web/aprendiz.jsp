<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Bienesoft | Home aprendiz</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css" />
    <script src="main.js"></script>
  
    <!--estilo body-->
    <link type="text/css" rel="stylesheet" href="css/body.css" media="screen,projection"/>

    <!--estilo encabezado-->
    <link type="text/css" rel="stylesheet" href="css/encabezado.css"  media="screen,projection"/>

    <!--estilo footer-->
    <link type="text/css" rel="stylesheet" href="css/footer.css"  media="screen,projection"/>
    
    <!--estilo materialize.css-->
    <link type="text/css" rel="stylesheet" href="materialize/css/materialize.min.css"  media="screen,projection"/>    

    <link type="text/css" rel="stylesheet" href="css_index_user/cards-prueba.css"  media="screen,projection"/>

    <!--importando--->
            <script src="js/jquery.js"></script>

</head>
<body>

        
        <!--*******************
    <!--estilo footer-->
    <link type="text/css" rel="stylesheet" href="css_index_user/footer.css"  media="screen,projection"/>

    <!--estilo menu tajetas-->
    <link type="text/css" rel="stylesheet" href="css_index_user/cards-prueba.css"  media="screen,projection"/>

    <!--importando--->
            <script src="js/jquery.js"></script>

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
                    
            <li><a href="#"> Aprendizes</a></li>

            <li><a href="#"> Alimentacion</a></li>

            <li><a href="#"> Permisos</a></li>        
        </ul>
        
        <!--------------------------------------------------->

            <!--------------------objeto perfil--------------------------------------------------->

            <div class="row contenedor-perfil hide-on-med-and-down">
                <%
                   HttpSession rnombre=request.getSession();
                   String nom=(String)rnombre.getAttribute("nombre");
                   String fot=(String)rnombre.getAttribute("foto");
                   int id=(int)rnombre.getAttribute("iden");
                %>

                <img id="img_foto" class="img_foto" src="<%=fot%>" />

                <div id="cont_name" class="cont_name">
                    <label id="msg_user" class="msg_user">Aprendiz</label>

                    <p id="user_text_nombre" class="user_text_nombre"><%=nom%></p>
                    <p id="user_text_nombre" class="user_text_nombre"><%=id%></p>
                </div>
                             
            </div>
                             
    <!----------------------botones de usuario---------------------------------->                 
            
            <div class="contenedor_btn_apr hide-on-med-and-down"  id="contenedor_btn_apr">
                <a href="mi_perfil.jsp">
                    <div class="btn_ver_perfil" id="btn_ver_perfil">
                    ver perfil
                    <img style="width: 20px;" src="css_index_user/icons/coordinador/btn_user.png" />
                    </div>
                </a>
            </div>
                    
                    
                    
       

    <!------------------objeto opciones-------------------------------------------->
    <div class=" contenedor-principal container row l12 m12 s12">

        <div class="row">

            <a href="f_permiso.jsp">
                <div class="option_menu col s12 l6 m12">
                    <p class="head_info" id="head_info">crear permiso</p>
                    <img src="css_index_user/icons/coordinador/menu_permiso.png" style="width: 120px;"/>
                    <p class="info_text_menu" id="info_text_menu">Crea tu permiso aqui</p>
                </div>
            </a>

            <a href="t_aprendiz.jsp">
                <div class="option_menu col s12 l5 m12">
                    <p class="head_info" id="head_info"> consultar datos como aprendiz </p>
                    <img src="css_index_user/icons/aprendiz/mochila.png" style="width: 120px;" />
                    <p class="info_text_menu" id="info_text_menu">Consulta tu informacion como aprendiz aqui</p>
                </div>
            </a>


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
<script>
    document.addEventListener('DOMContentLoaded', function() {
        M.AutoInit();
    });
</script>    

    
<!--JavaScript at end of body for optimized loading-->
<script type="text/javascript" src="materialize/js/materialize.min.js"></script>
        
    
</body>
</html>