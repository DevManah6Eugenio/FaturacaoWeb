<%-- 
    Document   : consulta_produto
    Created on : 31/03/2019, 20:26:26
    Author     : manasses
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="bo" class="br.com.faturacao.bo.MateriaPrimaBO"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <script type="text/javascript" src="../jquery/jquery-3.3.0.min.js"></script>
        <script type="text/javascript" src="../jquery/jquery.mask.min.js"></script>
        <script type="text/javascript" src="../js/produto.js"></script>
        <link type="text/css" rel="stylesheet" href="../scripts/materialize/css/materialize.css" media="screen,projection"/>
        <link type="text/css" rel="stylesheet" href="../css/estilo.css" media="screen,projection"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <title>Consulta Produto</title>
    </head>
    <body>
        <header>
            <nav>
                <div class="nav-wrapper center-align title">
                    Consulta Produto
                    <a href="../menu.jsp" class="brand-logo right large material-icons">home</a>
                </div>
            </nav>
        </header>
        <div class="row">
            <main class="col s12">
                <div class="col s12">
                    <div class="col s6 input-field">
                        <label>Codigo</label>
                        <input type="text" name="codigo" maxlength="20">
                    </div>
                </div>
                <div class="col s12">
                    <div class="col s6 input-field">
                        <label>Descrição</label>
                        <input type="text" name="descricao" maxlength="40">
                    </div>
                </div>
                <div class="col s12">
                    <div class="col s6">
                        <label>Materia Prima:</label>
                        <select name="ids_materia_prima" class="browser-default" id="ids_materia_prima">
                            <option value="" disabled selected>Selecione</option>
                            <c:forEach var="materiaPrima" items="${bo.listarTodos()}">
                                <option value="${materiaPrima.id}">
                                    ${materiaPrima.nome}
                                </option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="col s12 center-align">
                    <button class="btn" onclick="carregarProduto()">Pesquisar</button>
                </div>
            </main>
        </div>
        <div class="divider"></div>
        <table id="produto" class="striped">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Descrição</th>
                </tr>
            </thead>
            <tbody id="tabela_produto">
            </tbody>
        </table>
        <script type="text/javascript" src="../scripts/materialize/js/materialize.js"></script>
    </body>
</html>
