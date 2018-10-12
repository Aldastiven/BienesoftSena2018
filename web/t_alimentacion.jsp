<%-- 
    Document   : t_alimentacion
    Created on : Sep 22, 2018, 11:38:29 AM
    Author     : Stefany
--%>

<%@page import="modelo.consultas"%>
<%@page import="modelo.alimentacionSG"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Alimentacion</h1>
        <table align="center" border="1" width="800">
            <tr bgcolor="#A9CCE3" border="1">
                <th colspan="9" class="center">Tabla habitacion</th>
            </tr>
            <tr bgcolor="skyblue">
                <th class="center">Aid</th>
                <th class="center">Tipo alimento</th>
                <th class="center">Descripcion</th>
            </tr>
            <%
                ArrayList<alimentacionSG> listdat=new ArrayList<>(); 
                consultas con=new consultas();
                listdat=con.consultaAlimentacion();
                alimentacionSG igs=new alimentacionSG();
                
                for(int i=0; i<listdat.size(); i++){
                    igs=listdat.get(i);
                
            
            %>
            
        <form action="ServletAlimentacion">
        <tr>
            <td><input  name="t_aid"   value="<%=igs.getId()%>"     type="number"></td>
            <td><input  name="t_tipo"  value="<%=igs.getTipo()%>"></td>
            <td><input  name="t_descp" value="<%=igs.getDescrip()%>" type="text"></td>
            
        
            <td><input type="submit" name="btn-modificar" value="Modificar"></td>
            <td><input type="submit" name="btn-eliminar" value="Eliminar"></td>
            
        </tr>
        </form>
        
        <%
            }
        %>    
        </table>
    </body>
</html>
