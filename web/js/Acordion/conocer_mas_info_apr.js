$(document).ready(function(){
    $(".div_dat_per2").hide();
    $(".div_dat_per4").hide();
    $(".div_dat_per6").hide();
    
    
      $(".div_dat_per1").click(function(){

            var pos=$(".div_dat_per1").index(this);
            var asi=$(".div_dat_per2").eq(pos);            
            asi.slideToggle();
            $(".div_dat_per2").show();
      });

    
      $(".div_dat_per3").click(function(){

            var pos=$(".div_dat_per3").index(this);
            var asi=$(".div_dat_per4").eq(pos);            
            asi.slideToggle();
            $(".div_dat_per4").show();
      });
     
    
      $(".div_dat_per5").click(function(){

            var pos=$(".div_dat_per5").index(this);
            var asi=$(".div_dat_per6").eq(pos);            
            asi.slideToggle();
            $(".div_dat_per6").show();
      });
});
