var qtdDom = 1;

function adicionarNaTabela(materiaPrima) {
    var tabela = document.querySelector("#tabela_materia_prima");
    var materiaTr = document.createElement("tr");

    var _input_id = document.createElement("input");
    _input_id.setAttribute("type", "hidden");
    _input_id.setAttribute("id", "id_materia_prima_" + qtdDom);

    var _td_codigo = document.createElement("td");
    _td_codigo.setAttribute("id", "codigo_" + qtdDom);
    var _td_nome = document.createElement("td");
    _td_nome.setAttribute("id", "nome_" + qtdDom);
    var _td_unidade_compra = document.createElement("td");
    _td_unidade_compra.setAttribute("id", "unidade_compra_" + qtdDom);
    var _td_valor = document.createElement("td");
    _td_valor.setAttribute("id", "valor_" + qtdDom);
    var _td_edit = document.createElement("td");
    _td_edit.setAttribute("id", "edit_" + qtdDom);
    _td_edit.setAttribute("class", "col s1");

    _input_id.setAttribute("value", materiaPrima.id);
    _td_codigo.textContent = materiaPrima.codigo;
    _td_nome.textContent = materiaPrima.nome;
    _td_unidade_compra.textContent = materiaPrima.unidadeCompra;
    _td_valor.textContent = materiaPrima.valor;

    _iconEdit = document.createElement('i');
    _iconEdit.setAttribute('class', 'small material-icons');
    _iconEdit.textContent = 'edit';
    _iconEdit.setAttribute("onclick", "carregarEditar(" + materiaPrima.id + ")");

    _td_edit.appendChild(_iconEdit);
    _td_codigo.appendChild(_input_id);
    materiaTr.appendChild(_td_codigo);
    materiaTr.appendChild(_td_codigo);
    materiaTr.appendChild(_td_nome);
    materiaTr.appendChild(_td_unidade_compra);
    materiaTr.appendChild(_td_valor);
    materiaTr.appendChild(_td_edit);

    tabela.appendChild(materiaTr);
    qtdDom++;
}

function carregarListMateriaPrima() {
    jQuery.ajax({
        url: '../MateriaPrimaControlador',
        type: 'GET',
        async: false,
        data: {
            'acao': 'listar',
            'codigo': $("#codigo")[0].value,
            'descricao': $("#descricao")[0].value,
            'unidade_compra': $("#unidade_compra")[0].value,
            'id_materia_prima': '',
            'valor': ''
        },
        success: function (data, textStatus, jqXHR) {
            $("#tabela_materia_prima tr").remove();

            if (data) {
                data = JSON.parse(data);
                if (data["vector"][0]["MateriaPrima"][0]) {
                    data["vector"][0]["MateriaPrima"].forEach(function (materia) {
                        console.log(materia);
                        adicionarNaTabela(materia);
                    });
                } else {
                    adicionarNaTabela(data["vector"][0]["MateriaPrima"]);
                }
            }
        }
    });
}

function carregarEditar(id) {
    alert(id);
}