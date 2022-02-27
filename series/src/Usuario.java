
import java.util.*;

/**
 * 
 */
public class Usuario {

    /**
     * Default constructor
     */
    public Usuario() {

        this.seriesFavoritas = new ArrayList<>();

        this.seriesEnUso = new ArrayList<>();

        this.nombre = null;

        this.apellidos = null;

        this.fechaNacimiento = 0;

        this.email = null;

    }

    /**
     * 
     */
    private String nombre;

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
    private ArrayList<Serie> seriesFavoritas;

    /**
     * 
     */
    private ArrayList<Serie> seriesEnUso;

    /**
     * 
     */
    private String email;

    public Usuario(String nombre, String apellidos, int fechaNacimiento, String email) {

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

    public ArrayList<Serie> getSeriesFavoritas() {
        return seriesFavoritas;
    }

    public ArrayList<Serie> getSeriesEnUso() {
        return seriesEnUso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param serie 
     * @param temporada 
     * @param capitulo 
     * @return
     */
    public boolean verCapitulo(Serie serie, Temporada  temporada, int capitulo) {

        boolean response = false;

        ArrayList<Temporada> temporadasSerie = serie.getTemporadas();

        if ( temporadasSerie.contains(temporada) ){

            int indice_temporada = temporadasSerie.indexOf(temporada);

            int indice_capitulo = 9999;

            //se inicia en 99 pues no hay series con 9999 capitulos y asi sabes si el capitulo se encuentra o no en una temporada de la serie

            ArrayList<Capitulo>  capitulosTemporada = temporadasSerie.get(indice_temporada).getCapitulos();

            for (Capitulo cap : capitulosTemporada) {

                if(cap.getNumeroCapitulo() == capitulo){

                    indice_capitulo = capitulosTemporada.indexOf(cap);

                }

            }

            /*si el indice no es 9999 es porque el capitulo esta en la temporada,
            entonces procedemos a agregarlo a capitulos vistos,
            cambiar el estado de la serie y agregarla en la series en uso actualmente
             */

            if ( indice_capitulo != 9999  ){

                serie.getTemporadas().get(indice_temporada).agregarCapituloVisto( capitulosTemporada.get(indice_capitulo) );


                //ver si ya vio toda la temporada

                int contadorTemporadasVistas = 0;

                for ( Temporada temp: temporadasSerie) {

                    int contadorCaptiulosVistos = 0;

                    for ( Capitulo cap :  temp.getCapitulos() ) {

                        if(temp.getCapitulosVistos().contains(cap)){ contadorCaptiulosVistos++; }

                    }

                    if ( contadorCaptiulosVistos == temp.getCapitulosVistos().size() ){ contadorTemporadasVistas++; }

                }

                //si ya se vio todas las temporadas cambiar su estado

                if ( contadorTemporadasVistas == temporadasSerie.size() ){ serie.setEstado("vista"); }

                if( temporada.getCapitulosVistos().size() == 1 ){ serie.setEstado( "empezada" ); }

                this.seriesEnUso.add( serie );

                response = true;

            }

        }

        return response;
    }

    /**
     * @param serie 
     * @return
     */
    public boolean agregarSerieFavorita(Serie serie) {

        // agrega capitulos a la lista de series favoritas

        boolean response = false;

        if ( !this.seriesFavoritas.contains( serie ) ){

            this.seriesFavoritas.add(serie);

            response = true;

        }

        return response;

    }

    /**
     * @param serie 
     * @return
     */
    public boolean criticarSerie(Serie serie , Critica critica) {

        boolean response =  false;

        if(!serie.getCriticas().contains(critica) ){

            serie.agregarCritica(critica);

            response = true;

        }

        return response;

    }

    /**
     * @param serie 
     * @return
     */
    public boolean cancelarSerie(Serie serie) {

        //deja de seguir la serie ( la borra de las series en uso y de las series favoritas )

        boolean response = false;

        if ( seriesFavoritas.contains(serie) || seriesEnUso.contains( serie ) ) {

            seriesFavoritas.remove(serie);

            seriesEnUso.remove(serie);

            serie.setEstado("cancelada");

            response = true;

        }

        return response;

    }

    /**
     * @param serie 
     * @return
     */
    public boolean puntearSerie(Serie serie , int calificacion) {

        //califica la serie de 1 a 10

        boolean response = false;

        if ( calificacion > 0 && calificacion < 11){ serie.setCalificacion( calificacion );  response= true; }

        return response;

    }

    /**
     * @param temporada 
     * @return
     */
    public ArrayList<Capitulo> getCapitulosVistos( Temporada temporada) {

        return temporada.getCapitulosVistos();

    }

    /**
     * @param capitulo 
     * @return
     */
    public boolean criticarCapitulo(Capitulo capitulo, Critica critica ) {

        boolean response = false;

        if(!capitulo.getCriticas().contains(critica)){

            capitulo.agregarCritica(critica);

            response = true;

        }

        return response;

    }

}