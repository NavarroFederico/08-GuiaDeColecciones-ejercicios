/*
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main
 */
package ejercicio03.alumno.main;

import java.util.ArrayList;
import java.util.Scanner;
import ejercicio03.alumno.entidades.*;

/**
 *
 * @author ASUS
 */
public class AlumnoMain03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> listaDeAlumnos = new ArrayList();
        Alumno actual = null;
        char opcion = 'y';

        System.out.println("Bienvenidos al sistema notas de alumnos");
        while (opcion != 'n') {
            actual = crearAlumno(leer);
            ingresarNotasDeAlumno(leer, actual);
            guardarAlumnoAListaAlumno(listaDeAlumnos, actual);
            System.out.println("Desea ingresar otro Alumnos y sus notas. y/n");
            opcion = leer.next().charAt(0);

        }
        System.out.println(listaDeAlumnos);
        notaFinal(listaDeAlumnos, leer);

    }

    private static Alumno crearAlumno(Scanner leer) {
        Alumno nuevoAlumno = new Alumno();
        System.out.println("Ingrese Nombre del Alumno ");
        nuevoAlumno.setNombre(leer.next());
        return nuevoAlumno;
    }

    private static void ingresarNotasDeAlumno(Scanner leer, Alumno actual) {
        ArrayList<Integer> notasDeAlumnos = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese nota " + i);
            notasDeAlumnos.add(leer.nextInt());
        }

        actual.setNotasDeAlumno(notasDeAlumnos);
    }

    private static void guardarAlumnoAListaAlumno(ArrayList<Alumno> listaDeAlumnos, Alumno actual) {
        listaDeAlumnos.add(actual);
        System.out.println("Se ha guardado exitosamente.");
    }

    private static void notaFinal(ArrayList<Alumno> listaDeAlumnos, Scanner leer) {

        System.out.println("Ingrese el nombre del alumno que desee calcular la nota final");
        String nombre = leer.next();
        boolean seEncontro = false;
        for (int i = 0; i < listaDeAlumnos.size(); i++) {
            if (listaDeAlumnos.get(i).getNombre().equals(nombre)) {
                listaDeAlumnos.get(i).calculaNotaFinal();

                seEncontro = true;
            }
        }
        if (!seEncontro) {
            System.out.println("El nombre buscado no se encuentra en la lista");
        }
    }

}
