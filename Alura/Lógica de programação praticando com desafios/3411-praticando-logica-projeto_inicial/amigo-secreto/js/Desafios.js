console.log ('Desafio 1:') //Crie uma função que valide se um número é positivo, negativo ou zero.
let n = 1;

if (n == 0) {
    console.log('Zero')
} else if (n > 0) {
    console.log('Positivo')
} else {
    console.log('Negativo')
}

console.log ('Desafio 2:') //Implemente uma função que verifique se uma pessoa é maior de idade.


adulto(19)
function adulto(idade) {
    if (idade >= 18) {
        console.log('Maior de idade')
    } else {
        console.log('Menor de idade')
    }
 
}


console.log ('Desafio 3:') //Desenvolva uma função que valide se uma string é vazia ou não.


stringVazia('Cebola')
stringVazia('')
function stringVazia(texto) {
    if (texto == '') {
        console.log('String vazia')
    }   else {
        console.log('String preenchida')
    }


}

console.log ('Desafio 4:') //Crie uma função que determine se um ano é bissexto

anoBiss(366)
function anoBiss(diasAno) {
    if (diasAno > 365) {
        console.log('Ano bissexto')
    } else {
        console.log('Ano não bissexto')
    }

}

console.log ('Desafio 5:') //Implemente uma função que calcule a média de dois números, interrompendo a execução se algum dos números não for válido.


media(20, 'a')
function media(n1, n2) {
    if (typeof n1 != 'number' || typeof n2 != 'number') {
        console.log('Verificar dados, não é um número!')
        return
    }

    let media = (n1 + n2) / 2
    console.log(`A média entre ${n1} e ${n2} é ${media}`)


}

console.log ('Desafio 6:') // Desenvolva uma função que receba um array como parâmetro e retorne o seu tamanho.

let arrayDesafio6 = [1,2,3,4,5,6]

tamanhoArray(arrayDesafio6)

function tamanhoArray(array) {
    console.log(array.length)
}


console.log ('Desafio 7:') //Crie um array e utilize a função includes para verificar se um elemento específico está presente

let arrayDesafio7 = ['oi','bye','tchau','molesa','t-rex','bike']

console.log(arrayDesafio7.includes('bike'))
console.log(arrayDesafio7.includes('bikes'))


console.log ('Desafio 8:') // Implemente uma função que receba um array e um elemento, e retorne se o elemento está presente no array.

let arrayDesafio8 = [1,2,3,4,5,6]

testeIncludeArray(arrayDesafio8, 8)
testeIncludeArray(arrayDesafio8, 4)

function testeIncludeArray(array, elemento) {
    if (array.includes(elemento) == true) {
        console.log('Elemento está no array')
    } else {
        console.log('Não está no array')
    }


}


console.log ('Desafio 9:')  //Crie um array de strings e utilize includes para verificar se uma determinada string está presente.

let arrayDesafio9 = ['oi','bye','tchau','molesa','t-rex','bike']

console.log(arrayDesafio7.includes('bike'))
console.log(arrayDesafio7.includes('bikes'))

console.log ('Desafio 10:') // Desenvolva uma função que receba um array de objetos representando estudantes de um curso e um objeto que representa um estudante procurado. Depois retorne se o objeto está presente no array.

let arrayAluno = ['Caio', 'Felipe', 'Guilherme']

checarAluno(arrayAluno, 'Caio')
checarAluno(arrayAluno, 'Fernando')

function checarAluno (array, aluno) {
    if (array.includes(aluno) == true) {
        console.log('Aluno presente')
    } else {
        console.log('Aluno não está presente')
    }

}

console.log ('Desafio 11:') //Crie uma função que receba um array de números e retorne a soma dos elementos pares e o produto dos elementos ímpares.


let arrayDesafio11 = [1,2,3,4,5,6,7,8,9]


somaParProdutoImpar(arrayDesafio11)

function somaParProdutoImpar(array) {
let impar = []
let par = []



for (let index = 0; index < array.length; index++) {  // Separa par e impar e coloca nos arrays
    if (array[index] % 2 == 0) {
        par.push(array[index])
    } else {
        impar.push(array[index]);
    }   
}

let soma = 0
let produto = 1
console.log(impar)
console.log(par)


for (let index = 0; index < impar.length; index++) {
    produto *= (impar[index])
    console.log(produto)
}

for (let index = 0; index < par.length; index++) {
    soma += (par[index])
    console.log(produto)
    
}

console.log('Resultado')
console.log(soma)
console.log(produto)
}




