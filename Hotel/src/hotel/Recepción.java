/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author dower
 */
public class Recepción {
    public boolean habitacionesDisponibles;
    public int categoriasDisponibles;
    public int capacidad;

    public Recepción(boolean habitacionesDisponibles, int categoriasDisponibles, int capacidad) {
        this.habitacionesDisponibles = habitacionesDisponibles;
        this.categoriasDisponibles = categoriasDisponibles;
        this.capacidad = capacidad;
    }
    
    public boolean categoriaDsiponible(){
        Habitacion h = new Habitacion();
//        for(int i=0; i<=h.numeroHabitacion.length; i++){
//        }
        return false;
    }
    
    public Habitacion crearHabitacion(int numeroHabitacion, int categoriaHabitacion, String servicios, Huesped responsable, Huesped []huespedes){
        Habitacion h = new Habitacion();
        if(h.Responsable(responsable)){
            if(h.habitacionVacia(numeroHabitacion)){
                if(h.categoriaHabitacion(categoriaHabitacion)!=null){
                    for(int i=0; i<=h.habitaciones.length; i++){
                        h.habitaciones[i]= new Habitacion( numeroHabitacion, responsable, huespedes);
                    }
                }
            }
        }
        return null;
    }
    
    
    

    public boolean isHabitacionesDisponibles() {
        return habitacionesDisponibles;
    }

    public void setHabitacionesDisponibles(boolean habitacionesDisponibles) {
        this.habitacionesDisponibles = habitacionesDisponibles;
    }

    public int getCategoriasDisponibles() {
        return categoriasDisponibles;
    }

    public void setCategoriasDisponibles(int categoriasDisponibles) {
        this.categoriasDisponibles = categoriasDisponibles;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
}
