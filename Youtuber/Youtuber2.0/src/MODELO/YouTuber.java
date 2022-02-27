package MODELO;

/**
 *
 * @author 1151646 - 1151647
 */
public class YouTuber extends Persona
{
    public Video videos[];
    public YouTuberFollower followers[];
    private int count;
        
    public YouTuber(){}
    
    public YouTuber(Fecha fecha, String nombre)
    {
        super(fecha, nombre);
        videos = new Video[5];
        followers = new YouTuberFollower[1];
    }
    
    public void  agregarFollower(YouTuberFollower f)
    {
        YouTuberFollower [] followersTmp = null;
        
        if(count == followers.length){
            followersTmp = new YouTuberFollower[followers.length + 1];
            for(int i = 0; i < followers.length; i++) followersTmp[i]=followers[i];
            this.followers = followersTmp;
        }
      
        followers[count++] = f;
    }
    
    
    public void eliminarFollower(YouTuberFollower f)
    {
        YouTuberFollower [] followersTmp = null;
        
        for(int i=0; i<followers.length; i++)
        {
            if(followers[i].nombre.equals(f.nombre))
            {
                followers[i]=null;
                followersTmp = new YouTuberFollower[followers.length - 1];
                int k=0;
                for(int j=0; j<followers.length; j++)
                {
                    if(followers[j]!=null)
                    {
                        followersTmp[k]=followers[j];
                        k++;
                    }
                }
                this.followers=followersTmp;
                count--;
                break;
            }             
        }        
    }

    public Fecha getFechaNac() 
    {
        return fechaNac;
    }

    public void setFechaNac(Fecha fechaNac) 
    {
        this.fechaNac = fechaNac;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
}
