package Ejercicios_L2;

public class ejercicio4 {
    static long t = 0;
    public static void G(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                t++; 
            }
        }
        if (x > 0) {
            for (int i = 1; i <= 4; i++) {
                G(x / 2); 
            }
        }
    }
    public static void main(String[] args) {
        for (int n = 1; n <= 512; n *= 2) {
            t = 0;
            G(n);
            System.out.printf("t(%3d) = %d\n", n, t);
        }
    }
}
 
