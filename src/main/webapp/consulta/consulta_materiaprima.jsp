<%-- 
    Document   : consulta_materiaprima
    Created on : 31/03/2019, 20:26:49
    Author     : manasses
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
        <script type="text/javascript" src="../js/jquery-3.3.0.min.js"></script>
        <link type="text/css" rel="stylesheet" href="../scripts/materialize/css/materialize.css" media="screen,projection"/>
        <link type="text/css" rel="stylesheet" href="../css/materia_prima.css" media="screen,projection"/>
        <link type="text/css" rel="stylesheet" href="../css/estilo.css" media="screen,projection"/>
        <script type="text/javascript" src="../js/consulta.js"></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <title>Consulta Materia Prima</title>
    </head>
    <body>
        <header>
            <nav>
                <div class="nav-wrapper center-align title">
                    Consulta Materia Prima
                    <a href="../menu.jsp" class="brand-logo right large material-icons">home</a>
                </div>
            </nav>
        </header>
        <div class="row">
            <main class="col s12">
                <div class="col s12">
                    <label for="descricao">Descrição:</label>
                    <input type="text" id="descricao" class="validate">
                </div>
                <div class="col s8">
                    <label>Codigo:</label>
                    <input type="text" id="codigo" class="validate" data-length="10">
                </div>
                <div class="col s4">
                    <label>Unidade de Compra:</label>
                    <select id="unidade_compra" class="browser-default">
                        <option value="" disabled selected>Selecione</option>
                        <option value="kilo">Kilo</option>
                        <option value="litro">Litro</option>
                    </select>
                </div>            
                <div class="col s12 center-align">
                    <button class="btn" onclick="carregarListMateriaPrima()">Pesquisar</button>
                </div>
            </main>
        </div>
        <div class="divider"></div>
        <table id="materia_prima" class="striped">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Descrição</th>
                    <th>Unidade de Compra</th>
                    <th>Valor</th>
                </tr>
            </thead>
            <tbody id="tabela_materia_prima">
            </tbody>
        </table>
        <script type="text/javascript" src="../js/materia_prima.js"></script>
        <script type="text/javascript" src="../scripts/materialize/js/materialize.min.js"/>
    </body>
</html>
