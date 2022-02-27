/**
 * 
 */
public class Subtitulo {

    /**
     * Default constructor
     */
    public Subtitulo() {

        this.idioma = null;

        this.autor = null;

    }

    /**
     * 
     */
    private String idioma;

    /**
     * 
     */
    private String autor;

    public Subtitulo(String idioma, String autor) {

        this.idioma = idioma;

        this.autor = autor;

    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}