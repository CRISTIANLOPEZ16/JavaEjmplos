package mundo;

/**
 *
 * @author
 */
public class ProfesorOcasional extends Profesor {

    public ProfesorOcasional(String nombre, String apellidos, int edad, int codigo, int dia, int mes, int anio) {
        super(nombre, apellidos, edad, codigo, dia, mes, anio);
    }

    @Override
    public float importeNomina() {
        return 3515589f;
    }

    public String mostrarLosDatos() {
        return super.mostrarLosDatos() + " su fecha de contrato es: " + getFecha().toString();
    }
}
