/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_03_09;

/**
 *
 * @author Sergio
 */
public class MiEntero {
    private 
            int valor;
    public MiEntero (int valor){
        this.valor = valor;
    }
    public int getValor(){
        return valor;
    }
    public boolean esPar(){
        return valor % 2 == 0;
    }
    public boolean esImpar(){
        return valor % 2 != 0;
    }
    public boolean esPrimo(){
        if (valor <= 1) return false;
        for (int i = 2; i <= Math.sqrt(valor); i++) {
            if (valor % i == 0) return false;
        }
        return true;
    }
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    public static boolean esImpar(int n) {
        return n % 2 != 0;
    }
    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static boolean esPar(MiEntero x) {
        return x.valor % 2 == 0;
    }

    public static boolean esImpar(MiEntero x) {
        return x.valor % 2 != 0;
    }

    public static boolean esPrimo(MiEntero x) {
        return esPrimo(x.valor);
    }
        public boolean equals(int n) {
        return this.valor == n;
    }
    public boolean equals (MiEntero oher){
        return this.valor == valor;
    }
    public static int parseInt(char[] arr) {
        return Integer.parseInt(new String(arr));
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }
}
