<!--LOGIN BIENESOFT-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="css/estilos.css">
        <link rel="stylesheet" href="css/normalize.css">
    </head>
    <body>
        <h1>Login</h1>
    <form action="ServletLogin">
        <div class="center">
            <img src="img/logodos.png" alt="" width="250px">
            <div class="border-bottom"></div>
        </div>
        <div class="center">
            <input class="inputlabel" name="user" placeholder="Digite su numero documento" type="text">
            <br>
            <br> 
            <input class="inputlabel" name="pass" placeholder="Digite su contraseña" type="text">
            <br>
            <br> 

            <input class="send" type="submit" name="btn-entrar" value="Entrar">

        </div>
    </form>

    </body>
</html>
