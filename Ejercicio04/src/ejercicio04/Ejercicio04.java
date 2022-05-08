/*

 */
package ejercicio04;

import ejercicio04.pelicula.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;
import ejercicio04.pelicula.Servicio.utilidades.Comparadores;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author ASUS
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Pelicula> listaDePeliculas = new ArrayList<Pelicula>();
        
        int opcion;
        do {
            mostrarMenu();

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cargarPelicula(listaDePeliculas, leer);
                    break;
                case 2:
                    mostrarTodasLasPeliculas(listaDePeliculas);
                    break;
                case 3:
                    ordenarLasPeliculasMayorAUnaHora(listaDePeliculas);
                    break;
                case 4:
                    ordenarLasPeliculasDuracionMayorAMenor(listaDePeliculas);
                    break;
                case 5:
                    ordenarLasPeliculasDuracionMenorAMayor(listaDePeliculas);
                    break;
                case 6:
                    ordenarLasPeliculasPorTituloAlfabeticamente(listaDePeliculas);
                    break;
                case 7:
                    ordenarLasPeliculasPorDirectorAlfabeticamente(listaDePeliculas);
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

        System.out.println("1-Cargar Pelicula");
        System.out.println("2-Mostrar todas las peliculas");
        System.out.println("3-Ordenar las peliculas de acuerdo a su duración mayor a una hora");
        System.out.println("4-Ordenar las peliculas de acuerdo a su duración(de mayor a menor)");
        System.out.println("5-Ordenar las peliculas de acuerco a su duración (de menor a mayor");
        System.out.println("6-Ordenar las peliculas por título, alfabeticamente y mostrarlo en pantalla");
        System.out.println("7-Ordenar las peliculas por director, alfabeticamente y mostrarlo en pantalla");
        System.out.println("0-Salir del menú");

    }

    private static void cargarPelicula(ArrayList<Pelicula> listaDePeliculas, Scanner leer) {
        System.out.println("Cargar Pelicula-Ingrese los datos requeridos");
        System.out.println("Ingrese el título de la Pelicula");
        String titulo = leer.next();
        System.out.println("Ingrese el nombre del director de la Pelicula");
        String director = leer.next();
        System.out.println("Ingrese la duracion de la pelicula [00,00]");
        Double duracionDeLaPelicula = leer.nextDouble();
        Pelicula nuevaPelicula = new Pelicula(titulo, director, duracionDeLaPelicula);
        listaDePeliculas.add(nuevaPelicula);

    }

    private static void mostrarTodasLasPeliculas(ArrayList<Pelicula> listaDePeliculas) {
        for (Pelicula peliculaActual : listaDePeliculas) {
            System.out.println(peliculaActual);
        }
    }

    private static void ordenarLasPeliculasMayorAUnaHora(ArrayList<Pelicula> listaDePeliculas) {
       
        for (Pelicula peliculaActual : listaDePeliculas) {
              if(peliculaActual.getDuracionDeLaPelicula()>=1.0)
            System.out.println(peliculaActual);
        }
    }

    private static void ordenarLasPeliculasDuracionMayorAMenor(ArrayList<Pelicula> listaDePeliculas) {
        Collections.sort(listaDePeliculas, Comparadores.ordenarPorDuracionDesc);
        mostrarTodasLasPeliculas(listaDePeliculas);

    }

    private static void ordenarLasPeliculasDuracionMenorAMayor(ArrayList<Pelicula> listaDePeliculas) {
        Collections.sort(listaDePeliculas, Comparadores.ordenarPorDuracionAsc);
        mostrarTodasLasPeliculas(listaDePeliculas);
    }

    private static void ordenarLasPeliculasPorTituloAlfabeticamente(ArrayList<Pelicula> listaDePeliculas) {
        Collections.sort(listaDePeliculas, Comparadores.ordenarPorTitulo);

        mostrarTodasLasPeliculas(listaDePeliculas);

    }

    private static void ordenarLasPeliculasPorDirectorAlfabeticamente(ArrayList<Pelicula> listaDePeliculas) {

        Collections.sort(listaDePeliculas, Comparadores.ordenarPorDirector);

        mostrarTodasLasPeliculas(listaDePeliculas);
    }

}
