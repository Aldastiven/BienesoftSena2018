<%-- 
    Document   : f_patrocinio
    Created on : 21-sep-2018, 10:23:20
    Author     : equipo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>f_patrocinio</title>
    </head>
    <body>
        <div class="container">
            <h1>formulario patrocinio</h1>
            
            <form action="ServletPatrocinio">
                <input type="text" name="f_nombre" placeholder="nombre de la empresa">  
                <input type="submit" name="btn_guardar" value="Guardar">
            </form>
            
        </div>
    </body>
</html>
