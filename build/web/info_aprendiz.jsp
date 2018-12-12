<%-- 
    Consulta Informacion aprendiz
--%>

<%@page import="modelo.usuarioSG"%>
<%@page import="modelo.consultas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.aprendizSG"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

        <!--estilo footer-->
        <link type="text/css" rel="stylesheet" href="css_index_user/footer.css"  media="screen,projection"/>

        <!--estilo menu tajetas-->
        <link type="text/css" rel="stylesheet" href="css_index_user/cards-prueba.css"  media="screen,projection"/>
        
        <link type="text/css" rel="stylesheet" href="css/section.css"  media="screen,projection"/>
        
        <!--estilo perfil-->
        <link type="text/css" rel="stylesheet" href="css/perfil/perfil.css" media="screen,projection"/>
        
        <link type="text/css" rel="stylesheet" href="css/Style_formulario.css"  media="screen,projection"/>

        <!--importando--->
        <script src="js/jquery.js"></script>
        
        
        
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lobster">
      <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
      
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
        
        <nav id="nav_menu" class="hide-on-med-and-down" style="display:none;" >
            <div class="options_nav">
                    <a href="aprendiz.jsp">                
                            <input id="op_menu" type="submit" value="Inicio"/>                            
                    </a>
                    <a href="mi_perfil_aprendiz.jsp">                     
                            <input id="op_menu" type="submit" value="Perfil"/>                             
                    </a>
            </div>
        </nav>
        <!--**************************************************************************************************-->
        
        <%                                
            ArrayList<usuarioSG> listdatusu=new ArrayList<>(); 
            consultas con=new consultas();
            listdatusu=con.consultaUsuario();
            usuarioSG igs=new usuarioSG();
            
            HttpSession rnombre=request.getSession();
            int id=(int)rnombre.getAttribute("iden");
        %>

        <%
            ArrayList<aprendizSG> listdat=new ArrayList<>(); 
            int doc=id;
            listdat=con.consultarAprendizID(doc);
            aprendizSG x=new aprendizSG();

            for(int i=0; i<listdat.size(); i++){
            x=listdat.get(i);
        %>
             
   <section class="section">
            
                <h1 id="title_container"></h1>

                <div class="contenedor_form" style="margin-top: -90px;">

                            <form action="ServletUsuario" enctype="multipart/form-data" method="post"> 
                                <div class="row" class="containedor_form">
                                        <div class="encabezado_form">
                                            <div class="center_encab_tit">
                                                <p class="txt_titulo_form">Mi perfil de aprendiz</p> 
                                                <img class="img_tittulo_form" src="css/acciones/aprendiz.png">
                                            </div>                                            
                                        </div>
                                    
                                    <div  class="div_dat_per1"> 
                                        <div class="center_cam">
                                            <p class="txt_con_apr1">Datos personales</p>
                                            <img class="img_conocer_apr1" src="css/acciones/img_datos_usuario.png">
                                        </div>
                                    </div>
                                    
                                        <div class=" cont_info_perfil div_dat_per2">
                                            <p class="txt_tit_info">ID</p>                   <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_documento()%>" readonly>
                                            <p class="txt_tit_info">Tipo de documento</p>              <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_documentoTipo()%>" readonly>
                                            <p class="txt_tit_info">Nombres</p>            <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_nombres()%>" readonly>
                                            <p class="txt_tit_info">Apellidos</p>   <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_apellidos()%>" readonly>
                                            <p class="txt_tit_info">Fecha de nacimiento</p>               <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_fechaNacimiento()%>" readonly>
                                            <p class="txt_tit_info">Edad</p>           <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_edad()%>" readonly>
                                            <p class="txt_tit_info">Sexo</p>           <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_sexo()%>" readonly>
                                            <p class="txt_tit_info">Telefono de contacto</p>           <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_celular()%>" readonly>
                                            <p class="txt_tit_info">EPS</p>           <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_eps()%>" readonly>
                                            <p class="txt_tit_info">RH</p>           <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_rh()%>" readonly>
                                        </div>
                                        
                                        
                                        
                                        
                                    <div  class="div_dat_per3"> 
                                        <div class="center_cam">
                                            <p class="txt_con_apr2">Datos familiares</p>
                                            <img class="img_conocer_apr2" src="css/acciones/img_datos_familiares.png">
                                        </div>
                                    </div>
                                    
                                        <div class=" cont_info_perfil div_dat_per4">
                                            <p class="txt_tit_info">Nombre del padre</p>                   <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_nombrePadre()%>" readonly>
                                            <p class="txt_tit_info">Telefono de contacto</p>              <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_telefonoPadre()%>" readonly>
                                            <p class="txt_tit_info">Nombre de la Madre</p>            <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_nombreMadre()%>" readonly>
                                            <p class="txt_tit_info">Telefono de contacto</p>   <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_telefonoMadre()%>" readonly>
                                            <p class="txt_tit_info">Departamento</p>               <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_departamento()%>" readonly>
                                            <p class="txt_tit_info">Ciudad</p>           <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_ciudad()%>" readonly>                                            
                                            <p class="txt_tit_info">Barrio o vereda</p>           <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_barrio()%>" readonly>
                                            <p class="txt_tit_info">Direccion</p>           <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_direccion()%>" readonly>                                            
                                        </div>
                                        
                                        
                                    <div  class="div_dat_per5"> 
                                        <div class="center_cam">
                                            <p class="txt_con_apr3">Datos del programa</p>
                                            <img class="img_conocer_apr3" src="css/acciones/datos_programa.png">
                                        </div>
                                    </div>
                                    
                                        <div class=" cont_info_perfil div_dat_per6">
                                            <p class="txt_tit_info">Acta de compromiso</p>                   <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_actaCompromiso()%>" readonly>
                                            <p class="txt_tit_info">Llamados de atencion</p>              <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_llamadosDeAtencion()%>" readonly>
                                            <p class="txt_tit_info">Numero de habitacion</p>            <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_numero_habitacion()%>" readonly>
                                            <p class="txt_tit_info">Numero de ficha</p>   <input type="text" class=" info_perfil_only browser-default" value="<%=x.getApr_ficha_fic_numero()%>" readonly>                                           
                                        </div>
                                </div>
                            </form>
                        </div>   
                                
        </section> 
                
        <%
            }
        %>                         
            
        
       
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
            
            <script type="text/javascript" src="js/Acordion/conocer_mas_info_apr.js"></script>
    </body>
</html>
