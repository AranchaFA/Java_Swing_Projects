
package Modelo;

import DTO.OperacionBancaria;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class TableOperacionBancaria extends AbstractTableModel {

    private String[] cabecerasDeColumna = {"Fecha", "Concepto", "Importe"};
    private List<OperacionBancaria> listaOperaciones;

    public TableOperacionBancaria(List<OperacionBancaria> listaOperaciones) {
        this.listaOperaciones = listaOperaciones;
    }

    public List<OperacionBancaria> getListaOperaciones() {
        return listaOperaciones;
    }

    public void setListaOperaciones(List<OperacionBancaria> listaOperaciones) {
        this.listaOperaciones = listaOperaciones;
    }

    @Override
    public int getRowCount() {
        return listaOperaciones.size();
    }

    @Override
    public int getColumnCount() {
        return cabecerasDeColumna.length;
    }

    @Override
    public String getColumnName(int i) {
        return cabecerasDeColumna[i];
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
            case 0:
                return fechaString(listaOperaciones.get(row).getFecha());
            case 1:
                return listaOperaciones.get(row).getConcepto();
            case 2:
                // SEGÚN SI RETORNO COMO VALOR NUMÉRICO O COMO DECIMAL FORMAT EL IMPORTE, LUEGO TENGO QUE FILTRARLO
                // COMO TAL EN EL MÉTODO MOSTRAR SELECTIVO (con filtro numérico o de expresiones regulares)
                //return listaOperaciones.get(row).getImporte();
                return new DecimalFormat("#,##0.00€").format(listaOperaciones.get(row).getImporte());
            default:
                System.out.println("Columna fuera de rango.");
                return null;
        }
    }

    public String fechaString(GregorianCalendar fecha) {
        return fecha.DATE + "/" + fecha.MONTH + "/" + fecha.YEAR;
    }

    public OperacionBancaria removeRow(int row) {
        return listaOperaciones.remove(row);
    }

    public int removeRows(int[] rows) {
        Arrays.sort(rows);
        int contador = 0;
        for (int row : rows) {
            removeRow(row - contador);
        }
        return contador;
    }

    public boolean addOperacion(OperacionBancaria operacion) {
        return listaOperaciones.add(operacion);
    }

    public void refrescar() {
        fireTableDataChanged();
    }

    public float balance() {
        float balance = 0;
        for (OperacionBancaria operacion : listaOperaciones) {
            balance += operacion.getImporte();
        }
        return balance;
    }

    public String balanceFormateado() {
        float balance = 0;
        for (OperacionBancaria operacion : listaOperaciones) {
            balance += operacion.getImporte();
        }
        return new DecimalFormat("#,##0.00€").format(balance);
    }
}
