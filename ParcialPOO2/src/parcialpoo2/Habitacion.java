/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public abstract class Habitacion  {
    Scanner sc=new Scanner(System.in);
    protected double deuda=0.0;
    protected double gasto=0.0;
   protected int id=0;
   protected String tipo="";
   protected int capacidadMax=0;
   protected Responsable Propietario=new Responsable();
   protected ArrayList <Servicio> servicio=new ArrayList();
   protected ArrayList <Persona> integrantes=new ArrayList();
enum Tipo{
        SUITE,PRESIDENCIAL,EJECUTIVA,DOBLE
    }
    public Habitacion(int id,int tipo, int capacidad){
        this.id=id;
        this.capacidadMax=capacidad;
        switch (tipo){
            case 3: this.tipo=Tipo.SUITE.name();
            break;
            case 2:this.tipo=Tipo.DOBLE.name();
             break;
            case 1:this.tipo=Tipo.EJECUTIVA.name();
             break;
            case 4:this.tipo=Tipo.PRESIDENCIAL.name();
        }
    }
    
    public double calcularDeuda(){
        for(Servicio a:this.servicio){
          if(!a.pagado)deuda+=a.costo;
        }
        
        
        return this.deuda;
    }
    
    public double calcularGasto(){
    for(Servicio a:this.servicio){
         this.gasto+=a.costo;
        }
        
        return this.gasto;
}
    public Habitacion() {
    }
    public Habitacion(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Persona getPropietario() {
        return Propietario;
    }
    
    public String getServicio() {
        return servicio.toString();
    }
    public ArrayList<Persona> getIntegrantes() {
        return integrantes;
    }
    public void setIntegrantes(ArrayList<Persona> integrantes) {
        this.integrantes = integrantes;
    }
    public int getCapacidadMax() {
        return capacidadMax;
    }
    public void setCapacidadMax(int capacidad) {
        this.capacidadMax = capacidad;
    }
public void registrarHuesped(Persona p){
  integrantes.add(p);
}
public void vaciar(){
   
    this.integrantes.clear();
    this.servicio.clear();
}
    @Override
    public String toString() {
        String serviciios="";
       for(int i=0;i<this.servicio.size();i++){
          serviciios= serviciios+this.servicio.get(i).toString();
          serviciios=serviciios+ " ";
       }
        return "Habitacion{"  + id + ", tipo=" + tipo + ", capacidad=" + capacidadMax + ", Propietario=" + Propietario.nombre + ", servicio=" + serviciios + ", integrantes=" + integrantes.toString() + '}';
    }

}
