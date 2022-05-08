/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio06HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //HashMapsTiene de llave el nombre del Producto y el valor el precio
        HashMap<String, Double> productosHashMaps = new HashMap();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int opcion;
        do {
            mostrarMenu();

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    introducirUnNuevoProducto(productosHashMaps, leer);
                    break;
                case 2:
                    modificarSuPrecioValue(productosHashMaps, leer);
                    break;
                case 3:
                    eliminarUnProducto(productosHashMaps, leer);
                    break;
                case 4:
                    mostrarLosProcuctosQueTenemoosConSuPrecio(productosHashMaps);
                    break;
                case 0:
                    System.out.println("Muchas gracias");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("Sistema para tienda");
        System.out.println("Ingrese una opcion");
        System.out.println("1-Introducir un nuevo producto.");
        System.out.println("2-Modificar su precio.");
        System.out.println("3-Eliminar un producto.");
        System.out.println("4-Mostrar los productos que tenemos con su precio");
        System.out.println("0-Salir del menú");
    }

    private static void introducirUnNuevoProducto(HashMap<String, Double> productosHashMaps, Scanner leer) {

        char opcion = 'y';
        System.out.println("Cargar Producto");

        while (opcion != 'n') {
            System.out.println("Ingrese el nombre del producto");
            String nombreKey = leer.next();
            System.out.println("Ingrese el precio del producto");
            Double precioValue = leer.nextDouble();
            productosHashMaps.put(nombreKey, precioValue);
            System.out.println("\nDesea cargar otro pais. y/n");
            opcion = leer.next().toLowerCase().charAt(0);
        }
    }

    private static void modificarSuPrecioValue(HashMap<String, Double> productosHashMaps, Scanner leer) {
        System.out.println("Ingrese el nombre del producto a modificar el precio");
        String nombreKey = leer.next();

        if (productosHashMaps.containsKey(nombreKey)) {

            System.out.println("Ingrese el precio nuevo del producto ");
            Double precioValue = leer.nextDouble();
            productosHashMaps.put(nombreKey, precioValue);
        } else {
            System.out.println("El producto buscado no se encuentra en la lista . Revise cómo está escrito.");
        }
    }

    private static void mostrarLosProcuctosQueTenemoosConSuPrecio(HashMap<String, Double> productosHashMaps) {
        System.out.println("Lista de Productos");
        for (Map.Entry<String, Double> auxProducto : productosHashMaps.entrySet()) {
            String keyProducto = auxProducto.getKey();
            Double valuePrecio = auxProducto.getValue();

            System.out.println("Producto: " + keyProducto + "|" + " Precio: $" + valuePrecio);
        }
    }

    private static void eliminarUnProducto(HashMap<String, Double> productosHashMaps, Scanner leer) {
        System.out.println("Ingrese el Producto que desea eliminar");
        String nombreKey = leer.next();

        if (productosHashMaps.containsKey(nombreKey)) {
            productosHashMaps.remove(nombreKey);
            System.out.println("El producto " + nombreKey + " se eliminó correctamente.");
        } else {
            System.out.println("El producto buscado no se encuentra en la lista . Revise cómo está escrito.");
        }

    }

}
