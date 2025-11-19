/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_24_09;

/**
 *
 * @author sergi
 */
public class Cuadrado extends Rectangulo{
    public Cuadrado(double base, double altura) {
        super(base, altura);
    }
    public double area() {
        return this.base * this.base;
    }
    @Override
    public String toString() {
        return "Cuadrado [base = " + this.base + "]";
    }
}
