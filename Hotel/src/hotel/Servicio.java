/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author dower
 */
public class Servicio {
    public int []identificadorServicio;
    public int costoServicio;
    public boolean servicioPagado;

    public Servicio() {
        //Default
    }

    public Servicio(int[] identificadorServicio, int costoServicio, boolean servicioPagado) {
        this.identificadorServicio = identificadorServicio;
        this.costoServicio = costoServicio;
        this.servicioPagado = servicioPagado;
    }

    public int[] getIdentificadorServicio() {
        return identificadorServicio;
    }

    public void setIdentificadorServicio(int[] identificadorServicio) {
        this.identificadorServicio = identificadorServicio;
    }

    public int getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(int costoServicio) {
        this.costoServicio = costoServicio;
    }

    public boolean isServicioPagado() {
        return servicioPagado;
    }

    public void setServicioPagado(boolean servicioPagado) {
        this.servicioPagado = servicioPagado;
    }
    
    
    
}
