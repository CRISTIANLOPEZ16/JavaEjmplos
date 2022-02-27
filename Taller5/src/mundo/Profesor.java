package mundo;

import java.time.LocalDate;

/**
 *
 * @author
 */
public abstract class Profesor extends Persona {

    protected int codigo;
    protected LocalDate fech;

    public Profesor(String nombre, String apellidos, int edad, int codigo, int dia, int mes, int anio) {
        super(nombre, apellidos, edad);
        this.codigo = codigo;
        fech = LocalDate.of(anio, mes, dia);
    }

    public int mostrarCodigo() {
        return this.codigo;
    }

    public LocalDate getFecha() {
        return fech;
    }

    abstract public float importeNomina();

    public String mostrarLosDatos() {
        return "El profesor es de: \n Nombre " + this.nombre + " Apellido " + this.apellidos + " Edad " + this.edad
                + " y su codigo es " + this.codigo;

    }

}
