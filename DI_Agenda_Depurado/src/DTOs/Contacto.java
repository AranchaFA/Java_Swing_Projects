/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import java.util.Objects;

/**
 *
 * @author aranx
 */
public class Contacto implements Comparable<Contacto>{

    private String nombre;
    private String apellidos;
    private String dni;

    public Contacto(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "DTO_Contacto{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + '}';
    }

    // Hay que comparar el equals y el hashCode para que pueda borrarlos de la lista del controlador
    // si no, no podrá identificar el objeto que le estamos pidiendo que borre
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.dni);
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
        final Contacto other = (Contacto) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    // compareTo no haría falta en este caso, porque no estamos ordenando los elementos de la lista
    // pero lo meto por si acaso y ya está :)
    @Override
    public int compareTo(Contacto contacto) {
        return this.dni.compareToIgnoreCase(contacto.getDni());
    }
}
