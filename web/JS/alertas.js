$(document).ready(function () {
    $("tr #btnBorrar").click(function () {
        var idp = $(this).parent().find("#idp");
        swal({
            title: "¿Quieres eliminar el producto?",
            text: "Una vez eliminado puedes regresar al menú a comprar más.",
            icon: "warning",
            closeOnEsc: false,
            closeOnClickOutside: false,
            timer: 6000,
            buttons: true,
            dangerMode: true,
        })
                .then((willDelete) => {
                    if (willDelete) {
                        eliminar(idp);
                        swal("Se ha eliminado el producto", {
                            icon: "success",
                        }).then((willDelete)=>{
                            if(willDelete){
                                parent.location.href="AccionesCarrito?accion_carrito=Carrito"
                            }
                        });
                    } else {
                        swal("No se ha eliminado");
                    }
                });
        
    });
    function eliminar(idp) {
        var url = "AccionesCarrito?accion_carrito=Borrar";
        $ajax({
            type: 'POST',
            url: url,
            data: "idp=" + idp,
            success: function (data, textStatus, jqXHR) {
                
            }
        });
    }
});
