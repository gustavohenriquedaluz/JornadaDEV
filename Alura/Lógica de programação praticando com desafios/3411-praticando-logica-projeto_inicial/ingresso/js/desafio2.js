//Implemente uma função que aceite um número como parâmetro e utilize um bloco condicional 
// para determinar se o número é par ou ímpar.

console.log(imparOuPar(4))

function imparOuPar(n) {
    if (n % 2 == 0) {
        return 'Par'
    } else {
        return 'Impar'
    }

}