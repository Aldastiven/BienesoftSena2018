<%-- 
    Document   : mi_perfil
    Created on : 01-nov-2018, 4:44:11
    Author     : equipo
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <!--estilo body-->
            <link type="text/css" rel="stylesheet" href="css/body.css" media="screen,projection"/>
            
         <!--estilo perfil-->
         <link type="text/css" rel="stylesheet" href="css/perfil/perfil.css" media="screen,projection"/>
            
        <!--estilo materialize.css-->
            <link type="text/css" rel="stylesheet" href="materialize/css/materialize.min.css"  media="screen,projection"/>    
            
          <!--estilo de la registro--> 
          <link type="text/css" rel="stylesheet" href="css/perfil/perfil.css"  media="screen,projection"/>
               
            
        <!--importando--->
            <script src="js/jquery.js"></script>
        
        
    </head>
    <body>
        
 
        
        <%
            HttpSession rnombre=request.getSession();
            int id=(int)rnombre.getAttribute("iden");
            String nom=(String)rnombre.getAttribute("nombre");
            String ape=(String)rnombre.getAttribute("apellido");
            int cel=(int)rnombre.getAttribute("celular");
            String mail=(String)rnombre.getAttribute("mail");
            String pass=(String)rnombre.getAttribute("clave");
            String foto=(String)rnombre.getAttribute("foto");
            String rol=(String)rnombre.getAttribute("rol");
        %>



<h1 id="title_container">Mi perfil</h1>
           
           <div class="container" style="margin-bottom:15px;">
                        <div class="contenedor_blanco">
                                            <form action="ServletPermiso" enctype="multipart/form-data" method="post"> 
                                                        <div class="row" id="container_form_large">
                                                                    <div class="encab" id="encab" style="alignment-adjust: central;">
                                                                        <img id="img_fotoperfil" class="img_fotoperfil" src="<%=foto%>"/>
                                                                    </div>
                                                                    
                                                                    <div class="linea" id="linea">
                                                                        <br>
                                                                    </div>
                                                                    

                                                                    <div class="input-field col s12 m6 l6">
                                                                        <p id="input_msg">tu numero de identificacion</p>
                                                                        <br>
                                                                        <input id="input_txt" type="number" name="" placeholder="" value="<%=id%>" readonly>
                                                                    </div>   

                                                                     <div class="input-field col s12 l6 m6">
                                                                        <p id="input_msg">Nombres</p>
                                                                        <br>
                                                                        <input id="input_txt" type="text" name="" placeholder="" value="<%=nom%>">
                                                                    </div>

                                                                     <div class="input-field col s12 l6 m6">
                                                                        <p id="input_msg">Apellidos</p>
                                                                        <br>
                                                                        <input id="input_txt" type="text" name="" placeholder="" value="<%=ape%>">
                                                                    </div>

                                                                    <div class="input-field col s12 m6 l6">
                                                                        <p id="input_msg">numero telefonico</p>
                                                                        <br>
                                                                        <input id="input_txt" type="number" name="" placeholder="" value="<%=cel%>" readonly>
                                                                    </div>

                                                                    <div class="input-field col s12 l6 m6">
                                                                        <p id="input_msg">Correo electronico</p>
                                                                        <br>
                                                                        <input id="input_txt" type="text" name="" class="" name="" placeholder="" value="<%=mail%>">
                                                                    </div>

                                                                    <div class="input-field col s12 l6 m6">
                                                                        <p id="input_msg">Contraseña</p>
                                                                        <br>
                                                                        <input id="input_txt" type="text" name="" placeholder="" value="<%=pass%>">
                                                                    </div>

                                                                    <div class="input-field col s12 l6 m6">
                                                                        <p id="input_msg">Tipo de usuario</p>
                                                                        <br>
                                                                        <input id="input_txt" type="text" name="" placeholder="" value="<%=rol%>">
                                                                    </div>
                                                                    
                                                                    <div class="col s12 l6 m6" >
                                                                        <img src="icon_acciones/icons8-lápiz-64.png">
                                                                    </div>
                                                       </div>
                                           </form>
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
