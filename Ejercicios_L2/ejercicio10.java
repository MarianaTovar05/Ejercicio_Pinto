package Ejercicios_L2;

public class ejercicio10 {
    // (a) parcial(m)
    public static int parcial(int m) {
        if (m == 1) {
            return 1;
        } else {
            return 2 * parcial(m - 1);
        }
    }
    // (a) total(n)
    public static int total(int n) {
        if (n == 1) {
            return 1;
        } else {
            return total(n - 1) + 2 * parcial(n - 1);
        }
    }
    // (b) total(n,m)
    public static int total(int n, int m) {
        if (n == 1) {
            return m;
        } else {
            return m + total(n - 1, 2 * m);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Apartado (a)");
        int resultadoA = total(n);
        System.out.println("total(" + n + ") = " + resultadoA);
        System.out.println("\nApartado (b)");
        int resultadoB = total(n, 1);
        System.out.println("total(" + n + ", 1) = " + resultadoB);
    }
}
