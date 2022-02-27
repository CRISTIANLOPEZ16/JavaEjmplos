import java.util.ArrayList;

/**
 * 
 */
public class Actor {

    /**
     * Default constructor
     */
    public Actor() {

        this.nombre = null;

        this.apellidos = null;

        this.fechaNacimiento = 0;

        this.email = null;

        this.papeles = new ArrayList<>();

    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private ArrayList<Personaje> papeles;

    /**
     * 
     */
    private String apellidos;

    /**
     * 
     */
    private int fechaNacimiento;

    /**
     * 
     */
    private String email;


    public Actor(String nombre, String apellidos, int fechaNacimiento, String email) {

        this();

        this.nombre = nombre;

        this.apellidos = apellidos;

        this.fechaNacimiento = fechaNacimiento;

        this.email = email;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Personaje> getPapeles() {
        return papeles;
    }


    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param personaje 
     * @return
     */

    public boolean interpretarPersonaje(Personaje personaje) {

        // agrega personajes al actor siempre y cuando no lo haya interpretado antes

        boolean response = false;

        if ( !this.papeles.contains( personaje ) ){

            this.papeles.add(personaje);

            response = true;

        }

        return response;

    }

}