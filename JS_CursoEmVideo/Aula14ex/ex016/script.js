var inicio = document.getElementById('inicio');
var fim = document.querySelector('input#fim');
var passo = document.querySelector('input#passo');
var res = document.querySelector('div#res');

function contar() {
    if (inicio.value.length == 0 || fim.value.length == 0) {
        res.innerHTML = '<strong> IMPOSSÍVEL CONTAR </strong>';
        return;
    }

    res.innerHTML = '<strong> Contando: </strong>';

    var numContagem = Number(inicio.value); // num inicio
    var passoCorreto = Number(passo.value);

    if (passo.value.length == 0 || passo.value == 0) {
        alert('Passo inválido, será considerado 1!')
        passoCorreto = 1;
    } 
    
    if (Number(inicio.value) < Number(fim.value)) {
        while (numContagem <= Number(fim.value)) {
        res.innerHTML += `${numContagem} &#128073`;
        numContagem = numContagem + passoCorreto; 
    }

    } else {
        while (numContagem >= Number(fim.value)) {
        res.innerHTML += `${numContagem} &#128073`;
        numContagem = numContagem - passoCorreto; 
    }


}

    res.innerHTML += `&#9872`;


}