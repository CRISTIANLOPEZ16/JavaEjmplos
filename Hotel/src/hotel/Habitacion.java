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
public class Habitacion {

    public int numeroHabitacion;
    public Habitacion[] habitaciones;
    public String[] categoria = {"EJECUTIVA", "DOBLE", "SUITE", "PRESIDENCIAL"};
    public Huesped responsable;
    public Huesped []huespedes;

    public Habitacion() {
    }

    public Habitacion(int numeroHabitacion, Huesped responsable, Huesped []huespedes) {
        this.numeroHabitacion = numeroHabitacion;
        this.responsable = responsable;
        this.huespedes = huespedes;
    }

    public Habitacion(int habitacion) {
        habitaciones = new Habitacion[habitacion];
    }

    public boolean Responsable(Huesped huesped) {
        return huesped.edad >= 18;
    }

    public int obtenerNumeroHabitacion(int numero) {
        int aux = 0;
        for (int i = 0; i <= habitaciones.length; i++) {
            if (habitaciones[i + 1].getNumeroHabitacion() == numero) {
                aux = i + 1;
            }
        }
        return aux;
    }

    public String categoriaHabitacion(int categoria2) {
        String aux = null;
        if (categoria2 >= 1 && categoria2 <= 6) {
            aux = categoria[0];
        }
        if (categoria2 >= 7 && categoria2 <= 10) {
            aux = categoria[1];
        }
        if (categoria2 >= 11 && categoria2 <= 19) {
            aux = categoria[2];
        }
        if (categoria2 == 20) {
            aux = categoria[3];
        }

        return aux;
        //Habitacion llama a este metodo para saber que tipo de Habitacion utilizar
    }
    

    public boolean habitacionVacia(int numeroHabitacion) {
        for (int i = 0; i <= habitaciones.length; i++) {
            if (habitaciones[i + 1].getNumeroHabitacion() == numeroHabitacion) {
                if (habitaciones[i + 1] == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String[] getCategoria() {
        return categoria;
    }

    public void setCategoria(String[] categoria) {
        this.categoria = categoria;
    }

    public Huesped getResponsable() {
        return responsable;
    }

    public void setResponsable(Huesped responsable) {
        this.responsable = responsable;
    }

    public Huesped[] getHuespedes() {
        return huespedes;
    }

    public void setHuespedes(Huesped[] huespedes) {
        this.huespedes = huespedes;
    }

   

}
