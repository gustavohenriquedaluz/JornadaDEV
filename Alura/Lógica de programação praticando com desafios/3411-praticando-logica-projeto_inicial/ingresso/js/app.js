let qtdPista = 100
let qtdCadeiraInferior = 400
let qtdCadeiraSuperior = 200




function comprar() {
    let ingresso = document.getElementById('tipo-ingresso').value;
    let qtdBruto = document.querySelector('input#qtd').value
    let qtd = Number(qtdBruto)
    let qtdPistaVisual = document.getElementById('qtd-pista')
    let qtdCadeiraSupVisual = document.getElementById('qtd-superior')
    let qtdCadeiraInfVisual = document.getElementById('qtd-inferior')       

    if (qtd == '' || qtd < 0) {
        alert('[ERRO] Preencha a quantidade antes de clicar em comprar!')
        return
    }

    document.querySelector('input#qtd').value = ''

    if (ingresso == 'pista') {
        if (qtdPista - qtd < 0) {
            alert(`Inválido, temos ${qtdPista} ingressos de pista.`)
            return
        }
        qtdPista -= qtd
        qtdPistaVisual.innerText = `${qtdPista}`
    } else if (ingresso == 'inferior') {
        if (qtdCadeiraInferior - qtd < 0) {
            alert(`Inválido, temos ${qtdCadeiraInferior} ingressos de cadeiras inferiores.`)
            return            
        }
        qtdCadeiraInferior -= qtd
        qtdCadeiraInfVisual.innerText = `${qtdCadeiraInferior}`
    } else { //Superior
        if (qtdCadeiraSuperior - qtd < 0) {
            alert(`Inválido, temos ${qtdCadeiraSuperior} ingressos de cadeiras superiores.`)
            return            
        }
        qtdCadeiraSuperior -= qtd
        qtdCadeiraSupVisual.innerText = `${qtdCadeiraSuperior}`    
    }




}



let n1 = '1'
console.log(parseInt(n1))