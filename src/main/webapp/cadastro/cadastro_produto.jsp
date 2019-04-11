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
        <script type="text/javascript" src="../js/jquery-3.3.0.min.js"></script>
        <link type="text/css" rel="stylesheet" href="../scripts/materialize/css/materialize.css" media="screen,projection"/>
        <title>Cadastro Produto</title>
    </head>
    <body>
        <header>
            <div class="container">
                <h1 class="titulo">Cadastro Produto</h1>
            </div>
        </header>
        <form action="ProdutoControlador" method="post">
            <input type="hidden" name="acao" value="cadastrar">
            <input type="hidden" name="id">
            <label>Codigo</label>
            <input type="text" name="codigo">
            <label>Descrição</label>
            <input type="text" name="descricao">

            DOM de materia prima

            <button>Salvar</button>
        </form>
        <script type="text/javascript" src="../scripts/materialize/js/materialize.js"/>
    </body>
</html>
