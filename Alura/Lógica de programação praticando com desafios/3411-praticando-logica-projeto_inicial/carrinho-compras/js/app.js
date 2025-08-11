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



}


function limpar() {
let qtdProdutoBruto = document.getElementById('quantidade')
    totalCarrinhoElemento.innerText = 'R$00'
    qtdProdutoBruto.value = ''
    carrinho.innerHTML = ''
    totalCarrinho = 0
}