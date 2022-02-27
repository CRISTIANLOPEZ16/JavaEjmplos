
package MODELO;
import VISTA.*;

/**
 *
 * @author 1151646 - 1151647
 */
public class Control 
{
    public static void main(String[] args) 
    {
        new GUI().setVisible(true);
        
        Fecha fechaNac = new Fecha(19940306);
        YouTuberFollower follower1 = new YouTuberFollower(fechaNac, "Seguidor1");
        YouTuberFollower follower2 = new YouTuberFollower(fechaNac, "Seguidor3");
        YouTuberFollower follower3 = new YouTuberFollower(fechaNac, "Seguidor2");
        YouTuber youtuber1 = new YouTuber(fechaNac, "Youtuber1");
        YouTuber youtuber2 = new YouTuber(fechaNac, "Youtuber2");
        YouTuber youtuber3 = new YouTuber(fechaNac, "Youtuber3");
        
        follower1.seguirYoutuber(youtuber1);
        
    }
}
