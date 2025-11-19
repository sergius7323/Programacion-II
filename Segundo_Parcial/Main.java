/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Segundo_parcial;

/**
 *
 * @author sergi
 */
public class Main {
    public static void main(String[] args) {
        MiTeleferico mt = new MiTeleferico();

        Linea amarilla = new Linea("Amarilla");
        Linea rojo = new Linea("Rojo");
        Linea verde = new Linea("Verde");
        mt.agregarLinea(amarilla);
        mt.agregarLinea(rojo);
        mt.agregarLinea(verde);

        mt.agregarCabina("Roja", 1);
        mt.agregarCabina("Roja", 2);

        mt.agregarPersonaFila(new Persona("Mica", 20, 55), "Roja");
        mt.agregarPersonaFila(new Persona("Pacho", 30, 80), "Roja");

        mt.agregarPrimeraPersonaCabina("Roja", 1);
        mt.agregarPrimeraPersonaCabina("Roja", 2);

        System.out.println("Verificar cabina: " + mt.verificarCabinas());
        System.out.println("Ingreso total: " + mt.calcularIngresos());
        System.out.println("La linea " + mt.lineaConMasRegular() + "tiene mas ingreso con tarifa regular");
    }
}

