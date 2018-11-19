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
        

        //Div para el Input perId
        var inputId = crearElemento("input", {type:"number", name:"perId", class:"inputId"}, ["ID"] );
        var labelId = crearElemento("label", {class:"labelId"}, [datos[0]]);
        var divId = crearElemento("div", {id:"divId"}, [inputId,labelId]);
        
        //Nombre del aprendiz
        var titNom = crearElemento("h2", {id:"titNom"}, [datos[1]]);
        
        
        
        var perId = crearElemento("p", {id:"input_msg_modal"}, [datos[0]]);
        var divInput=crearElemento("div", {class:"perId"}, [perId]);
        
        //Div para el INPUT Documento aprendiz
        var inputDoc = crearElemento("p", {id:"input_txt_modal"}, [datos[1]]);
        var divDoc = crearElemento("input", {class:"perId"}, [inputDoc]);
        
        //Div perTipo
        var inputPerTipo = crearElemento("p", {class:"perId"}, [datos[2]]);
        var divPerTipo = crearElemento("div", {class:"perId"}, [inputPerTipo]);
        
        //Div FechaSalida
        var inputFSal = crearElemento("p", {class:"perId"}, [datos[3]]);
        var divFSal = crearElemento("div", {class:"perId"}, [inputFSal]);
        
        //Div HoraSalida
        var inputHSal = crearElemento("p", {class:"perId"}, [datos[4]]);
        var divHSal = crearElemento("div", {class:"perId"}, [inputHSal]);
        
        //Div Motivo
        var inputMotivo = crearElemento("p", {class:"input_txt_modal"}, [datos[5]]);
        var divMotivo = crearElemento("div", {class:"perId"}, [inputMotivo]);

        //CREAR SELECT PARA CAMBIAR ESTADO
        var option1 = crearElemento("option", {class:"op", value:"Autorizado"}, ["Autorizado"]);
        var option2 = crearElemento("option", {class:"op", value:"Denegado"}, ["Denegado"]);
        var comboEstado = crearElemento("select", {id:"selectEstado"}, [option1,option2] );
        //CREA EVIDENCIA
        //Div Evidencia imagen
        var inputEvid = crearElemento("img", {class:"perId"}, [datos[6]]);
        var divEvid = crearElemento("div", {id:"divinterno"}, [inputEvid]);
       
        
//        var observ= crearElemento("label", {class:"perTipo"}, [datos[7]]);//observacion
//        var motivo= crearElemento("label", {class:"perTipo"}, [datos[8]]);//motivo
//        var titNom = crearElemento("h2", {id:"titNom"}, [datos[0]]);
//        var titTipo = crearElemento("p", {id:"titTipo"}, [datos[1]] );
        
        //Ventana:almacena todos los elementos creados
        var formulario = crearElemento("div", {id:"ventana"}, [divInput,, divDoc, divPerTipo, divFSal, divHSal,divMotivo,comboEstado,divEvid]);
        var contenedor = crearElemento("div", {id:"modal-background-coordinador"}, [formulario] );
        
//        console.log(ventana);
        console.log(contenedor);
        //MOSTRAR VENTANA EN PANTALLA
        //document.body.appendChild(formulario);
        document.body.appendChild(contenedor);
        
        
    }
    
    
    
    

});



