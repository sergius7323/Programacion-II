/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Participacion_7;

/**
 *
 * @author sergi
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el lado 1 del triangulo: ");
        double lado1 = entrada.nextDouble();

        System.out.print("Introduce el lado 2 del triangulo: ");
        double lado2 = entrada.nextDouble();

        System.out.print("Introduce el lado 3 del triangulo: ");
        double lado3 = entrada.nextDouble();

        entrada.nextLine();
        System.out.print("Introduce el color del triangulo: ");
        String color = entrada.nextLine();

        System.out.print("¿El triangulo esta rellenado? (true/false): ");
        boolean rellenado = entrada.nextBoolean();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        triangulo.setColor(color);
        triangulo.setRellenado(rellenado);

        System.out.println("\n------------------------------------");
        System.out.println("Datos del Triangulo:");
        System.out.println("Area: " + triangulo.getArea());
        System.out.println("Perimetro: " + triangulo.getPerimetro());
        System.out.println("Color: " + triangulo.getColor());
        System.out.println("Rellenado: " + triangulo.isRellenado());
        System.out.println(triangulo.toString());
        System.out.println("------------------------------------");

        entrada.close();
    }
}
