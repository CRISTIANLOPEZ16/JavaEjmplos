package mundo;

/**
 *
 * @author
 */
public class Uso_Persona {
    
      public static void main(String[] args){
      ProfesorCatedra catedra1 = new ProfesorCatedra("Hector","Parra",65,54789,28,2,1991,9,"Asociado");
      ProfesorCatedra catedra2 = new ProfesorCatedra("Pedro","Perez",35,76534,6,9,2017,5,"Auxiliar");
      ProfesorCatedra catedra3 = new ProfesorCatedra("Juan","Martinez",43,558745,1,7,2016,14,"Titular");
      ProfesorOcasional ocacional1 = new ProfesorOcasional("Julio","Berbesi",47,55789,4,1,2006);
      ProfesorOcasional ocacional2 = new ProfesorOcasional("Milton","Vera",47,55274,20,11,2000);
      ProfesorPlanta planta1 = new ProfesorPlanta("Oscar","Gallardo",53,55270,15,2,1995,"titular");
      ProfesorPlanta planta2 = new ProfesorPlanta("Matias","Herrera",41,55289,14,2,2012,"Instructor");
      
      ListaProfesores lpo = new ListaProfesores();
      lpo.agregar(planta2);
      lpo.agregar(planta1);
      lpo.agregar(ocacional1);
      lpo.agregar(ocacional2);
      lpo.agregar(catedra1);
      lpo.agregar(catedra2);
      lpo.agregar(catedra3);
      
          System.out.println("impresion de la lista \n");
          lpo.imprimirLista();
          
          System.out.println("El total del importe de nomina de profesores es: "+lpo.importeTotalNominaProfesorado()
          +" Pesos");
      
      
      
      }
    
}
