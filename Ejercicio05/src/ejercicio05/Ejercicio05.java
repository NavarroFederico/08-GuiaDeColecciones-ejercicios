/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

import java.util.Scanner;
import ejercicio05.pais.servicio.utilidades.PaisServicioHashSet;
import ejercicio05.pais.entidades.Pais;

/**
 *
 * @author ASUS
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PaisServicioHashSet paisServ = new PaisServicioHashSet();

        int opcion;
        do {
            mostrarMenu();

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cargarPelicula(paisServ, leer);
                    break;
                case 2:
                    mostrarTodosLosPaises(paisServ);
                    break;
                case 3:
                    break;
                case 4:
                    buscarYEliminarPais(paisServ, leer);
                    break;
                case 0:
                    System.out.println("Muchas gracias");
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {

        System.out.println("1-Cargar País en un conjunto");
        System.out.println("2-Mostrar todos los países guardados en el conjunto");
        System.out.println("3-Ordenar el conjunto de países alfabeticamente y mostrar");
        System.out.println("4-Buscar un país y si lo encuentra eliminarlo y sino informar que no se encuentra");
        System.out.println("0-Salir del menú");

    }

    /* private static void cargarPelicula(ArrayList<Pelicula> listaDePeliculas, Scanner leer) {
        System.out.println("Cargar País");
        System.out.println("Ingrese el nombre del país");
        String nombreDelPais = leer.next();
        Pelicula nuevaPelicula = new Pelicula(titulo, director, duracionDeLaPelicula);
        listaDePeliculas.add(nuevaPelicula);

    }
    }
     */
    private static void cargarPelicula(PaisServicioHashSet paisServ, Scanner leer) {
        char opcion = 'y';
        System.out.println("Cargar País");
        while (opcion != 'n') {
            paisServ.cargarPais();
            System.out.println("Desea cargar otro pais. y/n");
            opcion = leer.next().toLowerCase().charAt(0);
        }
    }

    private static void mostrarTodosLosPaises(PaisServicioHashSet paisServ) {
        paisServ.mostrarPaisesAlmacenadosEnElConjunto();
    }

    private static void buscarYEliminarPais(PaisServicioHashSet paisServ, Scanner leer) {
        System.out.println("Ingrese el país que dese eliminar");
        String paisIngresado = leer.next();
        if (paisServ.buscarYEliminar(paisIngresado)) {
            System.out.println("Se ha eliminado correctamente " + paisIngresado);
        } else {
            System.out.println("El pais buscado no se encontró");
        };

    }
}
