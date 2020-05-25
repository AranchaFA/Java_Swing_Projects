/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModels;

import Controlador.LogicaNegocio;
import DTOs.Contacto;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aranx
 */
public class TablaContactos extends AbstractTableModel {

    // Nuestra propia clase de tabla modelo, tendrá como atributos los elementos con los que trabajará del controlador (lógica de negocio)
    // y los necesarios para inicializarse (cabeceras de columna)
    // LISTA : Se la pasaremos del controlador, en donde está la lista con la que realmente trabajaremos, 
    // el TableModel es sólo un intermediario entre lógica-interfaz
    private List<Contacto> listaContactos;
    private String[] cabecerasDeColumna = {"Nombre", "Apellidos", "DNI"};

    public TablaContactos(List<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    @Override
    public int getRowCount() {
        return listaContactos.size();
    }

    @Override
    public int getColumnCount() {
        return cabecerasDeColumna.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
            case 0:
                return listaContactos.get(row).getNombre();
            case 1:
                return listaContactos.get(row).getApellidos();
            case 2:
                return listaContactos.get(row).getDni();
            default:
                return "Índice de columna no válido."; // Podría saltar una Exception propia
        }
    }

    // Este no obliga a sobreescribirlo, pero es necesario para que asigne el nombre a las columnas
    // Así ahorramos hacer un método para inicializar la tabla y asignarle los nombres, como pasa con DefaultTableModel.setColumnIdentifiers
    @Override
    public String getColumnName(int col) {
        return cabecerasDeColumna[col];
    }

    // ¡¡¡ Hay que ejecutar el MÉTODO REFRESCAR DE LA INTERFAZ porque si no no actualiza los datos mostrados !!!
    // El del TableModel refresca los datos del objeto que está 'detrás' de la interfaz y que contiene la información
    // El de la ventana que muestra la tabla 'sustituye' el TableModel que tenía 'cargado' la jTable (con la información antigua)
    // por un TableModel con los datos actualizados
    public void refrescarTabla() {
        fireTableDataChanged(); // Llama a todos los listener que hagan falta si detecta modificaciones en la tabla
    }

    public int removeRows(int[] rowsOrdenados) {
        // Los ÍNDICES tienen que estar ORDENADOS para que no de error al borrar uno posterior y luego otro anterior
        Arrays.sort(rowsOrdenados);
        int contador = 0;
        for (int row : rowsOrdenados) {
            boolean borrado = removeRow(row - contador);
            if (borrado) {
                contador++;
            }
        }
        return contador;
    }

    public boolean removeRow(int row) {
        Contacto contactoBorrado = listaContactos.remove(row);
        if (contactoBorrado != null) {
            return true;
        }
        return false;
    }

    public boolean addRow(Contacto contacto){
        return listaContactos.add(contacto);
    }
    public String[] generarArrayDatos(int row) {
        String[] arrayDeDatos = {(String) getValueAt(row, 0), (String) getValueAt(row, 1), (String) getValueAt(row, 2)};
        return arrayDeDatos;
    }

    public Contacto generarContacto(String[] arrayDeDatos) {
        return new Contacto(arrayDeDatos[0], arrayDeDatos[1], arrayDeDatos[2]);
    }

    public Contacto generarContacto(int row) {
        return generarContacto(generarArrayDatos(row));
    }
}
