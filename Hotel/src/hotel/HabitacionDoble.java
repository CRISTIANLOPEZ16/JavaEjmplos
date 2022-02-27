/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author jesus
 */
public class HabitacionDoble extends Habitacion {

    public HabitacionDoble[] habitacionD;

    public HabitacionDoble(int numeroHabitacion, Huesped responsable, Huesped []huespedes) {
        super(numeroHabitacion, responsable, huespedes);
    }
    
    //Falta constructor de la HabitacionD que debe definirse el tamaño en Habitacion

    public boolean hayHabitacionDobleDisponible(int identidicadorHabitacion) {
        for(int i=0; i<=habitacionD.length; i++){
            if(habitacionD==null && identidicadorHabitacion==i+1)
                return true;
        }
        return false;
    }

}
