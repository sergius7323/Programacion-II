/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_01_10;

/**
 *
 * @author sergi
 */
public class ProfesorAutor extends Autor implements IProfesor {
    public Profesor profesor;
    
    public ProfesorAutor(String nombre, String titulo) {
        super(titulo);
        profesor = new Profesor(nombre);
    }
    public void metodo() {
        System.out.println("Metodo clase de ProfesorAutor");
    }

    @Override
    public void metodoA() {
        System.out.println("Metodo clase de ProfesorAutor");
    }
    
}
