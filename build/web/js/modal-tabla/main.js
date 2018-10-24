$(document).ready(function(){

    $(".btn-consulta-cerrar").hide();
    $(".modal-prueba-1").hide();
    
        $(".btn-consulta-tabla").click(function (){

           var pos=$(".btn-consulta-tabla").index(this);
           var asi=$(".modal-prueba-cont").eq(pos);

           $(".btn-consulta-cerrar").show();
           $(".modal-prueba-1").show();
           $(".modal-prueba-cont").show();
           
        });   
        
        $(".btn-consulta-cerrar").click(function (){
            $(".modal").hide();
            $(".btn-consulta-cerrar").hide();
        });
        
});
