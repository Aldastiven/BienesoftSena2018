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
        
        //encabezado del formulario
        var encab = crearElemento("p", {id:"ppp"}, ["Permiso"]);
        var titulo=crearElemento("p", {id:"msg_tit"},["ID DEL PERMISO"]);
        var perId = crearElemento("p", {id:"input_msg_modal"}, [datos[0]]);
        var contencab = crearElemento("div", {id:"con-encab"}, [encab]);

        
        var divInput=crearElemento("div", {class:"perId"}, [titulo,perId]);
        
        //Div para el INPUT Documento aprendiz
        var titulo=crearElemento("p", {id:"msg_tit"},["ID DEL APRENDIZ"]);
        var inputDoc = crearElemento("p", {id:"input_msg_modal"}, [datos[1]]);
        var divDoc = crearElemento("p", {class:"perId"}, [titulo,inputDoc]);
        
        //Div perTipo
        var titulo=crearElemento("p", {id:"msg_tit"},["TIPO"]);
        var inputPerTipo = crearElemento("p", {class:"perId"}, [datos[2]]);
    var divPerTipo = crearElemento("div", {class:"perId"}, [titulo, inputPerTipo]);
        
        //Div FechaSalida
        var msg=crearElemento("p", {id:"msg_tit"},["FECHA DE SALIDA"]);
        var inputFSal = crearElemento("p", {class:"perId"}, [datos[3]]);
        var divFSal = crearElemento("div", {class:"perId"}, [inputFSal]);
        
        //Div FechaEntrada
        var msg=crearElemento("p", {id:"msg_tit"},["FECHA DE ENTRADA"]);
        var inputFSal = crearElemento("p", {class:"perId"}, [datos[3]]);
        var divFSal = crearElemento("div", {class:"perId"}, [inputFSal]);
        
        //Div HoraSalida
        var msg=crearElemento("p", {id:"msg_tit"},["FECHA DE SALIDA"]);
        var inputHSal = crearElemento("p", {class:"perId"}, [datos[4]]);
        var divHSal = crearElemento("div", {class:"perId"}, [inputHSal]);
        
        //Div HoraEntrada
        var msg=crearElemento("p", {id:"msg_tit"},["FECHA DE ENTRADA"]);
        var inputHSal = crearElemento("p", {class:"perId"}, [datos[4]]);
        var divHSal = crearElemento("div", {class:"perId"}, [inputHSal]);
        
        //Div Motivo
        var inputMotivo = crearElemento("p", {class:"input_txt_modal"}, [datos[5]]);
        var divMotivo = crearElemento("div", {class:"perId"}, [inputMotivo]);

        //CREAR SELECT PARA CAMBIAR ESTADO
        var option0 = crearElemento("option", {value:""}, ["Respuesta a permiso"]);
        var option1 = crearElemento("option", {value:"Autorizado"}, ["Autorizar"]);
        var option2 = crearElemento("option", {value:"Denegado"}, ["Denegar"]);
        var comboEstado = crearElemento("select", {class:"browser-default", id:"selectEstado",name:"t_estado"}, [option0,option1,option2]);
        //CREA EVIDENCIA
        //Div Evidencia imagen
        var inputEvid = crearElemento("img", {class:"perId"}, [datos[6]]);
        var divEvid = crearElemento("div", {id:"divinterno"}, [inputEvid]);




        //Ventana:almacena todos los elementos creados
        var formulario = crearElemento("div", {id:"ventana"}, [encab, divInput, divDoc, divPerTipo, divFSal, divHSal,divMotivo,comboEstado,divEvid]);
        var contenedor = crearElemento("div", {id:"modal-background-coordinador"}, [formulario] );
        
        console.log(comboEstado);
//        console.log(contenedor);
        //MOSTRAR VENTANA EN PANTALLA
        //document.body.appendChild(formulario);
        document.body.appendChild(contenedor);
        
        
    }
    
    
    
    

});



