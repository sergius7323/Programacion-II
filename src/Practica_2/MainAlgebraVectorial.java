/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica_2;

/**
 *
 * @author Sergio
 */
public class MainAlgebraVectorial {
    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(3, 4, 0);
        AlgebraVectorial b = new AlgebraVectorial(4, -3, 0);
        System.out.println("Vector a = " + a);
        System.out.println("Vector b = " + b);
        System.out.println("Son perpendiculares? " + a.esPerpendicular(b));
        System.out.println("Son paralelos? " + a.esParalelo(b));
        System.out.println("Proyeccion de a sobre b =" + a.proyeccionSobre(b));
        System.out.println("Componente de a en b = " + a.componenteEn(b));
    } 
}
