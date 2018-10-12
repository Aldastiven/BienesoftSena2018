<%-- 
    Document   : t_permisos
    Created on : 01-oct-2018, 7:48:47
    Author     : equipo
--%>

<%@page import="modelo.consultaTablas"%>
<%@page import="modelo.permisoSG"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            t_permisos
        </title>
    </head>
    <body>
        <table>
            
            <thead>
            <th>ID</th>
            <th>Numero de documento del aprendiz</th>
            <th>Tipo de permiso</th>
            <th>Fecha de salida</th>
            <th>Fecha de ingreso</th>
            <th>Hora de salida</th>
            <th>Hora de ingreso</th>
            <th>Fecha de ingreso real</th>
            <th>Hora ingreso real</th>
            <th>Observacion</th>
            <th>Motivo</th>
            <th>Estado</th>
            <th>Autoriza</th>
            <th>Evidencia</th>
            </thead>
            
            <%
                ArrayList <permisoSG> consulta = new ArrayList<>();
                consultaTablas con = new consultaTablas();
                consulta = con.consultarPermiso();
                permisoSG x = new permisoSG();
                
                for(int i = 0; i< consulta.size(); i++){
                x = consulta.get(i);
            %>
            
            <tr>
            <form action="ServletPermiso"enctype="multipart/form-data"method="post">
                <td><input type="number" name="Id" value="<%=x.getPer_ID()%>" readonly></td>
                <td><input type="number" name="NumeroDocumento" value="<%=x.getPer_Aprendiz_Apr_documento()%>"></td>
                <td><input type="text" name="Tipo" value="<%=x.getPer_tipo()%>"></td>
                <td><input type="date" name="Fechsal" value="<%=x.getPer_fecha_salida()%>"></td>
                <td><input type="date" name="Fechingre" value="<%=x.getPer_fecha_ingreso()%>"></td>
                <td><input type="time" name="Horasal" value="<%=x.getPer_hora_Salida()%>"></td>
                <td><input type="time" name="Horaingre" value="<%=x.getPer_hora_ingreso()%>"></td>
                <td><input type="data" name="freal" value="<%=x.getPer_Fecha_ingresoReal()%>" readonly></td>
                <td><input type="time" name="Hreal" value="<%=x.getPer_Hora_ingresoReal()%>" readonly></td>
                <td><input type="text" name="Obser" value="<%=x.getPer_observacion_permiso_llegada()%>" readonly></td>
                <td><input type="text" name="Moti" value="<%=x.getPer_motivo()%>"></td>
                <td><input type="text" name="Estado" value="<%=x.getPer_estado()%>" readonly></td>
                <td><input type="text" name="Atoriza" value="<%=x.getPer_autoriza()%>"></td> 
                <th><img src="<%=x.getPer_evidenciaAdjunta()%>" width="60" height="60"/></th>
                  <td style="display: none;"><input type="text" name="Evide" value="<%=x.getPer_evidenciaAdjunta()%>"></td>
                  <td><input type="file" name="EvidenciaAdjunta" accept="imagen/*"></td>
                
                <td>
                    <input type="submit" name="btn_actualizar" value="Actulizar">
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
