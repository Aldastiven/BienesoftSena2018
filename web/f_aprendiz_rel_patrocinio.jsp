<%-- 
    Document   : f_aprendiz_rel_patrocinio
    Created on : 23-sep-2018, 9:08:35
    Author     : equipo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>f_aprendiz_rel_patrocinio</title>
    </head>
    <body>
        <div>
            <form action="ServletAprendiz_rel_Patrocinio">
                <input type="number" name="f_patrocinio_pat_id" placeholder="ID patrocinio">
                <input type="number" name="f_aprendiz_apr_documento" placeholder="Documento aprendiz">
                <input type="number" name="f_numeroContrato" placeholder="numero de contrato">
                <input type="text" name="f_estado" placeholder="estado">
                <input type="date" name="f_fechaContrato" placeholder="fecha de contrato">
                
                <input type="submit" name="btn_guardar" value="Guardar">

            </form>
        </div>
    </body>
</html>
