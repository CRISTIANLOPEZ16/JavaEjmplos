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
public class Sucursal {

    String Nombre;
    String Direccion;
    ArrayList<LineaProducto> misProductos;

    public Sucursal(String Nombre, String Direccion) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.misProductos = new ArrayList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public boolean registrarLineaProducto(String Nombre, String codigo, String Descripcion, Date Fecha, int Precio) {
        LineaProducto p = new LineaProducto(Nombre, codigo, Descripcion, Fecha, Precio);
        if (!misProductos.isEmpty()) {
            for (LineaProducto aux : misProductos) {
                if (codigo.equalsIgnoreCase(aux.getCodigo())) {
                    return false;
                }
            }
        }
        misProductos.add(p);
        return true;
    }

    public boolean EliminarLineaProducto(String nombre) {
        if (!misProductos.isEmpty()) {
            for (int i = 0; i < misProductos.size(); i++) {
                if(nombre.equalsIgnoreCase(misProductos.get(i).getNombre())){
                    misProductos.remove(i);
                     return true;
                }
            }
           
        }
        return false;
    }

    public int NumeroDeProductos() {
        return misProductos.size();
    }
    public ArrayList<LineaProducto> listarProductos(){
        return misProductos;
    }

    @Override
    public String toString() {
        String cad = "Sucursal: \n" + "Direccion=" + Direccion+", Nombre="+Nombre + "\n" + "LINEAS DE PRODUCTOS : \n";
        for (int i = 0; i < misProductos.size(); i++) {
            cad+= "NombreProducto:" +misProductos.get(i).getNombre()+"\n"+
                    "Codigo:"+misProductos.get(i).getCodigo()+"\n"+
                    "Descripcion:"+misProductos.get(i).getDescripcion()+"\n"+
                    "Precio por unidad:" + misProductos.get(i).getPrecio()+"\n"+
                    "fecha:"+misProductos.get(i).getFecha()+"\n";
                   
        }
        return cad;
    }
    
   
}
