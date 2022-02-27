/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


/**
 *
 * @author Newlifew
 */
public class Producto {
// atributos nombre y descripcion    
String nombre,descripcion;

//atributo codigo y precio por unidad 
int codigo, precioUnidad;

//atributo fecha
Fecha fecha;

//constructor con parametros
public Producto(int codigo,String nombre, String descripcion, int precioUnidad, int dia, int mes, int año){
this.nombre = nombre;
this.codigo = codigo;
this.descripcion = descripcion;
this.precioUnidad = precioUnidad;
fecha = new Fecha(dia,mes,año);
}   



//metodos get y set de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
}
