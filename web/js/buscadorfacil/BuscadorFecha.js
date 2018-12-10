/******* BuscadorTabla_historial******/

$(document).ready(function(){
    alert("entro a la funcion del ajax");
    var fm="";
    
    //CONSULTAR TODOS LOS REGISTROS
    ajaxBuscarFecha(fm);

    //ComboBox Historial x mes
    document.getElementById("ComboMes").addEventListener("change",function(e){    
        var fm = e.target.value;
        //Lamar método de ajax para buscar
        ajaxBuscar(fm);

    });
       
    

    function ajaxBuscarFecha(fm) {
        
        $.ajax({
            url: "servBuscarPermisos_Historial",//aqui llama a la tabla coordinador
            data: {
              mes: fm 
            },
            success: function( result ) {
                $( "#datos_history" ).html(result);
            }
        });
    }
});



