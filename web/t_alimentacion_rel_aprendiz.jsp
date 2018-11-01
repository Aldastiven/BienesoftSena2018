<%-- 
    Document   : t_aprendiz
    Created on : 22-sep-2018, 21:56:31
    Author     : equipo
--%>

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
            <title>BieneSoft | Aprendiz Coordinador</title>

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
        
<div class="container l12 m12 s12">
     <h1 id="title_container">TABLA APRENDIZ_ALIMENTACION(Coordinador)</h1>
 
         <div id="table"  class="table" style="margin-top: -10px;">
     
                <table class="responsive-table scrolling">
            
            <thead id="thead" class="thead">
                <th id="th_thead">Id</th>
                <th id="th_thead">Tipo</th>
                <th id="th_thead">Documento</th>
                <th id="th_thead">Fecha</th>
                <th id="th_thead">Estado</th>
                <th id="th_thead">Conteo</th>  
                <th id="th_thead">Acciones</th>  
            </thead>
            
            <%
                ArrayList<Alimento_rel_AprendizSG> consulta = new ArrayList<>();
                consultas con=new consultas();
                consulta = con.consultaAlimentacionRelApr();
                Alimento_rel_AprendizSG Alimen = new Alimento_rel_AprendizSG();
                for (int i = 0; i< consulta.size(); i++ ){
                Alimen = consulta.get(i);
            
            %>
            
            
            <tr>
            <form action="ServletAlimento_rel_Aprendiz" method="post">
        <tr>
            <td><input class="browser-default"  name="t_id"      value="<%=Alimen.getApid()%>" type="number"></td>
            <td><input class="browser-default"  name="t_tipo"    value="<%=Alimen.getAptipo()%>" type="number"></td>
            <td><input class="browser-default" name="t_doc"     value="<%=Alimen.getAprdoc()%>" type="number"></td>
            <td><input class="browser-default"  name="t_fecha"   value="<%=Alimen.getApfecha()%>" type="date"></td>
            <td><input class="browser-default" name="t_estado"  value="<%=Alimen.getApestado()%>" type="text"></td>
            <td><input class="browser-default"  name="t_conteo"  value="<%=Alimen.getApconteo()%>" type="number"></td>
            
            <td>
                <input type="submit" name="btn-modificar" value="Actualizar">
                <input type="submit" name="btn-eliminar" value="Eliminar">
            </td>
            
        </tr>
        </form>                        
</div>
<!---------------------------------------------------------------------------->
                 <%
                   }
                %>                  
               
                </table>
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
    
    <!--importando la funcion modal resultado-tabla-->
    <script src="js/modal-tabla/main.js"></script>
  
    <!--importando la funcion de modal-busqueda-->
    <script src="js/modulo-busqueda/main.js"></script>
        
    <!--JavaScript at end of body for optimized loading-->
    <script type="text/javascript" src="materialize/js/materialize.min.js"></script>

    
    </body>
</html>