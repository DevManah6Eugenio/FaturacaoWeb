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
        <script type="text/javascript" src="../jquery/jquery-3.3.0.min.js"></script>
        <script type="text/javascript" src="../jquery/jquery.mask.min.js"></script>
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
            <form action="../FormulacaoControlador" method="post">
                <input type="hidden" name="acao" value="cadastrar">
                <input type="hidden" name="id">
                <input type="hidden" name="cod_tela_consulta" value="103">
                <div class="col s12">
                    <div class="col s2 input-field">
                        <input type="text" name="custo_estimado" maxlength="10">
                        <label>Custo Estimado:</label>
                    </div>
                </div>
                <div class="col s12">
                    <div class="col s6 input-field">
                        <input type="text" name="observacao" maxlength="40">
                        <label>Observação:</label>
                    </div> 
                </div>
                <div class="col s12">
                    <div class="col s3 input-field">
                        <input type="text" name="valor_venda" maxlength="10">
                        <label>Valor Venda:</label>
                    </div>
                </div>
                <div class="col s12">
                    <div class="col s3 input-field">
                        <input type="text" name="qtd_estimada_produzida" maxlength="10">
                        <label>Qtd. Estimada Produzida:</label>
                    </div>
                </div>
                <div class="row">
                    <div class="col s12">
                        <ul class="tabs">
                            <li class="tab col s6">
                                <a href="#impostos">Impostos</a>
                            </li>
                            <li class="tab col s6">
                                <a href="#produtos">Produtos</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div id="impostos">
                    <div class="col s6">
                        <div class="col s4 input-field">
                            <input type="text" name="icm" maxlength="10">
                            <label>ICMS:</label>
                        </div>
                    </div>
                    <div class="col s6">
                        <div class="col s4 input-field">
                            <input type="text" name="pis" maxlength="10">
                            <label>PIS:</label>
                        </div>
                    </div>
                    <div class="col s6">
                        <div class="col s4 input-field">
                            <input type="text" name="confis" maxlength="10">
                            <label>CONFIS:</label>
                        </div>
                    </div>
                    <div class="col s6">
                        <div class="col s4 input-field">
                            <input type="text" name="comissao" maxlength="10">
                            <label>Comissão:</label>
                        </div> 
                    </div>
                    <div class="col s6">
                        <div class="col s4 input-field">
                            <input type="text" name="margem_lucro" maxlength="10">
                            <label>Margem de Lucro:</label>
                        </div> 
                    </div>
                    <div class="col s6">
                        <div class="col s4 input-field">
                            <input type="text" name="despesa_fixa" maxlength="10">
                            <label>Despesa Fixa:</label>
                        </div>
                    </div>
                    <div class="col s6">
                        <div class="col s4 input-field">
                            <input type="text" name="outros_descontos" maxlength="10">
                            <label>Outros Descontos:</label>
                        </div>
                    </div>
                </div>
                <div id="produtos">
                    <table>

                    </table>
                </div>
                <div class="col s12 center-align">
                    <button class="btn" onclick="salvar();">Salvar</button>
                </div>
            </form>
        </div>
        <script type="text/javascript" src="../scripts/materialize/js/materialize.js"></script>
        <script type="text/javascript" src="../js/formulacao.js"></script>
    </body>
</html>