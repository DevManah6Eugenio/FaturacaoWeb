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
        <script type="text/javascript" src="../js/consulta.js"></script>
        <title>Consulta Materia Prima</title>
    </head>
    <body>
        <header>
            <nav>
                <div class="nav-wrapper center-align title">
                    Consulta Materia Prima
                </div>
            </nav>
        </header>
        <div class="row">
            <main class="col s12">
                <div class="col s12">
                    <label for="descricao">Descrição:</label>
                    <input type="text" name="descricao" class="validate">
                </div>
                <div class="col s8">
                    <label>Codigo:</label>
                    <input type="text" name="codigo" class="validate" data-length="10">
                </div>
                <div class="col s4">
                    <label>Unidade de Compra:</label>
                    <select name="unidade_compra" class="browser-default">
                        <option value="" disabled selected>Selecione</option>
                        <option value="kl">Kilo</option>
                        <option value="lt">Litro</option>
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
            <tbody id="tabela-pacientes">
                <tr class="paciente" id="quinto-paciente">
                    <td class="info-codigo">12121212d</td>
                    <td class="info-descricao">Materia prima teste</td>
                    <td class="info-unidade_compra">kilo</td>
                    <td class="info-valor">19.09</td>
                </tr>
            </tbody>
        </table>
        <script type="text/javascript" src="../js/materia_prima.js"></script>
        <script type="text/javascript" src="../scripts/materialize/js/materialize.min.js"/>
    </body>
</html>
