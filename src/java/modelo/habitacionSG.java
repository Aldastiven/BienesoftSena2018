/*
 * HABITACION-SET-GETTER
 */
package modelo;

/**
 *
 * @author Stefany
 */

//CLASE
public class habitacionSG {
    
    private int numeroHabitacion;
    private int Hab_camasTotal;
    private int Hab_camasDisponibles;
    private String Hab_generoHabitacion;
    
    //Constructor vacio
    public habitacionSG(){
    }

    //CONSTUCTOR ENTIDAD
    public habitacionSG(int numeroHabitacion, int Hab_camasTotal, int Hab_camasDisponibles, String Hab_generoHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.Hab_camasTotal = Hab_camasTotal;
        this.Hab_camasDisponibles = Hab_camasDisponibles;
        this.Hab_generoHabitacion = Hab_generoHabitacion;
    }

    
    //SET&GET

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getHab_camasTotal() {
        return Hab_camasTotal;
    }

    public void setHab_camasTotal(int Hab_camasTotal) {
        this.Hab_camasTotal = Hab_camasTotal;
    }

    public int getHab_camasDisponibles() {
        return Hab_camasDisponibles;
    }

    public void setHab_camasDisponibles(int Hab_camasDisponibles) {
        this.Hab_camasDisponibles = Hab_camasDisponibles;
    }

    public String getHab_generoHabitacion() {
        return Hab_generoHabitacion;
    }

    public void setHab_generoHabitacion(String Hab_generoHabitacion) {
        this.Hab_generoHabitacion = Hab_generoHabitacion;
    }
    
    
   
    
    
   
    
    
}
