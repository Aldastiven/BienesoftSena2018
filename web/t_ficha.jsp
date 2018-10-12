<%-- 
    Document   : t_ficha
    Created on : 22-sep-2018, 11:08:02
    Author     : lenovo
--%>

<%@page import="modelo.Consulta"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.fichaSG"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>t_ficha</title>
    </head>
    <body>
        
        <table>
            <thead>
                <tr>
                
                    <th>Numero</th>
                    <th>Nombre Programa</th>
                    <th>Jornada</th>
                    <th>Fic_inicio_etapa_electiva</th>
                    <th>Fic_fin_etapa_electiva</th>
                </tr>
            </thead>
              <%
                  ArrayList <fichaSG> consultas=new ArrayList<>();
                  Consulta con=new Consulta();
                  consultas=con.consultarTablaFicha();
                  fichaSG x=new fichaSG();
                  
                    for(int i=0; i<consultas.size();i++){
                        x=consultas.get(i);
                    
              %>  
              
              <tr>
              <form action="ServletFicha" method="post">
                 
                  <td><input type="number" name="t_n_ficha" value="<%=x.getFic_numero()%>"></td>
                  <td><input type="text" name="t_nombre" value="<%=x.getFic_nombrePrograma()%>"></td>
                  <td><input type="text" name="t_jornada" value="<%=x.getFic_jornada()%>"></td>
                  <td><input type="date" name="Fic_inicio_etapa" value="<%=x.getFic_inicio_etapa()%>"></td>
                  <td><input type="date" name="Fic_fin_etapa" value="<%=x.getFic_fin_etapa()%>"></td>
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    </body>
</html>
