package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Newlifew
 */
public class Hipermercado {
    
  //ArrayList que almaneca las sucursales  
   ArrayList<Sucursales>sucursal;
   
   //constructor sin parametros
   public Hipermercado(){
   this.sucursal = new ArrayList<>();
   }
    
  //metodo para agregar una sucursal
   public void agregarSucursal(Sucursales sucursal){
   this.sucursal.add(sucursal);
   }
   
   //metodo para buscar una sucursal por su nombre
   public Sucursales buscarSucursal(String nombre){
   Sucursales aux = null;
   
      for(int i=0;i<sucursal.size();i++){
       if(this.sucursal.get(i).nombre.equals(nombre)){
           aux = sucursal.get(i);
        } 
      }
       return aux;
    }
   
   //metodo para eliminar una sucursal por su nombre
   public void eliminarSucursal(String nombre){   
    Sucursales s = buscarSucursal(nombre);
    this.sucursal.remove(s);
   }  


//metodo para buscar una sucursal por su direccion
public Sucursales BuscarDireccion( String direccion)
    {
       Sucursales nuevo=null;
       for(int y=0;y<this.sucursal.size();y++)
       {
           if(this.sucursal.get(y).direccion.equals(direccion))
           {
               nuevo=this.sucursal.get(y);
           }
       }
       return nuevo;
    }

//metodo para eliminar una sucursal por su direccion
 public void EliminarSucursal(String direccion)
    {
      Sucursales nuevo=BuscarDireccion(direccion);
      this.sucursal.remove(nuevo);
    }
 
 //metodo para buscar la posicion de la sucursal
   public int buscarSucursalint( String direccion)
    {
       int posicion=0;
       for(int y=0;y<this.sucursal.size();y++)
       {
           if(this.sucursal.get(y).direccion.equals(direccion))
           {
               posicion=y;
           }
       }
       return posicion;
    }
 
 //metodos get y set de los atributos
 public ArrayList<Sucursales> getSucursal() {
        return sucursal;
    }

    public void setSucursal(ArrayList<Sucursales> sucursal) {
        this.sucursal = sucursal;
    }
}

 
