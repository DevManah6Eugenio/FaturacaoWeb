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
        <script type="text/javascript" src="js/jquery-3.3.0.min.js"/>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
        <script type="text/javascript" src="js/bootstrap.min.js"/>

        <link rel="stylesheet" type="text/css" href="css/index.css">
        <title>Login</title>
    </head>
    <body class="text-center">
                <h1 class="h3 mb-3 font-weight-normal">Login</h1>
        <form action="./menu.jsp" method="post">
            <label>Usuario</label>
            <input type="text" name="login">
            <label>Senha</label>
            <input type="password" name="password">
            <button>Login</button>
            
            <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required="" autofocus="">
        </form>
    </body>
</html>
