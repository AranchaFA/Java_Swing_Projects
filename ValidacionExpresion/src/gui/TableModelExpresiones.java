/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dtos.Expresion;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.AbstractTableModel;
import logica.Logica;

/**
 *
 * @author aranx
 */
public class TableModelExpresiones extends AbstractTableModel {

    // ATRIBUTOS
    private ArrayList<Expresion> listaExpresiones;
    private String[] cabecerasColumnas = {"FECHA", "HORA", "OPERACIÓN"};

    // MÉTODOS
    public TableModelExpresiones(ArrayList<Expresion> listaExpresiones) {
        this.listaExpresiones = listaExpresiones;
    }

    public Expresion getRow(int row) {
        return listaExpresiones.get(row);
    }

    @Override
    public int getRowCount() {
        return listaExpresiones.size();
    }

    @Override
    public int getColumnCount() {
        return cabecerasColumnas.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
            case 0:
                return listaExpresiones.get(row).getFechaString();
            case 1: {
                return listaExpresiones.get(row).getHoraString();
            }
            case 2: {
                return listaExpresiones.get(row).getExpresion();
            }
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int col) {
        return cabecerasColumnas[col];
    }

    public void refrescar() {
        fireTableDataChanged();
    }

    // Añadir/Borrar filas (varias o una)
    public int removeRows(int[] rows) {
        Arrays.sort(rows); // Los ÍNDICES tienen que estar ORDENADOS para que no de error al borrar uno posterior y luego otro anterior
        int contador = 0;
        for (int row : rows) {
            boolean borrado = removeRow(row - contador);
            if (borrado) {
                contador++;
            }
        }
        return contador;
    }

    public boolean removeRow(int row) {
        if (!listaExpresiones.isEmpty() && row < listaExpresiones.size()) {
            // Borramos el objeto también de la lista de datos de la lógica del programa
            Logica.removeExpresion(getRow(row)); // Mejor pasar el objeto que el índice, aunque los índices deben coincidir
            listaExpresiones.remove(row);
            fireTableDataChanged(); // Refresco aquí, así no se nos olvida en el código de la GUI
            return true;
        }
        return false;
    }

    public boolean addRows(Expresion[] expresiones) {
        return listaExpresiones.addAll(Arrays.asList(expresiones));
    }

    public boolean addRow(Expresion expresion) {
        // Añadimos el objeto también a la lista de datos de la lógica del programa
        Logica.addExpresion(expresion);
        return listaExpresiones.add(expresion);
    }
}
