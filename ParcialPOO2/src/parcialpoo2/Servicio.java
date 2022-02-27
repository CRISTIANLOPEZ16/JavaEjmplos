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
public  class Servicio {
//la id es la posicion en el array
    enum Tipo{
        MINI_BAR,INTERNET, SPA,PELICULAS
    }
  static final int  COSTO_MINI_BAR=10000;
  static final int  COSTO_INTERNET=2000;
  static final int  COSTO_SPA=30000;
  static final int  COSTO_PELICULAS=7000;
    protected String tipo="";
 protected   double costo=0;
 protected   boolean pagado=false;
  
    public Servicio(int tipo) {
       
        
        switch(tipo){
            case 1: this.tipo=Tipo.MINI_BAR.name(); this.costo=COSTO_MINI_BAR;
                break; 
                case 2:this.tipo=Tipo.INTERNET.name();this.costo=COSTO_INTERNET;
                break;
                case 3:this.tipo=Tipo.SPA.name();this.costo=COSTO_SPA;
                break;
                case 4:this.tipo=Tipo.PELICULAS.name();this.costo=COSTO_PELICULAS;
                break;
                default:System.out.println("numero de servicio no encontrado");
                    break;
        }
    }
 
    public Servicio() {
    }

    @Override
    public String toString() {
        return  " tipo=" + tipo + ", costo= $" + costo + ", pagado=" + pagado + '}';
    }
 
 
}
