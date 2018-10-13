

<%@page import="modelo.consultas"%>
<%@page import="java.sql.Date"%>
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
        <table align="center" border="1" width="800">
            <tr bgcolor="#A9CCE3" border="1">
                <th colspan="9" class="center">Tabla ficha</th>
            </tr>
            <tr bgcolor="skyblue">
                <th>Numero</th>
                <th>Nombre Programa</th>
                <th>Jornada</th>
                <th>Fic_inicio_etapa_electiva</th>
                <th>Fic_fin_etapa_electiva</th>
            </tr>
            <%
                
                
                ArrayList<fichaSG> listdat=new ArrayList<>(); 
                consultas con=new consultas();
                listdat=con.consultaFicha();
                fichaSG igs=new fichaSG();
                
                for(int i=0; i<listdat.size(); i++){
                    igs=listdat.get(i);

            %>  
              
              
            <form action="ServletFicha">

                <td><input  name="t_n_ficha" value="<%=igs.getFic_numero()%>"></td>
                <td><input  name="t_nombre" value="<%=igs.getFic_nombrePrograma()%>"></td>
                <td><input  name="t_jornada" value="<%=igs.getFic_jornada()%>"></td>
                <td><input  name="Fic_inicio_etapa" value="<%=igs.getFic_inicio_etapa()%>"></td>
                <td><input  name="Fic_fin_etapa" value="<%=igs.getFic_fin_etapa()%>"></td>
                
                <td><input type="submit" name="btn_actualizar" value="Actualizar"></td>
                <td><input type="submit" name="btn_eliminar" value="Eliminar"></td>
            </form>
            
                 
                
            <%
                }
            %>
        </table>
    </body>
</html>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    </body>
</html>
