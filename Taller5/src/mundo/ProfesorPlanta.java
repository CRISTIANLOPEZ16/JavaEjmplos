package mundo;

/**
 *
 * @author
 */
public class ProfesorPlanta extends Profesor {

    protected String categoria;
    protected int horas;

    public ProfesorPlanta(String nombre, String apellidos, int edad, int codigo, int dia, int mes, int anio, String categoria) {
        super(nombre, apellidos, edad, codigo, dia, mes, anio);
        this.categoria = categoria;

    }

    @Override
    public float importeNomina() {
        if (this.categoria.equals("Instructor")) {
            return 300000f;
        }
        if (this.categoria.equals("Auxiliar")) {
            return 2343726f;
        }
        if (this.categoria.equals("Asociado")) {
            return 2953152f;
        }
        if (this.categoria.equals("Titular")) {
            return 4124968f;
        } else {
            return 0;
        }
    }

    @Override
    public String mostrarLosDatos() {
        return super.mostrarLosDatos() + " su fecha de contrato es: " + getFecha();
    }

}
