package Ejercicios_L2;

public class ejercicio2 {
    public static final double a = 2.0;
    public static final double b = 10.0;

    public static double logBase(double base, double x) {
        return Math.log(x) / Math.log(base);
    }
    public static void main(String[] args) {
        System.out.printf("%-10s %-15s %-15s %-15s\n", "n", "log_a(n)", "log_b(n)", "Ratio log_a/log_b");
        for (int n = 1; n <= 1000000; n *= 10) {
            double loga = logBase(a, n);
            double logb = logBase(b, n);
            double ratio = loga / logb;
            System.out.printf("%-10d %-15.6f %-15.6f %-15.6f\n", n, loga, logb, ratio);
        }
        double ratioTeorico = 1 / (Math.log(b) / Math.log(a)); 
        System.out.printf("\nRatio teórico (1 / log_b(a)) = %.6f\n", ratioTeorico);
    }
}   

