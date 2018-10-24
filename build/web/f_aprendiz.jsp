<%-- 
    Document   : f_aprendiz
    Created on : 22-sep-2018, 13:24:07
    Author     : equipo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>f_aprendiz</title>
    </head>
    <body>
        <div>
            <h1>formulario aprendiz</h1>
            
            <form action="ServletAprendiz"enctype="multipart/form-data"method="post">
                <td><input type="number" name="f_NumeroDocumento" placeholder="documento del aprendiz"></td>
                <td><input type="text" name="f_TipoDocumento" placeholder="tipo de documento"></td>
                <td><input type="text" name="f_Nombres" placeholder="nombres"></td>
                <td><input type="text" name="f_Apellidos" placeholder="apellidos"><td>
                <td><input type="date" name="f_FechaNacimiento" placeholder="fecha de nacimiento"></td>
                <td><input type="number" name="f_Edad" placeholder="edad"></td>
                <td><input type="text" name="f_sexo" placeholder="sexo"></td>
                <td><input type="number" name="f_celular" placeholder="celular"></td>
                <td><input type="text" name="f_eps" placeholder="eps"></td>
                <td><input type="text" name="f_rh" placeholder="rh"></td>
                <td><input type="text" name="f_TipoAprendiz" placeholder="tipo aprendiz"></td>
                <td><input type="text" name="f_NombrePadre" placeholder="nombre del padre"></td>
                <td><input type="number" name="f_celularPadre" placeholder="celular del padre"></td>
                <td><input type="text" name="f_NombreMadre" placeholder="nombre de la madre"></td>
                <td><input type="number" name="f_celularMadre" placeholder="celular de la madre"></td>
                <td><input type="text" name="f_Departamento" placeholder="departamento"></td>
                <td><input type="text" name="f_ciudad" placeholder="ciudad"></td>
                <td><input type="text" name="f_barrio" placeholder="barrio"></td>
                <td><input type="text" name="f_direccion" placeholder="direccion"><td>
                <td><input type="text" name="f_AntecedenteMedico" placeholder="antecedente medico"></td>
                <td><input type="text" name="f_email" placeholder="E-mail"></td>
                <td><input type="file" name="f_HojaDeVida" accept="imagen/*"><br><br></td>
                <td><input type="text" name="f_Acta" placeholder="Acta de compromiso"><td>
                <td><input type="number" name="f_llamadosAtencion" placeholder="llamados de atencion"></td>
                <td><input type="number" name="f_numeroHabitacion" placeholder="numero de habitacion"></td>
                <td><input type="number" name="f_numeroFicha" placeholder="numero de ficha"></td>
                
                <input type="submit" name="btn_guardar" value="Guardar">
                
            </form>
        </div>
    </body>
</html>
