$(document).ready(function(){

    var tipoAprendiz = "",documento=0;
    
    //CONSULTAR TODOS LOS REGISTROS   
    ajaxBuscar(tipoAprendiz,documento);
    
    //ComboBox
    document.getElementById("ComboFiltro").addEventListener("change",function(e){
        var tipoAprendiz = e.target.value;
        //Lamar método de ajax para buscar  
        if($("#documento_key").val() === "") ajaxBuscar(tipoAprendiz,documento);
        else ajaxBuscar(tipoAprendiz, $("#documento_key").val());
    });
    
    //Busqueda en teclado
    $("#documento_key").keypress(function(t){
        setTimeout(function(){
            var documento = t.target.value;
            if(documento !== "" || t.which === 8) {
                if(t.which === 8 && $("#documento_key").val().length <=1 ) ajaxBuscar(document.getElementById("ComboFiltro").value,0);
                else ajaxBuscar(document.getElementById("ComboFiltro").value,documento);
            }
    },200);
       
    });


    function ajaxBuscar(tipoAprendiz, documento) {
        $.ajax({
            url: "servBuscarAprendiz",//aqui llama a la tabla coordinador
            data: {
              tipo: tipoAprendiz,
              documento: documento
            
            },
            success: function( result ) {
                $( "#datos" ).html(result);
            }
        });
    }
});
