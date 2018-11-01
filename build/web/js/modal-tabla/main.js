$(document).ready(function(){

    $(".btn-consulta-cerrar").hide();
    $(".modal-background").hide    ();
    
        $(".btn-consulta-tabla").click(function (){

           var pos=$(".btn-consulta-tabla").index(this);
           var asi=$(".modal-background").eq(pos);
           asi.slideToggle();

        });   
        
        $(".btn-cerrar_modal").click(function (){
            $(".modal-background").hide();
            $(".btn_salida").show();
            $(".btn_entrada").hide();
        });
        
});
