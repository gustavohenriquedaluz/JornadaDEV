let palavra = prompt('Digite uma palavra para verificar se é um palíndromo!');
let listaImput = [];
let listaOutput = [];
let palavraInvertida;

let palavraSemEspaco = palavra.replace(/ /g, '');
let palavraTratada = palavraSemEspaco.toLowerCase();
listaImput = palavraTratada.split('');
listaOutput = listaImput.reverse('');
palavraInvertida = listaOutput.join('');

console.log(palavra)
console.log(palavraInvertida)

if (palavraTratada == palavraInvertida) {
    alert(`Parabéns, a palavra ${palavra} é um palíndromo!`)
} else {
    alert(`A palavra ${palavra} não é um palíndromo!`)
}