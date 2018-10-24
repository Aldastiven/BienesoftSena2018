
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
            <title>BieneSoft | Permiso Seguridad</title>

            <!--estilo body-->
            <link type="text/css" rel="stylesheet" href="css/body.css" media="screen,projection"/>
            
            <!--estilo encabezado-->
            <link type="text/css" rel="stylesheet" href="css/encabezado.css"  media="screen,projection"/>

            <!--estilo modulo busqueda-->
            <link type="text/css" rel="stylesheet" href="css/modulo_busqueda.css" media="screen,projection"/>
            
            <!--estilo de la tabla--> 
            <link type="text/css" rel="stylesheet" href="css/tabla.css"  media="screen,projection"/>
            
            
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
                        <lu id="li" title="cerrar cesion"><a href=""><img style="width: 25px; margin-top: 10px;" src="materialize/icons/white/menu.png" /></a></lu>
                        </ul>
                </a>
                
                    <a href="#" data-target="menu-responsive" class="sidenav-trigger"> 
                        <ul  class="right hide-on-med-and-down">
                            <lu id="li" title="cerrar cesion"><a href=""><img style="width: 25px; margin-top: 10px;" src="materialize/icons/white/menu.png" /></a></lu>
                        </ul>
                    </a>
                
                    <a href="#" data-target="menu-responsive" class="sidenav-trigger"> 
                        <ul  class="right hide-on-med-and-down">
                            <lu id="li" title="cerrar cesion"><a href=""><img style="width: 25px; margin-top: 10px;" src="materialize/icons/white/menu.png" /></a></lu>
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

        <!--nav secundario (opciones)--->
        
        <nav id="nav_menu" class="hide-on-med-and-down" >
                        <a href="f agencia.jsp">
                            <input id="opc_menu_2" type="submit" value="Aprendices"/>
                        </a>
                    
                    
                        <a href="f aspirante.jsp">
                            <input id="opc_menu_2" type="submit" value="Alimentacion"/>
                        </a>
            
                        <a href="f agencia.jsp">
                            <input id="opc_menu_2" type="submit" value="Aprendices"/>
                        </a>     
        </nav>
        <!--**************************************************************************************************-->
        
        <!--MODULO INFORMACION USUARIO-->


        <label id="user_text" class="user_text hide-on-med-and-down">Seguridad</label> 
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
         
         <!----------------------------MODAL PRUEBA--------------------->
        
        <div class="modal-prueba-1" id="modal-prueba-1">
                
                <div class="modal-prueba-cont" id="modal-prueba-cont">
                </div>
            
        </div>
        
        
        <!----------------------------------------------------------------------->


 <!--*******************************OBJETO TABLA***************************-->
        
 <div class="container l12 m12 s12">
     <h1 id="title_container">TABLA PERMISOS(seguridad)</h1>
 
         <div id="table"  class="table" style="margin-top: -10px;">
     
                <table class="responsive-table scrolling">
                    
                    <thead id="thead" class="thead">
                        <tr>
                            <th id="th_thead">ID</th>
                            <th id="th_thead">Tipo de permiso</th>
                            <th id="th_thead">Motivo</th>
                            <th id="th_thead">Fecha de salida</th>
                            <th id="th_thead">Fecha de ingreso</th>
                            <th id="th_thead">Acciones</th>
                        </tr>
                    </thead>
                               
                    <%
                        ArrayList <permisoSG> listdat = new ArrayList<>();
                        consultas con = new consultas();
                        listdat = con.consultarPermiso();
                        permisoSG x = new permisoSG();

                        for(int i = 0; i< listdat.size(); i++){
                        x = listdat.get(i);
                    %>
          
        <tr >
                <form action="ServletPermiso" enctype="multipart/form-data" method="post">

                            <td><input class="browser-default" readonly type="number" name="t_numerodocumento" value="<%=x.getPer_Aprendiz_Apr_documento()%>"></td>
                            <td><input class="browser-default" readonly type="text" name="t_tipo" value="<%=x.getPer_tipo()%>"></td>
                            <td><input class="browser-default" readonly type="text" name="t_moti" value="<%=x.getPer_motivo()%>"></td>
                            <td><input class="browser-default" readonly type="date" name="t_fechsal" value="<%=x.getPer_fecha_salida()%>"></td>
                            <td><input class="browser-default" readonly type="date" name="t_fechingre" value="<%=x.getPer_fecha_ingreso()%>"></td>

                             <td>  
                                 <div id="btn-consulta-tabla" class="btn-consulta-tabla" title="consultar aprendiz">
                                     <img src="materialize/icons/white/visibility.png" />
                                </div>
                             </td>

                </form>    
        </tr>   
        
        
        

<!-- Modal Trigger -->
               
    <div id="modal" class="modal">
        
        <div class="container">
            <div id="btn-consulta-cerrar" class="btn-consulta-cerrar" title="cerrar ventana">
                <img src="materialize/icons/accions/cerrar-ventana.png"/>
            </div>
        </div>   
      
    <div class="modal-content">
      
   <form action="ServletAprendiz" enctype="multipart/form-data" method="post">
       
      <!-- <h1 class="col l12 m12 s6" id="header_modal">informacion</h1> -->
        
                <div class=" row" id="">
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">ID</p>
                            <br>
                            <input id="input_txt" readonly type="number" name="t_Id" value="<%=x.getPer_ID()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Documento del aprendiz</p>
                            <br>
                            <input id="input_txt" readonly type="number" name="t_numerodocumento" value="<%=x.getPer_Aprendiz_Apr_documento()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Tipo de permiso</p>
                            <br>
                            <input id="input_txt" readonly type="text" name="t_tipo" value="<%=x.getPer_tipo()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Fecha de salida</p>
                            <br>
                            <input id="input_txt" readonly type="date" name="t_fechsal" value="<%=x.getPer_fecha_salida()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Fecha de ingreso</p>
                            <br>
                            <input id="input_txt" readonly type="date" name="t_fechingre" value="<%=x.getPer_fecha_ingreso()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Hora de salida</p>
                            <br>
                            <input id="input_txt" readonly type="time" name="t_horasal" value="<%=x.getPer_hora_Salida()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Hora de ingreso</p>
                            <br>
                            <input id="input_txt" readonly type="time" name="t_horaingre" value="<%=x.getPer_hora_ingreso()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Fecha de ingreso real</p>
                            <br>
                            <input id="input_txt" readonly type="date" name="t_freal" value="<%=x.getPer_fecha_ingresoReal()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Hora de ingreso real</p>   <!--falta-->
                            <br>
                            <input id="input_txt" readonly type="time" name="t_hreal" value="<%=x.getPer_fecha_ingreso()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Fecha de salida real</p>   <!--falta-->
                            <br>
                            <input id="input_txt" readonly type="date" name="t_fsreal" value="<%=x.getPer_hora_Salida()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Hora de salida real</p>
                            <br>
                            <input id="input_txt" readonly type="time" name="t_hsreal" value="<%=x.getPer_hora_salidaReal()%>">
                    </div>
                    
                     <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Observacion</p>
                            <br>
                            <input id="input_txt" readonly type="text" name="t_obser" value="<%=x.getPer_observacion_permiso_llegada()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Motivo</p>
                            <br>
                            <input id="input_txt" readonly type="text" name="t_moti" value="<%=x.getPer_motivo()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Estado</p>
                            <br>
                            <input id="input_txt" type="text" name="t_estado" value="<%=x.getPer_estado()%>" readonly>
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Autoriza</p>
                            <br>
                            <input id="input_txt" type="text" name="t_autoriza" value="<%=x.getPer_autoriza()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Evidencia adjunta</p>
                            <br>
                            <img src="<%=x.getPer_evidenciaAdjunta()%>" width="60" height="60"/>
                            <input id="input_txt" type="text" value="<%=x.getPer_evidenciaAdjunta()%>">
                    </div>
                    
                    
 
                 </div>
                    
                 <div class="modal-footer" id="modal_footer">
                     
                     <div id="containt-btn-action l12 m12 s6">
                         <button id="btn_action" type="submit" value="Ingresar" name="btn_actualizar">
                             <img src="materialize/icons/accions/update.png" title="Actualizar" style="cursor: pointer; width: 50px; "/>
                        </button>

                       <button id="btn_action" type="submit" value="Ingresar" name="btn_eliminar">
                           <img src="materialize/icons/accions/delete.png" title="Eliminar" style=" cursor: pointer; width: 50px; "/>
                        </button>
                     </div>
                  
                </div>
                           
</form>
 
            </div>  
     </div>      
                 <%
                   }
                %>                  
               
                </table>  
  </div>

</div>                
                
         
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
        
    <!--JavaScript at end of body for optimized loading-->
    <script type="text/javascript" src="materialize/js/materialize.min.js"></script>

    </body>
</html>
