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
        <link type="text/css" rel="stylesheet" href="../css/estilo.css" media="screen,projection"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <title>Cadastro Produto</title>
    </head>
    <body>
        <header>
            <nav>
                <div class="nav-wrapper center-align title">
                    Produto
                    <a href="../menu.jsp" class="brand-logo right large material-icons">home</a>
                </div>
            </nav>
        </header>
        <form action="../ProdutoControlador" method="post">
            <div class="row"> 
                <input type="hidden" name="acao" value="cadastrar">
                <input type="hidden" name="cod_tela_consulta" value="100">
                <input type="hidden" name="id">
                <div class="col s12">
                    <label>Codigo</label>
                    <input type="text" name="codigo">
                </div>
                <div class="col s12">
                    <label>Descrição</label>
                    <input type="text" name="descricao">
                </div>
                <div id="dom_materia_prima">
                    <div class="col s11">
                        <label>Materia Prima:</label>
                        <div class="chips chips-initial">

                        </div>
                    </div>
                    <div class="col s1" id="btn-adicionar-materia-prima">
                        <a href="#modal-materia-prima" class="btn-floating modal-trigger">
                            <i class="material-icons">add</i>
                        </a>
                    </div>
                    <input type="hidden" name="ids_materia_prima" id="ids_materia_prima" >
                    <div class="modal" id="modal-materia-prima">
                        <div class="modal-content">
                            <h4>Materia Prima</h4>
                            <div class="row">
                                <div class="col s11">
                                    <input type="text" class="materialize-textarea" id="pesquisar_materia_prima" placeholder="Descrição Materia Prima">
                                </div>
                                <div class="col s1">
                                    <a href="#" class="prefix large  material-icons" onclick="carregarMateriaPrima();">search</a>
                                </div>
                                <div class="col s12">
                                    <table id="materia_prima" class="responsive-table">
                                        <thead>
                                            <tr>
                                                <th>
                                                    <label>
                                                        <input type="checkbox" class="filled-in"/>
                                                        <span></span>
                                                    </label>
                                                </th>
                                                <th>
                                                    Descrição
                                                </th>
                                            </tr>
                                        </thead>
                                        <tbody id="tabela_materia_prima">
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <a class="btn modal-close">Sair</a>
                            <a class="btn modal-close" onclick="adicionarMateriaPrimaForm();">Adicionar</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col s12 center-align">
                <button class="btn" onclick="salvar()">Salvar</button>
            </div>
        </div>
    </form>
    <script type="text/javascript" src="../scripts/materialize/js/materialize.js"></script>
    <script type="text/javascript" src="../js/produto.js"></script>
</body>
</html>
