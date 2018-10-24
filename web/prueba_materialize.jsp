<%-- 
    Document   : prueba_materialize
    Created on : 20-oct-2018, 23:07:03
    Author     : equipo
--%>

<%@page import="modelo.usuarioSG"%>
<%@page import="controlador.conexion"%>
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
            <title>Material Desing</title>

            <!--estilo body-->
            <link type="text/css" rel="stylesheet" href="css/body.css" media="screen,projection"/>
            
            <!--estilo encabezado-->
            <link type="text/css" rel="stylesheet" href="css/encabezado.css"  media="screen,projection"/>

            <!--estilo modulo busqueda-->
            <link type="text/css" rel="stylesheet" href="css/modulo_busqueda.css" media="screen,projection"/>
            
            <!--estilo de la tabla--> 
            <link type="text/css" rel="stylesheet" href="css/tabla.css"  media="screen,projection"/>

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
         
         <div id="table"  class="table container l12 s12 m12">
             
                    
                <table class="responsive-table scrolling">
                    
                    <thead id="thead" class="thead">
                        <tr>
                           <th id="th_thead">ID</th>
                            <th id="th_thead">Tipo</th>
                            <th id="th_thead">Nombres</th>
                            <th id="th_thead">Apellidos</th>
                            <th id="th_thead">Acciones</th>
                        </tr>
                    </thead>
                               
                    <%
                        ArrayList<aprendizSG> lisdat = new ArrayList<>();
                        consultas co = new consultas();
                    
                    String ID=request.getParameter("ID");
                    String prof = request.getParameter("prof");
                    String gen = request.getParameter("gen");
                    if(prof!=null & gen!=null) {
                        if(prof.equalsIgnoreCase("Profesión")) {
                        prof = null;
                        }
                        if(gen.equalsIgnoreCase("Género")) {
                            gen = null;
                        }
                    }
                    
                    lisdat = co.consultarTablaAprendiz();
                    aprendizSG x = new aprendizSG();
                    int i;
                    for(i=0; i<lisdat.size(); i++){
                        x = lisdat.get(i);          
                    %>
          
        <tr >
                <form action="ServletAprendiz" enctype="multipart/form-data" method="post">

                            <td><input class="browser-default" type="number" name="ID" value="<%=x.getApr_documento()%>" readonly></td>
                            <td><input class="browser-default" type="text" name="t_TipoDocumento" value="<%=x.getApr_documentoTipo()%>"readonly></td>
                            <td><input class="browser-default" type="text" name="t_Nombres" value="<%=x.getApr_nombres()%>"readonly></td>
                            <td><input class="browser-default" type="text" name="t_Apellidos" value="<%=x.getApr_apellidos()%>"readonly></td>

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
                            <input id="input_txt"  type="number" name="t_NumeroDocumento" value="<%=x.getApr_documento()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Tipo de documento</p>
                            <br>
                            <input id="input_txt"  type="text" name="t_TipoDocumento"  value="<%=x.getApr_documentoTipo()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Nombres</p>
                            <br>
                            <input id="input_txt"  type="text" name="t_Nombres"   value="<%=x.getApr_nombres()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Apellidos</p>
                            <br>
                            <input id="input_txt"  type="text" name="t_Apellidos"   value="<%=x.getApr_apellidos()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Fecha de nacimiento</p>
                            <br>
                            <input id="input_txt"  type="text" name="t_FechaNacimiento"   value="<%=x.getApr_fechaNacimiento()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Edad</p>
                            <br>
                            <input id="input_txt"  type="number" name="t_Edad"  value="<%=x.getApr_edad()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Sexo</p>
                            <br>
                            <input id="input_txt"  type="text" name="t_sexo"  value="<%=x.getApr_sexo()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Celular</p>
                            <br>
                            <input id="input_txt" type="text" name="t_celular"  value="<%=x.getApr_celular()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">EPS</p>
                            <br>
                            <input id="input_txt" type="text" name="t_eps"  value="<%=x.getApr_eps()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">RH</p>
                            <br>
                            <input id="input_txt" type="text" name="t_rh"  value="<%=x.getApr_rh()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Tipo de aprendiz</p>
                            <br>
                            <input id="input_txt" type="text" name="t_TipoAprendiz"  value="<%=x.getApr_tipoAprendiz()%>">
                    </div>
                    
                     <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Nombre del padre</p>
                            <br>
                            <input id="input_txt" type="text" name="t_NombrePadre"  value="<%=x.getApr_nombrePadre()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Celular del padre</p>
                            <br>
                            <input id="input_txt" type="number" name="t_celularPadre"  value="<%=x.getApr_telefonoPadre()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Nombre de la madre</p>
                            <br>
                            <input id="input_txt" type="text" name="t_NombreMadre"  value="<%=x.getApr_nombreMadre()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Celular de la madre</p>
                            <br>
                            <input id="input_txt" type="number" name="t_celularMadre"  value="<%=x.getApr_telefonoMadre()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Departamento</p>
                            <br>
                            <input id="input_txt" type="text" name="t_Departamento"  value="<%=x.getApr_departamento()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Ciudad</p>
                            <br>
                            <input id="input_txt" type="text" name="t_ciudad"  value="<%=x.getApr_ciudad()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Barrio</p>
                            <br>
                            <input id="input_txt"  type="text" name="t_barrio"  value="<%=x.getApr_barrio()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Direccion</p>
                            <br>
                            <input id="input_txt" type="text" name="t_direccion"  value="<%=x.getApr_direccion()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Antecedente medico</p>
                            <br>
                            <input id="input_txt" type="text" name="t_AntecedenteMedico"  value="<%=x.getApr_antecedente_medico()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Correo electronico</p>
                            <br>
                            <input id="input_txt"  type="text" name="t_email"  value="<%=x.getApr_email()%>">
                    </div>

                    
                  <div class="input-field col s12 l12 m12">
                        <img src="<%=x.getApr_hojaDeVida()%>" width="60" height="60"/>
                        <br>
                       <input class="browser-default text_mod" type="text" name="Hoja" value="<%=x.getApr_hojaDeVida()%>">
                        <br>
                        <input  type="file" name="HojaDeVida" accept="imagen/*">
                </div>
                        
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Acta de compromiso</p>
                            <br>
                            <input id="input_txt"  type="text" name="t_Acta"  value="<%=x.getApr_actaCompromiso()%>">
                    </div>   
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Llamados de atencion</p>
                            <br>
                            <input id="input_txt"  type="number" name="t_llamadosAtencion"  value="<%=x.getApr_llamadosDeAtencion()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Numero de habitacion</p>
                            <br>
                            <input id="input_txt"  type="number" name="t_numeroHabitacion"  value="<%=x.getApr_numero_habitacion()%>">
                    </div>
                    
                    <div class="input-field col s12 l6 m6">
                            <p id="input_msg">Numero de ficha</p>
                            <br>
                            <input id="input_txt"  type="number" name="t_numeroFicha"  value="<%=x.getApr_ficha_fic_numero()%>">
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
         
         <!--**************************************************************************************************-->
                

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
