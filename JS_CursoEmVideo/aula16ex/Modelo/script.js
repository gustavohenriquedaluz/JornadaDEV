let qLista = [];

    let txtres = document.querySelector('div#res');

function adicionar() {
    let txtn = document.querySelector('input#txtn');
    let n = Number(txtn.value);
    let listaHtml = document.querySelector('select#lista');

    if (n < 1 || n > 100) {
        alert('[ERRO] Número inserido é inválido, não está entre 1 e 100! [ERRO]');
        return
    }

    txtres.innerHTML = ``;

    if (qLista.indexOf(n) == -1) {
    qLista.push(n);
    let numeroImput = document.createElement('option');
    numeroImput.textContent = `Numero ${n} adicionado!`;
    listaHtml.appendChild(numeroImput);
    } else {
        alert ('O número já está na lista, digite outro!');
        return;
    }
    txtn.value = ''
   // alert('Teste codigo final')


console.log(qLista);

}

function finalizar(){

    if (qLista.length == 0) {
        alert(`[ERRO]Inválido, nenhum número foi adicionado para ser analisado![ERRO]`)
        return
    }

    txtres.innerHTML = `<p>Ao todo temos <strong>${qLista.length}</strong> números cadastrados!</p>`;

    // Máximo valor do array
    let max = qLista.reduce((numAnterior, numAtual)=> Math.max(numAnterior, numAtual)) ;
    txtres.innerHTML += `<p> O maior valor informado foi o <strong>${max}</strong>!<p/>`;

    let min = qLista.reduce((numAnterior, numAtual) => Math.min(numAnterior,numAtual));
    txtres.innerHTML += `<p>O menor valor informado foi o <strong>${min}</strong>!<p/>`;

    // Soma dos valores do array
    let soma = qLista.reduce((numAnterior, numAtual)=> numAnterior + numAtual, 0);
    txtres.innerHTML += `<p>A soma dos valores informados é <strong>${soma}</strong>!</p>`;

    // Media dos valores do array

    let media = soma / qLista.length
    txtres.innerHTML += `<p>A média dos valores informados é <strong>${media}</strong>!</p>`
}

    