
package modelo;


public class aprendiz_rel_patrocinioSG {
    
   
    private int Patrocinio_Pat_ID;
    private int pat_Aprendiz_Apr_documento;
    private int Pat_numeroContrato;
    private String Pat_estado;
    private String Pat_fechaContrato;
    
    //contructor vacio
    public aprendiz_rel_patrocinioSG() {
    }
    
    //constructor
    public aprendiz_rel_patrocinioSG(int Patrocinio_Pat_ID, int pat_Aprendiz_Apr_documento, int Pat_numeroContrato, String Pat_estado, String Pat_fechaContrato) {
        this.Patrocinio_Pat_ID = Patrocinio_Pat_ID;
        this.pat_Aprendiz_Apr_documento = pat_Aprendiz_Apr_documento;
        this.Pat_numeroContrato = Pat_numeroContrato;
        this.Pat_estado = Pat_estado;
        this.Pat_fechaContrato = Pat_fechaContrato;
    }

    public int getPatrocinio_Pat_ID() {
        return Patrocinio_Pat_ID;
    }

    public void setPatrocinio_Pat_ID(int Patrocinio_Pat_ID) {
        this.Patrocinio_Pat_ID = Patrocinio_Pat_ID;
    }

    public int getPat_Aprendiz_Apr_documento() {
        return pat_Aprendiz_Apr_documento;
    }

    public void setPat_Aprendiz_Apr_documento(int pat_Aprendiz_Apr_documento) {
        this.pat_Aprendiz_Apr_documento = pat_Aprendiz_Apr_documento;
    }

    public int getPat_numeroContrato() {
        return Pat_numeroContrato;
    }

    public void setPat_numeroContrato(int Pat_numeroContrato) {
        this.Pat_numeroContrato = Pat_numeroContrato;
    }

    public String getPat_estado() {
        return Pat_estado;
    }

    public void setPat_estado(String Pat_estado) {
        this.Pat_estado = Pat_estado;
    }

    public String getPat_fechaContrato() {
        return Pat_fechaContrato;
    }

    public void setPat_fechaContrato(String Pat_fechaContrato) {
        this.Pat_fechaContrato = Pat_fechaContrato;
    }
    
    
    
    
    
    
    

   
    
    
}
