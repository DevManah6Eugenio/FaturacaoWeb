var botaoAdicionar = document.querySelector("#pesquisar");
var qtdDom = 0;

function adicionarNaTabela(materiaPrima) {
    var tr = montarTr(materiaPrima);
    var tabela = document.querySelector("#materia_prima");
    tabela.appendChild(tr);
}

function montarTr(materiaPrima) {
    var materiaTr = document.createElement("tr");

    materiaTr.appendChild(montarTd(materiaPrima.id, "info-id"));
    materiaTr.appendChild(montarTd(materiaPrima.codigo, "info-codigo"));
    materiaTr.appendChild(montarTd(materiaPrima.nome, "info-nome"));
    materiaTr.appendChild(montarTd(materiaPrima.unidadeCompra, "info-unidadeCompra"));
    materiaTr.appendChild(montarTd(materiaPrima.valor, "info-valor"));

    return materiaTr;
}

function carregarListMateriaPrima(){
    jQuery.ajax({
        url: '../MateriaPrimaControlador',
        type: 'POST',
        async: false,
        data: {
            'acao': 'listar',
            'codigo': jQuery("#codigo").value,
            'descricao': jQuery("#descricao").value,
            'unidade_compra': jQuery("#unidade_compra").value,
            'id_materia_prima': '', 
            'valor': ''
        },
        success: function (data, textStatus, jqXHR) {
            if (data) {
                data = JSON.parse(data);

                jQuery.each(data["vector"][0]["br.com.faturacao.models.MateriaPrima"], function (index, materia) {
                    adicionarNaTabela(materia);
                });
            }
        }
    });
}