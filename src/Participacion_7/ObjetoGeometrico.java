/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participacion_7;

/**
 *
 * @author sergi
 */
import java.util.Date;

public class ObjetoGeometrico {
    private String color = "blanco";
    private boolean rellenado = false;
    private Date fechaDeCreacion;

    public ObjetoGeometrico() {
        fechaDeCreacion = new Date();
    }

    public ObjetoGeometrico(String color, boolean rellenado) {
        this.color = color;
        this.rellenado = rellenado;
        fechaDeCreacion = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRellenado() {
        return rellenado;
    }

    public void setRellenado(boolean rellenado) {
        this.rellenado = rellenado;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    @Override
    public String toString() {
        return "color: " + color + " y rellenado: " + rellenado +
               "\nfecha de creacion: " + fechaDeCreacion;
    }
}