function carregar() {
    var msg = document.getElementById('msg');
    var img = document.getElementById('imagem');
    var data = new Date();
    var hora = data.getHours();

    msg.innerHTML = `Agora são ${hora} horas!`

    if (hora >= 0 && hora < 12) {
        img.src = 'fotomanha.png'
        document.body.style.background = '#d8f4fd'
    } else if (hora >= 12 && hora <= 18) {
        img.src = 'fototarde.png' // tarde
        document.body.style.background = '#d7c7b0'
    } else {
        img.src = 'fotonoite.png' // noite
        document.body.style.background = '#001e44'
    }
}
