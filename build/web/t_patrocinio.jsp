<%-- 
    Document   : t_patrocinio
    Created on : 21-sep-2018, 13:29:32
    Author     : equipo
--%>

<%@page import="modelo.consultas"%>
<%@page import="modelo.patrocinioSG"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>t_patrocinio</title>
    </head>
    <body>
        
        
    <table>
        <thead>
            <tr>
                <th>ID </th>
                <th>Nombre</th>
                <th>Acciones</th>
            </tr>
        </thead>
        
        <%
            ArrayList <patrocinioSG> consultas = new ArrayList<>();
            consultas con=new consultas();
            consultas = con.consultarTabla();
            patrocinioSG x = new patrocinioSG();
            
            for (int i=0; i< consultas.size(); i++ ){
            x = consultas.get(i);
            
            
        %>
        
        <tr>
        <form action="ServletPatrocinio" method="post">
            <td><input type="number" name="t_id" value="<%=x.getPat_ID()%>" readonly></td>
            <td><input type="text" name="t_nombre" value="<%=x.getPat_nombreEmpresa()%>"></td>
            
            <td>
                <input type="submit" name="btn_actualizar" value="Actualizar">
                <input type="submit" name="btn_eliminar" value="Eliminar">
            </td>
            
        </form>
        </tr>
        
        <%
            }
        %>
        
        
    </table>
    

</body>
</html>
