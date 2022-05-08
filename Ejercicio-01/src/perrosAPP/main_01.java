/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perrosAPP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class main_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razasDePerros = new ArrayList();
        String ingreso;
        boolean seEncontro= false;
        char opcion = 'y';

        do {
            System.out.println("Ingrese una raza de perro");
            ingreso = leer.next();
            razasDePerros.add(ingreso);

            System.out.println("¿Desea ingresar otra raza?Y/N");

        } while (leer.next().toLowerCase().charAt(0) != 'n');
        mostrarListasDePerros(razasDePerros);

        Iterator<String> it = razasDePerros.iterator();
        //eliminar un perro
        System.out.println("Ingrese un elemento a eliminar");
        String elementoAEliminar = leer.next();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(elementoAEliminar)) {
                it.remove();
                System.out.println("Se ha eliminido correctamente");
                mostrarListasDePerros(razasDePerros);
                seEncontro=true;
            }
        }
        if(!seEncontro){
            System.out.println("No se encontro ");
            mostrarListasDePerros(razasDePerros);
        }
    }

    private static void mostrarListasDePerros(ArrayList<String> razasDePerros) {
         System.out.println("Lista de perros");
              for(String aux1: razasDePerros){
                System.out.println(aux1);
            }
    }
}
