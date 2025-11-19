/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_2;

/**
 *
 * @author Sergio
 */
public class AlgebraVectorial {
    private double x;
    private double y;
    private double z;

    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double multPunto(AlgebraVectorial v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }
    public AlgebraVectorial prodCruz(AlgebraVectorial v) {
        double cx = this.y * v.z - this.z * v.y;
        double cy = this.z * v.x - this.x * v.z;
        double cz = this.x * v.y - this.y * v.x;
        return new AlgebraVectorial(cx, cy, cz);
    }
    public double magn() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public boolean esPerpendicular(AlgebraVectorial v) {
        return this.multPunto(v) == 0;
    }
    public boolean esParalelo(AlgebraVectorial v) {
        AlgebraVectorial cruz = this.prodCruz(v);
        return cruz.magn() == 0;
    }
    public AlgebraVectorial proyeccionSobre(AlgebraVectorial v) {
        double escalar = this.multPunto(v) / (v.magn() * v.magn());
        return new AlgebraVectorial(v.x * escalar, v.y * escalar, v.z * escalar);
    }
    public double componenteEn(AlgebraVectorial v) {
        return this.multPunto(v) / v.magn();
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
