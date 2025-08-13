//Escreva um programa de calculadora simples com funções separadas para adição, subtração, 
// multiplicação e divisão. Utilize um bloco condicional para determinar qual função executar 
// com base em uma variável que representa a operação desejada.

let resultado = (operacao(2,'x',5))

if (typeof resultado === 'string') {
    console.log ('Revisar operador')
} else {
    console.log(resultado)
}


function operacao (n1,operador,n2) {


    if (operador == '+') { // soma
        return soma(n1,n2);
    } else if (operador == '-') {
        return subtração(n1,n2);
    } else if (operador == '/') {
        return divisão(n1,n2);
    } else if (operador == '*' || operador == 'x') {
        return multiplicação(n1,n2);
    } else {
        return 'Erro, operador inválido!'
    }
}


function soma(n1, n2) {
    return n1 + n2
}

function subtração(n1, n2) {
    return n1 - n2
}

function divisão(n1, n2) {
    return n1 / n2
}

function multiplicação(n1, n2) {
    return n1 * n2
}