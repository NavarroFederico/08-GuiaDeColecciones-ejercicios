/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03.alumno.entidades;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Alumno {

    private String nombre;
    private ArrayList<Integer> notasDeAlumno;

    public Alumno() {
        notasDeAlumno = new ArrayList<>();
    }

    public Alumno(String nombre, ArrayList<Integer> notasDeAlumno) {
        this.nombre = nombre;
        this.notasDeAlumno = notasDeAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotasDeAlumno(ArrayList<Integer> notasDeAlumno) {
        this.notasDeAlumno = notasDeAlumno;
    }

    public void calculaNotaFinal() {
        Double promedio;
        Double sumatoria = 0.0;
        for (Integer nota : notasDeAlumno) {
            sumatoria += nota;
        }
        promedio = sumatoria / notasDeAlumno.size();
        System.out.println("La nota final del Alumno "+ nombre +" es : "+ promedio);
    }
    
}
