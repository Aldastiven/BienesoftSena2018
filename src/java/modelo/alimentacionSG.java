/*
 * GET-SET ALIMENTACION
 */
package modelo;

/**
 *
 * @author Stefany
 */
public class alimentacionSG {
    
    private int id;
    private int tipo;
    private String descrip;
    
    public alimentacionSG(int id, int tipo, String descrip) {
        this.id = id;
        this.tipo = tipo;
        this.descrip = descrip;
    }
    
    //consctrutor vacio
    public alimentacionSG(){
    
    }
    
    //GET&SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    //2vars
    public alimentacionSG(int tipo, String descrip) {
        this.tipo = tipo;
        this.descrip = descrip;
    }
    
    
    
    
    
    
    
    
}
