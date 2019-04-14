var botaoAdicionar = document.querySelector("#pesquisar");

botaoAdicionar.addEventListener("click", function () {
    var xhr = new XMLHttpRequest();
    
    xhr.open("GET", "../FormulacaoControlador?acao=listar");

    xhr.addEventListener("load", function () {
        
        if (xhr.status === 200) {
            var resposta = xhr.responseText;
            
            var formulacao = JSON.parse(resposta);

            formulacao.forEach(function (formulacao) {
                adicionarNaTabela(formulacao);
            });
        } else {
            alert("erro");
        }
    });
    xhr.send();
});

function adicionarNaTabela(formulacao) {
    console.log(formulacao);
}