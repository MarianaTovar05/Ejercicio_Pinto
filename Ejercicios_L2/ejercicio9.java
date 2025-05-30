package Ejercicios_L2;

public class ejercicio9 {
    static int a = 1;
    static double log2(double n) {
        return Math.log(n) / Math.log(2);
    }
    public static double T(int n) {
        if (n == 1) {
            return a;
        } else {
            return 2 * T(n / 4) + log2(n);
        }
    }
    public static void main(String[] args) {
        int n = 1024;  // Ejemplo: potencia de 4 para simplificar

        double resultado = T(n);

        System.out.println("T(" + n + ") = " + resultado);
        System.out.println("Orden esperado: Theta(sqrt(n)) = " + Math.sqrt(n));
    }
}
