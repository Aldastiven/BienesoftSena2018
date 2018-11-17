$(document).ready(function(){
    
    //funcion para añadir un objeto de atributos a mi elemento padre

    const agregarAtributos = (miElemento, obj_Atri) => {
            for (let i in obj_Atri){
                if(obj_Atri.hasOwnProperty(i)) miElemento.setAttribute(i, obj_Atri[i]);
            }
    };

    //funcion para crear el DIV padre que aparecera en pantalla, con sus respectivos atributos e hijos
    const crearDIV = (element, attributes, children) => {
            let miElemento = document.CreateElement (element);

            if(children !== undefined) children.forEach(el => {
                    if(el .nodeType){
                            if(el .nodeType === 1 ||  el .nodeType === 11)
                                miElemento.innerHTML += (el);                      
                    } else{
                        miElemento.innerHTML += el;
                    }
            });


                //Llamar funcion para añadir un objeto de atributos a mi elemento padre    
                        agregarAtributos (miElemento, attributes);

                        return miElemento;
    };
;

    var permisos = document.getElementsByClassName("ver");    
    var idPermisos = document.getElementsByClassName("id");
    
    for(var i=0; i<permisos.length; i++) {
        
        permisos[i].addEventListener("click", function(e){
            var per = e.target.id.substring(1);
            var perId = document.getElementById("id"+per).value;
            
            $.ajax({
                url: "servBuscarPermisos",
                data: {
                  perId: perId,
                  buscar: "ventana"
                },
                success: function( result ) {
                  //$( "#weather-temp" ).html( "<strong>" + result + "</strong> degrees" );
                }
            });
            
        });
    }
    

});



