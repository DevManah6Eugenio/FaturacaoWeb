var qtdDomMateriPrima = 1;

document.addEventListener('DOMContentLoaded', function () {
    let elems = document.querySelectorAll('.modal');
    var options;
    let instances = M.Modal.init(elems, options);
});

$(document).ready(function () {
    $('.modal').modal();
});

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

function adicionarNaTabelaDomMateriaPrima(materiaPrima) {

    let tabela = document.querySelector("#tabela_materia_prima");
    let materiaTr = document.createElement("tr");

    let _input_id = document.createElement("input");
    _input_id.setAttribute("type", "hidden");
    _input_id.setAttribute("id", "id_materia_prima_" + qtdDomMateriPrima);

    let _checkboxDom = document.createElement("input");
    _checkboxDom.setAttribute("type", "checkbox");
    _checkboxDom.setAttribute("class", "filled-in");
    _checkboxDom.setAttribute("id", "checkboxDom_" + qtdDomMateriPrima);

    let _td_nome = document.createElement("td");
    _td_nome.setAttribute("id", "nome_" + qtdDomMateriPrima);

    let _td_checkboxDom = document.createElement("td");
    _td_checkboxDom.setAttribute("id", "td_checkboxDom" + qtdDomMateriPrima);

    _input_id.setAttribute("value", materiaPrima.id);
    _td_nome.textContent = materiaPrima.nome;

    let _label = document.createElement("label");
    _label.appendChild(_checkboxDom);
    _label.appendChild(document.createElement("span"));

    _td_checkboxDom.appendChild(_label);
    _td_checkboxDom.appendChild(_input_id);

    materiaTr.appendChild(_td_checkboxDom);
    materiaTr.appendChild(_td_nome);

    tabela.appendChild(materiaTr);
    qtdDomMateriPrima++;
}

function adicionarMateriaPrimaForm() {
    let json = [];

    for (let i = 1; i < qtdDomMateriPrima; i++) {
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
    let inputs = $('.chip input');
    let idsMateriaPrima = "";

    for (let i = 0; i < inputs.length; i++) {
        if (idsMateriaPrima === "") {
            idsMateriaPrima = inputs[i].value;
        } else {
            idsMateriaPrima += "," + inputs[i].value;
        }
    }

    $('#ids_materia_prima')[0].value = idsMateriaPrima;
}