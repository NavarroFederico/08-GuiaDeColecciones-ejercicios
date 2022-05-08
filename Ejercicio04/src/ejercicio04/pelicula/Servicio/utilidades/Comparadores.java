/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04.pelicula.Servicio.utilidades;

import ejercicio04.pelicula.entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author ASUS
 */
public class Comparadores {

    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1){
            return t.getDuracionDeLaPelicula().compareTo(t1.getDuracionDeLaPelicula());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1){
            return t1.getDuracionDeLaPelicula().compareTo(t.getDuracionDeLaPelicula());
        }
    };
    
}
