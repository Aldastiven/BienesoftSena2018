
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>f_Permisos</title>
    </head>
    <body>
        <div>
            <h1>formulario Permiso</h1>
            
            <form action="ServletPermiso" enctype="multipart/form-data" method="post">
                <td><input type="number" name="f_numerodocumento" placeholder="documento del aprendiz"></td>
                <td><input type="text" name="f_tipo" placeholder="tipo de permiso"></td>
                <td><input type="date" name="f_fechsal" placeholder="Fecha salida"></td>
                <td><input type="date" name="f_fechingre" placeholder="Fecha ingreso"><td>
                <td><input type="time" name="f_horasal" placeholder="Hora salida"></td>
                <td><input type="time" name="f_horaingre" placeholder="Hora ingreso"></td>
                <td><input type="text" name="f_obser" placeholder="Observaciones"></td>
                <td><input type="text" name="f_moti" placeholder="Motivo"></td>
                <td><input type="text" name="f_estado" placeholder="Estado"></td>
                <td><input type="text" name="f_autoriza" placeholder="Autoriza"></td>
                <td><input type="file" name="f_evidenciaAdjunta" accept="imagen/*"><br><br></td>
                
                
                <input type="submit" name="btn-guardar" value="Guardar">
                
            </form>
        </div>
    </body>
</html>
