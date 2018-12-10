/******* BuscadorTabla_historial******/

$(document).ready(function(){
    
    var tipObservacion = "",documento=0,mes=0;
    
    //CONSULTAR TODOS LOS REGISTROS
    ajaxBuscar(tipObservacion,documento,mes);

    //ComboBox Historial
    document.getElementById("ComboFiltroHistorial").addEventListener("change",function(e){    
        var tipObservacion = e.target.value;
        //Lamar método de ajax para buscar
        if($("#documento_key").val() === "") ajaxBuscar(tipObservacion, documento, mes);
        else ajaxBuscar(tipObservacion, $("#documento_key").val());

    });
    
    document.getElementById("ComboMes").addEventListener("change",function(e){    
        var mes = e.target.value;
        alert("AJAX"+ mes);
        //Lamar método de ajax para buscar
        if($("#documento_key").val() === "") ajaxBuscar(tipObservacion, documento, mes);
        else ajaxBuscar(tipObservacion, $("#documento_key").val(), mes);

    });
   
 
    //Busqueda en teclado
    $("#documento_key").keypress(function(t){
        setTimeout(function(){
            var documento = t.target.value;
            if(documento !== "" || t.which === 8) {
                //alert(8);
                if(t.which === 8 && $("#documento_key").val().length <=1 ){ 
                    ajaxBuscar(document.getElementById("ComboFiltroHistorial").value,0, document.getElementById("ComboMes").value, document.getElementById("ComboFiltroHistorial").value);
                }
                else{ 
                    ajaxBuscar(document.getElementById("ComboFiltroHistorial").value,documento,document.getElementById("ComboMes").value);
                }
            }
    },200);
       
    });


    function ajaxBuscar(tipObservacion, documento, mes) {
        alert("tipo "+tipObservacion+ " documento "+documento+ " mes "+mes);
        $.ajax({
            url: "servBuscarPermisos_Historial",//aqui llama a la tabla coordinador
            data: {
              observacion: tipObservacion,
              documento: documento,
              mes: mes
            },
            success: function( result ) {
                $( "#datos_history" ).html(result);
            }
        });
    }
    
    
    
    
    
    
});



