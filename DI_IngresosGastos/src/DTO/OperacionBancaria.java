/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.GregorianCalendar;

/**
 *
 * @author aranx
 */
public class OperacionBancaria {

    // ATRIBUTOS
    private float importe;
    private String concepto;
    private GregorianCalendar fecha;

    // MÉTODOS
    public OperacionBancaria(float importe, String concepto, GregorianCalendar fecha) {
        this.importe = importe;
        this.concepto = concepto;
        this.fecha = fecha;
    }

    public String arrayDeDatos() {
        String[] arrayDatos = {String.valueOf(importe), concepto, this.fechaString()};
        return arrayDeDatos();
    }

    public String fechaString() {
        return fecha.DATE + "/" + fecha.MONTH + "/" + fecha.YEAR;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }
    
    public boolean esIngreso(){
        if (importe>0) {
            return true;
        }
        return false;
    }
    
    
}
