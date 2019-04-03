<%-- 
    Document   : cad_produto
    Created on : 29/03/2019, 13:50:35
    Author     : manases
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Cadastro Produto</title>
    </head>
    <body>
        <form action="ProdutoControlador" method="post">
            <h1>Cadastro Produto</h1>
            <input type="hidden" name="acao" value="cadastrar">
            <input type="hidden" name="id">
            <label>Codigo</label>
            <input type="text" name="codigo">
            <label>Descrição</label>
            <input type="text" name="descricao">

            DOM de materia prima
            
            <button>Salvar</button>
        </form>
    </body>
</html>
