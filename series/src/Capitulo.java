import java.util.ArrayList;

/**
 * 
 */
public class Capitulo {

    /**
     * Default constructor
     */
    public Capitulo() {

        this.titulo = null;

        this.numeroCapitulo = 0;

        this.duracion = 0;

        this.personajes = new ArrayList<>();

        this.subtitulos = new ArrayList<>();

        this.criticas = new ArrayList<>();

    }

    /**
     * 
     */
    private String titulo;

    /**
     * 
     */
    private int numeroCapitulo;

    /**
     * 
     */
    private int duracion;

    /**
     * 
     */
    private ArrayList<Personaje> personajes;

    /**
     * 
     */
    private ArrayList<Subtitulo> subtitulos;

    /**
     * 
     */
    private ArrayList<Critica> criticas;

    public Capitulo(String titulo, int numeroCapitulo, int duracion) {

        this();

        this.titulo = titulo;

        this.numeroCapitulo = numeroCapitulo;

        this.duracion = duracion;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroCapitulo() {
        return numeroCapitulo;
    }

    public void setNumeroCapitulo(int numeroCapitulo) {
        this.numeroCapitulo = numeroCapitulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public ArrayList<Subtitulo> getSubtitulos() {
        return subtitulos;
    }

    public ArrayList<Critica> getCriticas() {
        return criticas;
    }


    /**
     * @param subtitulo 
     * @return
     */
    public boolean agregarSubtitulo(Subtitulo subtitulo) {

        // subtitulos al capitulo siempre y cuando no lo posea anteriormente

        boolean response = false;

        if ( !this.subtitulos.contains( subtitulo ) ){

            this.subtitulos.add(subtitulo);

            response = true;

        }

        return response;

    }

    public void agregarCritica(Critica critica){

        this.criticas.add(critica);

    }

}