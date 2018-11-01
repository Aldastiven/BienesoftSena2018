
package modelo;


public class aprendizSG {
   
    private int apr_documento;//1
    private String apr_documentoTipo;//2
    private String apr_nombres;//3
    private String apr_apellidos;//4
    private String apr_fechaNacimiento;//5
    private int apr_edad;//6
    private String apr_sexo;//7
    private String apr_celular;//8
    private String apr_eps;//9
    private String apr_rh;//10
    private String apr_tipoAprendiz;//11
    private String apr_nombrePadre;//12
    private String apr_telefonoPadre;//13
    private String apr_nombreMadre;//14
    private String apr_telefonoMadre;//15
    private String apr_departamento;//16
    private String apr_ciudad;//17
    private String apr_barrio;//18
    private String apr_direccion;//19
    private String apr_antecedente_medico;//20 
    private String apr_email;//21
    private String apr_hojaDeVida;//22
    private String apr_actaCompromiso;//23
    private int apr_llamadosDeAtencion;//24
    private int apr_numero_habitacion;//25
    private int apr_ficha_fic_numero;//26
    
    
    //CONSTRUCTOR VACIO

    public aprendizSG() {
    }
    
    //CONSTRUCTOR

    public aprendizSG(int apr_documento, String apr_documentoTipo, String apr_nombres, String apr_apellidos, String apr_fechaNacimiento, int apr_edad, String apr_sexo, String apr_celular, String apr_eps, String apr_rh, String apr_tipoAprendiz, String apr_nombrePadre, String apr_telefonoPadre, String apr_nombreMadre, String apr_telefonoMadre, String apr_departamento, String apr_ciudad, String apr_barrio, String apr_direccion, String apr_antecedente_medico, String apr_email, String apr_hojaDeVida, String apr_actaCompromiso, int apr_llamadosDeAtencion, int apr_numero_habitacion, int apr_ficha_fic_numero) {
        
        this.apr_documento = apr_documento;
        this.apr_documentoTipo = apr_documentoTipo;
        this.apr_nombres = apr_nombres;
        this.apr_apellidos = apr_apellidos;
        this.apr_fechaNacimiento = apr_fechaNacimiento;
        this.apr_edad = apr_edad;
        this.apr_sexo = apr_sexo;
        this.apr_celular = apr_celular;
        this.apr_eps = apr_eps;
        this.apr_rh = apr_rh;
        this.apr_tipoAprendiz = apr_tipoAprendiz;
        this.apr_nombrePadre = apr_nombrePadre;
        this.apr_telefonoPadre = apr_telefonoPadre;
        this.apr_nombreMadre = apr_nombreMadre;
        this.apr_telefonoMadre = apr_telefonoMadre;
        this.apr_departamento = apr_departamento;
        this.apr_ciudad = apr_ciudad;
        this.apr_barrio = apr_barrio;
        this.apr_direccion = apr_direccion;
        this.apr_antecedente_medico = apr_antecedente_medico;
        this.apr_email = apr_email;
        this.apr_hojaDeVida = apr_hojaDeVida;
        this.apr_actaCompromiso = apr_actaCompromiso;
        this.apr_llamadosDeAtencion = apr_llamadosDeAtencion;
        this.apr_numero_habitacion = apr_numero_habitacion;
        this.apr_ficha_fic_numero = apr_ficha_fic_numero;
    }
    
    //SETGET
    public int getApr_documento() {
        return apr_documento;
    }

    public void setApr_documento(int apr_documento) {
        this.apr_documento = apr_documento;
    }

    public String getApr_documentoTipo() {
        return apr_documentoTipo;
    }

    public void setApr_documentoTipo(String apr_documentoTipo) {
        this.apr_documentoTipo = apr_documentoTipo;
    }

    public String getApr_nombres() {
        return apr_nombres;
    }

    public void setApr_nombres(String apr_nombres) {
        this.apr_nombres = apr_nombres;
    }

    public String getApr_apellidos() {
        return apr_apellidos;
    }

    public void setApr_apellidos(String apr_apellidos) {
        this.apr_apellidos = apr_apellidos;
    }

    public String getApr_fechaNacimiento() {
        return apr_fechaNacimiento;
    }

    public void setApr_fechaNacimiento(String apr_fechaNacimiento) {
        this.apr_fechaNacimiento = apr_fechaNacimiento;
    }

