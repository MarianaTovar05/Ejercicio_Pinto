package Ejercicios_L2;
public class ejercicio1 {
    public static int f1(int n) {
        return 4 * n;
    }
    public static int g1(int n) {
        return 3 * n;
    }
    public static int f2(int n) {
        return 4 * n;
    }
    public static int g2(int n) {
        return 4 * n - 1;
    }
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "n", "f1(n)", "g1(n)", "f1-g1", "f2(n)", "g2(n)", "f2-g2");
        for (int n = 1; n <= 10; n++) {
            int f1 = f1(n);
            int g1 = g1(n);
            int f2 = f2(n);
            int g2 = g2(n);
            System.out.printf("%-10d %-10d %-10d %-10d %-10d %-10d %-10d\n", n, f1, g1, f1 - g1, f2, g2, f2 - g2);
        }
    }
}

