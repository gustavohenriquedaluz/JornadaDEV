let titulo = document.querySelector('h1');
    titulo.innerHTML = 'Testeeee'

    function console() {
        console.log('O botão console foi cricado')
    }


function alerta() {
    alert('Eu amo JS')
}


let resposta

function promptBotao() {
    resposta = prompt('Digite o nome da sua cidade!')
    alert(`Estive em ${resposta}  e lembrei de você!`)

}


let num1
let num2

function botaoSoma() {
    num1 = prompt('Digite um número')
    num2 = prompt('Digite outro número')
        let soma = parseInt(num1) + parseInt(num2)
    alert (`A soma é ${soma}!`)
}