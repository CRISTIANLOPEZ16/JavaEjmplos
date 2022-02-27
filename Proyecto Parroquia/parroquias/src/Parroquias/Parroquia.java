package Parroquias;
import Controlador.*;
import DAO.diezmoDAO;
import DAO.feligresDAO;
import Vista.*;
public class Parroquia {

    public static void main(String[]args){
        feligresDAO f =new feligresDAO();
        diezmoDAO d=new diezmoDAO();
        Formulario_Registro v=new Formulario_Registro();
        new Controlador(f,d,v);
        v.setVisible(true);
    }
}
