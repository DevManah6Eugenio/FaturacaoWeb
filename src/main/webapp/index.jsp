<%-- 
    Document   : index
    Created on : 31/03/2019, 13:55:06
    Author     : manasses
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
        <script type="text/javascript" src="js/jquery-3.3.0.min.js"></script>
        <link type="text/css" rel="stylesheet" href="scripts/materialize/css/materialize.css" media="screen,projection"/>
        <link href="css/login.css" rel="stylesheet">
        <title>Login</title>
    </head>
    <body class="text-center">
    <center>
        <div class='header-box'>
            <h1>Faturação</h1>
        </div>
        <form action="./menu.jsp" method="post" class="form-login">
            <label>Usuario</label>
            <input type="text" name="login" class="form-control">
            <label>Senha</label>
            <input type="password" name="password" class="form-control">
            <button class="btn btn-primary btn-block">Login</button>
        </form>
    </center>
    <script type="text/javascript" src="scripts/materialize/js/materialize.js"/>
</body>
</html>
