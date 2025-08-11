
    let contarAlugados = 0;
function alterarStatus(numero) {
    let jogoSelecionado = document.getElementById(`game-${numero}`);
    let imagem = jogoSelecionado.querySelector('.dashboard__item__img');
    let botao =  jogoSelecionado.querySelector('.dashboard__item__button');



    if (imagem.classList.contains('dashboard__item__img--rented')) {
        let confirmacao = prompt('Você realmente deseja devolver o jogo? Digite SIM ou NÃO!');
        if (confirmacao == 'SIM') {
        imagem.classList.remove('dashboard__item__img--rented');
        botao.classList.remove('dashboard__item__button--return');  
        botao.classList.add('dashboard__item__button')
        botao.textContent = 'Alugar';
        } else {
            return

        }
    


    } else {
        imagem.classList.add('dashboard__item__img--rented');
        botao.classList.add('dashboard__item__button--return');
        botao.textContent = 'Devolver'
        contarAlugados = contarAlugados + 1;
        console.log(contarAlugados);
}



    }




