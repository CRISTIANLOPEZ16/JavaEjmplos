/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author
 */
public class LineaProducto {
   private String Nombre;
   private String codigo;
   private String Descripcion;
   private Date Fecha;
   private int Precio;

    public LineaProducto(String Nombre, String codigo, String Descripcion,Date Fecha, int Precio) {
        this.Nombre = Nombre;
        this.codigo = codigo;
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "LineaProducto{" + "Nombre=" + Nombre + ", codigo=" + codigo + ", Descripcion=" + Descripcion + ", Fecha=" + Fecha + ", Precio=" + Precio + '}';
    }
    
    
}
