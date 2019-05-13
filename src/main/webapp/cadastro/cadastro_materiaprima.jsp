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
        <script type="text/javascript" src="../jquery/jquery-3.3.0.min.js"></script>
        <script type="text/javascript" src="../jquery/jquery.mask.min.js"></script>
        <link type="text/css" rel="stylesheet" href="../scripts/materialize/css/materialize.css" media="screen,projection"/>
        <link type="text/css" rel="stylesheet" href="../css/materia_prima.css" media="screen,projection"/>
        <link type="text/css" rel="stylesheet" href="../css/estilo.css" media="screen,projection"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <title>Cadastro Materia Prima</title>
    </head>
    <body>
        <header>
            <nav>
                <div class="nav-wrapper center-align title">
                    Materia Prima
                    <a href="../menu.jsp" class="brand-logo right large material-icons">home</a>
                </div>
            </nav>
        </header>
        <div class="row">
            <form action="../MateriaPrimaControlador" method="post" class="col s12">
                <input type="hidden" name="acao" value="cadastrar">
                <input type="hidden" name="id_materia_prima">
                <input type="hidden" name="cod_tela_consulta" value="101">
                <div class="col s12">
                    <div class="col s6 input-field">
                        <input type="text" name="codigo" maxlength="10">
                        <label>Codigo:</label>
                    </div>
                </div>
                <div class="col s12">
                    <div class="col s6 input-field">
                        <input type="text" name="descricao" maxlength="40">
                         <label for="descricao">Descrição:</label>
                    </div>
                </div>
                <div class="col s12">
                    <div class="col s6 input-field">
                        <input type="number" name="valor" class="validate" max="9999">
                        <label for="valor">Valor:</label>
                    </div>
                </div>
                <div class="col s12">
                    <div class="col s6">
                        <label>Unidade de Compra:</label>
                        <select name="unidade_compra" class="browser-default">
                            <option value="" disabled selected>Selecione</option>
                            <option value="kilo">Kilo</option>
                            <option value="litro">Litro</option>
                        </select>
                    </div>
                </div>
                <div class="col s12 center-align">
                    <button class="btn">Salvar</button>
                </div>
            </form>
        </div>
        <script type="text/javascript" src="../scripts/materialize/js/materialize.js"></script>
    </body>
</html>