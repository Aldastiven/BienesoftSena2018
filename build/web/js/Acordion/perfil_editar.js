$(document).ready(function(){
    $(".div_editar").hide();
    
      $(".div_cambiar_datos").click(function(){

            var pos=$(".div_cambiar_datos").index(this);
            var asi=$(".div_editar").eq(pos);            
            asi.slideToggle();
            $(".div_editar").show();
      });
});
