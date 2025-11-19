/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_03_09;

/**
 *
 * @author Sergio
 */
public class FiguraGeometrica {
    /* cuadrado */
    public double perimetro(int x, String figura) {
        if (figura.equals("cuadrado"))
            return 4 * x;
        else if (figura.equals("circunferencia"))
            return 2 * Math.PI * x * x;
        return -1;
    }
    /*public double perimetro(int x, String figura) {
        if (figura.equals("triangulo"))
            return x + x + x;
    }*/
}
