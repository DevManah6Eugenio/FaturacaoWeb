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
        <title>Cadastro Materia Prima</title>
    </head>
    <body>
        <h1>Cadastro Materia Prima</h1>
        <form action="MateriaPrimaControlador" method="post">
            <input type="hidden" name="acao" value="cadastrar">
            <input type="hidden" name="id_materia_prima">
            <label>Codigo</label>
            <input type="text" name="codigo">
            <label>Descrição</label>
            <input type="text" name="descricao">
            <label>Unidade de Compra</label>
            <select name="unidade_compra">
                <option value="sel">Selecione</option>
                <option value="kl">Kilo</option>
                <option value="lt">Litro</option>
            </select>
            <label>Valor</label>
            <input type="number" name="valor">
            
            <button>Salvar</button>
        </form>
    </body>
</html>
