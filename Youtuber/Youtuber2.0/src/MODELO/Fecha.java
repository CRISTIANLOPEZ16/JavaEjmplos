package MODELO;

/**
 *
 * @author 1151646 - 1151647
 */
public class Fecha 
{
    public int fechaNac;
    
    /**
     * Constructor con parámetros 
     * @param fecha 
     */
    public Fecha(int fecha)
    {
        fechaNac = fecha;
    }
    
    /**
     * Método get que retorna la variable fechaNac
     * @return 
     */
    
    public int getFechaNac()
    {
        return fechaNac;
    }
    
    /**
     * Método set para cambiar el valor de la variable fechaNac
     * @param fecha 
     */
    
    public void setFechaNac(int fecha)
    {
        fechaNac = fecha;
    }
}
