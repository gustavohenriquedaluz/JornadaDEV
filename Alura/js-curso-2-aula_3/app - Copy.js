

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











let listaDeNumerosSorteados = [];
let numerosMaximos = 3
let numeroSecreto = gerarNumeroAleatorio();
let tentativas = 1;

function exibirTextoNaTela(tag, texto) {
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
}

function exibirMensagemInicial() {
    exibirTextoNaTela('h1', 'Jogo do número secreto');
    exibirTextoNaTela('p', 'Escolha um número entre 1 e 10');
}

exibirMensagemInicial();

function verificarChute() {
    let chute = document.querySelector('input').value;
    
    if (chute == numeroSecreto) {
        exibirTextoNaTela('h1', 'Acertou!');
        let palavraTentativa = tentativas > 1 ? 'tentativas' : 'tentativa';
        let mensagemTentativas = `Você descobriu o número secreto com ${tentativas} ${palavraTentativa}!`;
        exibirTextoNaTela('p', mensagemTentativas);
        document.getElementById('reiniciar').removeAttribute('disabled');
    } else {
        if (chute > numeroSecreto) {
            exibirTextoNaTela('p', 'O número secreto é menor');
        } else {
            exibirTextoNaTela('p', 'O número secreto é maior');
        }
        tentativas++;
        limparCampo();
    }
}

function gerarNumeroAleatorio() {
    let numeroEscolhido = parseInt(Math.random() * numerosMaximos + 1);
    let quantidadeDeElementosNaLista = listaDeNumerosSorteados.length;
    if (quantidadeDeElementosNaLista == numerosMaximos) {
        listaDeNumerosSorteados = [];        
    }


    if (listaDeNumerosSorteados.includes(numeroEscolhido)) {
        return gerarNumeroAleatorio();
    } else {
        listaDeNumerosSorteados.push(numeroEscolhido);
        console.log(listaDeNumerosSorteados);
        return numeroEscolhido;
    }
}

function limparCampo() {
    chute = document.querySelector('input');
    chute.value = '';
}

function reiniciarJogo() {
    numeroSecreto = gerarNumeroAleatorio();
    limparCampo();
    tentativas = 1;
    exibirMensagemInicial();
    document.getElementById('reiniciar').setAttribute('disabled', true)
}












let listaGenerica = [];



let linguagensDeProgramacão = ['JavaScript','C','C++','Kotlin','Python'];
console.log(linguagensDeProgramacão);
linguagensDeProgramacão.push('Java','Ruby','GoLang');
console.log(linguagensDeProgramacão);



let nomes = ['Gustavo','Henrique','da Luz'];
console.log(nomes[0])
console.log(nomes[1])
console.log(nomes[2])