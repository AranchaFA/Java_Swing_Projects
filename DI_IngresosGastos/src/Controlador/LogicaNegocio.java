/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DTO.OperacionBancaria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aranx
 */
public class LogicaNegocio {

    // ATRIBUTOS
    private static List<OperacionBancaria> listaOperaciones=new ArrayList<>();

    // MÉTODOS
    public static List<OperacionBancaria> getListaOperaciones() {
        return listaOperaciones;
    }

    public static void setListaOperaciones(List<OperacionBancaria> listaOperaciones) {
        LogicaNegocio.listaOperaciones = listaOperaciones;
    }

    public static boolean removeOperacion(OperacionBancaria operacion) {
        return listaOperaciones.remove(operacion);
    }

    public static boolean addOperacion(OperacionBancaria operacion) {
        return listaOperaciones.add(operacion);
    }
}
