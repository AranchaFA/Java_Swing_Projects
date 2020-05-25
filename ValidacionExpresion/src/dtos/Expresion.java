/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author aranx
 */
public class Expresion {
    
    // ATRIBUTOS
    private Date fecha;
    private String fechaString;
    private String horaString;
    private String expresion;
    
    // MÉTODOS
    // Getters + Setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFechaString() {
        return fechaString;
    }

    public void setFechaString(String fechaString) {
        this.fechaString = fechaString;
    }

    public String getHoraString() {
        return horaString;
    }

    public void setHoraString(String horaString) {
        this.horaString = horaString;
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }
    
    // Constructor

    public Expresion(Date fecha, String expresion) {
        this.fecha = fecha;
        this.expresion = expresion;
        // Formateamos la fecha y la hora que se mostrarán
        SimpleDateFormat formateadorFecha=new SimpleDateFormat("dd/MM/YYYY");
        SimpleDateFormat formateadorHora=new SimpleDateFormat("HH:mm:ss");
        fechaString=formateadorFecha.format(fecha);
        horaString=formateadorHora.format(fecha);
    }
    
}
