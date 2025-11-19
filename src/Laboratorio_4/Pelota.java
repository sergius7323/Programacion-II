/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio_4;

/**
 *
 * @author sergi
 */
public class Pelota implements Coloreado{
    public String color;
        public Pelota(String color) {
            this.color = color;
        }
        @Override
        public String getColor() {
            return color;
        }
}
