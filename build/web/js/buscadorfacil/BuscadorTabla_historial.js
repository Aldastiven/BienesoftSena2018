/* global tipoObservacion */

$(document).ready(function(){
    var tipoObservacion = "";
    
    //CONSULTAR TODOS LOS REGISTROS
    ajaxBuscar(tipoObservacion);


    document.getElementById("ComboFiltroHistorial").addEventListener("change",function(e){
        var tipoObservacion = e.target.value;
        //Lamar método de ajax para buscar
        ajaxBuscar(tipoObservacion);
  
        
    });


    function ajaxBuscar(tipoObservacion) {
        $.ajax({
            url: "servBuscarPermisos_Historial",//aqui llama a la tabla coordinador
            data: {
              tipo: tipoObservacion
            },
            success: function( result ) {
                $( "#datos_history" ).html(result);
            }
        });
    }
});



