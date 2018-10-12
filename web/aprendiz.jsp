<%-- 
    Document   : aprendiz
    Created on : Sep 23, 2018, 3:21:24 PM
    Author     : Stefany
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola Aprendiz!</h1>
        <%
            HttpSession usuname=request.getSession();
            String nombre=(String)usuname.getAttribute("datico");
        %>
        <label><%=nombre%></label>
        
        
    </body>
</html>
