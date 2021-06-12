/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Manuel
 */

 function validarn(e){
    var teclado=(document.all)?e.keyCode:e.which;
    if(teclado==8)return true;

    var patron=/[0-9\d .]/;

    var prueba=String.fromCharCode(teclado);
    return patron.test(prueba);
}

function validarReg(formulariores){
    if(formulariores.nombre.value.length < 3){
        alert("Escriba más de tres caracteres.");
        formulariores.nombre.focus();
        return false;
    }
    
    var checkOk="QWERTYUIOPASDFGHJKLÑZXCVBNM+"+"qwertyuiopasdfghjklñzxcvbnm"+" áéíóú";
    var checkNombre=formulariores.nombre.value;
    var allValid=true;
    
    
    
    for(var i=0; i<checkNombre.length;i++){
        var ch=checkNombre.charAt(i);
        for(var j=0; j<checkOk.length; j++)
        if(ch==checkOk.charAt(j))
            break;
        if(j==checkOk.length){
            allValid=false;
            break;
        }
    }
    if(!allValid){
        alert("Escriba solo letras en su nombre.");
        formulario.nombre.focus();
        return false;
    }
    
    var checkOk="1234567890";
    var checkID_produc=formulariores.producto.value;    
    var checkDesc=formulariores.descuento.value;
    var allValid=true;
    
    for(var i=0; i<checkDesc.length;i++){
        var ch=checkDesc.charAt(i);
        for(var j=0; j<checkOk.length; j++)
        if(ch==checkOk.charAt(j))
            break;
        if(j==checkOk.length){
            allValid=false;
            break;
        }
    }
    
    if(checkDesc<0 || checkDesc>99){
        alert("ID inválido.");
        return false;
    }

    for(var i=0; i<checkID_produc.length;i++){
        var ch=checkID_produc.charAt(i);
        for(var j=0; j<checkOk.length; j++)
        if(ch==checkOk.charAt(j))
            break;
        if(j==checkOk.length){
            allValid=false;
            break;
        }
    }
    
    if(checkID_produc<0 || checkID_produc>99){
        alert("Descuento inválido.");
        return false;
    }
}




function validarMod(formulariomodificar){
    if(formulariomodificar.modnom.value.length < 3){
        alert("Escriba más de tres carácteres.");
        formulariomodificar.modnom.focus();
        return false;
    }

    if(formulario.nappat.value.length < 3){
        alert("Escriba más de tres carácteres.");
        formulario.nappat.focus();
        return false;
    }

    if(formulario.napmat.value.length < 3){
        alert("Escriba más de tres carácteres.");
        formulario.napmat.focus();
        return false;
    }
    
    var checkOk="QWERTYUIOPASDFGHJKLÑZXCVBNM+"+"qwertyuiopasdfghjklñzxcvbnm"+" áéíóú";
    var checkNombre=formulariomodificar.nnom.value;
    var checkAppat=formulariomodificar.nappat.value;
    var checkApmat=formulariomodificar.napmat.value;
    var allValid=true;
    
    for(var i=0; i<checkNombre.length;i++){
        var ch=checkNombre.charAt(i);
        for(var j=0; j<checkOk.length; j++)
        if(ch==checkOk.charAt(j))
            break;
        if(j==checkOk.length){
            allValid=false;
            break;
        }
    }
    if(!allValid){
        alert("Escriba solo letras en su nombre.");
        formulario.nnom.focus();
        return false;
    }

    for(var i=0; i<checkAppat.length;i++){
        var ch=checkAppat.charAt(i);
        for(var j=0; j<checkOk.length; j++)
        if(ch==checkOk.charAt(j))
            break;
        if(j==checkOk.length){
            allValid=false;
            break;
        }
    }
    if(!allValid){
        alert("Escriba solo letras en su apellido paterno.");
        formulario.nappat.focus();
        return false;
    }

    for(var i=0; i<checkApmat.length;i++){
        var ch=checkApmat.charAt(i);
        for(var j=0; j<checkOk.length; j++)
        if(ch==checkOk.charAt(j))
            break;
        if(j==checkOk.length){
            allValid=false;
            break;
        }
    }
    if(!allValid){
        alert("Escribe solo letras en tu apellido materno");
        formulario.napmat.focus();
        return false;
    }
    
    var checkOk="1234567890";
    var checkEdad=formulario.nedad.value;
    var allValid=true;
    
    for(var i=0; i<checkEdad.length;i++){
        var ch=checkEdad.charAt(i);
        for(var j=0; j<checkOk.length; j++)
        if(ch==checkOk.charAt(j))
            break;
        if(j==checkOk.length){
            allValid=false;
            break;
        }
    }
    
    if(checkEdad<0 || checkEdad>80){
        alert("Edad inválida.");
        return false;
    }
    
    var txt=formulariomodificar.ncorreo.value;
    var b=/^[^@\s]+@[^@\.\s]+(\.[^@\.\s]+)+$/;
    return b.test(txt);
}

function validarID(formularioeliminar){
    var checkOk="1234567890";
    var idE=formulario.ideliminar.value;
    var allValid=true;
    
    for(var i=0; i<idE.length;i++){
        var ch=idE.charAt(i);
        for(var j=0; j<checkOk.length; j++)
        if(ch==checkOk.charAt(j))
            break;
        if(j==checkOk.length){
            allValid=false;
            break;
        }
    }
    
    if(idE<0){
        alert("El ID es inválido.");
        return false;
    }
}

function validarIDC(formulariomodificar){
    var checkOk="1234567890";
    var idC=formulariomodificar.idmod.value;
    var allValid=true;
    
    for(var i=0; i<idC.length;i++){
        var ch=idC.charAt(i);
        for(var j=0; j<checkOk.length; j++)
        if(ch==checkOk.charAt(j))
            break;
        if(j==checkOk.length){
            allValid=false;
            break;
        }
    }
    
    if(idC<0){
        alert("El ID es inválido.");
        return false;
    }
}