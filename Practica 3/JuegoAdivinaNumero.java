/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_3;

/**
 *
 * @author sergi
 */
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    protected
            int numeroAAdivinar;
    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }
    public boolean validaNumero(int n) {
        return n >= 0 && n <= 10;
    }
    public void Juega() {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            reiniciaPartida(super.numeroDeVidas);
            this.numeroAAdivinar = (int) (Math.random() * 11);
            System.out.println("Adivina un numero entre 0 y 10");
            System.out.println("Vidas Restantes: " + numeroDeVidas);
            
            while(this.numeroDeVidas > 0) {
            int entrada = sc.nextInt();
            
            if (!validaNumero(entrada)) {
                System.out.println("Error. Debe estar entre 0 y 10.");
                continue;
            }
            
            if (entrada == numeroAAdivinar) {
                System.out.println("Acertaste!!");
                actualizaRecord();
                System.out.println("Record actualizado: " + record);
                break;
            } else {
                if (quitaVida()) {
                    if (entrada < numeroAAdivinar) {
                        System.out.println("El numero es mayor. Vidas restantes " + numeroDeVidas);
                    } else {
                        System.out.println("El numero es menor. Vidas restantes " + numeroDeVidas);
                    }
                } else {
                    System.out.println("Ya no tienes mas vidas. El numero era: " + numeroAAdivinar);
                    System.out.println("Record: " + record);
                    System.out.println("GAME OVER");
                    return;

                }
            }
            }
        }
    }
}