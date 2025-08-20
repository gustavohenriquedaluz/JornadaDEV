let listaAmigos = []
let listaAmigosDar = []
let listaAmigosTempAleatorizar = []

function adicionar() {
let nomeAmigo = document.getElementById('nome-amigo').value;
let amigosIncluidos = document.getElementById('lista-amigos')


if (nomeAmigo == '') { // Obriga o usuário a digitar um número
    alert('Digite o nome do amigo para incluir no amigo secreto.')
    return
}

if (listaAmigos.indexOf(nomeAmigo) != -1) {
    alert ('Nome já inserido, revise ou complete com o sobrenome!')
    return
}


if (listaAmigos.length == 0) {
    amigosIncluidos.textContent += `${nomeAmigo}` // Inserir nos amigos incluidos
} else {
    amigosIncluidos.textContent += `, ${nomeAmigo}` // Inserir nos amigos incluidos
}

listaAmigos.push(nomeAmigo) // Insere o amigo no array
listaAmigosTempAleatorizar.push(nomeAmigo)
//listaAmigosDar.push(nomeAmigo)
document.getElementById('nome-amigo').value = '' // Limpar o nome do amigo
console.log(listaAmigos)
}


function sortear() {
let numeroAleatorio = Math.floor(Math.random() * listaAmigosTempAleatorizar.length)
let resultadoSorteio = document.getElementById('lista-sorteio')
let listaAmigosReceber = []
let amigoDar
let amigoReceber

if (listaAmigos.length % 2 != 0 || listaAmigos.length < 4) {
    alert('Lista de amigos Inválida, impossível fazer o amigo secreto, revise!')
    return
}

while (listaAmigosTempAleatorizar.length != 0) {
    numeroAleatorio = Math.floor(Math.random() * listaAmigosTempAleatorizar.length)
    listaAmigosReceber.push(listaAmigosTempAleatorizar[numeroAleatorio])
    listaAmigosTempAleatorizar.splice(numeroAleatorio,1)
}

while (listaAmigos.length != 0) {
    numeroAleatorio = Math.floor(Math.random() * listaAmigos.length)
    console.log (numeroAleatorio)
    listaAmigosDar.push(listaAmigos[numeroAleatorio])
    listaAmigos.splice(numeroAleatorio,1)    
}


console.log(listaAmigosReceber)
console.log('Receber acima')
console.log(listaAmigosDar)

for (let i = 0; i < listaAmigosDar.length; i++) {
    let qualRemover
    amigoDar = listaAmigosDar[i]
    console.log(listaAmigosDar[i])
    amigoReceber = listaAmigosReceber[listaAmigosReceber.length - 1]
    console.log(amigoReceber)

    if (amigoDar == amigoReceber) {
        let nomeRepetidoUltimo = listaAmigosReceber[listaAmigosReceber.length - 1]
        listaAmigosReceber[listaAmigosReceber.length - 1] = listaAmigosReceber[listaAmigosReceber.length - 2]
        listaAmigosReceber[listaAmigosReceber.length - 2] = nomeRepetidoUltimo
        amigoReceber = listaAmigosReceber[listaAmigosReceber.length - 1]
        console.log('Encontrou nome igual!')
    }

    listaAmigosReceber.pop()
    resultadoSorteio.innerHTML += `<p id="lista-sorteio">${amigoDar} -> ${amigoReceber}</p>`
}

}


function reiniciar() {
    console.log(listaAmigosDar)
    console.log(listaAmigosDar)
    document.getElementById('lista-sorteio').innerHTML = ''
    document.getElementById('lista-amigos').textContent = ''
    listaAmigos = []
    listaAmigosDar = []
    console.log(listaAmigosDar)
    console.log(listaAmigosDar)
    

}