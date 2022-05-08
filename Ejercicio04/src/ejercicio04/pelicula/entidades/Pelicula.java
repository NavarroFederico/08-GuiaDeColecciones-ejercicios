/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04.pelicula.entidades;

/**
 *
 * @author ASUS
 */
public class Pelicula {

    String titulo;
    String director;
    Double duracionDeLaPelicula;

    public Pelicula(String titulo, String director, Double duracionDeLaPelicula) {
        this.titulo = titulo;
        this.director = director;
        this.duracionDeLaPelicula = duracionDeLaPelicula;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracionDeLaPelicula() {
        return duracionDeLaPelicula;
    }

    public void setDuracionDeLaPelicula(Double duracionDeLaPelicula) {
        this.duracionDeLaPelicula = duracionDeLaPelicula;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracionDeLaPelicula=" + duracionDeLaPelicula + '}';
    }

}
