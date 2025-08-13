//Crie uma função que converta a temperatura de Celsius para Fahrenheit e 
// vice-versa. Utilize uma variável para indicar a escala desejada e um bloco condicional 
// para determinar qual conversão realizar


console.log(conversorDeTemperatura(60,'f'))

function conversorDeTemperatura(temperatura,escala) {

    if (escala == 'c') {
        return `${temperatura} graus Celsius são ${(temperatura * 9/5) + 32} graus Fahrenheit`
    } else {
        return `${temperatura} graus Fahrenheit são ${(temperatura - 32) * 5/9} graus Celsius`
    }


}