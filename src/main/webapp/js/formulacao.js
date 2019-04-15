var qtdDomProduto = 1;
var qtdDom = 1;

document.addEventListener('DOMContentLoaded', function () {
    var elems = document.querySelectorAll('.modal');
    var instances = M.Modal.init(elems, options);
});

$(document).ready(function () {
    $('.modal').modal();
});

$(document).ready(function (){
   $('ul.tabs').tabs(); 
});