<%-- 
    Document   : t_aprendiz
    Created on : 22-sep-2018, 21:56:31
    Author     : equipo
--%>

<%@page import="modelo.consultas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.aprendizSG"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>t_aprendiz</title>
    </head>
    <body>
        
        <table>
            
            <thead>
            <th>Numero de documento</th>
            <th>Tipo de documento</th>
            <th>Nombres</th>
            <th>Apellidos</th>
            <th>Fecha de nacimiento</th>
            <th>Edad</th>
            <th>Sexo</th>
            <th>Numero de contacto</th>
            <th>eps</th>
            <th>rh</th>
            <th>Tipo de aprendiz</th>
            <th>Nombre del padre</th>
            <th> Telefono </th>
            <th>Nombre da la madre</th>
            <th>Telefono</th>
            <th>Departamento</th>
            <th>Ciudad</th>
            <th>Barrio</th>
            <th>Direccion</th>
            <th>E-mail</th>
            <th>Hoja de vida</th>
            <th></th>
            <th></th>
            <th>Acta de compromiso</th>
            <th>Llamados de atencion</th>
            <th>Numero de habitacion</th>
            <th>Numero de ficha</th>         
            </thead>
            
            <%
                ArrayList <aprendizSG> consultas = new ArrayList<>();
                consultas con = new consultas();
                consultas = con.consultarTablaAprendiz();
                aprendizSG x = new aprendizSG();
                
                for (int i = 0; i< consultas.size(); i++){
                x = consultas.get(i);
             
            %>
            
            <tr>
            <form action="ServletAprendiz" enctype="multipart/form-data" method="post">
                
              
                <td><input type="number" name="t_NumeroDocumento" value="<%=x.getApr_documento()%>"></td>
                <td><input type="text" name="t_TipoDocumento" value="<%=x.getApr_documentoTipo()%>"></td>
                <td><input type="text" name="t_Nombres" value="<%=x.getApr_nombres()%>"></td>
                <td><input type="text" name="t_Apellidos" value="<%=x.getApr_apellidos()%>"></td>
                <td><input type="text" name="t_FechaNacimiento" value="<%=x.getApr_fechaNacimiento()%>"></td>
                <td><input type="number" name="t_Edad" value="<%=x.getApr_edad()%>"></td>
                <td><input type="text" name="t_sexo" value="<%=x.getApr_sexo()%>"></td>
                <td><input type="text" name="t_celular" value="<%=x.getApr_celular()%>"></td>
                <td><input type="text" name="t_eps" value="<%=x.getApr_eps()%>"></td>
                <td><input type="text" name="t_rh" value="<%=x.getApr_rh()%>"></td>
                <td><input type="text" name="t_TipoAprendiz" value="<%=x.getApr_tipoAprendiz()%>"></td>
                <td><input type="text" name="t_NombrePadre" value="<%=x.getApr_nombrePadre()%>"></td>
                <td><input type="number" name="t_celularPadre" value="<%=x.getApr_telefonoPadre()%>"></td>
                <td><input type="text" name="t_NombreMadre" value="<%=x.getApr_nombreMadre()%>"></td>
                <td><input type="number" name="t_celularMadre" value="<%=x.getApr_telefonoMadre()%>"></td>
                <td><input type="text" name="t_Departamento" value="<%=x.getApr_departamento()%>"></td>
                <td><input type="text" name="t_ciudad" value="<%=x.getApr_ciudad()%>"></td>
                <td><input type="text" name="t_barrio" value="<%=x.getApr_barrio()%>"></td>
                <td><input type="text" name="t_direccion" value="<%=x.getApr_direccion()%>"></td>
                <td><input type="text" name="t_AntecedenteMedico" value="<%=x.getApr_antecedente_medico()%>"></td>
                <td><input type="text" name="t_email" value="<%=x.getApr_email()%>"></td>
                <th><img src="<%=x.getApr_hojaDeVida()%>" width="60" height="60"/></th>
                <td style="display: none;"><input type="text" name="Hoja" value="<%=x.getApr_hojaDeVida()%>"></td>
                <td><input type="file" name="HojaDeVida" accept="imagen/*"></td>
                <td><input type="text" name="t_Acta" value="<%=x.getApr_actaCompromiso()%>"></td>
                <td><input type="number" name="t_llamadosAtencion" value="<%=x.getApr_llamadosDeAtencion()%>" readonly></td>
                <td><input type="number" name="t_numeroHabitacion" value="<%=x.getApr_numero_habitacion()%>"></td>
                <td><input type="number" name="t_numeroFicha" value="<%=x.getApr_ficha_fic_numero()%>"></td>
                
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
