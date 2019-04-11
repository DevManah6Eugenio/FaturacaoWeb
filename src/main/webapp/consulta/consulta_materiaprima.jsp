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
        <script type="text/javascript" src="../js/jquery-3.3.0.min.js"/>
        <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css"/>
        <script type="text/javascript" src="./bootstrap/js/bootstrap.min.js"/>
        <title>Consulta Materia Prima</title>
    </head>
    <body>
        <header>
            <div class="container">
                <h1 class="titulo">Consulta Materia Prima</h1>
            </div>
        </header>

        <main>
            <label>Codigo:</label>
            <input type="text" id="codigo">
            <label>Descrição:</label>
            <input type="text" id="descricao">
            <label>Unidade de Compra:</label>
            <select id="unidade_compra">
                <option value="sel">Selecione</option>
                <option value="kl">Kilo</option>
                <option value="lt">Litro</option>
            </select>            
            <button id="pesquisar" name="pesquisar">pesquisar</button>
        </main>
        <table id="materia_prima">
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
                    <td class="info-codigo">Tatiana</td>
                    <td class="info-descricao">46</td>
                    <td class="info-unidade_compra">1.55</td>
                    <td class="info-valor">19</td>
                </tr>
            </tbody>
        </table>
        <script src="../js/materia_prima.js" type="text/javascript"></script>
    </body>
</html>
