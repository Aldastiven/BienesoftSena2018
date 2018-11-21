<%-- 
    Document   : t_historialPermisos
    Created on : Nov 21, 2018, 10:04:39 AM
    Author     : Stefany
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Permisos history</title>
    </head>
    <body>
        <h1>Historial de permisos</h1>
        <!--Calendario de permisos de llegadas-->
        <input type="date" name="per_llegada" placeholder="Permisos de llegada"/>
        <div id="table"  class="table" style="margin-top: -10px;">
        <!--Tabla de datos--->
        <div id="table_p">
            <table id="datos" class="table_p">
                
            </table>          
        </div>  
             
        </div>
    </body>
</html>
