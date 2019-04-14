<%-- 
    Document   : consulta_fornecedor
    Created on : 31/03/2019, 20:27:12
    Author     : manasses
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <script type="text/javascript" src="../js/jquery-3.3.0.min.js"></script>
        <link type="text/css" rel="stylesheet" href="../scripts/materialize/css/materialize.css" media="screen,projection"/>
        <link type="text/css" rel="stylesheet" href="../css/estilo.css" media="screen,projection"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <title>Consulta Fornecedor</title>
    </head>
    <body>
        <header>
            <nav>
                <div class="nav-wrapper center-align title">
                    Consulta Fornecedor
                    <a href="../menu.jsp" class="brand-logo right large material-icons">home</a>
                </div>
            </nav>
        </header>
        <div class="row">
            <main class="col s12">
                <div class="col s7">
                    <label>CPF/CNPJ:</label>
                    <input type="text" name="cnpj">
                </div>
                <div class="col s12">
                    <label>Empresa:</label>
                    <input type="text" name="empresa">
                </div>
                <div class="col s12">
                    <label>Representante:</label>
                    <input type="text" name="representante">
                </div>
                <div class="col s6">
                    <label>Materia Prima:</label>
                    <select name="materia_prima_select" class="browser-default">
                        <option value="" disabled selected>Selecione</option>
                    </select>
                </div>
                <div class="col s12 center-align">
                    <button class="btn" onclick="carregarListFornecedor()">Pesquisar</button>
                </div>
            </main>
        </div>
        <div class="divider"></div>
        <table id="fornecedor" class="striped">
            <thead>
                <tr>
                    <th>CPF/CNPJ</th>
                    <th>Empresa</th>
                    <th>Representante</th>
                    <th>Fone</th>
                </tr>
            </thead>
            <tbody id="tabela_fornecedor">
            </tbody>
        </table>
        <script type="text/javascript" src="../scripts/materialize/js/materialize.js"></script>
        <script type="text/javascript" src="../js/fornecedor.js"></script>
    </body>
</html>
