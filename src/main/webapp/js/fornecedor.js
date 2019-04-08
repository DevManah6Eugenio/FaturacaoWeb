var botaoAdicionar = document.querySelector("#pesquisar");

botaoAdicionar.addEventListener("click", function () {
    var xhr = new XMLHttpRequest();
    
    xhr.open("POST", "../FornecedorControlador?acao=listar");

    xhr.addEventListener("load", function () {
        
        if (xhr.status === 200) {
            var resposta = xhr.responseText;
            
            var fornecedor = JSON.parse(resposta);

            fornecedor.forEach(function (fornecedor) {
                adicionarNaTabela(fornecedor);
            });
        } else {
            alert("erro");
        }
    });
    xhr.send();
});

function adicionarNaTabela(fornecedor) {
    console.log(fornecedor);
}