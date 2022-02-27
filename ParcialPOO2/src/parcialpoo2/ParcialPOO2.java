/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo2;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import vista.RegistrarH;

/**
 *
 * @author ASUS
 */
public class ParcialPOO2 {

    Scanner sc = new Scanner(System.in);
    public static Hotel h = new Hotel();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ParcialPOO2 a = new ParcialPOO2();
        Persona p1 = new Persona(19, "eduardo", "13123");
        Persona p2 = new Persona(21, "Jose", "435123");
        Persona p3 = new Persona(31, "Jhoan", "9733");
        Persona p4 = new Persona(34, "Daniela", "3198327");
        Persona p5 = new Persona(41, "Nathalia", "666");
        a.h.a[2].integrantes.add(p1);
        a.h.a[4].integrantes.add(p2);
        a.h.a[5].integrantes.add(p3);
        a.h.a[6].integrantes.add(p4);
    }

    public void menu() {
        int opcion;

        System.out.println("Bienvenido administrador ");
        System.out.println("---------------Lista De acciones-----------");
        System.out.println("Para Visualizar la informacion de las habitaciones: 1 ");
        System.out.println("Para Registrar al responsable de una habitacion: 2");
        System.out.println("Para Registrar un huesped en una habitacion:3");
        System.out.println("Para Dar salida a una habitacion:4");
        System.out.println("Para Adquirir un servicio: 5");
        System.out.println("Para Pagar un servicio: 6");
        System.out.println("Para Buscar habitacion por cedula de huespsed: 7");
        System.out.println("Para calcular el porcentaje de huepedes que son responsables de habitaciones en el hotel: 8");
        System.out.println("Para calcular estadisticas en el hotel: 9");
        System.out.println("Para ver la bitacora del horel: 10");
        System.out.println("Para Buscar el responsable con mas habitaciones a su nombre: 11");
        System.out.println("Para generar la factura de alguna habitacion: 12");
        System.out.println("Para Salir : 0");
        System.out.println("------------------------------------------");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                mostrar();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:

                break;
            case 6:

                break;
            case 7:
                break;
            case 8:
                calcularPorcentajeHuespedesResponsables();
                break;
            case 9:
                calcularEstadisticas();
                break;
            case 10:
                verBitacora();
                break;
            case 11:
                BuscarResponsableMonopolizador();
                break;
            case 12:
                GenerarFactura();
            default:
                break;
        }
    }

    public void mostrar() {
        System.out.println("-----------------mostrando lista de habitaciones con detalles--------------");
        h.toString();
        System.out.println("Presione enter para continuar");
        pausa();

        System.out.println("---------------------------------------------------------------------------");
        menu();
    }

    public void GenerarFactura() {
        String factura = "";
        System.out.println("--------------------Generando factura de Habitacion----------------------");
        System.out.println("Ingrese la habitacion para cobrar");
        int habitacion = sc.nextInt() - 1;
        if ("0".equals(h.a[habitacion].Propietario.cedula)) {
            System.out.println("la habitacion no tiene responsables");
        } else {
            System.out.println("responsable de la habitacion= " + (habitacion + 1) + "es= " + h.a[habitacion].Propietario.nombre + "con cc " + h.a[habitacion].Propietario.cedula);
            System.out.println("servicios no pagados:");
            for (Servicio y : h.a[habitacion].servicio) {
                if (y.pagado == false) {
                    System.out.println(y.tipo + " " + y.costo);
                }
            }
            h.a[habitacion].calcularDeuda();
            h.a[habitacion].calcularGasto();
            System.out.println("gasto total:" + h.a[habitacion].gasto);
            System.out.println("deuda total:" + h.a[habitacion].deuda);

        }
        pausa();
        menu();
    }

    public static void registrarResponsable(String hab, String name, String ced, int edad) {
        boolean registrado = false;

        int habitacion = Integer.parseInt(hab);
        habitacion--;
        if (!"0".equals(h.a[habitacion].Propietario.cedula)) {
            JOptionPane.showMessageDialog(null, "ERROR! ESTA HABITACION YA TIENE RESPONSABLE");

        } else {
            String cedula = ced;
            boolean repetido = false;
            int habitacionTemp = 0;
            for (habitacionTemp = 0; habitacionTemp < h.a.length; habitacionTemp++) {
                repetido = h.a[habitacionTemp].Propietario.cedula.equals(cedula);
                if (repetido) {
                    break;
                }
            }

            Responsable p = new Responsable();
            if (registrado == false) {
                String nombre = name;
                edad = edad;
                p = new Responsable(edad, nombre, cedula);
                h.a[habitacion].Propietario = p;
                p.habitacionesACargo++;
                h.responsables.add(p);
            }
        }
    }

    public static void registrarHuesped(String nombre, String cedula, String habit, int edad) {

        int habi = Integer.parseInt(habit) - 1;
        int temp1 = h.a[habi].integrantes.size();
        int temp2 = h.a[habi].capacidadMax - 1;
        String error = "";
        if (!(temp1 <= temp2)) {
            JOptionPane.showMessageDialog(null, "esta habitacion ha alcanzado su capacidad maxima");
            error = nombre;

            //menu();
        } else {
            boolean existe = false;
            boolean existeResponsable = false;

            Persona p = new Persona();
            for (int i = 0; i < h.a.length; i++) {
                for (int j = 0; j < h.a[i].integrantes.size(); j++) {
                    existe = h.a[i].integrantes.get(j).cedula.equals(cedula);
                    if (existe) {
                        break;
                    }
                    break;
                }
                existeResponsable = h.a[i].Propietario.cedula.equalsIgnoreCase(cedula);
                if (existeResponsable) {
                    p = h.a[i].Propietario;
                    break;
                }
            }
            if (existe) {
                JOptionPane.showMessageDialog(null, "Ya esta registrado");
                error = nombre;
                //menu();
            } else {

                if (existeResponsable == true) {
                    h.a[habi].registrarHuesped(p);
                } else {
                    p = new Persona(edad, nombre, cedula);
                    h.a[habi].registrarHuesped(p);
                }

                //verificar si un responsable con la misma cc ya existe
            }

        }
        if (!(error.equals(""))) {
            añadirABitacora(2, error);
        }
    }

    public static String comprobarS(String servi, String hab) {

        String var = "";

        boolean vacia = false;
        int habi = Integer.parseInt(hab) - 1;

        if (h.a[habi].integrantes.size() == 0) {
            vacia = true;
            JOptionPane.showMessageDialog(null, "La habitacion esta vacia");
        }

        if (servi.equals("MINI BAR") && !vacia) {
            var = "Servicio: MINI BAR Costo: $ 10.000";
        }
        if (servi.equals("INTERNET") && !vacia) {
            var = "Servicio: INTERNET Costo: $ 2.000";
        }

        if (servi.equals("PELICULAS") && !vacia) {
            var = "Servicio: PELICULAS Costo: $ 7.000";
        }
        if (servi.equals("SPA") && habi < 11 && !vacia) {
            var = "Servicio: SPA Costo: $ 30.000";
        } else if (servi.equals("SPA") && habi >= 11) {
            JOptionPane.showMessageDialog(null, "El SPA esta restringido para esta habitacion");
        }

        return var;
    }

    public static void adquirirServicio(String hab, String servi) {

        int habitacion = Integer.parseInt(hab) - 1;

        int x = 0;
        if (servi.equals("MINI BAR")) {
            x = 1;
        }
        if (servi.equals("INTERNET")) {
            x = 2;
        }

        if (servi.equals("PELICULAS")) {
            x = 3;
        }
        if (servi.equals("SPA") && habitacion < 11) {
            x = 4;
        }
        Servicio servicio = new Servicio(x);
        h.a[habitacion].servicio.add(servicio);

    }

    public static String comprobarPago(String hab) {
        int habitacion = Integer.parseInt(hab) - 1;
        String var = "";
        if (h.a[habitacion].servicio.isEmpty()) {
            var = "Esta habitacion no tiene servicios";
        } else {
            for (int i = 0; i < h.a[habitacion].servicio.size(); i++) {
                if (h.a[habitacion].servicio.get(i).pagado == false) {
                    var = var + "id: " + i + h.a[habitacion].servicio.get(i).toString() + "\n";
                }

            }
            // int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la id del servicio a pagar"));

        }
        return var;
    }

    public static String pagarServicio(String hab) {
        int habitacion = Integer.parseInt(hab) - 1;
        String var = "";
        boolean pagado = false;
        do {

            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la id del servicio a pagar"));

            if (h.a[habitacion].servicio.get(id).pagado == true) {
                System.out.println("este servicio ya está pagado");

            } else {
                h.a[habitacion].servicio.get(id).pagado = true;
                pagado = true;

                for (int i = 0; i < h.a[habitacion].servicio.size(); i++) {

                    if (h.a[habitacion].servicio.get(i).pagado == false) {
                        var = "id: " + i + h.a[habitacion].servicio.get(i).toString();
                    }
                }
            }
        } while (pagado == false);

        return var;
    }

    private void pausa() {
        String entrada = "";
        do {
            entrada = sc.nextLine();
            System.out.println(entrada);
        } while (!entrada.equals(""));
    }

    public static String comprobarSalida(int habitacion) {
        String var = "";
        if (h.a[habitacion].integrantes.isEmpty()) {
            var = "Esta  habitacion no tiene personas que la alberguen";
        } else {

            boolean terminado = false;
            boolean sinPagar = false;
            do {
                if (h.a[habitacion].servicio.isEmpty()) {
                    terminado = true;
                    var = "La habitación puede ser vaciada";
                }
                for (int i = 0; i < h.a[habitacion].servicio.size(); i++) {
                    if (h.a[habitacion].servicio.get(i).pagado == false) {
                        var = "La habitación aun no ha pagado todos sus servicios";

                        Integer temp = habitacion + 1;
                        añadirABitacora(3, temp.toString());
                        sinPagar = true;
                        break;
                    } else {
                        var = "La habitación puede ser vaciada";
                        terminado = true;

                    }
                }
                if (sinPagar) {
                    break;
                }
            } while (terminado == false);

        }

        return var;
    }

    public static String salidaHabitacion(int habitacion) {
        h.a[habitacion].vaciar();
        JOptionPane.showMessageDialog(null, "Habitacion Vaciada");
        return "Habitacion " + habitacion++ + " Vaciada";
    }

    public static void añadirABitacora(int error, String contenido) {
        /*
            1 para error de registro de responsable
            2 para error de registro de huesped
            3 para error de salida habitacion
         */
        switch (error) {
            case 1:
                h.bitacora = h.bitacora + "\n" + "El responsable " + contenido + " no pudo ser registrado";

                break;
            case 2:
                h.bitacora = h.bitacora + "\n" + "El huesped " + contenido + " no pudo ser registrado";
                break;
            case 3:
                h.bitacora = h.bitacora + "\n" + "no pudo dar la salida de la habitacion: " + contenido;
                break;
            default:
                break;
        }

    }

    public static String buscarHabitacionHuespedCedula(String cedula) {
        String var = "";
        boolean encontrado = false;
        for (int i = 0; i < h.a.length; i++) {
            for (int j = 0; j < h.a[i].integrantes.size(); j++) {
                if (cedula.equalsIgnoreCase(h.a[i].integrantes.get(j).cedula)) {
                    encontrado = true;
                    var = "la persona: " + h.a[i].integrantes.get(j).nombre + " identificado con: " + h.a[i].integrantes.get(j).cedula;
                    var = var + "\nse encuentra en la habitacion: " + (i + 1);
                    break;
                }
            }
            if (encontrado) {
                break;
            } else {
            }
        }
        if (!encontrado) {
            System.out.println("No fue encontrado");
        }
        return var;
    }

    public void calcularPorcentajeHuespedesResponsables() {
        double cantidad = 0.0;
        double cantidadTotal = 0.0;
        double resultado = 0.0;
        for (int i = 0; i < h.a.length; i++) {
            for (int j = 0; j < h.a[i].integrantes.size(); j++) {
                cantidadTotal++;
                if (h.a[i].integrantes.get(j) instanceof Responsable) {
                    cantidad++;
                }
            }
        }
        resultado = (cantidad / cantidadTotal) * 100;

        System.out.println("un : " + resultado + "% de huespedes son responsables de habitaciones");
        pausa();
        menu();
    }

    public void calcularEstadisticas() {
        int habitacionesVacias = 0, habitacionesLlenas = 0, mayorConsumo = 0, mayorDeuda = 0;
        System.out.println("---------ESTADISTICAS----------");
        for (Habitacion i : h.a) {
            if (i.integrantes.isEmpty()) {
                habitacionesVacias++;
            }
            if (i.integrantes.size() == i.capacidadMax) {
                habitacionesLlenas++;
            }
        }

        //mayor consumo
        Habitacion aux = new HabitacionEjecutiva(0);
        for (Habitacion t : h.a) {
            t.calcularGasto();
            aux.calcularGasto();
            if (t.gasto > aux.gasto) {
                aux = t;
            }
        }
        mayorConsumo = aux.id;
        //mayor deuda
        aux = new HabitacionEjecutiva(0);
        for (Habitacion t : h.a) {
            t.calcularDeuda();
            aux.calcularDeuda();
            if (t.deuda > aux.deuda) {
                aux = t;
            }
        }
        mayorDeuda = aux.id;

        System.out.println("habitaciones Vacias: " + habitacionesVacias);
        System.out.println("habitaciones Llenas: " + habitacionesLlenas);
        System.out.println("habitacion mayor Consumo: " + mayorConsumo);
        System.out.println("habitacion mayor Deuda : " + mayorDeuda);
        pausa();
        menu();

    }

    public static String verBitacora() {
        return h.bitacora;       
    }

    public void BuscarResponsableMonopolizador() {
        System.out.println("---------Responsable jugando al monopoly----------");
        System.out.println("---------EXPROPIENLO!!!----------");
        System.out.println("---------PROLETARIADO DEL MUNDO UNIDO!----------");
        System.out.println("---------VENEZUELA NO ES UN EJEMPLO----------");
        Responsable aux1 = new Responsable();
        Responsable aux = new Responsable();
        for (int i = 0; i < h.responsables.size(); i++) {
            aux1 = (Responsable) h.responsables.get(i);
            if (aux.habitacionesACargo < aux1.habitacionesACargo) {
                aux = aux1;
            }

        }
        System.out.println("este es: " + aux.toString());
        pausa();
        menu();
    }
}
