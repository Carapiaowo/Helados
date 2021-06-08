$("tr #cant").click(function(){
    var idp = $(this).parent().find("#idprod").val();
    var cantidad = $(this).parent().find("#cant").val();
    var url = "AccionesCarrito?accion_carrito=ActualizarCantidad";
    $.ajax({
        type: 'POST',
        url: url,
        data: "idp="+idp+"&cant="+cantidad,
        success: function(data,textStatus,jqXHR){
            location.href="AccionesCarrito?accion_carrito=ActualizarCantidad";
        }
    });
});