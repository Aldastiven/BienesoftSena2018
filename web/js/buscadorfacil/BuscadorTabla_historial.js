/******* BuscadorTabla_historial******/

$(document).ready(function(){
    var tipObservacion = "",documento=0;;
    
    //CONSULTAR TODOS LOS REGISTROS
    ajaxBuscar(tipObservacion,documento);

    //ComboBox Historial
    document.getElementById("ComboFiltroHistorial").addEventListener("change",function(e){
        var tipObservacion = e.target.value;
        //Lamar método de ajax para buscar
        if($("#documento_key").val() === "") ajaxBuscar(tipObservacion, documento);
        else ajaxBuscar(tipObservacion, $("#documento_key").val());

    });
    
    //Busqueda en teclado
    $("#documento_key").keypress(function(t){
        setTimeout(function(){
            var documento = t.target.value;
            if(documento !== "" || t.which === 8) {
                //alert(8);
                if(t.which === 8 && $("#documento_key").val().length <=1 ){ 
                    ajaxBuscar(document.getElementById("ComboFiltroHistorial").value,0);
                }
                else{ 
                    ajaxBuscar(document.getElementById("ComboFiltroHistorial").value,documento);
                }
            }
    },200);
       
    });





    function ajaxBuscar(tipObservacion, documento) {
        $.ajax({
            url: "servBuscarPermisos_Historial",//aqui llama a la tabla coordinador
            data: {
              observacion: tipObservacion,
              documento: documento
            },
            success: function( result ) {
                $( "#datos_history" ).html(result);
            }
        });
    }
});



