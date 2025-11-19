/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_24_09;

/**
 *
 * @author sergi
 */
public class Circulo extends Figura {
    // atributo
    public double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    // metodos
    public double area() {
        return Math.PI * this.radio + this.radio;
    }
    @Override
    public String toString() {
            return "Circulo [radio = " + radio + "]";
    }
}
