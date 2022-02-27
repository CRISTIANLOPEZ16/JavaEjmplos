package mundo;

import java.util.ArrayList;

/**
 *
 * @author
 */
public class ListaProfesores {

    protected ArrayList<Profesor> listaProfesor;

    public ListaProfesores() {
        listaProfesor = new ArrayList();
    }

    public void agregar(Profesor profesor) {
        listaProfesor.add(profesor);
    }

    public void imprimirLista() {
        for (Profesor p : listaProfesor) {
            System.out.println(p.mostrarLosDatos() + " el sueldo es: " + p.importeNomina());
        }

    }

    public double importeTotalNominaProfesorado() {
        double pro = 0;
        for (Profesor profesor : listaProfesor) {
            if (profesor instanceof ProfesorOcasional) {
                ProfesorOcasional p = (ProfesorOcasional) profesor;
                pro += p.importeNomina();
            } else if (profesor instanceof ProfesorCatedra) {
                ProfesorCatedra p = (ProfesorCatedra) profesor;
                pro += p.importeNomina();
            } else if (profesor instanceof ProfesorPlanta) {
                ProfesorPlanta p = (ProfesorPlanta) profesor;
                pro += p.importeNomina();
            }

        }
        return pro;

    }

}
