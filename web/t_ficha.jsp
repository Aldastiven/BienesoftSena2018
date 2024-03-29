<%-- 
    Document   : t_aprendiz
    Created on : 22-sep-2018, 21:56:31
    Author     : equipo
--%>

<%@page import="modelo.fichaSG"%>
<%@page import="modelo.Alimento_rel_AprendizSG"%>
<%@page import="modelo.consultas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.aprendizSG"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <!--Let browser know website is optimized for mobile-->
            <meta name="viewport" content="width=device-width, initial-scale=1.0"/> 
            
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

            <!--importando imagen y texto en pestaña-->
            <link rel="shortcut icon" type="image/x-icon" href="materialize/icons/black/ver_lista.png" />
            <title>BieneSoft | Ficha Coordinador</title>

            <!--estilo body-->
            <link type="text/css" rel="stylesheet" href="css/body.css" media="screen,projection"/>
            
            <!--iconos--> 
            <link type="text/css" rel="stylesheet" href="css/styleicons.css"/>
            
            <!--estilo encabezado-->
            <link type="text/css" rel="stylesheet" href="css/encabezado.css"  media="screen,projection"/>

            <!--estilo modulo busqueda-->
            <link type="text/css" rel="stylesheet" href="css/modulo_busqueda.css" media="screen,projection"/>
            
            <!--estilo de la tabla--> 
            <link type="text/css" rel="stylesheet" href="css/tabla.css"  media="screen,projection"/>
            
            <!--estilo de la acordion--> 
            <link type="text/css" rel="stylesheet" href="css/acordion_busqueda.css"  media="screen,projection"/>
                       
            <!--estilo modal-->
            <link type="text/css" rel="stylesheet" href="css/modal.css" media="screen,projection"/>
            
            <!--estilo de la botones--> 
            <link type="text/css" rel="stylesheet" href="css/buttons.css"  media="screen,projection"/>
            
            <!--estilo de la registro--> 
            <link type="text/css" rel="stylesheet" href="css/formulario.css"  media="screen,projection"/>
            
            <!--estilo footer-->
            <link type="text/css" rel="stylesheet" href="css/footer.css"  media="screen,projection"/>

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

                
                <a href="#" data-target="menu-responsive" class="sidenav-trigger"> 
                    <i>
                        <img style="width: 25px; margin-top: 10px;" src="materialize/icons/white/menu.png" />
                    </i>
                    
                        <ul class="right hide-on-med-and-down">
                        <lu id="li" title="cerrar cesion"><a href=""><img style="width: 25px; margin-top: 10px;" src="" /></a></lu>
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
                    
            <li><a href="t_permiso_coordinador.jsp"> Permisos</a></li>

            <li><a href="t_aprendiz"> Aprendices</a></li>

            <li><a href="t_ficha.jsp">Fichas</a></li>
            
            <li><a href="t_aprendiz_rel_patrocinio.jsp">Patrocinios</a></li> 
            
            <li><a href="t_habitacion.jsp">Habitaciones</a></li>         
        </ul>
        
        <!--------------------------------------------------->

        <!--nav secundario (opciones)--->
        
        <nav id="nav_menu" class="hide-on-med-and-down" >
            <a href="coordinador.jsp">
                <img class="icon-a" src="iconos_nav_bar/home.png"/>
                <input id="opc_menu_2" type="submit" value="Inicio"/>
            </a>
            <a href="t_permiso_coordinador.jsp">
                <!--<span class="icon-office"></span>-->
                <img class="icon-b" src="iconos_nav_bar/permisos.png"/>
                <input id="opc_menu_2" type="submit" value="Permisos"/>
            </a>

            <a href="t_aprendiz.jsp">
                <img class="icon-c" src="iconos_nav_bar/aprendiz.png"/>
                <input id="opc_menu_2" type="submit" value="Aprendices"/>
            </a>

            <a href="t_ficha.jsp">
                <img class="icon-d" src="iconos_nav_bar/fichas.png"/>
                <input id="opc_menu_2" type="submit" value="Fichas"/>
            </a>    

            <a href="t_aprendiz_rel_patrocinio.jsp">
                <img class="icon-e" src="iconos_nav_bar/patrocinio.png"/>
                <input id="opc_menu_2" type="submit" value="Patrocinio"/>
            </a>

            <a href="t_habitacion.jsp">
                <img class="icon-f" src="iconos_nav_bar/habitaciones.png"/>
                <input id="opc_menu_2" type="submit" value="Habitaciones"/>
            </a>
        </nav>
        
        <!--**************************************************************************************************-->
        
        <!--MODULO INFORMACION USUARIO-->


        <label id="user_text" class="user_text hide-on-med-and-down">Coordinador</label> 
            <%
                HttpSession rnombre=request.getSession();
                String nom=(String)rnombre.getAttribute("datico");
             %>
        <p id="user_text" class="user_text hide-on-med-and-down"><%=nom%></p>


          <!--*********************************************************-->
        
        
        <!--*******************************OBJETO  MODULO CONSULTAS***************************-->
        
        <div class="container hide-on-small-only">
            <div id="search-container" >
                
                
            </div>
        </div>
        
        <div id="btn-search-principal" class="btn-search-principal hide-on-med-and-up">
            <img src="materialize/icons/white/search.png" />
        </div>
        
        <div id="btn-search-close" class="btn-search-close hide-on-med-and-up">
            <img src="materialize/icons/white/close.png" />
        </div>
        
        <div id="modal-container" class="modal-container container hide-on-med-and-up">
            <div id="search-container-modal" class="col s12">
            </div>
        </div>
            
         
        
        
         <!--**************************************************************************************************-->

    <!----********************OBJETO TABLA****************---->
        
