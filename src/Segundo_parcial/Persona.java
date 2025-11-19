/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Segundo_parcial;

/**
 *
 * @author sergi
 */
class Persona {
    private String nombre;
    private int edad;
    private float pesoPersona;

    public Persona(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.pesoPersona = peso;
    }
    public int getEdad(){
        return edad;
    }
    public float getPeso(){
        return pesoPersona;
    }
    public String getNombre(){
        return nombre;
    }
}
