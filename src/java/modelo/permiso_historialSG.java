/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Stefany
 */
public class permiso_historialSG {
    
    private int his_per_ID;
    private int his_per_Aprendiz_Apr_documento;
    private String his_per_tipo;
    private String his_per_fecha_salida;
    private String his_per_fecha_ingreso;
    private String his_per_hora_Salida;
    private String his_per_hora_ingreso;
    private String his_per_fecha_ingresoReal;
    private String his_per_hora_ingresoReal;
    private String his_per_fecha_salidaReal;
    private String  his_per_hora_salidaReal;
    private String his_per_observacion_llegada;
    private String his_per_motivo;
    private String his_per_estado;
    private String his_per_autoriza;
    private String his_per_evidenciaAdjunta;
    private String his_per_fecha_respuesta;
    private String his_per_fechaCreacion;
    private String his_per_estado_leido;
    
    public permiso_historialSG(){
    }

     //COMPLETO
    public permiso_historialSG(int his_per_ID, int his_per_Aprendiz_Apr_documento, String his_per_tipo, String his_per_fecha_salida, String his_per_fecha_ingreso, String his_per_hora_Salida, String his_per_hora_ingreso, String his_per_fecha_ingresoReal, String his_per_hora_ingresoReal, String his_per_fecha_salidaReal, String his_per_hora_salidaReal, String his_per_observacion_llegada, String his_per_motivo, String his_per_estado, String his_per_autoriza, String his_per_evidenciaAdjunta, String his_per_fecha_respuesta, String his_per_fechaCreacion, String his_per_estado_leido) {
        this.his_per_ID = his_per_ID;
        this.his_per_Aprendiz_Apr_documento = his_per_Aprendiz_Apr_documento;
        this.his_per_tipo = his_per_tipo;
        this.his_per_fecha_salida = his_per_fecha_salida;
        this.his_per_fecha_ingreso = his_per_fecha_ingreso;
        this.his_per_hora_Salida = his_per_hora_Salida;
        this.his_per_hora_ingreso = his_per_hora_ingreso;
        this.his_per_fecha_ingresoReal = his_per_fecha_ingresoReal;
        this.his_per_hora_ingresoReal = his_per_hora_ingresoReal;
        this.his_per_fecha_salidaReal = his_per_fecha_salidaReal;
        this.his_per_hora_salidaReal = his_per_hora_salidaReal;
        this.his_per_observacion_llegada = his_per_observacion_llegada;
        this.his_per_motivo = his_per_motivo;
        this.his_per_estado = his_per_estado;
        this.his_per_autoriza = his_per_autoriza;
        this.his_per_evidenciaAdjunta = his_per_evidenciaAdjunta;
        this.his_per_fecha_respuesta = his_per_fecha_respuesta;
        this.his_per_fechaCreacion = his_per_fechaCreacion;
        this.his_per_estado_leido = his_per_estado_leido;
    }

     //SIN ID
    public permiso_historialSG(int his_per_Aprendiz_Apr_documento, String his_per_tipo, String his_per_fecha_salida, String his_per_fecha_ingreso, String his_per_hora_Salida, String his_per_hora_ingreso, String his_per_fecha_ingresoReal, String his_per_hora_ingresoReal, String his_per_fecha_salidaReal, String his_per_hora_salidaReal, String his_per_observacion_llegada, String his_per_motivo, String his_per_estado, String his_per_autoriza, String his_per_evidenciaAdjunta, String his_per_fecha_respuesta, String his_per_fechaCreacion, String his_per_estado_leido) {
        this.his_per_Aprendiz_Apr_documento = his_per_Aprendiz_Apr_documento;
        this.his_per_tipo = his_per_tipo;
        this.his_per_fecha_salida = his_per_fecha_salida;
        this.his_per_fecha_ingreso = his_per_fecha_ingreso;
        this.his_per_hora_Salida = his_per_hora_Salida;
        this.his_per_hora_ingreso = his_per_hora_ingreso;
        this.his_per_fecha_ingresoReal = his_per_fecha_ingresoReal;
        this.his_per_hora_ingresoReal = his_per_hora_ingresoReal;
        this.his_per_fecha_salidaReal = his_per_fecha_salidaReal;
        this.his_per_hora_salidaReal = his_per_hora_salidaReal;
        this.his_per_observacion_llegada = his_per_observacion_llegada;
        this.his_per_motivo = his_per_motivo;
        this.his_per_estado = his_per_estado;
        this.his_per_autoriza = his_per_autoriza;
        this.his_per_evidenciaAdjunta = his_per_evidenciaAdjunta;
        this.his_per_fecha_respuesta = his_per_fecha_respuesta;
        this.his_per_fechaCreacion = his_per_fechaCreacion;
        this.his_per_estado_leido = his_per_estado_leido;
    }

