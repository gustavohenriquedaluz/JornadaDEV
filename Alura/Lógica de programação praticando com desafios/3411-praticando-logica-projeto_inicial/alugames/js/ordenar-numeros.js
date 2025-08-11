let numeroUm = parseInt(prompt('Digite o primeiro número de 3!'));
let numeroDois = parseInt(prompt('Digite o segundo número de 3!'));
let numeroTres = parseInt(prompt('Digite o terceiro número de 3!'));
let listaOriginal = [];
listaOriginal.push(numeroUm, numeroDois, numeroTres)
console.log(numeroUm, numeroDois, numeroTres);

console.log(listaOriginal);

listaOriginal.sort((a, b) => a - b);

console.log(listaOriginal);