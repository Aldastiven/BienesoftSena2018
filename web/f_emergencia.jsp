

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>f_SalidaEmergente</title>
    </head>
    <body>
        <div class="container">
            <h1>formulario Emergencia</h1>  
            
            <form action="ServletEmergencia" enctype="multipart/form-data" method="post">
                <input type="number"   name="e_doc" placeholder="Documento">
                <input type="text"     name="e_moti" placeholder="Motivo">
                <input type="date" name="e_f_sal" placeholder="FechaSalida">
                <!--<input type="date" name="e_f_ingre" placeholder="FechaIngreso">-->
                <input type="time" name="e_Hs" placeholder="Hora salida">
                <input type="number"   name="e_d_acompa" placeholder="DocumentoAcompaniante">
                <input type="text"     name="e_autoriza" placeholder="Autoriza">
                <td><input type="file" name="e_e_adjun"  placeholder="EvidenciaAdjunta" accept="imagen/*"><br><br></td>
               
                <input  type="submit" name="btn_guardar" value="Guardar" >
            </form>
        </div>
    </body>
</html>
