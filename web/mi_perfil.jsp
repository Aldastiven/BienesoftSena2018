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
            
        <!--importando--->
            <script src="js/jquery.js"></script>
        
        
    </head>
    <body>
        
        <%
            HttpSession rnombre=request.getSession();
            int id=(int)rnombre.getAttribute("iden");
            String nom=(String)rnombre.getAttribute("datico");
            String ape=(String)rnombre.getAttribute("apellido");
            int cel=(int)rnombre.getAttribute("celular");
            String mail=(String)rnombre.getAttribute("mail");
            String pass=(String)rnombre.getAttribute("clave");
            String foto=(String)rnombre.getAttribute("foto");
            String rol=(String)rnombre.getAttribute("rol");
        %>

     
               <div class="container l12 m12 s12">
                   <div class="div_container" id="div_container">
                       
                       <div class="row l6 m6 s12">  
                           <p class="msg_sss col l3">Numero de documento</p><input id="txt_dato" class="input-field col s12 l6 m12" value="<%=id%>" >
                           <br>
                           <p class="msg_sss col l3">Nombre</p> <input id="txt_dato" class=" input-field col s12 l6 m12" value="<%=nom%>">
                       </div>  
                    
                           
                       <p id="user_text_nombre" class="user_text_nombre">Apellido <%=ape%></p>
                        <p id="user_text_nombre" class="user_text_nombre">Numero telefonico <%=cel%></p>
                         <p id="user_text_nombre" class="user_text_nombre">Correo electronico<%=mail%></p>
                           <p id="user_text_nombre" class="user_text_nombre">contraseña <%=pass%></p>
                            <img id="img_foto" class="img_foto" src="<%=foto%>" style="width: 80px;"/>
                              <p id="user_text_nombre" class="user_text_nombre">Tipo de usuario <%=rol%></p>
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
