let array = [5, 8, 2, 9, 3];
array.push(1);
array.sort();
console.log(array);
console.log(`O vetor dem ${array.length} posições!`);
console.log(`O primeiro valor do vetor é ${array[0]}`);


//console.log(`O valor 1 está na posição ${array.indexOf(1)} do Array/Vetor!`);

let pos = array.indexOf(2);

if(pos == -1) {
    console.log('O valor não foi encontrado!')
} else {
    console.log(`O valor está na posição ${pos}!`)
}