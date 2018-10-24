<%-- 
    Document   : f_alimentacion_rel_aprendiz
    Created on : Sep 22, 2018, 6:31:58 PM
    Author     : Stefany
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alimentacion-Aprendiz </title>
    </head>
    <body>
        <div class="container">
            <h1>Alimentacion-relacion-aprendiz</h1>
            <form action="ServletAlimento_rel_Aprendiz">
                <input  type="number" name="f_tipo" placeholder="Tipo">
                <input  type="number" name="f_doc" placeholder="Documento">
                <input  type="date" name="f_fecha" placeholder="Fecha">
                <input  type="text" name="f_estado" placeholder="Estado">
                <input  type="number" name="f_conteo" placeholder="Conteo">
                
                <input type="submit" name="btn-guardar" value="Guardar">
            </form>
        </div>
    </body>
</html>
