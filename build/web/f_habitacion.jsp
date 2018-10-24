<%-- 
    Document   : f_habitacion
    Created on : Sep 22, 2018, 11:11:03 AM
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
            <h1>Formulario habitacion</h1>
            <form action="ServletHabitacion">
                <input  type="number" name="f_numero" placeholder="numero habitacion">
                <input  type="number" name="f_c_total" placeholder="camas total">
                <input  type="number" name="f_c_disponibles" placeholder="camas disponibles">
                <input  type="text" name="f_g_habitacion" placeholder="genero habitacion">
                <input type="submit" name="btn-guardar" value="Guardar">
            </form>
        </div>
    </body>
</html>
