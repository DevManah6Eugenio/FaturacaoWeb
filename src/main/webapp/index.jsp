<%-- 
    Document   : index
    Created on : 31/03/2019, 13:55:06
    Author     : manasses
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Login</title>
    </head>
    <body>
        <form action="./menu.jsp" method="post">
            <label>Usuario</label>
            <input type="text" name="login">
            <label>Senha</label>
            <input type="password" name="password">
            <button>Login</button>
        </form>
    </body>
</html>
