

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
            
            <form action="ServletPermiso"enctype="multipart/form-data"method="post">
                <td><input type="number" name="f_NumeroDocumento" placeholder="documento del aprendiz"></td>
                <td><input type="text" name="f_Tipo" placeholder="tipo de permiso"></td>
                <td><input type="date" name="f_Fechsal" placeholder="Fecha salida"></td>
                <td><input type="date" name="f_Fechingre" placeholder="Fecha ingreso"><td>
                <td><input type="time" name="f_Horasal" placeholder="Hora salida"></td>
                <td><input type="time" name="f_Horaingre" placeholder="Hora ingreso"></td>
                <td><input type="text" name="f_Obser" placeholder="Observacones"></td>
                <td><input type="text" name="f_Moti" placeholder="Motivo"></td>
                <td><input type="text" name="f_Estado" placeholder="Estado"></td>
                <td><input type="text" name="f_Atoriza" placeholder="Autoriza"></td>
                <td><input type="file" name="f_evidenciaAdjunta" accept="imagen/*"><br><br></td>
                
                
                <input type="submit" name="guardar" value="Guardar">
                
            </form>
        </div>
    </body>
</html>
