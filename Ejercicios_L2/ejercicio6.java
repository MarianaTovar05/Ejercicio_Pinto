package Ejercicios_L2;

public class ejercicio6 {
    public static void main(String[] args) {
        long n = 1_000_000; 
        double tiempoOriginal = 1.0;
        double tiempoNuevo = 3.0;
        double factorTiempo = tiempoNuevo / tiempoOriginal;

        long n_lineal = (long)(n * factorTiempo);
        long n_cuadratica = (long)(n * Math.sqrt(factorTiempo));
        double n_exponencial = n + Math.log10(factorTiempo);

        System.out.println("NUEVO TAMAÑO DE ENTRADA PERMITIDO");
        System.out.printf("Complejidad lineal     (k·n):     %,d\n", n_lineal);
        System.out.printf("Complejidad cuadrática (k·n^2):   %,d\n", n_cuadratica);
        System.out.printf("Complejidad exponencial (k·10^n):  %.0f\n", n_exponencial);
    }

}