<div class="container l12 m12 s12 hide-on-small-only">
    <div class="header_conte">
        <figcaption class="vicon">
            <img src="css_index_user/icons/coordinador/vficha.png" height="75px"/> 
        </figcaption>
        <div class="prueba">
            <h1 class="titulonly">TABLA FICHA(Coordinador)</h1>
        </div>
    </div>
 
         <div id="table"  class="table" style="margin-top: -10px;">
     
                <table class=" scrolling">
            
            <thead id="thead" class="thead">
                <th id="th_thead">Numero</th>
                <th id="th_thead">Nombre Programa</th>
                <th id="th_thead">Jornada</th>
                <th id="th_thead">Inicio de etapa</th>
                <th id="th_thead">Fin de etapa</th>   
                <th id="th_thead">Acciones</th>  
            </thead>
            
            <%
                
                
                ArrayList<fichaSG> listdat=new ArrayList<>(); 
                consultas con=new consultas();
                listdat=con.consultaFicha();
                fichaSG igs=new fichaSG();
                
                for(int i=0; i<listdat.size(); i++){
                    igs=listdat.get(i);

            %> 
            
            
            <tr>
            <form action="ServletFicha" method="post">

                <td><input  class="browser-default" type="number" name="t_n_ficha" value="<%=igs.getFic_numero()%>"></td>
                <td><input  class="browser-default" type="text" name="t_nombre" value="<%=igs.getFic_nombrePrograma()%>"></td>
                <td><input  class="browser-default" type="text" name="t_jornada" value="<%=igs.getFic_jornada()%>"></td>
                <td><input  class="browser-default" type="text" name="Fic_inicio_etapa" value="<%=igs.getFic_inicio_etapa()%>"></td>
                <td><input  class="browser-default" type="text" name="Fic_fin_etapa" value="<%=igs.getFic_fin_etapa()%>"></td>
                
                <td>
                    <!--<input type="submit" name="btn_actualizar" value="Actualizar">
                    <input type="submit" name="btn_eliminar" value="Eliminar">-->
                    
                    <button id="btn_tabla" class="btn_tabla" name="btn_actualizar" style="width: 20px; background: transparent; border:none;">
                        <img src="icon_acciones/icon_actualizar.png" title="Actualizar tabla" style="width: 30px; height: 30px;   cursor: pointer "/>
                    </button>
                    
                    <button id="btn_tabla" class="btn_tabla" name="btn_eliminar" style="width: 20px; background: transparent; border:none;">
                        <img src="icon_acciones/icon_eliminar.png" title="Eliminar tabla" style="width: 30px; height: 30px;   cursor: pointer; margin-left:5px; "/>
                    </button>
                    
                </td>

        </form>                        
</div>
<!---------------------------------------------------------------------------->
                 <%
                   }
                %>                  
               
                </table>
         </div>

