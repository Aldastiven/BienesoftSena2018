<%-- 
    Document   : monitor
    Created on : Sep 23, 2018, 3:30:47 PM
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
        <h1>Hello Monitor!</h1>
        <%
            HttpSession rnombre=request.getSession();
            String nom=(String)rnombre.getAttribute("datico");
        %>
        <label><%=nom%></label>
        
    </body>
</html>
