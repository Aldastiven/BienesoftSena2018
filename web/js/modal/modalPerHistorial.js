//MODAL DE PERMISO-HISTORIAL
/****modalPerHistorial***/
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
                url: "servBuscarPermisos_Historial",
                data: {
                  perId: perId,
                  ventana: "abrir"
                },
                    success: function(datos) {
              
                    //SEPARAMOS LOS DATOS QUE TRAE EL SERVLET CON OUT.PRINT
                    //TODOS LOS DATOS QUE IRÁN EN LA VENTANA QUEDAN EN EL ARREGLO DATOS
                    var datos = datos.split("|");
                    //Crear ventana (Llamar función enviandole los datos)
            
                        ventanaCoordinadorHistory(datos);
                  
 
                }
            });
            
        });
    
    }
//Función para crear la ventana modal coordinador
    function ventanaCoordinadorHistory(datos) {
      
    //CREAR ELEMENTO DE LA VENTANA
        
        /**********************************info header**********************************************/
        
                    var encab = crearElemento("h1", {id:"ppp"}, ["Permiso"]);
                var perId = crearElemento("input", { name:"t_Id", id:"input_tit_id", class:"browser-default", type:"number", value:[datos[0]]}, [datos[0]]);   
                var titulo=crearElemento("p", {class:"tip"},["Tipo :"]);
                var perTipo = crearElemento("p", {name:"tipoper",class:"infotip",type:"text"}, [datos[3]]);
            var contID = crearElemento("div",{id:"contID"}, [perId]);
            var contTipo = crearElemento("div",{id:"contTipo"}, [titulo,perTipo]);
        var divencabezado = crearElemento("div",{id:"enacabezado_per"},[contID,contTipo,encab]);
      
  
  
        /**********************************info aprendiz**********************************************/
        
        var titulo_cont=crearElemento("h1", {id:"titulo_cont"}, ["info. del Aprendiz"]);
        
        //Nombre aprendiz 1
        var titulo=crearElemento("p", {id:"msg_tit"},["NOMBRE DEL APRENDIZ"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name: "" ,type:"text"}, [datos[1]] );
        var divNom = crearElemento("p", {class:"perId"}, [titulo_cont, titulo, inputNom]);

        //Documento del aprendiz 2
        var titulo=crearElemento("p", {id:"msg_tit"},["DOCUMENTO DEL APRENDIZ"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name: "t_numerodocumento" ,type:"number"}, [datos[2]] );
        var divDocApr = crearElemento("p", {class:"perId"}, [titulo,inputNom]);
        
        //Numero del programa de formacion 12
        var titulo=crearElemento("p", {id:"msg_tit"},["N° FICHA"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name: "" ,type:"number"}, [datos[12]] );
        var divficha = crearElemento("p", {class:"perId"}, [titulo,inputNom]);
        
        //Nombre del programa de formacion 13
        var titulo=crearElemento("p", {id:"msg_tit"},["NOMBRE PROGRAMA"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name: "" ,type:"text"}, [datos[13]] );
        var divfichaNom = crearElemento("p", {class:"perId"}, [titulo,inputNom]);
        
        var contenedor_infoAprendiz=crearElemento("div", {id:"cont_apr"}, [divNom, divDocApr, divficha, divfichaNom]);
        
        /**********************************info permiso**********************************************/
        
        var titulo_cont=crearElemento("h1", {id:"titulo_cont"}, ["info. del Permiso"]);
        
        //Permiso fecha salida
        var titulo=crearElemento("p", {id:"msg_tit"},["FECHA DE SALIDA (estipulada por el aprendiz)"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name: "t_fechsal" ,type:"date"}, [datos[4]] );
        var divFSal = crearElemento("p", {class:"perId"}, [titulo,inputNom]);
        
        //Permiso fecha ingreso
        var titulo=crearElemento("p", {id:"msg_tit"},["FECHA DE INGRESO (estipulada por el aprendiz)"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name: "t_fechingre" ,type:"date"}, [datos[5]] );
        var divFEnt = crearElemento("p", {class:"perId"}, [titulo,inputNom]);
        
        //Permiso hora salida
        var titulo=crearElemento("p", {id:"msg_tit"},["HORA DE SALIDA (estipulada por el aprendiz)"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name: "t_horasal" ,type:"time"}, [datos[6]] );
        var divHSal = crearElemento("p", {class:"perId"}, [titulo,inputNom]);
        
        //Permiso hora ingreso
        var titulo=crearElemento("p", {id:"msg_tit"},["HORA DE INGRESO (estipulada por el aprendiz)"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name: "t_horaingre" ,type:"time"}, [datos[7]] );
        var divHEnt = crearElemento("p", {class:"perId"}, [titulo,inputNom]);
        
        //Permiso fecha de salida real
        var titulo=crearElemento("p", {id:"msg_tit"},["FECHA DE SALIDA REAL"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name: "" ,type:"date"}, [datos[14]] );
        var divFSR = crearElemento("p", {class:"perId"}, [titulo,inputNom]);
        
        //Permiso hora de salida real
        var titulo=crearElemento("p", {id:"msg_tit"},["HORA DE SALIDA REAL"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name: "" ,type:"time"}, [datos[15]] );
        var divHSR = crearElemento("p", {class:"perId"}, [titulo,inputNom]);
        
        //Permiso fecha de ingreso real
        var titulo=crearElemento("p", {id:"msg_tit"},["FECHA DE INGRESO REAL"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name:"" ,type:"date"}, [datos[16]] );
        var divFIR = crearElemento("p", {class:"perId"}, [titulo,inputNom]);
        
        //Permiso hora de ingreso real
        var titulo=crearElemento("p", {id:"msg_tit"},["HORA DE INGRESO REAL"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name: "" ,type:"time"}, [datos[17]] );
        var divHIR = crearElemento("p", {class:"perId"}, [titulo,inputNom]);
        
        //Permiso Motivo
        var titulo=crearElemento("p", {id:"msg_tit"},["MOTIVO"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name: "t_moti" ,type:"text"}, [datos[8]] );
        var divMotivo = crearElemento("p", {class:"perId"}, [titulo,inputNom]);
    
        //Permiso Observacion del permiso
        var titulo=crearElemento("p", {id:"msg_tit"},["OBSERVACION"]);
        var inputNom = crearElemento("p", {id:"input_msg_modal", name: "t_moti" ,type:"text"}, [datos[18]] );
        var divObservacion = crearElemento("p", {class:"perId"}, [titulo,inputNom]);
    
    
         //Evidencia
        var titulo=crearElemento("p", {id:"msg_tit"},["EVIDENCIA"]);
        var img = crearElemento("img", {name:"t_evidenciaAdjunta", class:"perId", src:datos[11]} );//probar imagen con imput (si hay)
        var divEvid = crearElemento("div", {id:"divinterno"}, [titulo, img]);
        
        
        var contenedor_infoPermiso=crearElemento("div", {id:"cont_per"}, [titulo_cont, divFSal, divFEnt, divHSal, divHEnt, divFSR, divHSR, divFIR, divHIR, divMotivo, divEvid, divObservacion]);
        
        /**********************************Gestion Autoriza**********************************************/
        
        var titulo_cont=crearElemento("h1", {id:"titulo_cont"}, ["Autorizacion"]);
        
        //Estado Despliegue
        var titulo=crearElemento("p", {id:"msg_tit"},["Autoriza"]);
        var inputNom = crearElemento("p", {class:"perId", name:"t_obser", type:"text", value:datos[10]}, [datos[10]]);
        var divEstado = crearElemento("div", {class:"perId"}, [titulo, inputNom]);
        
        //Estado
        var titulo=crearElemento("p", {id:"msg_tit"},["Estado"]);
        var inputNom = crearElemento("p", {class:"perId", name:"t_obser", type:"text", value:datos[9]}, [datos[9]]);
        var divAutoriza = crearElemento("div", {class:"perId"}, [titulo, inputNom]);
         
        var contenedor_Autorizacion=crearElemento("div", {id:"cont_Autorizacion"}, [titulo_cont, divEstado, divAutoriza]);
        
        
        
        
        //este es el fomr que contiene los campos a actualizar
        var form = crearElemento("form", {action:"ServletPermiso", enctype:"multipart/form-data", method:"post"}, [ divencabezado,
                                                                                                                    contenedor_infoAprendiz,
                                                                                                                    contenedor_infoPermiso,
                                                                                                                    contenedor_Autorizacion
                                                                                                                  ]  );
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



