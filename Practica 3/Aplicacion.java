/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica_3;

/**
 *
 * @author sergi
 */
public class Aplicacion {
    public static void main(String[] args) {
        /*JuegoAdivinaNumero juego = new JuegoAdivinaNumero(5);
        juego.Juega();*/
        
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(5);
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(5);
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(5);

        juego1.Juega();
        juego2.Juega();
        juego3.Juega();
    }
}
