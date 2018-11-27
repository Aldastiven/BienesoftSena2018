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
            var rol = document.getElementById("user_text").innerHTML;
            $.ajax({
                url: "servBuscarPermisos",
                data: {
                  perId: perId,
                  ventana: "abrir",
                  rol: rol
                },
                    success: function( datosPermiso ) {
                    //SEPARAMOS LOS DATOS QUE TRAE EL SERVLET CON OUT.PRINT
                    //TODOS LOS DATOS QUE IRÁN EN LA VENTANA QUEDAN EN EL ARREGLO DATOS
                    var datos = datosPermiso.split("|");
                    //Crear ventana (Llamar función enviandole los datos)
                    var rol = document.getElementById("user_text").innerHTML;
                    
                    if (rol==="Seguridad"){
                        ventanaSeguridad(datos);
                    }else if(rol==="Coordinador"){
                        ventanaCoordinador(datos);
                    }

                }
            });
            
        });
    
    }
    
    //Función para crear la ventana modal coordinador
    function ventanaCoordinador(datos) {
      
    //CREAR ELEMENTO DE LA VENTANA
        
        //encabezado del formulario
        var encab = crearElemento("h1", {id:"ppp"}, ["Permiso"]);
        var titulo=crearElemento("p", {id:"msg_tit_id"},["ID"]);
        var perId = crearElemento("input", { name:"t_Id", id:"input_tit_id", class:"browser-default", type:"number", value:[datos[0]]}, [datos[0]]);
        var divencabezado = crearElemento("div",{id:"enacabezado_per"},[perId,titulo,encab]);
  
        //ID Permiso 0
	var titulo=crearElemento("p", {id:"msg_tit"},["ID DEL PERMISO"]);
        var perId = crearElemento("input", { name:"t_Id", class:"browser-default", type:"number", value:[datos[0]]});
        var divId=crearElemento("div", {class:"perId"}, [titulo,perId]);

        //Nombre aprendiz 1
        var titulo=crearElemento("p", {id:"msg_tit"},["NOMBRE DEL APRENDIZ"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name: "" ,type:"text"}, [datos[1]] );
        var divNom = crearElemento("p", {class:"perId"}, [titulo,inputNom]);

        //Doc Aprendiz 2
        var titulo=crearElemento("p", {id:"msg_tit"},["DOCUMENTO APRENDIZ"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name: "" ,type:"number"}, [datos[2]] );
        var divDocApr = crearElemento("p", {class:"perId"}, [titulo,inputNom]);

        //Numero de ficha 3
       var titulo=crearElemento("p", {id:"msg_tit"},["NUMERO DE FICHA"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name: "" ,type:"number"}, [datos[3]] );
        var divNumFic = crearElemento("p", {class:"perId"}, [titulo,inputNom]);

        //Nombre de la ficha o programa 4
        var titulo=crearElemento("p", {id:"msg_tit"},["NOMBRE DEL PROGRAMA"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name: "" ,type:"text"}, [datos[4]] );
        var divNomPro = crearElemento("p", {class:"perId"}, [titulo,inputNom]);      
        
        //Tipo permiso 5
        var titulo=crearElemento("p", {id:"msg_tit"},["TIPO"]);
        var inputPerTipo = crearElemento("p", {name:"tipoper",class:"perId",type:"text"}, [datos[5]]);
        var divPerTipo = crearElemento("div", {class:"perId"}, [titulo, inputPerTipo]);
       
        //Fecha salida estipulada Aprendiz 6
        var titulo=crearElemento("p", {id:"msg_tit"},["FECHA DE SALIDA"]);
        var inputFSal = crearElemento("p", {name:"t_fechsal",class:"perId", type:"date"}, [datos[6]]);
        var divFSal = crearElemento("div", {class:"perId"}, [titulo, inputFSal]);

        //Fecha ingreso estipulada Aprendiz 7
        var titulo=crearElemento("p", {id:"msg_tit"},["FECHA DE INGRESO"]);
        var inputFEnt = crearElemento("p", {name:"t_fechingre", class:"perId", type:"date"}, [datos[7]]);
        var divFEnt = crearElemento("div", {class:"perId"}, [titulo, inputFEnt]);
        
        //Hora salida estipulada Aprendiz 8
        var titulo=crearElemento("p", {id:"msg_tit"},["HORA DE SALIDA"]);
        var inputHSal = crearElemento("p", {name:"t_horasal",class:"perId", type:"time"}, [datos[8]]);
        var divHSal = crearElemento("div", {class:"perId"}, [titulo, inputHSal]);

        //Hora Ingreso estipulada Aprendiz 9
        var titulo=crearElemento("p", {id:"msg_tit"},["HORA DE INGRESO"]);
        var inputHEnt = crearElemento("p", {name:"t_horaingre", class:"perId", type:"time"}, [datos[9]]);
        var divHEnt = crearElemento("div", {class:"perId"}, [titulo, inputHEnt]);
       
       //Motivo 10
        var titulo=crearElemento("p", {id:"msg_tit"},["MOTIVO"]);
        var inputMotivo = crearElemento("p", {name:"t_moti", class:"input_txt_modal", type:"text"}, [datos[10]]);
        var divMotivo = crearElemento("div", {class:"perId"}, [titulo, inputMotivo]);

        //Estado Despliegue 10
        var option1 = crearElemento("option", {value:"Autorizado"}, ["Autorizar"]);
        var option2 = crearElemento("option", {value:"Denegado"}, ["Denegar"]);
        var comboEstado = crearElemento("select", {name:"t_estado", class:"browser-default",id:"selectEstado"}, [option1,option2]);
         
        //Autoriza (nombre)11
        var titulo=crearElemento("p", {id:"msg_tit"},["AUTORIZA"]);
        var inputAut = crearElemento("p", {name:"t_autoriza", class:"perId", type:"text"});
        var divAut = crearElemento("div", {id:"divinterno"}, [titulo, inputAut]);
        
         
        //Nombre del Coordinador 11
//        var coorNom = document.getElementsByClassName("userNom")[0].innerHTML;
//        var corNom = crearElemento("input", {type:"text", id:"corNom", value:coorNom, name:"coordinador"});
        
//        //Hora Ingreso real Aprendiz
//        var titulo=crearElemento("p", {id:"msg_tit"},["HORA DE INGRESO REAL"]);
//        var inputHEnt = crearElemento("p", {name:"t_horaingre", class:"perId", type:"time"}, [datos[11]]);
//        var divHEnt = crearElemento("div", {class:"perId"}, [titulo, inputHEnt]);
//        
//       //Fecha Ingreso real Aprendiz
//        var titulo=crearElemento("p", {id:"msg_tit"},["FECHA DE INGRESO REAL"]);
//        var inputHEnt = crearElemento("p", {name:"t_horaingre", class:"perId", type:"date"}, [datos[12]]);
//        var divHEnt = crearElemento("div", {class:"perId"}, [titulo, inputHEnt]);
//        
        //Observacion
//        var titulo=crearElemento("p", {id:"msg_tit"},["OBSERVACION"]);
//        var inputObserv = crearElemento("p", {class:"perId", name:"t_obser", type:"text"});
//        var divObserv = crearElemento("div", {class:"perId"}, [titulo, inputObserv]);
                 
        //Div Evidencia
//        var titulo=crearElemento("p", {id:"msg_tit"},["EVIDENCIA"]);
//        var img = crearElemento("img", {name:"t_evidenciaAdjunta", class:"perId"}, [datos[11]]);//probar imagen con imput (si hay)
//        var divEvid = crearElemento("div", {id:"divinterno"}, [titulo, img]);
//             

        
        
        //BOTON ENVIAR
        var btnText = crearElemento("p", {id:"txt_buttom", class:"txt_buttom"},["Enviar"]);
        var btnEnviar=crearElemento("button", {type:"submit", name:"btn-actualizaEstado" , id:"btn_action_salida", class:"btn_action_salida l12  m12 s12"},[btnText]);

        //BOTON ELIMINAR
        var btnText = crearElemento("p", {id:"txt_buttom", class:"txt_buttom"},["Eliminar"]);
        var btnEliminar=crearElemento("button", {type:"submit", name:"btn-eliminar", id:"btn_action_eliminar", class:"btn_action_salida l12  m12 s12"},[btnText]);

        
        
        //este es el fomr que contiene los campos a actualizar
        var form = crearElemento("form", {action:"ServletPermiso", enctype:"multipart/form-data", method:"post"}, [ divencabezado,
                                                                                                                    divId,
                                                                                                                    divNom,
                                                                                                                    divDocApr,
                                                                                                                    divNumFic,
                                                                                                                    divNomPro,
                                                                                                                    divPerTipo,
                                                                                                                    divFSal,
                                                                                                                    divFEnt,
                                                                                                                    divHSal,
                                                                                                                    divHEnt,
                                                                                                                    divMotivo,
                                                                                                                    comboEstado,
                                                                                                                    divAut, 
                                                                                                                    btnEnviar, btnEliminar]  );
        //este es el div que contiene al form
        var ventana = crearElemento("div", {id:"ventana"}, [form]);

        //este es el div principal que contiene al div ventana
        var contenedor = crearElemento("div", {id:"modal-background-coordinador"}, [ventana] );      
        document.body.appendChild(contenedor);
        
        contenedor.addEventListener("click", function(e){
            if(e.target === contenedor) document.body.removeChild(contenedor);
        });            
    }
    
    
    
    
     //Función para crear la ventana modal seguridad
    function ventanaSeguridad(datos) {
      
    //CREAR ELEMENTO DE LA VENTANA
        
        //encabezado del formulario
        var encab = crearElemento("h1", {id:"ppp"}, ["Permiso"]);
        var titulo=crearElemento("p", {id:"msg_tit_id"},["ID"]);
        var perId = crearElemento("input", { name:"t_Id", id:"input_tit_id", class:"browser-default", type:"text", value:[datos[0]]}, [datos[0]]);
        var divencabezado = crearElemento("div",{id:"enacabezado_per"},[perId,titulo,encab]);
    
        //ID Permiso
//	var titulo=crearElemento("p", {id:"msg_tit"},["ID DEL PERMISO"]);
//        var perId = crearElemento("input", { name:"t_Id", class:"browser-default", type:"number", value:[datos[0]]}, [datos[0]]);
//        var divId=crearElemento("div", {class:"perId"}, [titulo,perId]);
                
        //Nombre aprendiz
        var titulo=crearElemento("p", {id:"msg_tit"},["NOMBRE DEL APRENDIZ"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name: "" ,type:"text"}, [datos[1]] );
        var divNom = crearElemento("p", {class:"perId"}, [titulo,inputNom]);

	//Documento aprendiz
        var titulo=crearElemento("p", {id:"msg_tit"},["DOC DEL APRENDIZ"]);
        var inputDoc = crearElemento("p", {name:"t_numerodocumento",id:"input_msg_modal",type:"number"}, [datos[2]]);
        var divDoc = crearElemento("div", {class:"perId"}, [titulo,inputDoc]);

        //Tipo permiso
        var titulo=crearElemento("p", {id:"msg_tit"},["TIPO"]);
        var inputPerTipo = crearElemento("p", {name:"tipoper",class:"perId",type:"text"}, [datos[3]]);
        var divPerTipo = crearElemento("div", {class:"perId"}, [titulo, inputPerTipo]);
                
        //Fecha salida estipulada Aprendiz
        var titulo=crearElemento("p", {id:"msg_tit"},["FECHA DE SALIDA"]);
        var inputFSal = crearElemento("p", {name:"t_fechsal",class:"perId", type:"date"}, [datos[4]]);
        var divFSal = crearElemento("div", {class:"perId"}, [titulo, inputFSal]);

        //Fecha ingreso estipulada Aprendiz
        var titulo=crearElemento("p", {id:"msg_tit"},["FECHA DE INGRESO"]);
        var inputFEnt = crearElemento("p", {name:"t_fechingre", class:"perId", type:"date"}, [datos[5]]);
        var divFEnt = crearElemento("div", {class:"perId"}, [titulo, inputFEnt]);
        
        //Hora salida estipulada Aprendiz
        var titulo=crearElemento("p", {id:"msg_tit"},["HORA DE SALIDA"]);
        var inputHSal = crearElemento("p", {name:"t_horasal",class:"perId", type:"time"}, [datos[6]]);
        var divHSal = crearElemento("div", {class:"perId"}, [titulo, inputHSal]);

        //Hora Ingreso estipulada Aprendiz
        var titulo=crearElemento("p", {id:"msg_tit"},["HORA DE INGRESO"]);
        var inputHEnt = crearElemento("p", {name:"t_horaingre", class:"perId", type:"time"}, [datos[7]]);
        var divHEnt = crearElemento("div", {class:"perId"}, [titulo, inputHEnt]);
        
        //Observacion
        var titulo=crearElemento("p", {id:"msg_tit"},["OBSERVACION"]);
        var inputObserv = crearElemento("p", {class:"perId", name:"t_obser", type:"text"});
        var divObserv = crearElemento("div", {class:"perId"}, [titulo, inputObserv]);
                
        //Motivo
        var titulo=crearElemento("p", {id:"msg_tit"},["MOTIVO"]);
        var inputMotivo = crearElemento("p", {name:"t_moti", class:"input_txt_modal", type:"text"}, [datos[8]]);
        var divMotivo = crearElemento("div", {class:"perId"}, [titulo, inputMotivo]);

        //Estado Despliegue
        //var option1 = crearElemento("option", {value:"Autorizado"}, ["Autorizar"]);
        //var option2 = crearElemento("option", {value:"Denegado"}, ["Denegar"]);
        //var comboEstado = crearElemento("select", {name:"t_estado", class:"browser-default",id:"selectEstado"}, [option1,option2]);
        
        var titulo=crearElemento("p", {id:"msg_tit"},["ESTADO"]);
        var inputAut = crearElemento("p", {name:"t_estado", class:"perId", type:"text"}, [datos[9]]);
        var comboEstado = crearElemento("div", {id:"divinterno"}, [titulo, inputAut]);

        //Autoriza (nombre)
        var titulo=crearElemento("p", {id:"msg_tit"},["AUTORIZA"]);
        var inputAut = crearElemento("p", {name:"t_autoriza", class:"perId", type:"text"}, [datos[10]]);
        var divAut = crearElemento("div", {id:"divinterno"}, [titulo, inputAut]);
           
        //Div Evidencia
        var titulo=crearElemento("p", {id:"msg_tit"},["EVIDENCIA"]);
        var img = crearElemento("img", {name:"t_evidenciaAdjunta", class:"perId"}, [datos[11]]);//probar imagen con imput (si hay)
        var divEvid = crearElemento("div", {id:"divinterno"}, [titulo, img]);
               
        //BOTON OK
        var btnText = crearElemento("p", {id:"txt_buttom", class:"txt_buttom"},["OK"]);
        var btnEnviar=crearElemento("button", {type:"submit", name:"btn-autorizado" , id:"btn_action_salida", class:"btn_action_salida l12  m12 s12"},[btnText]);
  
        
        //este es el fomr que contiene los campos a actualizar
        var form = crearElemento("form", {action:"ServletPermiso", enctype:"multipart/form-data", method:"post"}, [divencabezado, divNom, divDoc, divPerTipo, divFSal, divFEnt, divHSal,divHEnt, divObserv, divMotivo, comboEstado, divAut, divEvid, btnEnviar]  );

        //este es el div que contiene al form
        var ventana = crearElemento("div", {id:"ventana"}, [form]);

        //este es el div principal que contiene al div ventana
        var contenedor = crearElemento("div", {id:"modal-background-coordinador"}, [ventana] );      
        document.body.appendChild(contenedor);
        
        contenedor.addEventListener("click", function(e){
            if(e.target === contenedor) document.body.removeChild(contenedor);
        });            
    }
});



