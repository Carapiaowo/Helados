let ubicacion = window.pageYOffset;



window.onscroll = function() {
    let desplazamiento = window.pageYOffset;

    if(ubicacion>=desplazamiento){
        document.getElementById('navegador').style.top = '0';
    }
    else{
        document.getElementById('navegador').style.top = '-100px';
    }
    ubicacion = desplazamiento;
}


function frame(pagina) {

    document.getElementById("frame").src = pagina;
}