    public int getApr_edad() {
        return apr_edad;
    }

    public void setApr_edad(int apr_edad) {
        this.apr_edad = apr_edad;
    }

    public String getApr_sexo() {
        return apr_sexo;
    }

    public void setApr_sexo(String apr_sexo) {
        this.apr_sexo = apr_sexo;
    }

    public String getApr_celular() {
        return apr_celular;
    }

    public void setApr_celular(String apr_celular) {
        this.apr_celular = apr_celular;
    }

    public String getApr_eps() {
        return apr_eps;
    }

    public void setApr_eps(String apr_eps) {
        this.apr_eps = apr_eps;
    }

    public String getApr_rh() {
        return apr_rh;
    }

    public void setApr_rh(String apr_rh) {
        this.apr_rh = apr_rh;
    }

    public String getApr_tipoAprendiz() {
        return apr_tipoAprendiz;
    }

    public void setApr_tipoAprendiz(String apr_tipoAprendiz) {
        this.apr_tipoAprendiz = apr_tipoAprendiz;
    }

    public String getApr_nombrePadre() {
        return apr_nombrePadre;
    }

    public void setApr_nombrePadre(String apr_nombrePadre) {
        this.apr_nombrePadre = apr_nombrePadre;
    }

    public String getApr_telefonoPadre() {
        return apr_telefonoPadre;
    }

    public void setApr_telefonoPadre(String apr_telefonoPadre) {
        this.apr_telefonoPadre = apr_telefonoPadre;
    }

    public String getApr_nombreMadre() {
        return apr_nombreMadre;
    }

    public void setApr_nombreMadre(String apr_nombreMadre) {
        this.apr_nombreMadre = apr_nombreMadre;
    }

    public String getApr_telefonoMadre() {
        return apr_telefonoMadre;
    }

    public void setApr_telefonoMadre(String apr_telefonoMadre) {
        this.apr_telefonoMadre = apr_telefonoMadre;
    }

    public String getApr_departamento() {
        return apr_departamento;
    }

    public void setApr_departamento(String apr_departamento) {
        this.apr_departamento = apr_departamento;
    }

    public String getApr_ciudad() {
        return apr_ciudad;
    }

    public void setApr_ciudad(String apr_ciudad) {
        this.apr_ciudad = apr_ciudad;
    }

    public String getApr_barrio() {
        return apr_barrio;
    }

    public void setApr_barrio(String apr_barrio) {
        this.apr_barrio = apr_barrio;
    }

    public String getApr_direccion() {
        return apr_direccion;
    }

    public void setApr_direccion(String apr_direccion) {
        this.apr_direccion = apr_direccion;
    }

    public String getApr_antecedente_medico() {
        return apr_antecedente_medico;
    }

    public void setApr_antecedente_medico(String apr_antecedente_medico) {
        this.apr_antecedente_medico = apr_antecedente_medico;
    }

    public String getApr_email() {
        return apr_email;
    }

    public void setApr_email(String apr_email) {
        this.apr_email = apr_email;
    }

    public String getApr_hojaDeVida() {
        return apr_hojaDeVida;
    }

    public void setApr_hojaDeVida(String apr_hojaDeVida) {
        this.apr_hojaDeVida = apr_hojaDeVida;
    }

    public String getApr_actaCompromiso() {
        return apr_actaCompromiso;
    }

    public void setApr_actaCompromiso(String apr_actaCompromiso) {
        this.apr_actaCompromiso = apr_actaCompromiso;
    }

    public int getApr_llamadosDeAtencion() {
        return apr_llamadosDeAtencion;
    }

    public void setApr_llamadosDeAtencion(int apr_llamadosDeAtencion) {
        this.apr_llamadosDeAtencion = apr_llamadosDeAtencion;
    }

    public int getApr_numero_habitacion() {
        return apr_numero_habitacion;
    }

    public void setApr_numero_habitacion(int apr_numero_habitacion) {
        this.apr_numero_habitacion = apr_numero_habitacion;
    }

    public int getApr_ficha_fic_numero() {
        return apr_ficha_fic_numero;
    }

    public void setApr_ficha_fic_numero(int apr_ficha_fic_numero) {
        this.apr_ficha_fic_numero = apr_ficha_fic_numero;
    }

    public aprendizSG(int apr_documento) {
        this.apr_documento = apr_documento;
    }
    
    
    
    
    

  
} 
    

