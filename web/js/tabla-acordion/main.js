
$(document).ready(function(){


    $(".divdos").hide();
    $(".modal-background-acordion").hide();
    $(".modal-background").hide();
    
      $(".divuno").click(function(){
            $(".divtres").hide();

            var pos=$(".divuno").index(this);
            var asi=$(".divdos").eq(pos);
            asi.slideToggle();
      });

      $(".divdos").click(function(){
            var pos1=$(".divdos").index(this);
            var asi1=$ (".modal-background-acordion").eq(pos1);
            asi1.slideToggle();
      });
      
      $(".btn-cerrar_modal-acordion").click(function(){
          $(".modal-background-acordion").hide();
      });
      
      $(".ver_modal").click(function (){
            var pos3=$(".ver_modal").index(this);
            var asi3=$ (".modal-background").eq(pos3);
            $(".modal-background").show();
            asi3.slideToggle();
      });
});
