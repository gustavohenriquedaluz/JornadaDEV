function tabuada()  {
    let numeroDoc = document.querySelector('input#txtn');
    let n = Number(numeroDoc.value);
    let lista = document.querySelector('select#lista');


    let numeroMultiplicador = 1;


    if (numeroDoc.value.length == 0) {
    alert('Número inválido!');
    return        
    }

    lista.innerHTML = ``;


    if (n == 0) {
        while (numeroMultiplicador <= 10) {
            let item = document.createElement('option');
            let resultado = n * numeroMultiplicador;
            item.textContent = `${n} x ${numeroMultiplicador} = ${resultado}`;
            lista.appendChild(item)
            numeroMultiplicador++
            console.log(numeroMultiplicador);

    }
     }else if (n < 10000) {
        while (numeroMultiplicador <= 10) {
            let item = document.createElement('option');
            let resultado = n * numeroMultiplicador;
            item.textContent = `${n} x ${numeroMultiplicador} = ${resultado}`;
            lista.appendChild(item)
            numeroMultiplicador++
            console.log(numeroMultiplicador);
    }           
    } else {
    while (numeroMultiplicador >= 10) {
        let item = document.createElement('option');
        let resultado = n * numeroMultiplicador;
        item.textContent = `${n} x ${numeroMultiplicador} = ${resultado}`;
        lista.appendChild(item)
        numeroMultiplicador--
        console.log(numeroMultiplicador);
    }




}
}