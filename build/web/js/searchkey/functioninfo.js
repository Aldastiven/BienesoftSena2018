/*
 * Function de busqueda con el parametro
 * 
 */

function searchInfo(){
var num_docu = document.vinform.name.value;
var url="t_permiso_coordinador.jsp?val="+num_docu;//busqueda por documento aprendiz

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
