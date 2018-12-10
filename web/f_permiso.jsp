
<%@page import="modelo.permisoSG"%>
<%@page import="modulo_permisos.tipopermiso"%>
<%@page import="modelo.aprendizSG"%>
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
            <title>BieneSoft | Permiso</title>

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
            
            <!--estilo de la botones--> 
            <link type="text/css" rel="stylesheet" href="css/buttons.css"  media="screen,projection"/>
            
            <!--estilo de la registro--> 
            <link type="text/css" rel="stylesheet" href="css/formulario.css"  media="screen,projection"/>
            
            <!--estilo footer-->
            <link type="text/css" rel="stylesheet" href="css/footer.css"  media="screen,projection"/>
            
            <!--estilo watch(Reloj)-->
            <link type="text/css" rel="stylesheet" href="css/timePicker.css"  media="screen,projection"/>

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
            <a href="aprendiz.jsp">
                <input id="opc_menu_2" type="submit" value="Inicio"/>
                <img class="icon-a" src="iconos_nav_bar/profile.png"/>
            </a>
            <a href="mi_perfil_aprendiz.jsp">
                <input id="opc_menu_2" type="submit" value="Perfil"/>
                <img class="icon-b" src="iconos_nav_bar/home.png"/>
            </a>
        </nav>
        <!--**************************************************************************************************-->

<!--**************************************************************************************************-->
        
        <!--MODULO INFORMACION USUARIO-->


        <label id="user_text" class="user_text hide-on-med-and-down">Aprendiz</label> 
            <%
                HttpSession rnombre=request.getSession();
                String nom=(String)rnombre.getAttribute("nombre");
                int id=(int)rnombre.getAttribute("iden");
             %>
        <p id="user_text" class="user_text hide-on-med-and-down"><%=nom%></p>


 <!--*********************************************************-->    
        
    <!----------------------FORMULARIO--------------------------->
        
        <div class="container" style="margin-bottom:15px;">
            
        <div class="header_conte">
            <figcaption class="vicon">
                <img src="css_index_user/icons/coordinador/vpermiso.png" height="75px"/> 
            </figcaption>
            <div class="prueba">
                <h1 class="titulonly">REGISTRO PERMISO</h1>
            </div>
        </div>
            

    <form action="ServletPermiso" id="frm" enctype="multipart/form-data" method="post" > 
    
        <input id="today" type="date" name="f_fechCreacion" style="display:none">
    
    <div class="row" id="container_form_large">
        <div class="input-field col s12 m6 l6">
            <p id="input_msg">Documento del aprendiz</p>
            <br>
            <input id="" type="hidden" name="f_estado" placeholder="" value="Pendiente" readonly>
            <input id="input_txt" type="number" name="f_numerodocumento" placeholder="documento del aprendiz" value="<%=id%>" readonly>
        </div>   

             <div class="row">
                 <div class="input-field col s12 l6 m6">
                     <select name="tipoper" class="browser-default" id="cambiar">
                         <option >elige el tipo de permiso</option>
                         <option value="semana morning">semana mañana</option>
                         <option value="semana tarde">semana tarde</option>
                         <option value="fin de semana">fin de semana</option>
                         <option value="Extra">Extra</option>
                      </select>
                     <!--Mostra/Desaparecer input del tipo permiso con fecha ingreso-->
                     
                     
                 </div>
             </div>


         <div class="input-field col s12 l6 m6">
            <p id="input_msg">Fecha de salida</p>
            <br>
            <input id="today2" type="date" name="f_fechsal">
            <script>
                let today = new Date().toISOString().substr(0, 10);
                    //document.querySelector("#today").value = today;

                    document.querySelector("#today2").valueAsDate = new Date();
                    document.querySelector("#today").valueAsDate = new Date();
            </script> 
        </div>

        <div class="input-field col s12 l6 m6" id="fecha_ing">
            <p id="input_msg">Fecha de ingreso</p>
            <br>
            <input id="input_txt"  type="date" name="f_fechingre" placeholder="Fecha">
            <br> 
        </div>

        <div class="input-field col s12 l6 m6">
            <p id="input_msg">Hora de salida</p>
            <br>
            <input id="input_txt" type="time" name="f_horasal" class="time-picker form-control" name="3" placeholder="Hora salida" value="08:00">
        </div>

        <div class="input-field col s12 l6 m6">
            <p id="input_msg">Hora de ingreso</p>
            <br>
            <input id="input_txt" type="time" name="f_horaingre" class="time-picker form-control" name="3" placeholder="Hora ingreso" value="11:00">
        </div>

        <div class="input-field col s12 l6 m6">
            <p id="input_msg">Motivo</p>
            <br>
            <input id="input_txt" type="text" name="f_moti" placeholder="Motivo">
        </div>

        <div class="input-field col s12 l6 m6">
            <p id="input_msg">Evidencia</p>
            <br>
            <input type="file" name="f_evidenciaAdjunta" accept="imagen/*">
        </div>
   </div>
                               
                               
