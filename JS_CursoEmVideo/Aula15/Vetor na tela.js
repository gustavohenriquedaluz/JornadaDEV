let array = [5, 8, 2, 9, 3];
array.push(1);
//array.sort();
console.log(array);
console.log(`O vetor dem ${array.length} posições!`)
console.log(`O primeiro valor do vetor é ${array[0]}`)

console.log('Teste loop array')

for (let pos = 0; pos < array.length; pos++) {
    console.log(`A pos ${pos} tem o valor ${array[pos]}!`)
}

for (let pos in array){
    console.log(`A pos ${pos} tem o valor ${array[pos]}!`)
}