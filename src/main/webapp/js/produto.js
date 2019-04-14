var botaoAdicionar = document.querySelector("#pesquisar");

botaoAdicionar.addEventListener("click", function () {
    var xhr = new XMLHttpRequest();
    
    xhr.open("GET", "../ProdutoControlador?acao=listar");

    xhr.addEventListener("load", function () {
        
        if (xhr.status === 200) {
            var resposta = xhr.responseText;
            
            var produto = JSON.parse(resposta);

            produto.forEach(function (produto) {
                adicionarNaTabela(produto);
            });
        } else {
            alert("erro");
        }
    });
    xhr.send();
});

function adicionarNaTabela(produto) {
    console.log(produto);
}