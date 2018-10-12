
package modelo;
/**
 *
 * @author Aldair
 */
public class patrocinioSG {
    
    private int Pat_ID;
    private String Pat_nombreEmpresa;
    
    //CONSTRUCTOR VACIO

    public patrocinioSG() {
    }
    
    //CONSTRUCTOR

    public patrocinioSG(int Pat_ID, String Pat_nombreEmpresa) {
        this.Pat_ID = Pat_ID;
        this.Pat_nombreEmpresa = Pat_nombreEmpresa;
    }
    
    //SET & GET

    public int getPat_ID() {
        return Pat_ID;
    }

    public void setPat_ID(int Pat_ID) {
        this.Pat_ID = Pat_ID;
    }

    public String getPat_nombreEmpresa() {
        return Pat_nombreEmpresa;
    }

    public void setPat_nombreEmpresa(String Pat_nombreEmpresa) {
        this.Pat_nombreEmpresa = Pat_nombreEmpresa;
    }
    
    //CONSTRUCTOR PARA QUE TOME EL VALOR DEL NOMBRE EN EL CRUD!!!!!

    public patrocinioSG(String Pat_nombreEmpresa) {
        this.Pat_nombreEmpresa = Pat_nombreEmpresa;
    }
            
    
}
