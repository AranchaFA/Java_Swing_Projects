/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModels;

import DTOs.Contacto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aranx
 */
public class TablaContactos extends AbstractTableModel {

    // Nuestra propia clase de tabla modelo, tendrá como atributos los elementos con los que trabajará del controlador (lógica de negocio)
    // y los necesarios para inicializarse
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

    
}
