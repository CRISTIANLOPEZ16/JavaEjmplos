package Modelo;

import java.util.ArrayList;

/**
 * @author Newlifew
 */
public class Sucursales{


 String nombre;
 String direccion;   

 ArrayList<Producto>producto;
 
 //constructor vacio
public Sucursales(){}


 public Sucursales(String nombre, String direccion){
 this.nombre = nombre;
 this.direccion = direccion;
 this.producto = new ArrayList<>();
 }


public void agregarProducto(Producto producto){
 this.producto.add(producto);
 } 
 

public Producto buscarProducto(int codigo){
   Producto aux = null;
   
      for(int i=0;i<producto.size();i++){
       if(this.producto.get(i).codigo==codigo){
           aux = producto.get(i);
       } else {
       } 
      }
    return aux;
    }
   

 public void eliminarProducto(int codigo){
 Producto p = buscarProducto(codigo);
 this.producto.remove(p);
 }

 

 
            

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
     public ArrayList<Producto>getProducto(){
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }
 
}
