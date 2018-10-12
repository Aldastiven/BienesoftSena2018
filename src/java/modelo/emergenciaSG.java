package modelo;

/**
 *
 * @author lenovo
 */
public class emergenciaSG {
    private int sal_ID;
    private int Sal_Aprendiz_Apr_documento;  
    private String sal_motivoEmergente;
    private String  Sal_fechaSalida;
    private String sal_fechaIngreso;
    private String  Sal_horaSalida;
    private String sal_horaIngreso;
    private int sal_documentoAcompaniante;
    private String sal_autoriza;
    private String  Sal_evidenciaAdjunta;
    
    //CONSTRUCTOR VACIO

    public emergenciaSG() {
    }
    //CONSTRUCTOR

    public emergenciaSG(int sal_ID, int Sal_Aprendiz_Apr_documento, String sal_motivoEmergente, String Sal_fechaSalida, String sal_fechaIngreso, String Sal_horaSalida, String sal_horaIngreso, int sal_documentoAcompaniante, String sal_autoriza, String Sal_evidenciaAdjunta) {
        this.sal_ID = sal_ID;
        this.Sal_Aprendiz_Apr_documento = Sal_Aprendiz_Apr_documento;
        this.sal_motivoEmergente = sal_motivoEmergente;
        this.Sal_fechaSalida = Sal_fechaSalida;
        this.sal_fechaIngreso = sal_fechaIngreso;
        this.Sal_horaSalida = Sal_horaSalida;
        this.sal_horaIngreso = sal_horaIngreso;
        this.sal_documentoAcompaniante = sal_documentoAcompaniante;
        this.sal_autoriza = sal_autoriza;
        this.Sal_evidenciaAdjunta = Sal_evidenciaAdjunta;
    }

    public int getSal_ID() {
        return sal_ID;
    }

    public void setSal_ID(int sal_ID) {
        this.sal_ID = sal_ID;
    }

    public int getSal_Aprendiz_Apr_documento() {
        return Sal_Aprendiz_Apr_documento;
    }

    public void setSal_Aprendiz_Apr_documento(int Sal_Aprendiz_Apr_documento) {
        this.Sal_Aprendiz_Apr_documento = Sal_Aprendiz_Apr_documento;
    }

    public String getSal_motivoEmergente() {
        return sal_motivoEmergente;
    }

    public void setSal_motivoEmergente(String sal_motivoEmergente) {
        this.sal_motivoEmergente = sal_motivoEmergente;
    }

    public String getSal_fechaSalida() {
        return Sal_fechaSalida;
    }

    public void setSal_fechaSalida(String Sal_fechaSalida) {
        this.Sal_fechaSalida = Sal_fechaSalida;
    }

    public String getSal_fechaIngreso() {
        return sal_fechaIngreso;
    }

    public void setSal_fechaIngreso(String sal_fechaIngreso) {
        this.sal_fechaIngreso = sal_fechaIngreso;
    }

    public String getSal_horaSalida() {
        return Sal_horaSalida;
    }

    public void setSal_horaSalida(String Sal_horaSalida) {
        this.Sal_horaSalida = Sal_horaSalida;
    }

    public String getSal_horaIngreso() {
        return sal_horaIngreso;
    }

    public void setSal_horaIngreso(String sal_horaIngreso) {
        this.sal_horaIngreso = sal_horaIngreso;
    }

    public int getSal_documentoAcompaniante() {
        return sal_documentoAcompaniante;
    }

    public void setSal_documentoAcompaniante(int sal_documentoAcompaniante) {
        this.sal_documentoAcompaniante = sal_documentoAcompaniante;
    }

    public String getSal_autoriza() {
        return sal_autoriza;
    }

    public void setSal_autoriza(String sal_autoriza) {
        this.sal_autoriza = sal_autoriza;
    }

    public String getSal_evidenciaAdjunta() {
        return Sal_evidenciaAdjunta;
    }

    public void setSal_evidenciaAdjunta(String Sal_evidenciaAdjunta) {
        this.Sal_evidenciaAdjunta = Sal_evidenciaAdjunta;
    }

    public emergenciaSG(int Sal_Aprendiz_Apr_documento, String sal_motivoEmergente, String Sal_fechaSalida, String sal_fechaIngreso, String Sal_horaSalida, String sal_horaIngreso, int sal_documentoAcompaniante, String sal_autoriza, String Sal_evidenciaAdjunta) {
        this.Sal_Aprendiz_Apr_documento = Sal_Aprendiz_Apr_documento;
        this.sal_motivoEmergente = sal_motivoEmergente;
        this.Sal_fechaSalida = Sal_fechaSalida;
        this.sal_fechaIngreso = sal_fechaIngreso;
        this.Sal_horaSalida = Sal_horaSalida;
        this.sal_horaIngreso = sal_horaIngreso;
        this.sal_documentoAcompaniante = sal_documentoAcompaniante;
        this.sal_autoriza = sal_autoriza;
        this.Sal_evidenciaAdjunta = Sal_evidenciaAdjunta;
    }
    
}
