<%-- 
    Document   : t_habitacion
    Created on : Sep 22, 2018, 11:12:35 AM
    Author     : Stefany
--%>

<%@page import="modelo.consultas"%>
<%@page import="modelo.habitacionSG"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tabla habitacion</h1>
        <table align="center" border="1" width="800">
            <tr bgcolor="#A9CCE3" border="1">
                <th colspan="9" class="center">Tabla habitacion</th>
            </tr>
            <tr bgcolor="skyblue">
                <th class="center">Numero habitacion</th>
                <th class="center">Total de camas</th>
                <th class="center">Camas disponibles</th>
                <th class="center">Genero habitacion</th>
            </tr>
            <%
                ArrayList<habitacionSG> listdat=new ArrayList<>(); 
                consultas con=new consultas();
                listdat=con.consultaHabitacion();
                habitacionSG igs=new habitacionSG();
                
                for(int i=0; i<listdat.size(); i++){
                    igs=listdat.get(i);        
            %>
            
        <form action="ServletHabitacion">
        <tr>
            <td><input  name="t_numero" value="<%=igs.getNumeroHabitacion()%>" type="number"></td>
            <td><input  name="t_c_total" value="<%=igs.getHab_camasTotal()%>"  type="number"</td>
            <td><input  name="t_c_disponibles" value="<%=igs.getHab_camasDisponibles()%>" type="number"></td>
            <td><input  name="t_g_habitacion" value="<%=igs.getHab_generoHabitacion()%>" type="text"></td>
            
        
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
