package MODELO;

/**
 *
 * @author 1151646 - 1151647
 */
public class YouTuberFollower extends Persona
{
    public YouTuber [] misYoutubers;
    private int count;
//    String nombresYoutubers [] = new String [10];
    
    public YouTuberFollower(){}
    
    public YouTuberFollower(Fecha fecha, String nombre)
    {
        super(fecha, nombre);
        misYoutubers = new YouTuber[1];   
    }
    
    public void seguirYoutuber(YouTuber y)
    {
        if(existeYoutuber(y)==false)
        {
            y.agregarFollower(this);
            addYoutubers(y);
        }
    }
    
    public boolean existeYoutuber(YouTuber y)
    {
        boolean existe=false;
        if(misYoutubers[0]!=null)
        {
            for(YouTuber temp : misYoutubers)
            {
                if(temp.nombre.equals(y.nombre))
                    existe=true;
                break;
            }
        }
        return existe;        
    }
    
    public void dejarDeSeguirYoutuber(YouTuber y)
    {
        if(existeYoutuber(y)==true){
            y.eliminarFollower(this);
            delYoutuber(y);}
    } 
        
    private void addYoutubers(YouTuber y)
    {
        YouTuber [] youtubersTmp = null;
        if(count == misYoutubers.length)
        {
            youtubersTmp = new YouTuber[misYoutubers.length + 1];
            for(int i = 0; i < misYoutubers.length; i++) youtubersTmp[i]=misYoutubers[i];
            this.misYoutubers = youtubersTmp;
        }
      
        misYoutubers[count++] = y;
    }
        
    private void delYoutuber(YouTuber y)
    {
        YouTuber [] youtubersTmp = null;
        for(int i=0; i<misYoutubers.length; i++)
        {
            if(misYoutubers[i].nombre.equals(y.nombre))
            {
                misYoutubers[i]=null;
                youtubersTmp = new YouTuber[misYoutubers.length - 1];
                int k=0;
                for(int j=0; j<misYoutubers.length; j++)
                {
                    if(misYoutubers[j]!=null)
                    {
                        youtubersTmp[k]=misYoutubers[j];
                        k++;
                    }
                }
                this.misYoutubers=youtubersTmp;
                count--;
                break;
            }             
        }        
    }
}
