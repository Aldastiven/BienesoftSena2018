$(document).ready(function(){
    var tipoPermiso = "";
    
    //CONSULTAR TODOS LOS REGISTROS
    ajaxBuscar(tipoPermiso);


    document.getElementById("ComboFiltro").addEventListener("change",function(e){
        var tipoPermiso = e.target.value;
        //Lamar método de ajax para buscar
        ajaxBuscar(tipoPermiso);
  
        
    });

    
    function ajaxBuscar(tipoPermiso) {
        $.ajax({
            url: "servBuscarPermisos",//aqui llama a la tabla coordinador
            data: {
              tipo: tipoPermiso
            },
            success: function( result ) {
                $( "#datos" ).html(result);
            }
        });
    }
});



