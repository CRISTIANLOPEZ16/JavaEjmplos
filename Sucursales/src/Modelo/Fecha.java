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
public class Fecha {
 int dia;
 int mes;
 int año;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

 public static final int [ ] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};  
  Fecha()
    {
    
     this.dia=0;
     this.mes=0;
     this.año=0;
      
    }
    
  Fecha(int dia,int mes,int año)
    {
     if(Validacion(dia,mes,año))
     {
     this.dia=dia;
     this.mes=mes;
     this.año=año;
     }
     
    
    }    
    public boolean esAnioBisiesto(int año)
    {
      return ((año%4 == 0) && ((año%100 != 0) || (año%400 == 0)))?true:false;
    }
   
    
     boolean Validacion(int dia,int mes,int año)
    {
      boolean g=esAnioBisiesto(año);
      int y=0,u=0;
      if(mes==2 && dia<=29 && g==true){u=1;}
      else{ y=(mes>0 && mes<13)?(dia>0 && dia<=diasMes[mes-1])?1:0:0;u=(y==1)?1:0;}
      return (u==1)?true:false;
    }   
}
