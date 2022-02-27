
import java.util.*;

/**
 * 
 */
public class Temporada {

    /**
     * Default constructor
     */
    public Temporada() {

        this.capitulosVistos = new ArrayList<>();

        this.capitulos = new ArrayList<>();

        this.fechaInicio = 0;

        this.fechaEstreno = 0;

        this.numeroCapitulos = 0;

        this.numeroTemporada = 0;

    }

    /**
     * 
     */
    private int fechaInicio;

    /**
     * 
     */
    private int fechaEstreno;

    /**
     * 
     */
    private int numeroCapitulos;

    /**
     * 
     */
    private int numeroTemporada;

    /**
     * 
     */
    private ArrayList<Capitulo> capitulosVistos;

    /**
     * 
     */
    private ArrayList<Capitulo> capitulos;


    public Temporada(int fechaInicio, int fechaEstreno, int numeroCapitulos, int numeroTemporada) {

        this();

        this.fechaInicio = fechaInicio;

        this.fechaEstreno = fechaEstreno;

        this.numeroCapitulos = numeroCapitulos;

        this.numeroTemporada = numeroTemporada;

    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(int fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public int getNumeroCapitulos() {
        return numeroCapitulos;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public ArrayList<Capitulo> getCapitulosVistos() {
        return capitulosVistos;
    }

    public ArrayList<Capitulo> getCapitulos() {
        return capitulos;
    }

    /**
     * @param capitulo 
     * @return
     */
    public boolean agregarCapitulo(Capitulo capitulo) {

        // agrega capitulos a la temporada siempre y cuando no sea repetido

        boolean response = false;

        if ( !this.capitulos.contains( capitulo) ){

            this.capitulos.add(capitulo);

            response = true;

            this.numeroCapitulos++;

        }

        return response;

    }

    public boolean agregarCapituloVisto(Capitulo capitulo) {

        // agrega capitulos a la lista de capitulos vistos

        boolean response = false;

        if ( !this.capitulos.contains( capitulo) ){

            this.capitulosVistos.add(capitulo);

            response = true;

        }

        return response;

    }

}
