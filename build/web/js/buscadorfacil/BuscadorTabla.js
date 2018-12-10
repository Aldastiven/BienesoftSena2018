//BUSCADOR DE PERMISOS
$(document).ready(function(){
    var tipoPermiso = "",documento=0;
    
    //CONSULTAR TODOS LOS REGISTROS
    var rol = document.getElementById("user_text").innerHTML;   
    ajaxBuscar(tipoPermiso,rol,documento);
    
    //ComboBox
    document.getElementById("ComboFiltro").addEventListener("change",function(e){
        var tipoPermiso = e.target.value;
        //Lamar método de ajax para buscar  
        if($("#documento_key").val() === "") ajaxBuscar(tipoPermiso, rol,documento);
        else ajaxBuscar($("#documento_key").val());
    });
    
    //Busqueda en teclado
    $("#documento_key").keypress(function(t){
        setTimeout(function(){
            var documento = t.target.value;
            if(documento !== "" || t.which === 8) {
                if(t.which === 8 && $("#documento_key").val().length <=1 ) ajaxBuscar(document.getElementById("ComboFiltro").value,rol,0);
                else ajaxBuscar(document.getElementById("ComboFiltro").value,rol,documento);
            }
    },200);
       
    });


    function ajaxBuscar(tipoPermiso, rol,documento) {
        
        $.ajax({
            url: "servBuscarPermisos",//aqui llama a la tabla coordinador
            data: {
              tipo: tipoPermiso,
              rol: rol,
              documento: documento
            
            },
            success: function( result ) {
                $( "#datos" ).html(result);
            }
        });
    }
});