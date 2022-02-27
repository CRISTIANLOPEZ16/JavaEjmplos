/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo2;

/**
 *
 * @author Eduardo Pico 1151638- Jhoan Mancilla 11516
 */
public class Persona {
    protected int edad;
  protected  String nombre="";
   protected String cedula="0";

    public Persona(int edad, String nombre, String cedula) {
        this.edad = edad;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Persona() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return  nombre + " edad=" + edad + ", cedula=" + cedula + '}';
    }
            
}
