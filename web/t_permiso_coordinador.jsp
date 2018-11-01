
<%@page import="modelo.consultas"%>
<%@page import="modelo.permisoSG"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <!--Let browser know website is optimized for mobile-->
            <meta name="viewport" content="width=device-width, initial-scale=1.0"/> 
            
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

            <!--importando imagen y texto en pestaña-->
            <link rel="shortcut icon" type="image/x-icon" href="materialize/icons/black/ver_lista.png" />
            <title>BieneSoft | Permiso Coordinador</title>

            <!--estilo body-->
            <link type="text/css" rel="stylesheet" href="css/body.css" media="screen,projection"/>
            
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
                        <a href="t_permiso_coordinador.jsp">
                            <input id="opc_menu_2" type="submit" value="Permisos"/>
                        </a>
                                  
                        <a href="t_aprendiz.jsp">
                            <input id="opc_menu_2" type="submit" value="Aprendices"/>
                        </a>
            
                        <a href="t_ficha.jsp">
                            <input id="opc_menu_2" type="submit" value="Fichas"/>
                        </a>    
            
                        <a href="t_aprendiz_rel_patrocinio.jsp">
                            <input id="opc_menu_2" type="submit" value="Patrocinio"/>
                        </a>
            
                        <a href="t_habitacion.jsp">
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


  <!--*******************************OBJETO TABLA***************************-->
        
 <div class="container l12 m12 s12 hide-on-small-only">
     <h1 id="title_container">PERMISOS</h1>
 
         <div id="table"  class="table" style="margin-top: -10px;">
     
                <table class="table scrolling">
                    
                    <thead id="thead" class="thead">
                    
                            <th id="th_thead">ID</th>
                            <th id="th_thead">TIPO DE PERMISO</th>
                            <th id="th_thead">MOTIVO</th>
                            <th id="th_thead">FECHA DE SALIDA</th>
                            <th id="th_thead">FECHA DE INGRESO</th>
                            <th id="th_thead">ACCIONES</th>
                       
                    </thead>
                               
                    <%
                        ArrayList <permisoSG> listdat = new ArrayList<>();
                        consultas con = new consultas();
                        listdat = con.consultarPermiso();
                        permisoSG x = new permisoSG();

                        for(int i = 0; i< listdat.size(); i++){
                        x = listdat.get(i);
                    %>
          
                    <tr style="padding: 0px;">
        <form action="ServletPermiso" enctype="multipart/form-data" method="post">

                    <td><input class="browser-default" readonly type="number" name="t_numerodocumento" value="<%=x.getPer_Aprendiz_Apr_documento()%>"></td>
                    <td><input class="browser-default" readonly type="text" name="t_tipo" value="<%=x.getPer_tipo()%>"></td>
                    <td><input class="browser-default" readonly type="text" name="t_moti" value="<%=x.getPer_motivo()%>"></td>
                    <td><input class="browser-default" readonly type="date" name="t_fechsal" value="<%=x.getPer_fecha_salida()%>"></td>
                    <td><input class="browser-default" readonly type="date" name="t_fechingre" value="<%=x.getPer_fecha_ingreso()%>"></td>

                     <td>  
                         <div id="ver_modal" class="ver_modal" title="consultar aprendiz">
                             <img src="icon_acciones/ver.png" style="padding-left: 15px" />
                        </div>
                     </td>

            
</tr>

                           <!--MODAL-->

<div class="modal-background" id="modal-background">
    
    <div class="btn-cerrar_modal" id="btn-cerrar_modal">
        <img src="icon_acciones/icon_eliminar.png" />
    </div>
    
    <div class="container">
        
        <div class="  col s12 l12 m12" id="">
            
            <h1 id="title" style="margin-bottom: 5px;">acerca del permiso</h1>
  
        <div class="modal-cont l12 s12 m12" id="modal-cont" >
            
                            <div class="row">
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">ID de permiso</p>                      
                            <input id="input_txt_modal" readonly type="number" name="t_Id" value="<%=x.getPer_ID()%>">
                        </div>
                        
                        <div class="input-field col s12 l6 m6">
                           <p id="input_msg_modal">Tipo de permiso</p>
                           <input id="input_txt_modal" readonly type="text" name="t_tipo" value="<%=x.getPer_tipo()%>">
                       </div>     
                </div>
                
                <div class="row">
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Documento del aprendiz</p>
                            <input id="input_txt_modal" readonly type="number" name="t_numerodocumento" value="<%=x.getPer_Aprendiz_Apr_documento()%>">
                         </div>
                </div>
                       
                <div class="row">
                        <div class="input-field col s12 l6 m6">
                           <p id="input_msg_modal">Fecha de salida</p>
                           <input id="input_txt_modal" readonly type="date" name="t_fechsal" value="<%=x.getPer_fecha_salida()%>">
                       </div>

                         <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Hora de salida</p>
                            <input id="input_txt_modal" readonly type="time" name="t_horasal" value="<%=x.getPer_hora_Salida()%>">
                        </div>
                </div>

                <div class="row">
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Hora de ingreso</p>
                            <input id="input_txt_modal" readonly type="time" name="t_horaingre" value="<%=x.getPer_hora_ingreso()%>">
                        </div>

                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Fecha de ingreso</p>
                            <input id="input_txt_modal" readonly type="date" name="t_fechingre" value="<%=x.getPer_fecha_ingreso()%>">
                        </div>               
                </div>
                
                <div class="row">
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Hora de ingreso real</p>   <!--falta-->
                            <input id="input_txt_modal" readonly type="time" name="t_hreal" value="<%=x.getPer_fecha_ingreso()%>">
                        </div>
                            
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Fecha de ingreso real</p>
                            <input id="input_txt_modal" readonly type="date" name="t_freal" value="<%=x.getPer_fecha_ingresoReal()%>">
                        </div>                      
                </div>

                <div class="row">
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Hora de salida real</p>
                            <input id="input_txt_modal" readonly type="time" name="t_hsreal" value="<%=x.getPer_hora_salidaReal()%>">
                        </div>  
                        
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Fecha de salida real</p>   <!--falta-->
                            <input id="input_txt_modal" readonly type="date" name="t_fsreal" value="<%=x.getPer_hora_Salida()%>">
                        </div>
                </div>
                 
                <div class="row">                 
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Observacion</p>
                            <input id="input_txt_modal" readonly type="text" name="t_obser" value="<%=x.getPer_observacion_permiso_llegada()%>">
                        </div>
                        
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Motivo</p>
                            <input id="input_txt_modal" readonly type="text" name="t_moti" value="<%=x.getPer_motivo()%>">
                        </div>                     
                </div>
                
                <div class="row">                    
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Estado</p>
                            <input id="input_txt_modal" type="text" name="t_estado" value="<%=x.getPer_estado()%>" readonly>
                        </div>
                    
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Autoriza</p>
                            <input id="input_txt_modal" type="text" name="t_autoriza" value="<%=x.getPer_autoriza()%>">
                        </div>
                </div>
                        
                <div class="row">
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Evidencia adjunta</p>
                            <img src="<%=x.getPer_evidenciaAdjunta()%>" width="240" height="280"/>
                            <input id="input_txt_modal" type="text" value="<%=x.getPer_evidenciaAdjunta()%>">
                        </div>
                </div>



        </div>
    </div>

    <!-----**************************FOOTER MODAL*********************----------->
                <div id="div_buttom" class="div_buttom col  s12">

                        <div id="btn_container" class="btn_container row ">                                               
                                    <button type="submit" name="btn_actualizar" id="btn_action_salida" class="btn_action_salida l12  m12 s12">
                                        <p id="txt_buttom" class="txt_buttom">
                                            Salida
                                        </p>   
                                    </button>                                      
                        </div>

                </div>

</div>

                        </form>

            </div>


<!---------------------------------------------------------------------------->
<!---------------------------------------------------------------------------->

                 <%
                   }
                %>                  
               
                </table>  
  </div>

