//BUSCADOR POR TECLADO
//$(document).ready(function(){
//   
//    //documento aprendiz
//    $( "#search" ).keyup(function() {
//	//var numdocu = e.target.value;
//        var numdocu = document.vinform.name.value;
//        var url="t_permiso_coordinador.jsp?val="+numdocu;//busqueda por documento aprendiz
//        //Llamado ajax
//        ajaxBuscarDoc(numdocu);
//
//    });
//    
//   
//    //Documento aprendiz
//    function ajaxBuscarDoc(numdocu) {
//        $.ajax({
//            url:"servBuscarPermisosKey",
//            data: {
//              doc: numdocu
//            },
//            success: function( result ) {
//                $( "#datos" ).html(result);
//            }
//        });
//        
//    }
//    
//});

function searchInfo(){
    var numdocu = document.vinform.name.value;
    var url="t_permiso_coordinador.jsp?val="+numdocu;//busqueda por documento aprendiz

    try{
        request.onreadystatechange=function(){
        if(request.readyState==4){
        var val=request.responseText;
        document.getElementById('datos').innerHTML=val;
    }
    }//end of function
        request.open("GET",url,true);
        request.send();
        }catch(e){alert("Unable to connect to server");}
}

