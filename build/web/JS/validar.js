function validarn(evt){
    if(window.event){
        keynum= evt.keyCode;
    }
    else{
        keynum= evt.which;
    }

    if((keynum>64 && keynum <91 )||keynum == 32|| keynum>96 && keynum<123)
    {
        return true;
    }
    else{
        alert("Ingresar solo letras");
        return false;
    }
}

function validarnn(evt){
    if(window.event){
        keynum= evt.keyCode;
    }
    else{
        keynum= evt.which;
    }

    if((keynum>47 && keynum <58 )||keynum == 8|| keynum == 13||keynum == 46)
    {
        return true;
    }
    else{
        alert("Ingresar solo numeros");
        return false;
    }

}

function usuario(){
    var valor = document.getElementById('email').value;
    var valor1 = document.getElementById('pass').value;
    if(valor==""||valor1==""){
    alert("Debes ingresar los datos");
    }
    else{
         var patron = /^[-\w.%+]{1,64}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/i
         var correo = document.getElementById('email').value;
            if(patron.test(correo)){
        window.open("menu_usuario.html", "_self");
    }
    else{
        alert("Ingresa un email valido")
    }
}
}

function admin(){
    var valor = document.getElementById('email').value;
    var valor1 = document.getElementById('pass').value;
    if(valor==""||valor1==""){
    alert("Debes ingresar los datos");
    }
    else{
         var patron = /^[-\w.%+]{1,64}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/i
         var correo = document.getElementById('email').value;
            if(patron.test(correo)){
        window.open("menu_admin.html", "_self");
    }
    else{
        alert("Ingresa un email valido")
    }
}
}