</div> 

<!-----------------------------OBJETO ACORDION------------------------------------------->
<div class="container div_principal hide-on-med-and-up" id="container">
    <h1 id="title">consultas ficha</h1>
            <div id="div_principal" class="">              
                    <%
                            ArrayList<fichaSG> consulta = new ArrayList<>();
                            consulta = con.consultaFicha();
                            for (int i = 0; i< consulta.size(); i++ ){
                            igs= consulta.get(i);
                    %>
                            <div class="divuno" id="divuno">
                                <input class="browser-default" id="txt" type="text"  value="<%=igs.getFic_nombrePrograma()%> " readonly>
                            </div>

                            <div class="divdos" id="divdos">
                                Consultar
                            </div>
                            
                            <div class="modal-background-acordion" id="modal-background-acordion">
                            <div class="container">

                                <div class="  col s12 l12 m12" id="">

                                <div class="modal-cont l12 s12 m12" id="modal-cont" >


                                        <div class="btn-cerrar_modal-acordion" id="btn-cerrar_modal-acordion">
                                            <img src="icon_acciones/cerrar-ventana.png" />
                                        </div>

                                        <div class="row">
                                                <div class="input-field col s12 l6 m6">
                                                    <p id="input_msg_modal">numero de ficha</p>
                                                    <br>
                                                    <input id="input_txt_modal" type="number" name="t_n_ficha" value="<%=igs.getFic_numero()%>">
                                                </div>

                                                <div class="input-field col s12 l6 m6">
                                                    <p id="input_msg_modal">Nombre del programa</p>
                                                    <br>
                                                    <input id="input_txt_modal" type="text" name="t_nombre" value="<%=igs.getFic_nombrePrograma()%>">
                                                 </div>
                                        </div>

                                        <div class="row">
                                                <div class="input-field col s12 l6 m6">
                                                   <p id="input_msg_modal">Jornada</p>
                                                   <br>
                                                   <input id="input_txt_modal" type="text" name="t_jornada" value="<%=igs.getFic_jornada()%>">
                                               </div>

                                                <div class="input-field col s12 l6 m6">
                                                   <p id="input_msg_modal">Inicio de la etapa</p>
                                                   <br>
                                                   <input id="input_txt_modal" type="text" name="Fic_inicio_etapa" value="<%=igs.getFic_inicio_etapa()%>">
                                               </div>
                                        </div>

                                        <div class="row">
                                                <div class="input-field col s12 l6 m6">
                                                    <p id="input_msg_modal">Fin de la etapa</p>
                                                    <br>
                                                    <input id="input_txt_modal"  type="text" name="Fic_fin_etapa" value="<%=igs.getFic_fin_etapa()%>">
                                                </div>                                            
                                        </div>

                                </div>
                            </div>

                               <!-----**************************FOOTER MODAL*********************----------->
                                            <div id="div_buttom" class="div_buttom col  s12">

                                                    <div id="btn_container" class="btn_container row ">                                               
                                                                <button type="submit" name="btn_actualizar" id="btn_action_guardar" class="btn_action_guardar l12  m12 s12">
                                                                    <p id="txt_buttom" class="txt_buttom">
                                                                        Actualizar
                                                                    </p>   
                                                                </button>  

                                                                    <button type="submit" name="btn_eliminar" id="btn_action_eliminar" class="btn_action_eliminar l12  m12 s12">
                                                                    <p id="txt_buttom" class="txt_buttom">
                                                                        Eliminar
                                                                    </p>   
                                                                </button>                                     
                                                    </div>

                                                </div>

                            </div>

                                                  </form>

                        </div>
                    <%
                        }
                    %>               
            </div> 
</div>
<!--------------------------------------------------------------------------------------------------->
    


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
    
    <!--importando la funcion modal resultado-tabla-->
    <script src="js/modal-tabla/main.js"></script>
  
    <!--importando la funcion de modal-busqueda-->
    <script src="js/modulo-busqueda/main.js"></script>
    
    <!--importando la funcion de modal-acordion-->
    <script src="js/tabla-acordion/main.js"
        
    <!--JavaScript at end of body for optimized loading-->
    <script type="text/javascript" src="materialize/js/materialize.min.js"></script>

    
    </body>
</html>