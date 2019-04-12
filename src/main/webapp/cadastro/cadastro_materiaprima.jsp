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
        <link type="text/css" rel="stylesheet" href="../css/materia_prima.css" media="screen,projection"/>
        <title>Cadastro Materia Prima</title>
    </head>
    <body>
        <header>
            <nav>
                <div class="nav-wrapper center-align title">
                   Cadastro Materia Prima
                </div>
            </nav>
        </header>
        <div class="row">
            <form action="../MateriaPrimaControlador" method="post" class="col s12">
                <input type="hidden" name="acao" value="cadastrar">
                <input type="hidden" name="id_materia_prima">
                <div class="col s8">
                    <label>Codigo:</label>
                    <input type="text" name="codigo" class="validate" data-length="10">
                </div>
                <div class="col s12">
                    <label for="descricao">Descri��o:</label>
                    <input type="text" name="descricao" class="validate">
                </div>
                <div class="col s7">
                    <label for="valor">Valor:</label>
                    <input type="number" name="valor" class="validate">
                </div>
                <div class="col s6">
                    <label>Unidade de Compra:</label>
                    <select name="unidade_compra" class="browser-default">
                        <option value="" disabled selected>Selecione</option>
                        <option value="kl">Kilo</option>
                        <option value="lt">Litro</option>
                    </select>
                </div>
                <div class="col s12 center-align">
                    <button class="btn">Salvar</button>
                </div>
            </form>
        </div>
        <script type="text/javascript" src="../scripts/materialize/js/materialize.min.js"/>
    </body>
</html>