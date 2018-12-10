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
            <a href="mi_perfil_aprendiz.jsp">
                <input id="opc_menu_2" type="submit" value="Inicio"/>
                <img class="icon-h" src="iconos_nav_bar/profile.png"/>
            </a>
            <a href="aprendiz.jsp">
                <input id="opc_menu_2" type="submit" value="Perfil"/>
                <img class="icon-home" src="iconos_nav_bar/home.png"/>
            </a>
        </nav>
        
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
        
        <form action="ServletUsuario" enctype="multipart/form-data" method="post"> 
              <div class="input-field col s12 m6 l6">
                    <p id="input_msg">tu numero de identificacion</p>
                    <br>
                    <input id="input_txt" name="t_doc" value="<%=x.getApr_celular()%>" type="number">
                </div>   

                <div class="input-field col s12 m6 l6">
                    <p id="input_msg">tu nombre</p>
                    <br>
                    <input id="input_txt" name="t_doc" value="<%=x.getApr_nombres()%>" type="text">
                </div>

            </div>
        </form>
                
        <%
            }
        %>                         
        

<div class="container" style="margin-bottom:15px;">
    <div class="contenedor_blanco">
        
        hola
              
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
