
package modelo;

/**
 *
 * @author equipo
 */
public class permisoSG {
    private int per_ID;
    private int per_Aprendiz_Apr_documento;
    private String per_tipo;
    private String per_fecha_salida;
    private String per_fecha_ingreso;
    private String per_hora_Salida;
    private String per_hora_ingreso;
    private String per_Fecha_ingresoReal;
    private String per_Hora_ingresoReal;
    private String  per_observacion_permiso_llegada;
    private String per_motivo;
    private String per_estado;
    private String per_autoriza;
    private String per_evidenciaAdjunta;
    
    //CONSTRUCTOR VACIO 

    public permisoSG() {
    }
    
    //CONSTRUCTOR
    public permisoSG(int per_ID, int per_Aprendiz_Apr_documento, String per_tipo, String per_fecha_salida, String per_fecha_ingreso, String per_hora_Salida, String per_hora_ingreso, String per_Fecha_ingresoReal, String per_Hora_ingresoReal, String per_observacion_permiso_llegada, String per_motivo, String per_estado, String per_autoriza, String per_evidenciaAdjunta) {
        this.per_ID = per_ID;
        this.per_Aprendiz_Apr_documento = per_Aprendiz_Apr_documento;
        this.per_tipo = per_tipo;
        this.per_fecha_salida = per_fecha_salida;
        this.per_fecha_ingreso = per_fecha_ingreso;
        this.per_hora_Salida = per_hora_Salida;
        this.per_hora_ingreso = per_hora_ingreso;
        this.per_Fecha_ingresoReal = per_Fecha_ingresoReal;
        this.per_Hora_ingresoReal = per_Hora_ingresoReal;
        this.per_observacion_permiso_llegada = per_observacion_permiso_llegada;
        this.per_motivo = per_motivo;
        this.per_estado = per_estado;
        this.per_autoriza = per_autoriza;
        this.per_evidenciaAdjunta = per_evidenciaAdjunta;
    }

    public int getPer_ID() {
        return per_ID;
    }

    public void setPer_ID(int per_ID) {
        this.per_ID = per_ID;
    }

    public int getPer_Aprendiz_Apr_documento() {
        return per_Aprendiz_Apr_documento;
    }

    public void setPer_Aprendiz_Apr_documento(int per_Aprendiz_Apr_documento) {
        this.per_Aprendiz_Apr_documento = per_Aprendiz_Apr_documento;
    }

    public String getPer_tipo() {
        return per_tipo;
    }

    public void setPer_tipo(String per_tipo) {
        this.per_tipo = per_tipo;
    }

    public String getPer_fecha_salida() {
        return per_fecha_salida;
    }

    public void setPer_fecha_salida(String per_fecha_salida) {
        this.per_fecha_salida = per_fecha_salida;
    }

    public String getPer_fecha_ingreso() {
        return per_fecha_ingreso;
    }

    public void setPer_fecha_ingreso(String per_fecha_ingreso) {
        this.per_fecha_ingreso = per_fecha_ingreso;
    }

    public String getPer_hora_Salida() {
        return per_hora_Salida;
    }

    public void setPer_hora_Salida(String per_hora_Salida) {
        this.per_hora_Salida = per_hora_Salida;
    }

    public String getPer_hora_ingreso() {
        return per_hora_ingreso;
    }

    public void setPer_hora_ingreso(String per_hora_ingreso) {
        this.per_hora_ingreso = per_hora_ingreso;
    }

    public String getPer_Fecha_ingresoReal() {
        return per_Fecha_ingresoReal;
    }

    public void setPer_Fecha_ingresoReal(String per_Fecha_ingresoReal) {
        this.per_Fecha_ingresoReal = per_Fecha_ingresoReal;
    }

    public String getPer_Hora_ingresoReal() {
        return per_Hora_ingresoReal;
    }

    public void setPer_Hora_ingresoReal(String per_Hora_ingresoReal) {
        this.per_Hora_ingresoReal = per_Hora_ingresoReal;
    }

    public String getPer_observacion_permiso_llegada() {
        return per_observacion_permiso_llegada;
    }

    public void setPer_observacion_permiso_llegada(String per_observacion_permiso_llegada) {
        this.per_observacion_permiso_llegada = per_observacion_permiso_llegada;
    }

    public String getPer_motivo() {
        return per_motivo;
    }

    public void setPer_motivo(String per_motivo) {
        this.per_motivo = per_motivo;
    }

    public String getPer_estado() {
        return per_estado;
    }

    public void setPer_estado(String per_estado) {
        this.per_estado = per_estado;
    }

    public String getPer_autoriza() {
        return per_autoriza;
    }

    public void setPer_autoriza(String per_autoriza) {
        this.per_autoriza = per_autoriza;
    }

    public String getPer_evidenciaAdjunta() {
        return per_evidenciaAdjunta;
    }

    public void setPer_evidenciaAdjunta(String per_evidenciaAdjunta) {
        this.per_evidenciaAdjunta = per_evidenciaAdjunta;
    }

    public permisoSG(int per_Aprendiz_Apr_documento, String per_tipo, String per_fecha_salida, String per_fecha_ingreso, String per_hora_Salida, String per_hora_ingreso, String per_Fecha_ingresoReal, String per_Hora_ingresoReal, String per_observacion_permiso_llegada, String per_motivo, String per_estado, String per_autoriza, String per_evidenciaAdjunta) {
        this.per_Aprendiz_Apr_documento = per_Aprendiz_Apr_documento;
        this.per_tipo = per_tipo;
        this.per_fecha_salida = per_fecha_salida;
        this.per_fecha_ingreso = per_fecha_ingreso;
        this.per_hora_Salida = per_hora_Salida;
        this.per_hora_ingreso = per_hora_ingreso;
        this.per_Fecha_ingresoReal = per_Fecha_ingresoReal;
        this.per_Hora_ingresoReal = per_Hora_ingresoReal;
        this.per_observacion_permiso_llegada = per_observacion_permiso_llegada;
        this.per_motivo = per_motivo;
        this.per_estado = per_estado;
        this.per_autoriza = per_autoriza;
        this.per_evidenciaAdjunta = per_evidenciaAdjunta;
    }

   
    
}
