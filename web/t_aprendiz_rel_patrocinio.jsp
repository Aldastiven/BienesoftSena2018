

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
        <h1>Tabla Aprendiz-rel-Patrocinio</h1>
        <table>
            <tr bgcolor="#A9CCE3" border="1">
                <th colspan="9" class="center">Tabla habitacion</th>
            </tr>
            <tr bgcolor="skyblue">
                <th class="center">Pat id</th>
                <th class="center">Documento</th>
                <th class="center">Numero contrato</th>
                <th class="center">Estado</th>
                <th class="center">Fecha de contrato</th>
            </tr>
            
            <%
                ArrayList<aprendiz_rel_patrocinioSG> listdat = new ArrayList<>();
                consultas con=new consultas();
                listdat = con.consultaAprendiz_rel_Patricinio();
                aprendiz_rel_patrocinioSG x= new aprendiz_rel_patrocinioSG();
                
                for (int i = 0; i< listdat.size(); i++ ){
                    x = listdat.get(i);
                
            %>
            
            <form action="ServletAprendiz_rel_Patrocinio">
            <tr>
                <td><input name="t_patrocinio_pat_id" value="<%=x.getPatrocinio_Pat_ID()%>"></td>
                <td><input name="t_aprendiz_apr_documento" value="<%=x.getPat_Aprendiz_Apr_documento()%>"></td>
                <td><input name="t_numeroContrato" value="<%=x.getPat_numeroContrato()%>"></td>
                <td><input name="t_estado" value="<%=x.getPat_estado()%>" ></td>
                <td><input name="t_fechaContrato" value="<%=x.getPat_fechaContrato()%>"></td>
                
                <td><input type="submit" name="btn_actualizar" value="Actualizar"></td>
                
                <td><input type="submit" name="btn-eliminar" value="Eliminar"></td>
            </tr>   
            </form> 
        
        
            <%
                }
            %>
        </table>
    </body>
</html>
