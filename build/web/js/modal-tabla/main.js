


$(document).ready(function(){


    $(".btn-consulta-cerrar").hide();
    $(".modal-background-coordinador").hide();
    $(".modal-background-seguridad").hide();
    
    //ESTE MUESTRA EL MODAL DE LA TABLA PERMISOS POR PARTE DEL COORDINADOR
        $(".btn-ver-permiso-coordinador").click(function (){

           var pos=$(".btn-ver-permiso-coordinador").index(this);
           var asi=$(".modal-background-coordinador").eq(pos);
           asi.slideToggle();

        });   
        
    //ESTE MUESTRA EL MODAL DE LA TABLA PERMISOS POR PARTE DE SEGURIDAD
        $(".btn-ver-permiso-seguridad").click(function (){

           var pos=$(".btn-ver-permiso-seguridad").index(this);
           var asi=$(".modal-background-seguridad").eq(pos);
           asi.slideToggle();

        });
        
        $(".btn-cerrar_modal").click(function (){
            $(".modal-background-seguridad").hide();
            $(".modal-background-coordinador").hide();
            $(".btn_salida").show();
            $(".btn_entrada").hide();
        });
        
});
