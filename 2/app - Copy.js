let numeroAleatorio = gerarNumeroAleatorio();
let tentativas = 1;

function exibirTextoNaTela(tag, texto) {
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
}

mensagemInicial()
function mensagemInicial() {
    exibirTextoNaTela('h1', 'Jogo do número secreto!');
    exibirTextoNaTela('p', 'Escolha um número entre 1 e 10 BALEIA!');
}


function verificarChute() {
    let chute = document.querySelector('input').value;
    if (chute == numeroAleatorio) {
        if (tentativas == 1) {
            exibirTextoNaTela('h1', 'PARABÉNS EDMEIA GORDA, MAMUTE');
            exibirTextoNaTela('p', `Você descobriu o fucking number da sorte com apenas ${tentativas} tentativa!`);
        } else {
                exibirTextoNaTela('h1', 'PARABÉNS EDMEIA GORDA, MAMUTE');
                exibirTextoNaTela('p', `Você descobriu o fucking number da sorte com apenas ${tentativas} tentativas!`);
        }
    document.getElementById('reiniciar').removeAttribute('Disabled');


    } else { 
        if (chute > numeroAleatorio) {
            exibirTextoNaTela('h1', 'O numero é MENOR sua BURRA');
            tentativas++;
    } else {
            exibirTextoNaTela('h1', 'O numero é MAIOR sua GORDA!');
            tentativas++
    }1
        
    }

    limparChute();
}

function limparChute() {
    chute = document.querySelector('input');
    chute.value = '';
}

function gerarNumeroAleatorio() {
    return parseInt(Math.random() * 10 + 1);
}



function novoJogo() {
    limparChute();
    numeroAleatorio = gerarNumeroAleatorio();
    mensagemInicial()
    tentativas = 1;
    document.getElementById('reiniciar').setAttribute('disabled', true)
}





let numeroAleatorio = parseInt(prompt('Digite um número aleatório'))
console.log(numeroAleatorio)
let testeFatorial = fatorial(numeroAleatorio)
console.log(testeFatorial)

function fatorial(numeroBase) {
    let resultadoFatorial = 1;
    while (numeroBase != 0) {
        resultadoFatorial = resultadoFatorial * numeroBase;
        numeroBase = numeroBase -1
    
    }
    return resultadoFatorial
}






let cotacaoDolar = 4.8

console.log(`R$ ${converter(4)}`)



function converter (valorDolar) {
    let valorCovertido = cotacaoDolar * valorDolar
    return valorCovertido
}





console.log(perimetro(3,5))

function perimetro (altura, largura) {
    const calcArea = altura * largura;
    const calcPer = 2 * (altura + largura);
    const calcTotal = (`Area: ${calcArea} e Perímetro: ${calcPer}`);
    return calcTotal;
}





calcAreaEPerimetro(3)
function calcAreaEPerimetro (raio) {
    const pi = 3.14;
    let area = pi * (raio * raio);
    let perimetro = 2 * pi * raio;

    console.log(`A área é ${area} e o perímetro é ${perimetro}`);

    
}





tabuada(2)
    

function tabuada(numeroBase) {
    let numeroInicial = 1;
    while(numeroInicial < 11){
    let resultadoTabuada = numeroBase * numeroInicial;
    console.log(`${numeroBase} * ${numeroInicial} = ${resultadoTabuada}`);
    numeroInicial = numeroInicial + 1;
    }

}