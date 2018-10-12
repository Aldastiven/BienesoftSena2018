<%-- 
    Document   : t_aprendiz_rel_patrocinio
    Created on : 23-sep-2018, 11:30:53
    Author     : equipo
--%>

<%@page import="modelo.consultas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.aprendiz_rel_patrocinioSG"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>t_aprendiz_rel_patrocinio</title>
    </head>
    <body>
        <table>
            <thead>
            <th>Numero registro</th>   
            <th>ID del patrocinio</th>
            <th>ID aprendiz</th>
            <th>Numero de contrato</th>
            <th>Estado</th>
            <th>Fecha de contrato</th>
            </thead>
            
            <%
                ArrayList<aprendiz_rel_patrocinioSG> consultas = new ArrayList<>();
                consultas con=new consultas();
                consultas = con.consultarTablaAprendiz_rel_Patricinio();
                aprendiz_rel_patrocinioSG x= new aprendiz_rel_patrocinioSG();
                for (int i = 0; i< consultas.size(); i++ ){
                x = consultas.get(i);
            %>
            
            <tr>
            <form action="ServletAprendiz_rel_Patrocinio" method="post">
                <td><input type="number" name="t_ID" value="<%=x.getPatrocinio_Rel_Aprendiz_ID()%>" readonly></td>
                <td><input type="number" name="t_patrocinio_pat_id" value="<%=x.getPatrocinio_Pat_ID()%>"></td>
                <td><input type="number" name="t_aprendiz_apr_documento" value="<%=x.getPat_Aprendiz_Apr_documento()%>"></td>
                <td><input type="number" name="t_numeroContrato" value="<%=x.getPat_numeroContrato()%>"></td>
                <td><input type="text" name="t_estado" value="<%=x.getPat_estado()%>" ></td>
                <td><input type="date" name="t_fechaContrato" value="<%=x.getPat_fechaContrato()%>"></td>
                
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
