let listaAmigos = []
let listaAmigosSorteados = []

function adicionar() {

let nomeAmigo = document.getElementById('nome-amigo').value;
let amigosIncluidos = document.getElementById('lista-amigos')
let qtdAmigos = listaAmigos.length

if (nomeAmigo == '') { // Obriga o usuário a digitar um número
    alert('Digite o nome do amigo para incluir no amigo secreto.')
    return
}

listaAmigos.push(nomeAmigo) // Insere o amigo no array

console.log(listaAmigos)

let numeroAleatorio = Number(Math.floor(Math.random() * qtdAmigos )) // Número aleatório com base no máximo do array
console.log(numeroAleatorio)



if (qtdAmigos == 0) {
    amigosIncluidos.textContent += `${nomeAmigo}` // Inserir nos amigos incluidos
} else {
    amigosIncluidos.textContent += `, ${nomeAmigo}` // Inserir nos amigos incluidos
}




document.getElementById('nome-amigo').value = '' // Limpar o nome do amigo




}
