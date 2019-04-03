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
        <title>Cadastro Fornecedor</title>
    </head>
    <body>
        <h1>Cadastro Fornecedor</h1>
        <form action="FornecedorControlador" method="post">
            <input type="hidden" name="acao" value="cadastrar">
            <label>CPF/CNPJ</label>
            <input type="text" name="cnpj">
            <label>Empresa</label>
            <input type="text" name="empresa">
            <label>Representante</label>
            <input type="text" name="representante">
            <label>Tel.:</label>
            <input type="tel" name="telefone01">
            <label>Tel.:</label>
            <input type="tel" name="telefone02">
            <label>Email</label>
            <input type="email" name="email">
            
            DOM materia prima
            
            <button>Salvar</button>
        </form>
    </body>
</html>
