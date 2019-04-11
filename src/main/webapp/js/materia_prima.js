var botaoAdicionar = document.querySelector("#pesquisar");
var qtdDom = 0;

botaoAdicionar.addEventListener("click", function () {
    var xhr = new XMLHttpRequest();
    
    xhr.open("GET", "../MateriaPrimaControlador?acao=listar" + 
            "&codigo=" + document.querySelector("#codigo").value +
            "&descricao=" + document.querySelector("#descricao").value +
            "&unidade_compra=" + document.querySelector("#unidade_compra").value +
            "&id_materia_prima=" +
            "&valor=");

    xhr.addEventListener("load", function () {      
        if (xhr.status === 200) {
            var resposta = xhr.responseText;
            var listaMateriaPrima = JSON.parse(resposta);
            listaMateriaPrima["vector"][0]["br.com.faturacao.models.MateriaPrima"].forEach(function (materia) {
                adicionarNaTabela(materia);
            });
        } else {
            alert("Ocorreu um erro durante o corregamento");
        }
    });
    xhr.send();
});

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