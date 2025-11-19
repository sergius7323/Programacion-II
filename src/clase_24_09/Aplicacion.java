/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_24_09;

/**
 *
 * @author sergi
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*//Circulo circulo = new Circulo(1);
        Figura circulo = new Circulo(1);
        //Rectangulo rectangulo = new Rectangulo(2,3);
        Figura rectangulo = new Rectangulo(2,3);
        //Cuadrado cuadrado = new Cuadrado(2,2);
        Figura cuadrado = new Cuadrado(2,2);
        System.out.println(circulo);
        System.out.println(circulo.area());
        System.out.println(rectangulo);
        System.out.println(rectangulo.area());
        System.out.println(cuadrado);
        System.out.println(cuadrado.area());*/
        
        Figura figuras[] = {new Circulo(1), new Rectangulo(2, 3), new Cuadrado(4, 5)};
        for (Figura f:figuras) {
            System.out.println(f + "Area = " + f.area());
            /*if (f instanceof Circulo)
                System.out.println(f + "Area = " + f.area());
            else if (f instanceof Rectangulo)
                System.out.println(f + "Area = " + f.area());
            else if (f instanceof Cuadrado)
                System.out.println(f + "Area = " + f.area());*/
        }
    }
    
}
