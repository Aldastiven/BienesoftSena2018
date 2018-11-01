$(document).ready(function(){

$(".btn_entrada").hide();


    $(".btn_salida").click(function(){

        alert("el aprendiz a salido del CBA");

        $(".btn_entrada").show();
        $(".btn_salida").hide();
    });

    $(".btn_entrada").click(function(){

        alert("El aprendiz ha ingresado");
        
        $(".btn_entrada").hide();
        $(".btn_salida").hide();
    })
});

