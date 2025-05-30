package Ejercicios_L2;

public class ejercicio7 {
    public static void main(String[] args) {
        long n = 1_000_000;
        double factorVelocidad = 100.0; 
        long n_lineal = (long)(n * factorVelocidad);
        long n_cuadratica = (long)(n * Math.sqrt(factorVelocidad));
        double n_exponencial = n + Math.log10(factorVelocidad);

        System.out.println("Mayor tamaño de entrada con máquina 100x más rápida");
        System.out.printf("Complejidad lineal     (k1 * n):      %,d\n", n_lineal);
        System.out.printf("Complejidad cuadrática (k2 * n^2):    %,d\n", n_cuadratica);
        System.out.printf("Complejidad exponencial (k3 * 10^n):  %.0f\n", n_exponencial);
    }
}