<!----------------------------***********ESTILOS DE LOS BOTONES EN (buttons.css)*******************************---------------------------------------------------------->

    <div id="div_buttom" class="div_buttom col  s12">

            <div id="btn_container" class="btn_container row ">   
                
               
                
                 <button type="submit" name="btn-guardar" id="btn_desa" class="btn_action_guardar l12  m12 s12">
                     <p id="txt_buttom" class="txt_buttom">
                         Enviar
                         <img id="img_buttom" class="img_buttom" src="icon_acciones/enviar.png" />
                     </p>   
                 </button>  
                
                <script>
                        var d = new Date();
                        var n = d.getDay();
                        alert(n);
                        if(n===1 || n===3){//se consulta el dia de la semana SOLO lunes y miercoles
                                var btn=document.getElementById("btn_desa").disabled = false; 
                            
        
                            //HABILITAR Y DESABILITAR LA FECHA DE INGRESO PARA FIN DE SEMANA Y FIN DE SEMANA
                            $('#cambiar').change(function(){
                            var valorCambiado =$(this).val();
                            
                                if((valorCambiado === 'semana tarde')||(valorCambiado === 'semana morning') ||(valorCambiado === 'Extra')){
                                    $('#fecha_ing').css('display','none');         
                                }else{
                                    $('#fecha_ing').css('display','block');               
                                }
                            });
                            
                                
                                
                                
                        }else{
                            
                                                    
                            var btn=document.getElementById("btn_desa").disabled = true; 
                            alert("tienes permitido realizar permisos los dias lunes y miercoles");
                            
                            
                            //FUNCION DE EXTRA
                            $('#cambiar').change(function(){
                            var valorCambiado =$(this).val();
                            
                                if((valorCambiado=='Extra')){
                                    var btn=document.getElementById("btn_desa").disabled = false;
                                    alert("entra a permiso extra");
                                }
                                else{
                                    var btn=document.getElementById("btn_desa").disabled = true;
                                }
                            });
                            
                            
                        }

                </script>
                
                <script>
                        $('#cambiar').change(function(){
                            var valorCambiado =$(this).val();
                            
                            
                             
                        });
                 </script>
                <a>
                    <button type="submit" name="btn-cancel" id="btn_action_eliminar" class="btn_action_eliminar l12  m12 s12">
                        <p id="txt_buttom" class="txt_buttom">
                            Cancelar
                            <img id="img_buttom" class="img_buttom" src="icon_acciones/cancelar.png" />
                        </p>   
                    </button> 
                </a>

            </div>

      </div> 
<!----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------->
    </form>
            </div>

                    
               </div>   
        <!--------------------------------------------------------------------------------------------------->
        
        
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        
        
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
            <!--JS plugin Reloj-->
            <script type="text/javascript" src="js/watch/jquery-timepicker.js"></script>
            <!--Tipo permiso select (permiso)-->
            <script type="text/javascript" src="js/watch/jquery-timepicker.js"></script>
            
            
    </body>
</html>
