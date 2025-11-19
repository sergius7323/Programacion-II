/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Segundo_parcial;

/**
 *
 * @author sergi
 */
class Linea {
    private String color;
    private Persona[] filaPersonas;
    private int cantFila;
    private Cabina[] cabinas;
    private int cantidadCabinas;

    public Linea(String color) {
        this.color = color;
        this.filaPersonas = new Persona[150];
        this.cantFila = 0;
        this.cabinas = new Cabina[100];
        this.cantidadCabinas = 0;
    }

    public String getColor() { return color; }
    public Cabina[] getCabinas() { return cabinas; }

    public void agregarPersona(Persona p) {
        filaPersonas[cantFila++] = p;
    }

    public void agregarCabina(int nroCab) {
        cabinas[cantidadCabinas++] = new Cabina(nroCab);
    }

    public Persona obtenerPrimeroFila() {
        if (cantFila == 0) return null;
        Persona p = filaPersonas[0];
        for (int i = 1; i < cantFila; i++) filaPersonas[i - 1] = filaPersonas[i];
        cantFila--;
        return p;
    }
}
