/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_3;

/**
 *
 * @author sergi
 */
public class Juego {
    protected
            int numeroDeVidas;
            int record;
    
    public Juego(int vidas) {
        this.numeroDeVidas = vidas;
        this.record = 0;
    }
    public void reiniciaPartida(int vidas) {
        this.numeroDeVidas = vidas;
    }
    public void actualizaRecord() {
        this.record++;
    }
    public boolean quitaVida() {
        this.numeroDeVidas--;
        if (this.numeroDeVidas > 0) {
            return true;
        } else {
            return false;
        }
    }
}
