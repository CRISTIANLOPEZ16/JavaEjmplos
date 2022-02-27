/**
 * 
 */
public class Critica {

    /**
     * Default constructor
     */
    public Critica() {

        this.fechaPublicacion = 0;

        this.resenia = null;

    }

    /**
     * 
     */
    private int fechaPublicacion;

    /**
     * 
     */
    private String resenia;


    public Critica(int fechaPublicacion, String resenia) {

        this.fechaPublicacion = fechaPublicacion;

        this.resenia = resenia;

    }

    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(int fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getResenia() {
        return resenia;
    }

    public void setResenia(String resenia) {
        this.resenia = resenia;
    }

}