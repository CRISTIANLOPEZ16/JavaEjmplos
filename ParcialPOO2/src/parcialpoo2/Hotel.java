/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo2;

import java.util.ArrayList;

/**
 *
 * @author Eduardo Pico 1151638- Jhoan Mancilla 11516
 */
public class  Hotel {
    
    Habitacion a[]=new Habitacion[20];
    protected String bitacora="";
    public ArrayList responsables=new ArrayList();
    public Hotel() {
        
        for(int i=0;i<20;i++){
            Habitacion t=new HabitacionEjecutiva(i+1);
           if(i<=5){a[i]=t;}
           if(i>=6 && i<=9){ t=new HabitacionDoble(i+1);a[i]=t; }
            if(i>=10 && i<=18){t=new HabitacionSuite(i+1);a[i]=t;}
            if(i==19){t=new HabitacionPresidencial(i+1); a[i]=t;}
        }
    }

    
    @Override
    public  String toString() {
        for (Habitacion a1 : a) {
            System.out.println(a1.toString()+"\n");
        }  
    
        String re="";
        for (Habitacion a1 : a) {
            re=re+ a1.toString()+"\n";
            
            
        } 
        
     return re;
    }
    
}
