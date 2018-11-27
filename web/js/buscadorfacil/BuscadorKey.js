//BUSCADOR POR TECLADO
$(document).ready(function(){

    //documento aprendiz
        $("#documento_key").keypress(function() {
	var doc=$("#documento_key").val();
           $.ajax({
            url: "servBuscarPermisos",
            data: {
              y:doc
            },
            success: function( result ) {
              $( "#datos" ).html(result);
            }
          });

    });

   
});


