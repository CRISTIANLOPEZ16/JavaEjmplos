package mundo;

/**
 *
 * @author
 */
public class ProfesorCatedra extends Profesor {

    protected int cantidadHoras;
    protected String Categoria;

    public ProfesorCatedra(String nombre, String apellidos, int edad, int codigo, int dia, int mes, int anio, int horas, String categoria) {
        super(nombre, apellidos, edad, codigo, dia, mes, anio);
        this.cantidadHoras = horas;
        this.Categoria = categoria;
    }

    @Override
    public float importeNomina() {
        if (this.Categoria.equals("Instructor")) {
            return 13000 * cantidadHoras;
        }
        if (this.Categoria.equals("auxiliar")) {
            return 14000 * cantidadHoras;
        }
        if (this.Categoria.equals("asociado")) {
            return 15000 * cantidadHoras;
        }
        if (this.Categoria.equals("titular")) {
            return 16000 * cantidadHoras;
        }

        return 0;
    }

    @Override
    public String mostrarLosDatos() {
        return super.mostrarLosDatos() + " su fecha de contrato es: " + getFecha();
    }

}
