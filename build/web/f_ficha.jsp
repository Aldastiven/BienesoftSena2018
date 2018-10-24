<%-- 
    Document   : f_ficha
    Created on : 21-sep-2018, 10:23:13
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>f_ficha</title>
    </head>
    <body>
        <div class="container">
            <h1>formulario ficha</h1>  
            
            <form action="ServletFicha">
                <input type="number" name="f_n_ficha" placeholder="Numero">
                <input type="text" name="f_nombre" placeholder="Nombre programa">
                <input type="text" name="f_jornada" placeholder="Jornada">
                <input type="date" name="f_Fic_inicio_etapa" >
                <input type="date" name="f_Fic_fin_etapa" >
                
                <input  type="submit" name="btn_guardar" >
            </form>
        </div>
    </body>
</html>
