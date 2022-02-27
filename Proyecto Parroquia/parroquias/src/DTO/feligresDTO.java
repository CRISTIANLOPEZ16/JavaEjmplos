
package DTO;

public class feligresDTO {
 private String cedula;
 private String nombre;
 private String apellidos;
 private String dirreccion;
 private String FeahcaDeNacimiento;
 private String telefono;
 private String estado;
 private String estrato;

    public feligresDTO() {
    }

    public feligresDTO(String cedula, String nombre, String apellidos, String dirreccion, String FeahcaDeNacimiento, String telefono, String estado, String estrato) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dirreccion = dirreccion;
        this.FeahcaDeNacimiento = FeahcaDeNacimiento;
        this.telefono = telefono;
        this.estado = estado;
        this.estrato = estrato;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public String getFeahcaDeNacimiento() {
        return FeahcaDeNacimiento;
    }

    public void setFeahcaDeNacimiento(String FeahcaDeNacimiento) {
        this.FeahcaDeNacimiento = FeahcaDeNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    @Override
    public String toString() {
        return "feligresDTO{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dirreccion=" + dirreccion + ", FeahcaDeNacimiento=" + FeahcaDeNacimiento + ", telefono=" + telefono + ", estado=" + estado + ", estrato=" + estrato + '}';
    }
 
}
