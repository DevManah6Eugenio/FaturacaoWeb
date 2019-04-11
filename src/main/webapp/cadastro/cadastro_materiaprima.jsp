<%-- 
    Document   : cad_materiaprima
    Created on : 29/03/2019, 13:50:22
    Author     : manases
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <script type="text/javascript" src="../js/jquery-3.3.0.min.js"></script>
        <link type="text/css" rel="stylesheet" href="../scripts/materialize/css/materialize.css" media="screen,projection"/>
        <title>Cadastro Materia Prima</title>
    </head>
    <body>
        <header>
            <div class="container">
                <h1>Cadastro Materia Prima</h1>
            </div>
        </header>
        <form action="MateriaPrimaControlador" method="post">
            <input type="hidden" name="acao" value="cadastrar">
            <input type="hidden" name="id_materia_prima">
            <label for="codigo">Codigo:</label>
            <input type="text" name="codigo" class="validate">
            <label for="descricao">Descrição:</label>
            <input type="text" name="descricao" class="validate">
            <label>Unidade de Compra:</label>
            <div class="input-field col s12">
                <select name="unidade_compra" class="browser-default">
                    <option value="" disabled selected>Selecione</option>
                    <option value="kl">Kilo</option>
                    <option value="lt">Litro</option>
                </select>
            </div>
            <label for="valor">Valor:</label>
            <input type="number" name="valor" class="validate">

            <button>Salvar</button>
        </form>
        <script type="text/javascript" src="../scripts/materialize/js/materialize.js"/>
    </body>
</html>