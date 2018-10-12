/*
 * ALIMENTO-REL-APRENDIZ
 */
package modelo;

/**
 *
 * @author Stefany
 */
public class Alimento_rel_AprendizSG {
    
    private int apid;
    private int aptipo;
    private int aprdoc;
    private String apfecha;
    private String apestado;
    private int apconteo;
    
    //CONSTRUCTOR
    public Alimento_rel_AprendizSG(int apid, int aptipo, int aprdoc, String apfecha, String apestado, int apconteo) {
        this.apid = apid;
        this.aptipo = aptipo;
        this.aprdoc = aprdoc;
        this.apfecha = apfecha;
        this.apestado = apestado;
        this.apconteo = apconteo;
    }
    
    //vacio
    public Alimento_rel_AprendizSG(){
    
    }

    //GET-SET
    public int getApid() {
        return apid;
    }

    public void setApid(int apid) {
        this.apid = apid;
    }

    public int getAptipo() {
        return aptipo;
    }

    public void setAptipo(int aptipo) {
        this.aptipo = aptipo;
    }

    public int getAprdoc() {
        return aprdoc;
    }

    public void setAprdoc(int aprdoc) {
        this.aprdoc = aprdoc;
    }

    public String getApfecha() {
        return apfecha;
    }

    public void setApfecha(String apfecha) {
        this.apfecha = apfecha;
    }

    public String getApestado() {
        return apestado;
    }

    public void setApestado(String apestado) {
        this.apestado = apestado;
    }

    public int getApconteo() {
        return apconteo;
    }

    public void setApconteo(int apconteo) {
        this.apconteo = apconteo;
    }
    
    

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
