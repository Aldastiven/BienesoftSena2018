


$(document).ready(function(){


    $(".btn-consulta-cerrar").hide();
    $(".modal-background-coordinador").show();
    $(".modal-background-seguridad").hide();
    $(".prueba1").hide();
    
    //ESTE MUESTRA EL MODAL DE LA TABLA PERMISOS POR PARTE DEL COORDINADOR
        $(".btn-ver-permiso-coordinador").click(function (){

            var pos=$(".btn-ver-permiso-coordinador").index(this);
           var newDiv = document.createElement("modal-cont");
           // crea un nuevo div 
            // y añade contenido 
            var newDiv = document.createElement("div"); 
            var newContent = document.createTextNode(pos); 
            newDiv.appendChild(newContent); //añade texto al div creado. 

            // añade el elemento creado y su contenido al DOM 
            var currentDiv = document.getElementById("modal-cont"); 
            document.body.insertBefore(newDiv, currentDiv);

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
