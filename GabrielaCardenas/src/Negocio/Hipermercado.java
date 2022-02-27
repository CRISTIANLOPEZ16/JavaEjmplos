/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Hipermercado {

    ArrayList<Sucursal> missucursales;

    public Hipermercado() {
        missucursales = new ArrayList<Sucursal>();
    }

    public boolean registrarSucursal(String Nombre, String Direccion) {
        Sucursal principal = new Sucursal(Nombre, Direccion);
        if (!missucursales.isEmpty()) {
            for (Sucursal suc : missucursales) {
                if (Nombre.equalsIgnoreCase(suc.getNombre())) {
                    return false;
                }
            }
        }
        missucursales.add(principal);
        return true;
    }

    public boolean EliminarSucursal(String Nombre) {
        if (!missucursales.isEmpty()) {
            for (Sucursal suc : missucursales) {
                if (Nombre.equalsIgnoreCase(suc.getNombre())) {
                    missucursales.remove(suc);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean registrarProducto(String nombre, String codigo, String Descripcion, Date fecha, int Precio, String nombreSucursal) {
        if (!missucursales.isEmpty()) {
            for (Sucursal suc : missucursales) {
                if (nombreSucursal.equalsIgnoreCase(suc.getNombre())) {
                    return suc.registrarLineaProducto(nombre, codigo, Descripcion, fecha, Precio);

                }
            }
        }
        return false;
    }

    public boolean EliminarProducto(String nombre) {
        if (!missucursales.isEmpty()) {
            for (Sucursal suc : missucursales) {
                if (nombre.equalsIgnoreCase(suc.getNombre())) {
                    JOptionPane.showMessageDialog(null, suc.getNombre());
                    suc.EliminarLineaProducto(nombre);
                    return true;
                }
            }
        }
        return false;
    }
    

    public ArrayList<Sucursal> listarSucursales() {
        return missucursales;
    }

    public int numeroProductos(String nombresucursal) {
        if (!missucursales.isEmpty()) {
            for (Sucursal suc : missucursales) {
                if (nombresucursal.equalsIgnoreCase(suc.getNombre())) {
                    return suc.NumeroDeProductos();
                }
            }
        }
        return 0;
    }

    public ArrayList<LineaProducto> listarProductos(String nombreSucursal) {
        if (!missucursales.isEmpty()) {
            for (Sucursal suc : missucursales) {
                if (nombreSucursal.equalsIgnoreCase(suc.getNombre())) {
                    return suc.listarProductos();
                }
            }
        }
        return null;
    }
    
    public LineaProducto productoAntiguo(){
        Date a = new Date(9999, 11, 12);
        boolean ff = false;
        LineaProducto linea = new LineaProducto("","","",a, 1);
        if(!missucursales.isEmpty()){
            for (Sucursal au: missucursales) {
                if(!au.misProductos.isEmpty()){
                    for(LineaProducto aucs:au.misProductos){
                        int t = aucs.getFecha().compareTo(linea.getFecha());
                           if(t==-1){
                               linea=aucs;
                               ff=true;
                        }
                    }
                }
            }
        }
        if(ff){
            return linea;
        }
        return null;
    }

    public int eliminarLineasDeProductoPorRango(int rangoinicial, int rangofinal) {
        int contador = 0;
        if (!missucursales.isEmpty()) {
            for (Sucursal suc : missucursales) {
                for (LineaProducto lin : suc.listarProductos()) {
                    if (lin.getPrecio() >= rangoinicial && lin.getPrecio() <= rangofinal) {
                        suc.misProductos.remove(lin);
                        contador++;
                    }
                }
            }
        }
        return contador;
    }

    public String generarReporte() {
        String cadena = "";
        if (!missucursales.isEmpty()) {
            for (Sucursal suc : missucursales) {
                cadena += suc.toString();
            }
        }
        return cadena;
    }
}
