
import java.util.*;

/**
 * 
 */
public class Personaje {

    /**
     * Default constructor
     */
    public Personaje() {

        this.nombre = null;

        this.interprete = null;

        this.seriesParticipa = new ArrayList<>();

        this.capitulosParticipa = new ArrayList<>();

    }

    public Personaje(String nombre, Actor interprete ) {

        this();

        this.nombre = nombre;

        this.interprete = interprete;

    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private Actor interprete;

    /**
     * 
     */
    private ArrayList<Serie> seriesParticipa;

    /**
     *
     */
    private ArrayList<Capitulo> capitulosParticipa;


    /**
     * @param serie 
     * @return
     */
    public boolean participarSerie(Serie serie) {

        // agrega una serie a la filmografia del personaje en cuestion

        boolean response = false;

        if ( !this.seriesParticipa.contains( serie ) ){

            this.seriesParticipa.add(serie);

            response = true;

        }

        return response;

    }

    /**
     * @param capitulo 
     * @return
     */
    public boolean participarCapitulo(Capitulo capitulo) {

        // agrega un capitulo a la filmografia del personaje en cuestion

        boolean response = false;

        if ( !this.capitulosParticipa.contains( capitulo ) ){

            this.capitulosParticipa.add(capitulo);

            response = true;

        }

        return response;

    }

}