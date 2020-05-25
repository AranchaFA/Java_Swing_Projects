/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import dtos.Expresion;
import java.util.ArrayList;

/**
 *
 * @author aranx
 */
public class Logica {
    
    // ATRIBUTOS
    private static ArrayList<Expresion> listaExpresiones=new ArrayList<>(); // Lista STATIC con los datos
    
    // MÉTODOS
    public static ArrayList<Expresion> getListaExpresiones() {
        return listaExpresiones;
    }
    
    
    public static boolean addExpresion(Expresion expresion){ // Static
        return listaExpresiones.add(expresion);
    }
    
    public static boolean removeExpresion(Expresion expresion){ // Static
        return listaExpresiones.remove(expresion);
    }  
}
