package MODELO;

/**
 * @author 1151646 - 1151647
 */
public class Persona 
{
    public Fecha fechaNac;
    public String nombre;
    
    /**
     * Costructor con vacío
     */
    public Persona(){}
    
    /**
     * Costructor con parámetros
     * @param fecha
     * @param nombre 
     */
    public Persona(Fecha fecha, String nombre) {
        this.fechaNac = fecha;
        this.nombre = nombre;
    }
    
    /**
     * Método get que retorna la variable fechaNac
     * @return 
     */
    
    public Fecha getFechaNac()
    {
        return fechaNac;
    }
    
    /**
     * Método set para cambiar el valor de la variable fechaNac
     * @param fecha 
     */
    
    public void setFechaNac(Fecha fecha)
    {
        this.fechaNac = fecha;
    }
    
    /**
     * Método get que retorna la variable nombre
     * @return 
     */
    
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * Método set para cambiar el valor de la variable nombre
     * @param nombre 
     */
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
}
