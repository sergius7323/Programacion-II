/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica_2;

/**
 *
 * @author Sergio
 */
public class MainVector3D {
    public static void main(String[] args) {
        Vector3D a = new Vector3D(2, 3, 4);
        Vector3D b = new Vector3D(1, -2, 0);
        System.out.println("Vector a = " + a);
        System.out.println("Vector b = " + b);
        System.out.println("Suma = " + a.sumar(b));
        System.out.println("Escalar (a*3) = " + a.escalar(3));
        System.out.println("Magnitud de a = " + a.magn());
        System.out.println("Normal de a = " + a.normal());
        System.out.println("Producto escalar = " + a.multPunto(b));
        System.out.println("Producto vectorial = " + a.prodCruz(b));
    }
    
}
