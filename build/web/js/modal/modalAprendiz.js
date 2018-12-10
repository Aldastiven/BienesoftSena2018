//MODAL INFO APRENDIZ
$(document).ready(function(){
//   alert("entra a la funcion"); 
    //funcion para añadir un objeto de atributos a mi elemento padre

    const agregarAtributos = (miElemento, obj_Atri) => {
            for (let i in obj_Atri){
                if(obj_Atri.hasOwnProperty(i)) miElemento.setAttribute(i, obj_Atri[i]);
            }
    };

    //funcion para crear el DIV padre que aparecera en pantalla, con sus respectivos atributos e hijos
    const crearElemento = (element, attributes, children) => {
            let miElemento = document.createElement(element);

            if(children !== undefined) children.forEach(el => {
                    if(el.nodeType){
                        if(el.nodeType === 1 ||  el.nodeType === 11)
                            miElemento.appendChild(el);                      
                    } else{
                        miElemento.innerHTML+= el;
                    }
            });


                //Llamar funcion para añadir un objeto de atributos a mi elemento padre    
                agregarAtributos(miElemento, attributes);

                return miElemento;
    };


    var permisos = document.getElementsByClassName("ver_apr");    
    var idAprendiz = document.getElementsByClassName("id");
    
    
     for(var i=0; i<permisos.length; i++) {
        
        permisos[i].addEventListener("click", function(e){
            var per = e.target.id.substring(1);
            var perId = document.getElementById("id"+per).value;
            
            alert("soy un id" + perId);

            $.ajax({
                url: "servBuscarAprendiz",
                data: {
                  perId: perId,
                  ventana: "abrir"
                },
                    success: function(datos) {
                        alert(datos[1]);
                    //SEPARAMOS LOS DATOS QUE TRAE EL SERVLET CON OUT.PRINT
                    //TODOS LOS DATOS QUE IRÁN EN LA VENTANA QUEDAN EN EL ARREGLO DATOS
                    var datos = datos.split("|");
                    //Crear ventana (Llamar función enviandole los datos)
            
                        ventanaAprendiz(datos);
                  
 
                }
            });
            
        });
    
    }
    
    //Función para crear la ventana modal de la vista
    function ventanaAprendiz(datos) {
    //CREAR ELEMENTO DE LA VENTANA
    
    alert("se llamo la ventana");
        
    
        //este es el div principal que contiene al div ventana
        var contenedor = crearElemento("div", {id:""}, [datos[1]] );      
        document.body.appendChild(contenedor);
        
        contenedor.addEventListener("click", function(e){
            if(e.target === contenedor) document.body.removeChild(contenedor);
        });            
    }
    
    
    
});



