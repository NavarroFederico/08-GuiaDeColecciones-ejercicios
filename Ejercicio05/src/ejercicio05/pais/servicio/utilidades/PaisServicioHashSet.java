/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05.pais.servicio.utilidades;

import ejercicio05.pais.entidades.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PaisServicioHashSet {
    private HashSet<Pais> nuevoConjunto;
    private Scanner leer; //Creo la variable 
//es buena practica
    public PaisServicioHashSet() {
        this.nuevoConjunto =new HashSet<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    //Cargar pais
    public void cargarPais(){
        System.out.println("Ingrese el nombre del país");
        String nombreDelPais= leer.next();
        
        //Cargo el nuevoObjetoPais en un conjunto todo en una sola linea
        nuevoConjunto.add(new Pais(nombreDelPais));
        
    }
    public void mostrarPaisesAlmacenadosEnElConjunto(){
        //utilizo el foreach
        for (Pais pais : nuevoConjunto) {
            System.out.println(pais.toString());
        }
    }
    
    public void ordenarLosPaisesAlfabeticamenteYMostrar(){
        
    }
    public boolean buscarYEliminar(String paisIngresado){
        boolean sePudoEliminar= false;
        Iterator <Pais>it= nuevoConjunto.iterator();
        while(it.hasNext()){
            if(it.next().getNombreDelPais().equals(paisIngresado)){
                it.remove();
                sePudoEliminar=true;
            }
        }
        return sePudoEliminar;
    }
}
