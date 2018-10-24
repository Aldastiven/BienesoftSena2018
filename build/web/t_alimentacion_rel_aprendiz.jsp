<%-- 
    Document   : t_alimentacion_rel_aprendiz
    Created on : Sep 22, 2018, 6:38:28 PM
    Author     : Stefany
--%>
<%@page import="modelo.Alimento_rel_AprendizSG"%>
<%@page import="modelo.consultas"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tabla Alimentacion-relacion-aprendiz</h1>
        
            <tr bgcolor="#A9CCE3" border="1">
                <th colspan="9" class="center">Tabla habitacion-Rel-Apr</th>
            </tr>
            <tr bgcolor="skyblue">
                <th class="center">Id</th>
                <th class="center">Tipo</th>
                <th class="center">Documento</th>
                <th class="center">Fecha</th>
                <th class="center">Estado</th>
                <th class="center">Conteo</th>
            </tr>
            <%
                ArrayList<Alimento_rel_AprendizSG> consulta = new ArrayList<>();
                consultas con=new consultas();
                consulta = con.consultaAlimentacionRelApr();
                Alimento_rel_AprendizSG Alimen = new Alimento_rel_AprendizSG();
                for (int i = 0; i< consulta.size(); i++ ){
                Alimen = consulta.get(i);
            
            %>
            
    
            <form action="ServletAlimento_rel_Aprendiz" method="post">
        <tr>
            <td><input  name="t_id"      value="<%=Alimen.getApid()%>" type="number"></td>
            <td><input  name="t_tipo"    value="<%=Alimen.getAptipo()%>" type="number"></td>
            <td><input  name="t_doc"     value="<%=Alimen.getAprdoc()%>" type="number"></td>
            <td><input  name="t_fecha"   value="<%=Alimen.getApfecha()%>" type="date"></td>
            <td><input  name="t_estado"  value="<%=Alimen.getApestado()%>" type="text"></td>
            <td><input  name="t_conteo"  value="<%=Alimen.getApconteo()%>" type="number"></td>
            
            <td><input type="submit" name="btn-modificar" value="Actualizar"></td>
            <td><input type="submit" name="btn-eliminar" value="Eliminar"></td>
            
        </tr>
        </form>
        
        <%
            }
        %>    
       
</html>
