package GUI;

import DTOs.Contacto;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class TableModleContactos extends DefaultTableModel {

    private List<Contacto> listaContactos;
    private String[] nombreColumnas = {"Nombre", "Apellidos", "DNI"};

    public TableModleContactos(List<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public TableModleContactos() {
    }
    
    public List<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(List<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public String[] getNombreColumnas() {
        return nombreColumnas;
    }

    public void setNombreColumnas(String[] nombreColumnas) {
        this.nombreColumnas = nombreColumnas;
    }

    
    
    @Override
    public int getRowCount() {
        return listaContactos.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int colIndex) {
        switch (colIndex) {
            case 1:
                return listaContactos.get(rowIndex).getNombre();
            case 2:
                return listaContactos.get(rowIndex).getApellidos();
            case 3:
                return listaContactos.get(rowIndex).getDni();
            default:
                System.out.println("No existe ese índice de columna");
                return null;
        }
    }

}
