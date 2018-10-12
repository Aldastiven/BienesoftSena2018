<%-- 
    Document   : t_usuario
    Created on : Sep 23, 2018, 6:37:29 PM
    Author     : Stefany
--%>

<%@page import="modelo.consultas"%>
<%@page import="modelo.usuarioSG"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tabla usuario</h1>
        <table align="center" border="1" width="800">
            <tr bgcolor="#A9CCE3" border="1">
                <th colspan="9" class="center">Tabla usuario</th>
            </tr>
            <tr bgcolor="skyblue">
                <th class="center">Numero documento</th>
                <th class="center">Nombre</th>
                <th class="center">Apellido</th>
                <th class="center">Celular</th>
                <th class="center">Email</th>
                <th class="center">Foto perfil</th>
                <th class="center">Password</th>
                <th class="center">Tipo rol</th>
            </tr>
            <%
                ArrayList<usuarioSG> listdat=new ArrayList<>(); 
                consultas con=new consultas();
                listdat=con.consultaUsuario();
                usuarioSG igs=new usuarioSG();
                
                for(int i=0; i<listdat.size(); i++){
                    igs=listdat.get(i);
                    String photo=igs.getUsufoto();
            %>
            
        <form action="ServletUsuario">
        <tr>
            <td><input  name="t_doc" value="<%=igs.getUsudoc()%>" type="number"></td>
            <td><input  name="t_nom" value="<%=igs.getUsunom()%>"  type="text"></td>
            <td><input  name="t_ape" value="<%=igs.getUsuape()%>" type="text"></td>
            <td><input  name="t_cel" value="<%=igs.getUsucel()%>" type="number"></td>
            <td><input  name="t_ema" value="<%=igs.getUsuemail()%>" type="email"></td>
            <td><img src="<%=igs.getUsufoto()%>" width="60" height="60"/></td>
            <td><input  name="t_pas" value="<%=igs.getUsuclave()%>" type="text"></td>
            <td><input  name="t_rol" value="<%=igs.getUsurol()%>" type="text"></td>
        
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
