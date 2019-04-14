<%-- 
    Document   : menu
    Created on : 29/03/2019, 13:55:22
    Author     : manases
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <script type="text/javascript" src="js/jquery-3.3.0.min.js"></script>
        <link type="text/css" rel="stylesheet" href="scripts/materialize/css/materialize.css" media="screen,projection"/>
        <title>Menu Faturação</title>
    </head>
    <body>
        <header>
            <div class="container">
                <h1>Menu Faturação</h1>
            </div>
        </header>
        <nav>
            <div class="nav-wrapper">
                <ul>
                    <li><a href="CadastroControlador?codTela=2">Cadastro Fornecedor</a></li>            
                    <li><a href="CadastroControlador?codTela=3">Cadastro Formulacao</a></li>
                    <li><a href="CadastroControlador?codTela=1">Cadastro Materia Prima</a></li>
                    <li><a href="CadastroControlador?codTela=0">Cadastro Produto</a></li>                            
                </ul>
                <ul>
                    <li><a href="ConsultaControlador?codTela=102">Consulta Fornecedor</a></li>            
                    <li><a href="ConsultaControlador?codTela=103">Consulta Formulacao</a></li>
                    <li><a href="ConsultaControlador?codTela=101">Consulta Materia Prima</a></li>
                    <li><a href="ConsultaControlador?codTela=100">Consulta Produto</a></li>
                </ul>
            </div>
        </nav>
        <script type="text/javascript" src="scripts/materialize/js/materialize.js"/>
    </body>
</html>