    public permiso_historialSG(int his_per_ID) {
        this.his_per_ID = his_per_ID;
    }


    
    
    //SET AND GET

    public int getHis_per_ID() {
        return his_per_ID;
    }

    public void setHis_per_ID(int his_per_ID) {
        this.his_per_ID = his_per_ID;
    }

    public int getHis_per_Aprendiz_Apr_documento() {
        return his_per_Aprendiz_Apr_documento;
    }

    public void setHis_per_Aprendiz_Apr_documento(int his_per_Aprendiz_Apr_documento) {
        this.his_per_Aprendiz_Apr_documento = his_per_Aprendiz_Apr_documento;
    }

    public String getHis_per_tipo() {
        return his_per_tipo;
    }

    public void setHis_per_tipo(String his_per_tipo) {
        this.his_per_tipo = his_per_tipo;
    }

    public String getHis_per_fecha_salida() {
        return his_per_fecha_salida;
    }

    public void setHis_per_fecha_salida(String his_per_fecha_salida) {
        this.his_per_fecha_salida = his_per_fecha_salida;
    }

    public String getHis_per_fecha_ingreso() {
        return his_per_fecha_ingreso;
    }

    public void setHis_per_fecha_ingreso(String his_per_fecha_ingreso) {
        this.his_per_fecha_ingreso = his_per_fecha_ingreso;
    }

    public String getHis_per_hora_Salida() {
        return his_per_hora_Salida;
    }

    public void setHis_per_hora_Salida(String his_per_hora_Salida) {
        this.his_per_hora_Salida = his_per_hora_Salida;
    }

    public String getHis_per_hora_ingreso() {
        return his_per_hora_ingreso;
    }

    public void setHis_per_hora_ingreso(String his_per_hora_ingreso) {
        this.his_per_hora_ingreso = his_per_hora_ingreso;
    }

    public String getHis_per_fecha_ingresoReal() {
        return his_per_fecha_ingresoReal;
    }

    public void setHis_per_fecha_ingresoReal(String his_per_fecha_ingresoReal) {
        this.his_per_fecha_ingresoReal = his_per_fecha_ingresoReal;
    }

    public String getHis_per_hora_ingresoReal() {
        return his_per_hora_ingresoReal;
    }

    public void setHis_per_hora_ingresoReal(String his_per_hora_ingresoReal) {
        this.his_per_hora_ingresoReal = his_per_hora_ingresoReal;
    }

    public String getHis_per_fecha_salidaReal() {
        return his_per_fecha_salidaReal;
    }

    public void setHis_per_fecha_salidaReal(String his_per_fecha_salidaReal) {
        this.his_per_fecha_salidaReal = his_per_fecha_salidaReal;
    }

    public String getHis_per_hora_salidaReal() {
        return his_per_hora_salidaReal;
    }

    public void setHis_per_hora_salidaReal(String his_per_hora_salidaReal) {
        this.his_per_hora_salidaReal = his_per_hora_salidaReal;
    }

    public String getHis_per_observacion_llegada() {
        return his_per_observacion_llegada;
    }

    public void setHis_per_observacion_llegada(String his_per_observacion_llegada) {
        this.his_per_observacion_llegada = his_per_observacion_llegada;
    }

    public String getHis_per_motivo() {
        return his_per_motivo;
    }

    public void setHis_per_motivo(String his_per_motivo) {
        this.his_per_motivo = his_per_motivo;
    }

    public String getHis_per_estado() {
        return his_per_estado;
    }

    public void setHis_per_estado(String his_per_estado) {
        this.his_per_estado = his_per_estado;
    }

    public String getHis_per_autoriza() {
        return his_per_autoriza;
    }

    public void setHis_per_autoriza(String his_per_autoriza) {
        this.his_per_autoriza = his_per_autoriza;
    }

    public String getHis_per_evidenciaAdjunta() {
        return his_per_evidenciaAdjunta;
    }

    public void setHis_per_evidenciaAdjunta(String his_per_evidenciaAdjunta) {
        this.his_per_evidenciaAdjunta = his_per_evidenciaAdjunta;
    }

    public String getHis_per_fecha_respuesta() {
        return his_per_fecha_respuesta;
    }

    public void setHis_per_fecha_respuesta(String his_per_fecha_respuesta) {
        this.his_per_fecha_respuesta = his_per_fecha_respuesta;
    }

    public String getHis_per_fechaCreacion() {
        return his_per_fechaCreacion;
    }

    public void setHis_per_fechaCreacion(String his_per_fechaCreacion) {
        this.his_per_fechaCreacion = his_per_fechaCreacion;
    }

    public String getHis_per_estado_leido() {
        return his_per_estado_leido;
    }

    public void setHis_per_estado_leido(String his_per_estado_leido) {
        this.his_per_estado_leido = his_per_estado_leido;
    }
    
    
    
    
    
    
    
    
    
    
}
