

<%@page import="modelo.consultas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.emergenciaSG"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabla emergencia</title>
    </head>
    <body>
        
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Documento</th>
                    <th>Motivo Emergente</th>
                    <th>Fecha  Salida</th>
                    <th>Fecha  Ingreso</t> 
                    <th>Hora Salida</th>
                    <th>Hora Ingreso</t> 
                    <th>DocumentoAcompaniante</th>
                    <th>Autoriza</th>
                    <th>EvidenciaAdjunta </th>
                    
                </tr>
            </thead>
              <%
                  ArrayList <emergenciaSG> listdat=new ArrayList<>();
                  consultas con=new consultas();
                  listdat=con.consultarEmergencia();
                  emergenciaSG x=new emergenciaSG();
                  
                    for(int i=0; i<listdat.size();i++){
                        x=listdat.get(i);
                       
                    
              %>  
              
              <tr>
              <form action="ServletEmergencia" enctype="multipart/form-data" method="post">
                  <td><input type="number" name="t_e_Id" value="<%=x.getSal_ID()%>" readonly></td>
                  <td><input type="number" name="t_e_doc" value="<%=x.getSal_Aprendiz_Apr_documento()%>"></td>
                  <td><input type="text" name="t_e_moti" value="<%=x.getSal_motivoEmergente()%>"></td>
                  <td><input type="date" name="t_e_f_sal" value="<%=x.getSal_fechaSalida()%>"></td>
                  <td><input type="date" name="t_e_f_ingre" value="<%=x.getSal_fechaIngreso()%>"></td> 
                  <td><input type="time" name="t_e_Hs" value="<%=x.getSal_horaSalida()%>"></td>
                  <td><input type="time" name="t_e_Hi" value="<%=x.getSal_horaIngreso()%>"></td> 
                  <td><input type="number" name="t_e_d_acompa" value="<%=x.getSal_documentoAcompaniante()%>"></td>
                  <td><input type="text" name="t_e_autoriza" value="<%=x.getSal_autoriza()%>"></td>
                  <th><img src="<%=x.getSal_evidenciaAdjunta()%>" width="60" height="60"/></th>
                  <td style="display: none;"><input type="text" name="Evidencia" value="<%=x.getSal_evidenciaAdjunta()%>"></td>
                  <td><input type="file" name="EvidenciaAdjunta" accept="imagen/*"></td>
                  
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   

