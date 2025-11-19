/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_01_10;

/**
 *
 * @author sergi
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProfesorAutor obj = new ProfesorAutor("Juan", "Memorias");
        obj.metodo();
        obj.metodoA();
        obj.profesor.metodoA();
    }
    
}
