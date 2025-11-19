/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_24_09;

/**
 *
 * @author sergi
 */
public class Rectangulo extends Figura {
    // atributos
    public
            double base;
            double altura;
    
    // metodos
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double area() {
        return this.base * this.altura;
    }
    @Override
    public String toString() {
        return "Rectangulo [base = " + base + "altura = " + altura + "]";
    }
}
