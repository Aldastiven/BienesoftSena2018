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
        
        <p id="user_text_nombre" class="user_text_nombre"><%=id%></p>
         <p id="user_text_nombre" class="user_text_nombre"><%=nom%></p>
          <p id="user_text_nombre" class="user_text_nombre"><%=ape%></p>
           <p id="user_text_nombre" class="user_text_nombre"><%=cel%></p>
            <p id="user_text_nombre" class="user_text_nombre"><%=mail%></p>
             <p id="user_text_nombre" class="user_text_nombre"><%=pass%></p>
              <img id="img_foto" class="img_foto" src="<%=foto%>" style="width: 80px;"/>
               <p id="user_text_nombre" class="user_text_nombre"><%=rol%></p>
    </body>
</html>
