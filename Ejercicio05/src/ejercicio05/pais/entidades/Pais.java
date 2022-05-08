/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05.pais.entidades;

import java.util.Objects;

/**
 *
 * @author ASUS
 */
public class Pais {
    String nombreDelPais ;

    public Pais(String nombreDelPais) {
        this.nombreDelPais = nombreDelPais;
    }

    public Pais() {
    }

    public String getNombreDelPais() {
        return nombreDelPais;
    }

    public void setNombreDelPais(String nombreDelPais) {
        this.nombreDelPais = nombreDelPais;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombreDelPais=" + nombreDelPais + '}';
    }
     //AMBOS METODOS TRABAJAN JUNTOS PARA HACER VALIDACIONES CORRECTAS Y EVITAR DUPLICACIONES.
    //DEBO DECIDIR BAJO QUE CRITERIO HAGO LA COMPARACION. 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nombreDelPais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nombreDelPais, other.nombreDelPais)) {
            return false;
        }
        return true;
    }

   
    
}
