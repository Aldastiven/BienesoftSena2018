<%-- 
    Document   : f_usuario
    Created on : Sep 23, 2018, 5:22:35 PM
    Author     : Stefany
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario</title>
    </head>
    <body>
        <div class="container">
            <h1>formulario usuario</h1>
            <form action="ServletUsuario" enctype="multipart/form-data" method="post">
                <input  type="number" name="f_doc" placeholder="numero doc">
                <input  type="text"   name="f_nom" placeholder="Nombre">
                <input  type="text"   name="f_ape" placeholder="Apellido">
                <input  type="number" name="f_cel" placeholder="Celular">
                <input  type="email"  name="f_ema" placeholder="Email">
                <input  type="file"   name="f_fot" accept="img/*" placeholder="Tu Foto">
                <input  type="text"   name="f_pas" placeholder="Password">
                <input  type="text"   name="f_rol" placeholder="rol">
                
                <input type="submit"  name="btn-guardar" value="Guardar">
            </form>
        </div>
    </body>
</html>
