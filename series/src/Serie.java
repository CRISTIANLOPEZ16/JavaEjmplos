import java.util.ArrayList;

/**
 * 
 */
public class Serie {

    /**
     * Default constructor
     */
    public Serie() {

        this.temporadas = new ArrayList<>();

        this.criticas = new ArrayList<>();

        this.personajes = new ArrayList<>();

        this.titulo = null;

        this.anioInicio = 0;

        this.sinopsis = null;

        this.calificacion = 0;

        this.numeroTemporadasProducidas = 0;

        this.estado = null;

        this.genero = null;

    }

    /**
     * 
     */
    private String titulo;

    /**
     * 
     */
    private int anioInicio;

    /**
     * 
     */
    private String sinopsis;

    /**
     * 
     */
    private int calificacion;

    /**
     * 
     */
    private ArrayList<Personaje> personajes;

    /**
     * 
     */
    private int numeroTemporadasProducidas;

    /**
     * 
     */
    private ArrayList<Temporada> temporadas;

    /**
     * 
     */
    private ArrayList<Critica> criticas;

    /**
     * 
     */
    private Estado estado;

    /**
     * 
     */
    private Genero genero;

    public Serie(String titulo, int anioInicio, String sinopsis, int calificacion, int numeroTemporadasProducidas, Estado estado, Genero genero) {

        this();

        this.titulo = titulo;

        this.anioInicio = anioInicio;

        this.sinopsis = sinopsis;

        this.calificacion = calificacion;

        this.numeroTemporadasProducidas = numeroTemporadasProducidas;

        this.estado = estado;

        this.genero = genero;

    }

    /**
     * @param personaje 
     * @return
     */
    public boolean agregarPersonaje(Personaje personaje) {

        // agrega personajes a la serie siempre y cuando no haya aparecido antes en la misma

        boolean response = false;

        if ( !this.personajes.contains( personaje ) ){

            this.personajes.add(personaje);

            response = true;

        }

        return response;

    }

    /**
     * @param temporada 
     * @return
     */
    public boolean agregarTemporada(Temporada temporada) {

        // agrega temporadas a la serie siempre y cuando no sea repetida

        boolean response = false;

        if ( !this.temporadas.contains( temporada) ){

            this.temporadas.add(temporada);

            this.numeroTemporadasProducidas++;

            response = true;

        }

        return response;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(int anioInicio) {
        this.anioInicio = anioInicio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getEstado() {
        return estado.name();
    }

    public boolean setEstado(String estado) {

        /*recibe un string en minuscula y se verifica si corresponde a un elemento del enum,

         posteriormente asigna el elemento correcto del enum a la serie,

         devuelve true si se pudo realizar la operación

        */

        boolean valido = false;

        if ( estado != null ){

            for (Estado state : Estado.values() ){

                if ( estado.toUpperCase().equals( state.name() ) ){

                    this.estado = state;

                    valido = true;

                }
            }

        }

        return valido;

    }

    public String getGenero() {
        return genero.name();
    }

    public boolean setGenero(String genero) {

        /*recibe un string en minuscula y se verifica si corresponde a un elemento del enum,

         posteriormente asigna el elemento correcto del enum a la serie,

         devuelve true si se pudo realizar la operación

        */

        boolean valido = false;

        if ( genero != null ){

            for (Genero gen : Genero.values() ){

                if ( genero.toUpperCase().equals( gen.name() ) ){

                    this.genero= gen;

                    valido = true;

                }
            }

        }

        return valido;

    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public int getNumeroTemporadasProducidas() {
        return numeroTemporadasProducidas;
    }

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    public ArrayList<Critica> getCriticas() {
        return criticas;
    }

    public void agregarCritica(Critica critica){

        this.criticas.add(critica);

    }

    public Temporada getTemporada(int numero ){

        Temporada response = null;

        for ( Temporada temp : this.temporadas ) {

            if ( temp.getNumeroTemporada() == numero ){

                response = temp;

            }

        }

        return response;

    }


}