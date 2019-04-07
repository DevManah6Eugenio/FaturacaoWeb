<%-- 
    Document   : cad_fornecedor
    Created on : 29/03/2019, 13:50:03
    Author     : manases
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet" type="text/css" href="css/index.css">
        <title>Cadastro Fornecedor</title>
    </head>
    <body>
        <header>
            <div class="container">
                <h1 class="titulo">Cadastro Fornecedor</h1>
            </div>
        </header>
        <form action="FornecedorControlador" method="post">
            <input type="hidden" name="acao" value="cadastrar">
            <label>CPF/CNPJ:</label>
            <input type="text" name="cnpj">
            <label>Empresa:</label>
            <input type="text" name="empresa">
            <label>Representante:</label>
            <input type="text" name="representante">
            <label>Tel.:</label>
            <input type="tel" name="telefone01">
            <label>Tel.:</label>
            <input type="tel" name="telefone02">
            <label>Email:</label>
            <input type="email" name="email">
            
            DOM materia prima
            
            <button>Salvar</button>
        </form>
    </body>
</html>
