/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_2;

/**
 *
 * @author Sergio
 */
public class Vector3D {
    private double x;
    private double y;
    private double z;
    
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector3D sumar(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }
    public Vector3D escalar(double r) {
        return new Vector3D(this.x * r, this.y * r, this.z * r);
    }
    public double magn() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public Vector3D normal() {
        double mag = this.magn();
        if (mag == 0) return new Vector3D(0, 0, 0);
        return new Vector3D(this.x / mag, this.y / mag, this.z / mag);
    }
    public double multPunto(Vector3D v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }
    public Vector3D prodCruz(Vector3D v) {
        double cx = this.y * v.z - this.z * v.y;
        double cy = this.z * v.x - this.x * v.z;
        double cz = this.x * v.y - this.y * v.x;
        return new Vector3D(cx, cy, cz);
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
