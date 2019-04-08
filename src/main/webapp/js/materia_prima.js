var botaoAdicionar = document.querySelector("#pesquisar");

botaoAdicionar.addEventListener("click", function () {
    var xhr = new XMLHttpRequest();
    
    xhr.open("POST", "../MateriaPrimaControlador?acao=listar" + 
            "&codigo=" + document.querySelector("#codigo").value +
            "&descricao=" + document.querySelector("#descricao").value +
            "&unidade_compra=" + document.querySelector("#unidade_compra").value +
            "&id_materia_prima=" +
            "&valor=");

    xhr.addEventListener("load", function () {
        
        if (xhr.status === 200) {
            var resposta = xhr.responseText;
            
            alert("reposta: " + resposta);
            
            var materiaPrima = JSON.parse(resposta);

            materiaPrima.forEach(function (materia) {
                adicionarNaTabela(materia);
            });
        } else {
            alert("erro");
        }
    });
    xhr.send();
});

function adicionarNaTabela(materiaPrima) {
    console.log(materiaPrima);
}