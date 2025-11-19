/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_03_09;

/**
 *
 * @author Sergio
 */
public class MainMiEntero {
    public static void main(String[] args) {
        MiEntero num1 = new MiEntero(7);
        MiEntero num2 = new MiEntero(10);
        System.out.println("num1 = " + num1.getValor());
        System.out.println("num1 es par? " + num1.esPar());
        System.out.println("num1 es primo? " + num1.esPrimo());
        System.out.println("num2 = " + num2.getValor());
        System.out.println("num2 es impar? " + num2.esImpar());
        System.out.println("num1 equals 7? " + num1.equals(7));
        System.out.println("num1 equals num2? " + num1.equals(num2));
        System.out.println("Es primo 17? " + MiEntero.esPrimo(17));
        System.out.println("Es par num2? " + MiEntero.esPar(num2));
        char[] arr = {'6', '4', '7'};
        System.out.println("parseInt {'6','4','7'} = " + MiEntero.parseInt(arr));
        System.out.println("parseInt \"7323\" = " + MiEntero.parseInt("7323"));
    }
}
