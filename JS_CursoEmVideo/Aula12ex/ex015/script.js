function verificar() {
    var data = new Date();
    var ano = data.getFullYear();
    var fAno = document.getElementById('txtano');
    var res = document.querySelector('div#res');
    if (fAno.value.length == 0 || Number(fAno.value > ano)) {
        alert('[ERRO] Verifique os dados e tente novamente!') ;       
    } else {
        var fsex = document.getElementsByName('radsex');
        var idade = ano - Number(fAno.value);
        var genero = '';
        var img = document.createElement('img');
        img.setAttribute('id', 'foto');
        if (fsex[0].checked) {
            genero = 'Homem';
            if (idade >= 0 && idade < 10) {
                // criança
                img.setAttribute('src', 'imagem_bebe_h.png');
            } else if (idade < 21) {
                // jovem
                img.setAttribute('src', 'imagem_jovem_h.png');
            } else if (idade < 50) {
                // adulto
                img.setAttribute('src', 'imagem_adulto_h.png');
            } else {
                // idoso
                img.setAttribute('src', 'imagem_idoso_h.png');
            }


        } else if (fsex[1].checked) {
            genero = 'Mulher'
            if (idade >= 0 && idade < 10) {
                // criança
                img.setAttribute('src', 'imagem_bebe_m.png');
            } else if (idade < 21) {
                // jovem
                img.setAttribute('src', 'imagem_jovem_m.png');
            } else if (idade < 50) {
                // adulto
                img.setAttribute('src', 'imagem_adulto_m.png');
            } else {
                // idoso
                img.setAttribute('src', 'imagem_idoso_m.png');
            }            
        }
        res.innerHTML = `<p>Detectamos <strong>${genero}</strong> com <strong>${idade}</strong> anos de idade!</p>`;
        res.style.textAlign = 'center';
        res.appendChild(img);
    }
}