package DTO;

public class diezmoDTO {
 private String cedula;
 private int monto;

    public diezmoDTO() {
    }

    public diezmoDTO(String cedula, int monto) {
        this.cedula = cedula;
        this.monto = monto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "diezmoDTO{" + "cedula=" + cedula + ", monto=" + monto + '}';
    }
 
}
