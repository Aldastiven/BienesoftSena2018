/****

* FESTIVOS DE COLOMBIA
 
***/
package modelo;


public class festivoSG {
    
    private String fes_nombre;
    private String fes_fecha;
    
    public festivoSG(){
    }

    public festivoSG(String fes_nombre, String fes_fecha) {
        this.fes_nombre = fes_nombre;
        this.fes_fecha = fes_fecha;
    }

    public String getFes_nombre() {
        return fes_nombre;
    }

    public void setFes_nombre(String fes_nombre) {
        this.fes_nombre = fes_nombre;
    }

    public String getFes_fecha() {
        return fes_fecha;
    }

    public void setFes_fecha(String fes_fecha) {
        this.fes_fecha = fes_fecha;
    }


    
    
}
