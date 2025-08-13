let carrinho = document.getElementById('lista-produtos')
//carrinho.innerHTML += `<section class="carrinho__produtos__produto">
                            //<span class="texto-azul">1x</span> Celular <span class="texto-azul">R$1400</span><br>`;
let totalCarrinhoElemento = document.getElementById('valor-total');               
let totalCarrinho = 0


if (totalCarrinhoElemento.innerText == 'R$1400') {
    totalCarrinho = 1400
}


function adicionar() {
let produto = document.querySelector('select#produto')
let qtdProdutoBruto = document.getElementById('quantidade')
let qtdProduto = Number(qtdProdutoBruto.value)

if (qtdProduto == '0') {
    alert('[ERRO] Quantidade inválida!')
    return
}

if (produto.value == 'Fone de ouvido - R$100'){
    //console.log (`${produto.value}, QTD ${qtdProduto}`)

    carrinho.innerHTML += `<section class="carrinho__produtos__produto"><span class="texto-azul">${qtdProduto}x</span> Fone de ouvido <span class="texto-azul">R$100</span><br>`
    totalCarrinho += qtdProduto * 100
    totalCarrinhoElemento.innerText = `R$${totalCarrinho}`

}   else if (produto.value == 'Celular - R$1400') {
    //console.log (`${produto.value}, QTD ${qtdProduto}`)
    carrinho.innerHTML += `<section class="carrinho__produtos__produto"><span class="texto-azul">${qtdProduto}x</span> Celular <span class="texto-azul">R$1400</span><br>`
    totalCarrinho += qtdProduto * 1400
    totalCarrinhoElemento.innerText = `R$${totalCarrinho}`

} else if (produto.value == 'Oculus VR - R$5000') {
    //console.log (`${produto.value}, QTD ${qtdProduto}`)
    carrinho.innerHTML += `<section class="carrinho__produtos__produto"><span class="texto-azul">${qtdProduto}x</span> Oculus VR <span class="texto-azul">R$5000</span><br>`
    totalCarrinho += qtdProduto * 5000
    totalCarrinhoElemento.innerText = `R$${totalCarrinho}`
}

    document.getElementById('quantidade').value = 0;
    console.log(`Produto ${produto.value}, QTD ${qtdProduto}`)
    alert(`Produto ${produto.value}, QTD ${qtdProduto}`)


}


function limpar() {
let qtdProdutoBruto = document.getElementById('quantidade')
    totalCarrinhoElemento.innerText = 'R$00'
    qtdProdutoBruto.value = ''
    carrinho.innerHTML = ''
    totalCarrinho = 0
}


    let desafioHTML = document.querySelector('p#desafio')
    desafioHTML.textContent = `TESTE MALUCO`

/* 
    let n1 = 4
    let n2 = 6
    alert(`A soma entre ${n1} e ${n2} é ${n1 + n2}`) */



    let frase = 'Para;quedas'
    let palavraFinal = frase.split(';')[1]
    console.log(palavraFinal)

    let numerosString = '1,2,3'
    let numerosTratados = numerosString.split(',')
    console.log(numerosTratados)
    console.log(Number(numerosTratados[0]) + Number(numerosTratados[1]))     