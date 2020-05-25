/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DTOs.Contacto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aranx
 */
public class LogicaNegocio {
    // Tengo que inicializarlo aquí, en la declaración de atributos, si lo inicializo en un constructor
    // como los métodos son estáticos y no voy a crear una instancia del objeto para utilizarlos (no voy
    // a ejecutar el método constructor para usar los métodos), no se inicializaría y daría NullPointerException
    private static List<Contacto> listaContactos=new ArrayList<>();

    public static List<Contacto> getListaContactos() {
        return listaContactos;
    }
    
    public static boolean addContacto(Contacto contacto){
        return listaContactos.add(contacto);
    }
    
    public static boolean removeContacto(Contacto contacto){
        return listaContactos.remove(contacto);
    }
    
    
}
