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
        
        //Div NOMBRE aprendiz
        var titulo=crearElemento("p", {id:"msg_tit"},["NOMBRE DEL APRENDIZ"]);
        var inputDoc = crearElemento("p", {id:"input_msg_modal"}, [datos[1]]);
        var divDoc = crearElemento("p", {class:"perId"}, [titulo,inputDoc]);
        
        
        //Div para el INPUT Documento aprendiz
        var titulo=crearElemento("p", {id:"msg_tit"},["ID DEL APRENDIZ"]);
        var inputDoc = crearElemento("p", {id:"input_msg_modal"}, [datos[2]]);
        var divDoc = crearElemento("p", {class:"perId"}, [titulo,inputDoc]);
        
        //Div perTipo
        var titulo=crearElemento("p", {id:"msg_tit"},["TIPO"]);
        var inputPerTipo = crearElemento("p", {class:"perId"}, [datos[3]]);
        var divPerTipo = crearElemento("div", {class:"perId"}, [titulo, inputPerTipo]);
        
        //Div FechaSalida Aprendiz
        var titulo=crearElemento("p", {id:"msg_tit"},["FECHA DE SALIDA"]);
        var inputFSal = crearElemento("p", {class:"perId"}, [datos[4]]);
        var divFSal = crearElemento("div", {class:"perId"}, [titulo, inputFSal]);
        
        //Div FechaEntrada Aprendiz
        var titulo=crearElemento("p", {id:"msg_tit"},["FECHA DE ENTRADA"]);
        var inputFEnt = crearElemento("p", {class:"perId"}, [datos[5]]);
        var divFEnt = crearElemento("div", {class:"perId"}, [titulo, inputFEnt]);
        
        //Div HoraSalida estipulada Aprendiz
        var titulo=crearElemento("p", {id:"msg_tit"},["HORA DE SALIDA"]);
        var inputHSal = crearElemento("p", {class:"perId"}, [datos[6]]);
        var divHSal = crearElemento("div", {class:"perId"}, [titulo, inputHSal]);
        
        //Div HoraIngreso estipulada Aprendiz
        var titulo=crearElemento("p", {id:"msg_tit"},["HORA DE INGRESO"]);
        var inputHEnt = crearElemento("p", {class:"perId"}, [datos[7]]);
        var divHEnt = crearElemento("div", {class:"perId"}, [titulo, inputHEnt]);
        
        //Div Motivo
        var titulo=crearElemento("p", {id:"msg_tit"},["MOTIVO"]);
        var inputMotivo = crearElemento("p", {class:"input_txt_modal"}, [datos[8]]);
        var divMotivo = crearElemento("div", {class:"perId"}, [titulo, inputMotivo]);

        //CREAR SELECT PARA CAMBIAR ESTADO
        var titulo=crearElemento("p", {id:"msg_tit"},["ESTADO"]);
        var option0 = crearElemento("option", {value:""}, ["Respuesta a permiso"]);
        var option1 = crearElemento("option", {value:"Autorizado"}, ["Autorizar"]);
        var option2 = crearElemento("option", {value:"Denegado"}, ["Denegar"]);
        var comboEstado = crearElemento("select", {class:"browser-default", id:"selectEstado",name:"t_estado"}, [titulo, option0,option1,option2]);
        //CREA EVIDENCIA
        //Div Evidencia imagen
        var titulo=crearElemento("p", {id:"msg_tit"},["EVIDENCIA"]);
        var inputEvid = crearElemento("img", {class:"perId"}, [datos[9]]);
        var divEvid = crearElemento("div", {id:"divinterno"}, [titulo, inputEvid]);
        
        //BOTON ENVIAR
        var btnText = crearElemento("p", {id:"txt_buttom", class:"txt_buttom"},["Enviar"]);
        var btnEnviar=crearElemento("button", {type:"submit", name:"btn_actualizar", id:"btn_action_salida", class:"btn_action_salida l12  m12 s12"},[btnText]);

        //BOTON ELIMINAR
        var btnText = crearElemento("p", {id:"txt_buttom", class:"txt_buttom"},["Eliminar"]);
        var btnEliminar=crearElemento("button", {type:"submit", name:"btn-eliminar", id:"btn_action_eliminar", class:"btn_action_salida l12  m12 s12"},[btnText]);

        
        
        //Ventana:almacena todos los elementos creados
        var formulario = crearElemento("div", {id:"ventana"}, [encab, divInput, divDoc, divPerTipo, divFSal, divFEnt, divHSal,divHEnt, divMotivo,comboEstado,divEvid, btnEnviar, btnEliminar]);
        
        //ETIQUETA FORM: para trabajar con el Servlet
        var form = crearElemento("form", {action:"ServletPermiso", enctype:"multipart/form-data", method:"post"}, [formulario]  );
        
        var contenedor = crearElemento("div", {id:"modal-background-coordinador"}, [form] );
        
        document.body.appendChild(contenedor);
        
        
    }
    
    
    
    

});



