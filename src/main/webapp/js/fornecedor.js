var qtdDomMateriPrima = 1;
var qtdDom = 1;

document.addEventListener('DOMContentLoaded', function () {
    var elems = document.querySelectorAll('.modal');
    var instances = M.Modal.init(elems, options);
});

$(document).ready(function () {
    $('.modal').modal();
});

function adicionarNaTabelaDomMateriaPrima(materiaPrima) {

    var tabela = document.querySelector("#tabela_materia_prima");
    var materiaTr = document.createElement("tr");

    var _input_id = document.createElement("input");
    _input_id.setAttribute("type", "hidden");
    _input_id.setAttribute("id", "id_materia_prima_" + qtdDomMateriPrima);

    var _checkboxDom = document.createElement("input");
    _checkboxDom.setAttribute("type", "checkbox");
    _checkboxDom.setAttribute("class", "filled-in");
    _checkboxDom.setAttribute("id", "checkboxDom_" + qtdDomMateriPrima);

    var _td_nome = document.createElement("td");
    _td_nome.setAttribute("id", "nome_" + qtdDomMateriPrima);

    var _td_checkboxDom = document.createElement("td");
    _td_checkboxDom.setAttribute("id", "td_checkboxDom" + qtdDomMateriPrima);

    _input_id.setAttribute("value", materiaPrima.id);
    _td_nome.textContent = materiaPrima.nome;

    var _label = document.createElement("label");
    _label.appendChild(_checkboxDom);
    _label.appendChild(document.createElement("span"));

    _td_checkboxDom.appendChild(_label);
    _td_checkboxDom.appendChild(_input_id);

    materiaTr.appendChild(_td_checkboxDom);
    materiaTr.appendChild(_td_nome);

    tabela.appendChild(materiaTr);
    qtdDomMateriPrima++;
}

function carregarMateriaPrima() {
    jQuery.ajax({
        url: '../MateriaPrimaControlador',
        type: 'GET',
        async: false,
        data: {
            'acao': 'listar',
            'codigo': '',
            'descricao': $("#pesquisar_materia_prima")[0].value,
            'unidade_compra': '',
            'id_materia_prima': '',
            'valor': ''
        },
        success: function (data, textStatus, jqXHR) {
            $("#tabela_materia_prima tr").remove();

            if (data) {
                data = JSON.parse(data);
                qtdDomMateriPrima = 1;
                if (data["vector"][0]["MateriaPrima"][0]) {
                    data["vector"][0]["MateriaPrima"].forEach(function (materia) {
                        adicionarNaTabelaDomMateriaPrima(materia);
                    });
                } else {
                    adicionarNaTabelaDomMateriaPrima(data["vector"][0]["MateriaPrima"]);
                }
            }
        }
    });
}

function adicionarMateriaPrimaForm() {
    var json = [];

    for (var i = 1; i < qtdDomMateriPrima; i++) {
        if (document.querySelector('#checkboxDom_' + i).checked) {
            json.push({
                'tag': document.querySelector('#nome_' + i).innerText,
                'value': document.querySelector('#id_materia_prima_' + i).value
            });
        }
    }

    if (json) {
        $('.chips-initial').chips({
            data: json
        });
    }
    $("#tabela_materia_prima tr").remove();
}

function salvar() {
    var inputs = $('.chip input');
    var idsMateriaPrima = "";

    for (var i = 0; i < inputs.length; i++) {
        if (idsMateriaPrima === "") {
            idsMateriaPrima = inputs[i].value;
        } else {
            idsMateriaPrima += "," + inputs[i].value;
        }
    }

    $('#ids_materia_prima')[0].value = idsMateriaPrima;
}

function adicionarNaTabela(fornecedor){
    console.log(fornecedor);
    var tabela = document.querySelector("#tabela_fornecedor");
    var fornecedorTr = document.createElement("tr");
    
    var _input_id = document.createElement("input");
    _input_id.setAttribute("type", "hidden");
    _input_id.setAttribute("id", "id_fornecedor_" + qtdDom);
    _input_id.setAttribute("value", fornecedor.cpf);

    var _td_cnpj = document.createElement("td");
    _td_cnpj.setAttribute("id", "cnpj_" + qtdDom);
    var _td_empresa = document.createElement("td");
    _td_empresa.setAttribute("id", "empresa_" + qtdDom);    
    var _td_representante = document.createElement("td");
    _td_representante.setAttribute("id", "representante_" + qtdDom);
    var _td_fone = document.createElement("td");
    _td_fone.setAttribute("id", "fone_" + qtdDom);
    
    var _td_edit = document.createElement("td");
    _td_edit.setAttribute("id", "edit_" + qtdDom);
    _td_edit.setAttribute("class", "col s1");

    _td_cnpj.textContent = fornecedor.cpf;
    _td_empresa.textContent = fornecedor.empresa;
    _td_representante.textContent = fornecedor.nomeRepresentante;
    _td_fone.textContent = fornecedor.telefone1 + ' / ' + fornecedor.telefone2;

    _iconEdit = document.createElement('i');
    _iconEdit.setAttribute('class', 'small material-icons');
    _iconEdit.textContent = 'edit';
    _iconEdit.setAttribute("onclick", "carregarEditar(" + fornecedor.cpf + ")");

    _td_edit.appendChild(_iconEdit);
    _td_cnpj.appendChild(_input_id);
    fornecedorTr.appendChild(_td_cnpj);
    fornecedorTr.appendChild(_td_empresa);
    fornecedorTr.appendChild(_td_representante);
    fornecedorTr.appendChild(_td_fone);
    fornecedorTr.appendChild(_td_edit);

    tabela.appendChild(fornecedorTr);
    qtdDom++;
}

function carregarListFornecedor() {
    jQuery.ajax({
        url: '../FornecedorControlador',
        type: 'GET',
        async: false,
        data: {
            'acao': 'listar',
            'cnpj': '',
            'email': '',
            'empresa': '',
            'representante': '',
            'telefone01': '',
            'telefone02': '',
            'ids_materia_prima': ''
        },
        success: function (data, textStatus, jqXHR) {

            if (data) {
                data = JSON.parse(data);
                if (data["vector"][0]["Fornecedor"][0]) {
                    data["vector"][0]["Fornecedor"].forEach(function (fornecedor) {
                        adicionarNaTabela(fornecedor);
                    });
                } else {
                    adicionarNaTabela(data["vector"][0]["Fornecedor"]);
                }
            }
        }
    });
}

function carregarEditar(cnpj) {
    alert(cnpj);
}