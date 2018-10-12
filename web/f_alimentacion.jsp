<%-- 
    Document   : f_alimentacion
    Created on : Sep 22, 2018, 11:37:53 AM
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
        <div class="container">
            <h1>Formulario alimentacion</h1>
            <form action="ServletAlimentacion">
                <input  type="number" name="f_tipo" placeholder="tipo">
                <input  type="text"   name="f_descp" placeholder="Descripcion">
                <input  type="submit" name="btn-guardar" value="Guardar">
            </form>
        </div>
    </body>
</html>
