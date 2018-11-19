$(document).ready(function(){
    
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
                  ventana: "abrir"
                },
                    success: function( datosPermiso ) {
                    //SEPARAMOS LOS DATOS QUE TRAE EL SERVLET CON OUT.PRINT
                    //TODOS LOS DATOS QUE IRÁN EN LA VENTANA QUEDAN EN EL ARREGLO DATOS
                    var datos = datosPermiso.split("|");
                    //Crear ventana (Llamar función enviandole los datos)
                    ventanaPermiso(datos);
                    

                }
            });
            
        });
    }
    
    
    //Función para crear la ventana modal
    function ventanaPermiso(datos) {
        
        //CREAR ELEMENTO DE LA VENTANA
        var otrodiv=crearElemento("div", {id:"input_msg_modal"}, ["Hola prueba"] );
        var perId = crearElemento("p", {class:"perId"}, [datos[0]] );
        var aprdoc= crearElemento("p", {class:"aprDoc"},  [datos[1]]);
        var perTip= crearElemento("p", {class:"perTipo"}, [datos[2]]);
        var fSalid= crearElemento("p", {class:"fSalida"}, [datos[3]]);
        var hSalid= crearElemento("p", {class:"hSalida"}, [datos[4]]);
        var motivo= crearElemento("p", {class:"motivo"},  [datos[5]]);

        var input = crearElemento("input", {id:"input"}, [perId, aprdoc, perTip, fSalid, hSalid, motivo]);
        //CREAR SELECT PARA CAMBIAR ESTADO
        var option1 = crearElemento("option", {class:"op", value:"Autorizado"}, ["Autorizado"]);
        var option2 = crearElemento("option", {class:"op", value:"Denegado"}, ["Denegado"]);
        var comboEstado = crearElemento("select", {id:"selectEstado"}, [option1,option2] );
        //CREA EVIDENCIA
        var evidencia = crearElemento("img", {id:"imagenevidenc"}, [datos[6]] );
        
//        var observ= crearElemento("label", {class:"perTipo"}, [datos[7]]);//observacion
//        var motivo= crearElemento("label", {class:"perTipo"}, [datos[8]]);//motivo
//        var titNom = crearElemento("h2", {id:"titNom"}, [datos[0]]);
//        var titTipo = crearElemento("p", {id:"titTipo"}, [datos[1]] );
        
        //Ventana:almacena todos los elementos creados
        var ventana = crearElemento("div", {class:"modal-cont", id:"ventana"}, [otrodiv, input, comboEstado, evidencia]);
        var divPrincipal = crearElemento("div", {class:"divPrincipal", id:"modal-background-coordinador"}, [ventana] );
        
        //MOSTRAR VENTANA EN PANTALLA
        document.body.appendChild(divPrincipal);
        
    }
    

});



