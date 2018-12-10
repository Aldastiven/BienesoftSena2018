<%@page import="modelo.permiso_historialSG"%>
<%@page import="jdk.nashorn.internal.runtime.ListAdapter"%>
<%@page import="modelo.usuarioSG"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="modelo.patrocinioSG"%>
<%@page import="controlador.ServletPermiso"%>
<%@page import="modelo.crudPermisos"%>
<%@page import="modelo.consultas"%>
<%@page import="modelo.permisoSG"%>
<%@page import="java.util.ArrayList"%>
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
                <a href="mi_perfil_aprendiz.jsp">
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

            <a href="info_aprendiz.jsp">
                <div class="option_menu col s12 l5 m12">
                    <p class="head_info" id="head_info"> consultar datos como aprendiz </p>
                    <img src="css_index_user/icons/aprendiz/mochila.png" style="width: 120px;" />
                    <p class="info_text_menu" id="info_text_menu">Consulta tu informacion como aprendiz aqui</p>
                </div>
            </a>


        </div>

    </div>
    
    <div style="background: yellow; width: 300px; position: relative; top: -150px; margin-left: 30px; margin-top: -40; display: none;">
        
        <div>
    <%                                
            ArrayList<usuarioSG> listdatusu=new ArrayList<>(); 
            consultas con=new consultas();
            listdatusu=con.consultaUsuario();
            usuarioSG igs=new usuarioSG();
      
            int idper=(int)rnombre.getAttribute("iden");
        %>

        <%
            ArrayList<permisoSG> listdat=new ArrayList<>(); 
            int u=id;
            listdat=con.consulta_notificacion(u);
            permisoSG x=new permisoSG();

            for(int i=0; i<listdat.size(); i++){
            x=listdat.get(i);
        %>
        <div id="resp_noti">        
            <input id="input_txt" name="t_doc" value="<%=x.getPer_motivo()%>, <%=x.getPer_estado()%>" type="text" style="background: blue;">
        </div>
    <%
        }
    %>


    </div>  
    
    
    <div>
            

        <%
            ArrayList<permiso_historialSG> listdathis=new ArrayList<>(); 
            listdathis=con.consulta_notificacion_his(u);
            permiso_historialSG ph = new permiso_historialSG();

            for(int i=0; i<listdat.size(); i++){
            ph=listdathis.get(i);
        %>
        <div id="resp_noti">        
           <input id="input_txt" name="t_doc" value="<%=ph.getHis_per_estado()%>, <%=ph.getHis_per_ID()%>" type="text" style="background: blue;"> 
        </div>
    <%
        }
    %>

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

</html>