</div>  
                
                <!-----------------------------OBJETO ACORDION------------------------------------------->
<div class="container div_principal hide-on-med-and-up" id="container">
    <h1 id="title">consultas permisos</h1>
            <div id="div_principal" class="">              
                    <%
                            ArrayList <permisoSG> consulta = new ArrayList<>();
                            consulta = con.consultarPermiso();
                            for (int i = 0; i< consulta.size(); i++ ){
                            x= consulta.get(i);
                    %>
                            <div class="divuno" id="divuno">
                                <input class="browser-default" id="txt" type="text"  value=" <%=x.getPer_Aprendiz_Apr_documento()%> " readonly>
                            </div>

                            <div class="divdos" id="divdos">
                                Consultar
                            </div>
                            
                            <div class="modal-background-acordion" id="modal-background">
                                
                                
                                        <div class="btn-cerrar_modal-acordion" id="btn-cerrar_modal-acordion">
                                            <img src="icon_acciones/icon_eliminar.png" />
                                        </div>
                                
                            <div class="container">
                                
                                <h1 id="title" style="margin-bottom: 5px;">acerca del permiso</h1>

                                <div class="  col s12 l12 m12" id="">

                                <div class="modal-cont l12 s12 m12" id="modal-cont" >

                <div class="row">
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">ID de permiso</p>                      
                            <input id="input_txt_modal" readonly type="number" name="t_Id" value="<%=x.getPer_ID()%>">
                        </div>
                        
                        <div class="input-field col s12 l6 m6">
                           <p id="input_msg_modal">Tipo de permiso</p>
                           <input id="input_txt_modal" readonly type="text" name="t_tipo" value="<%=x.getPer_tipo()%>">
                       </div>     
                </div>
                
                <div class="row">
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Documento del aprendiz</p>
                            <input id="input_txt_modal" readonly type="number" name="t_numerodocumento" value="<%=x.getPer_Aprendiz_Apr_documento()%>">
                         </div>
                </div>
                       
                <div class="row">
                        <div class="input-field col s12 l6 m6">
                           <p id="input_msg_modal">Fecha de salida</p>
                           <input id="input_txt_modal" readonly type="date" name="t_fechsal" value="<%=x.getPer_fecha_salida()%>">
                       </div>

                         <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Hora de salida</p>
                            <input id="input_txt_modal" readonly type="time" name="t_horasal" value="<%=x.getPer_hora_Salida()%>">
                        </div>
                </div>

                <div class="row">
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Hora de ingreso</p>
                            <input id="input_txt_modal" readonly type="time" name="t_horaingre" value="<%=x.getPer_hora_ingreso()%>">
                        </div>

                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Fecha de ingreso</p>
                            <input id="input_txt_modal" readonly type="date" name="t_fechingre" value="<%=x.getPer_fecha_ingreso()%>">
                        </div>               
                </div>
                
                <div class="row">
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Hora de ingreso real</p>   <!--falta-->
                            <input id="input_txt_modal" readonly type="time" name="t_hreal" value="<%=x.getPer_fecha_ingreso()%>">
                        </div>
                            
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Fecha de ingreso real</p>
                            <input id="input_txt_modal" readonly type="date" name="t_freal" value="<%=x.getPer_fecha_ingresoReal()%>">
                        </div>                      
                </div>

                <div class="row">
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Hora de salida real</p>
                            <input id="input_txt_modal" readonly type="time" name="t_hsreal" value="<%=x.getPer_hora_salidaReal()%>">
                        </div>  
                        
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Fecha de salida real</p>   <!--falta-->
                            <input id="input_txt_modal" readonly type="date" name="t_fsreal" value="<%=x.getPer_hora_Salida()%>">
                        </div>
                </div>
                 
                <div class="row">                 
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Observacion</p>
                            <input id="input_txt_modal" readonly type="text" name="t_obser" value="<%=x.getPer_observacion_permiso_llegada()%>">
                        </div>
                        
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Motivo</p>
                            <input id="input_txt_modal" readonly type="text" name="t_moti" value="<%=x.getPer_motivo()%>">
                        </div>                     
                </div>
                
                <div class="row">                    
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Estado</p>
                            <input id="input_txt_modal" type="text" name="t_estado" value="<%=x.getPer_estado()%>" readonly>
                        </div>
                    
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Autoriza</p>
                            <input id="input_txt_modal" type="text" name="t_autoriza" value="<%=x.getPer_autoriza()%>">
                        </div>
                </div>
                        
                <div class="row">
                        <div class="input-field col s12 l6 m6">
                            <p id="input_msg_modal">Evidencia adjunta</p>
                            <img src="<%=x.getPer_evidenciaAdjunta()%>" width="240" height="280"/>
                            <input id="input_txt_modal" type="text" value="<%=x.getPer_evidenciaAdjunta()%>">
                        </div>
                </div>



        </div>
    </div>

    <!-----**************************FOOTER MODAL*********************----------->
                <div id="div_buttom" class="div_buttom col  s12">

                        <div id="btn_container" class="btn_container row ">                                               
                                    <button type="submit" name="btn_actualizar" id="btn_action_salida" class="btn_action_salida l12  m12 s12">
                                        <p id="txt_buttom" class="txt_buttom">
                                            Salida
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
                
         
         <!--**************************************************************************************************-->
         
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
