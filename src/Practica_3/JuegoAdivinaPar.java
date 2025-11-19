/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_3;

/**
 *
 * @author sergi
 */
public class JuegoAdivinaPar extends JuegoAdivinaNumero{
    public JuegoAdivinaPar(int vidas) {
        super(vidas);
    }
    @Override
    public boolean validaNumero(int n) {
        if (n >= 0 && n <= 10) {
            if (n % 2 == 0) {
                return true;
            } else {
                System.out.println("Error. El numero tiene que ser par entre 0 y 10");
                return false;
            }
        }
        return false;
    }
}
