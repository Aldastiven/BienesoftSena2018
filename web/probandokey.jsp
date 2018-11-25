<%-- 
    PROBANDO BUSQUEDA TECLADO POR DOCUMENTO
    Author     : Stefany
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bucame en teclado</h1>
<%@ page import="java.sql.*" %>
<%
//BUSCANDO NUMERO DOCUMENTO
int num_docu=Integer.parseInt(request.getParameter("val"));
if(num_docu==num_docu){
out.print("<p>Escribe aqui numero de documento!</p>");
}else{

    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bienesoft", "root", "1234");
    PreparedStatement ps=con.prepareStatement("select per_ID, per_Aprendiz_Apr_documento, per_tipo, per_motivo, per_estado  from permiso where per_Aprendiz_Apr_documento='"+num_docu+"' ");
    ResultSet rs=ps.executeQuery();

    if(!rs.isBeforeFirst()) {    
     out.println("<p>No se encuentra!</p>"); 
    }else{
    out.print("<table border='1' cellpadding='2' width='100%'>");
    out.print("<tr><th>Id</th><th>Documento</th><th>Tipo</th><th>Motivo</th><th>Estado</th>");
    while(rs.next()){
    out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(13)+"</td><td>"+rs.getString(14)+"</td> ");
    }
    out.print("</table>");
    }//end of else for rs.isBeforeFirst
    con.close();
    }catch(Exception e){out.print(e);}
    }//end of else
%>
    
    
    </body>
</html>
