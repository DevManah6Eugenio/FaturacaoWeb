<%-- 
    Document   : cad_formulacao
    Created on : 29/03/2019, 13:49:48
    Author     : manases
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <script type="text/javascript" src="../js/jquery-3.3.0.min.js"></script>
        <link type="text/css" rel="stylesheet" href="../scripts/materialize/css/materialize.css" media="screen,projection"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="../css/estilo.css" media="screen,projection"/>
        <title>Cadastro Formulação</title>
    </head>
    <body>
        <header>
            <nav>
                <div class="nav-wrapper center-align title">
                    Formulação
                    <a href="../menu.jsp" class="brand-logo right large material-icons">home</a>
                </div>
            </nav>
        </header>
        <div class="row">
            <form action="FormulacaoControlador" method="post">
                <input type="hidden" name="acao" value="cadastrar">
                <input type="hidden" name="id">
                <div class="col s12">
                    <label>Qtd. Estimada Produzida:</label>
                    <input type="text" name="qtd_estimada_produzida">
                </div>
                <div class="col s12">
                    <label>ICMS:</label>
                    <input type="text" name="icm">
                </div>
                <div class="col s12">
                    <label>PIS:</label>
                    <input type="text" name="pis">
                </div>
                <div class="col s12">
                    <label>CONFIS:</label>
                    <input type="text" name="confis">
                </div>
                <div class="col s12">
                    <label>Comissão:</label>
                    <input type="text" name="comissao">
                </div> 
                <div class="col s12">
                    <label>Margem de Lucro:</label>
                    <input type="text" name="margem_lucro">
                </div> 
                <div class="col s12">
                    <label>Despesa Fixa:</label>
                    <input type="text" name="despesa_fixa">
                </div>                 
                <div class="col s12">
                    <label>Outros Descontos:</label>
                    <input type="text" name="outros_descontos">
                </div>                
                <div class="col s12">
                    <label>Custo Estimado:</label>
                    <input type="text" name="custo_estimado">
                </div> 
                <div class="col s12">
                    <label>Observação:</label>
                    <input type="text" name="observacao">
                </div> 
                <div class="col s12">
                    <label>Valor Venda:</label>
                    <input type="text" name="valor_venda">
                </div> 
                <div class="col s12 center-align">
                    <button class="btn" onclick="salvar();">Salvar</button>
                </div>
            </form>
        </div>
        <script type="text/javascript" src="../scripts/materialize/js/materialize.js"/>
    </body>
</html>