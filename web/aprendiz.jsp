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
    
    <!--estilo materialize.css-->
    <link type="text/css" rel="stylesheet" href="materialize/css/materialize.min.css"  media="screen,projection"/>    

    <link type="text/css" rel="stylesheet" href="css/notificaciones.css"  media="screen,projection"/>
    <!--importando--->
    
    
    <link type="text/css" rel="stylesheet" href="css/footer.css"  media="screen,projection"/>
    
    <link type="text/css" rel="stylesheet" href="css/section.css"  media="screen,projection"/>
    
     <!--stilo para las nuevas tarjetas de menu-->
     <link type="text/css" rel="stylesheet" href="css/Style_index_apr.css"  media="screen,projection"/>
     
      <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lobster">
      <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
      
    <script src="js/jquery.js"></script>

</head>    
        
    <!--estilo footer-->
    <link type="text/css" rel="stylesheet" href="css_index_user/footer.css"  media="screen,projection"/>

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
                    <button type="submit" class="btn_mi_perfil">                        
                        <img class="img_btn_perfil"  src="css/menus_index/menu_Apr/img_btn_perfil.png">
                        Mi perfil
                    </button>
                </a>                
            </div>

    <!------------------objeto opciones-------------------------------------------->
    <div class="cont_principal" style="width: 650px;">
        
        <p class="header_titulo"> Menu </p>    
        <hr class="separator">

                <a href="f_permiso.jsp">
                    <div class="options">
                        <img class="img_option" src="css/menus_index/menu_Apr/img_diligenciar_permiso.png" /> 
                        <p class="txt_option">Permisos</p>
                    </div>
                                                                                           
                </a>

                <a href="info_aprendiz.jsp">
                    <div class="options">                        
                        <img class="img_option" src="css/menus_index/menu_Apr/img_perfil_aprendiz.png" />
                       <p class="txt_option">Perfil Aprendiz</p>
                    </div>
                </a>
        </div>
    
    <div class="cont_noti_pro">
        
        <p class="noti_head">Notificaciones <img class="head_img_campana" src="css/notificaciones/campana_normal.png"></p>
        <hr class="separator_noti">
        
        <div class="contenedor_noti">
        
        <div>
        <%                                
            ArrayList<usuarioSG> listdatusu=new ArrayList<>(); 
            consultas con=new consultas();
            listdatusu=con.consultaUsuario();
      
            int idper=(int)rnombre.getAttribute("iden");
        %>

        <%
            ArrayList<permisoSG> listdat=new ArrayList<>(); 
            int u=idper;
            listdat=con.consulta_notificacion(u);
            permisoSG x=new permisoSG();

            for(int i=0; i<listdat.size(); i++){
            x=listdat.get(i);
        %>
       
        <div class="cont_indi_noti_good">        
            <input class="browser-default txt_noti" value="tu permiso esta  <%=x.getPer_estado()%>" type="text">
            <input class="browser-default txt_noti" value="fecha de creacion <%=x.getPer_fecha_Creacion()%>" type="text">
        </div>
    <%
        }
    %>


    </div>  
    
    
    
    <div>
            
        <%
            ArrayList<permiso_historialSG> listdathis=new ArrayList<>(); 
            int uhis = idper;
            listdathis=con.consulta_notificacion_his(uhis);
            //JOptionPane.showMessageDialog(null,"consulta el ID" +uhis);
            permiso_historialSG e=new permiso_historialSG();

            for(int i=0; i<listdathis.size(); i++){
            e=listdathis.get(i);
            
            //JOptionPane.showMessageDialog(null, e.getHis_per_ID());
        %>
        <div class="cont_indi_noti_bad">        
            <input class="browser-default txt_noti" value="tu permiso esta  <%=e.getHis_per_estado()%>" type="text">
            <input class="browser-default txt_noti" value="fecha de creacion <%=e.getHis_per_fechaCreacion()%>" type="text">
        </div>
        <%
            }
        %>

    </div>
     
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
        <div id="footer_style_1">
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