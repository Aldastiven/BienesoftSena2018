/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Edison
 */
public class fichaSG {
   
    private int Fic_numero;
    private String Fic_nombrePrograma;
    private String Fic_jornada;
    private String Fic_inicio_etapa;
    private String Fic_fin_etapa;

//CONSTRUCTOR VACIO

    public fichaSG() {
    }
    
    //CONSTRUCTOR

    public fichaSG(int Fic_numero, String Fic_nombrePrograma, String Fic_jornada, String Fic_inicio_etapa, String Fic_fin_etapa) {
       
        this.Fic_numero = Fic_numero;
        this.Fic_nombrePrograma = Fic_nombrePrograma;
        this.Fic_jornada = Fic_jornada;
        this.Fic_inicio_etapa = Fic_inicio_etapa;
        this.Fic_fin_etapa = Fic_fin_etapa;
    }
    
    //SET & GET

    public int getFic_numero() {
        return Fic_numero;
    }

    public void setFic_numero(int Fic_numero) {
        this.Fic_numero = Fic_numero;
    }

    public String getFic_nombrePrograma() {
        return Fic_nombrePrograma;
    }

    public void setFic_nombrePrograma(String Fic_nombrePrograma) {
        this.Fic_nombrePrograma = Fic_nombrePrograma;
    }

    public String getFic_jornada() {
        return Fic_jornada;
    }

    public void setFic_jornada(String Fic_jornada) {
        this.Fic_jornada = Fic_jornada;
    }

    public String getFic_inicio_etapa() {
        return Fic_inicio_etapa;
    }

    public void setFic_inicio_etapa(String Fic_inicio_etapa) {
        this.Fic_inicio_etapa = Fic_inicio_etapa;
    }

    public String getFic_fin_etapa() {
        return Fic_fin_etapa;
    }

    public void setFic_fin_etapa(String Fic_fin_etapa) {
        this.Fic_fin_etapa = Fic_fin_etapa;
    }

  

    
 

    }
    
    

