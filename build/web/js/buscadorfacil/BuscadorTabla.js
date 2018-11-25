$(document).ready(function(){
    var tipoPermiso = "";
    
    //CONSULTAR TODOS LOS REGISTROS
    var rol = document.getElementById("user_text").innerHTML;
    ajaxBuscar(tipoPermiso,rol);

    document.getElementById("ComboFiltro").addEventListener("change",function(e){
        alert("rol");
        var tipoPermiso = e.target.value;
        //Lamar método de ajax para buscar        
        ajaxBuscar(tipoPermiso, rol);
  
        
    });

    
    function ajaxBuscar(tipoPermiso, rol) {
        $.ajax({
            url: "servBuscarPermisosDoc",//aqui llama a la tabla coordinador
            data: {
              tipo: tipoPermiso,
              rol: rol
            },
            success: function( result ) {
                $( "#datos" ).html(result);
            }
        });
    }
});



