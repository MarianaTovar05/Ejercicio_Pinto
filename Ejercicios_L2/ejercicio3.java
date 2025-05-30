package Ejercicios_L2;

public class ejercicio3 {
    public static void main(String[] args) {
        System.out.printf("\n%-10s | %-10s %-10s | %-12s %-12s | %-15s\n",
                "n", "f(n)", "h(n)", "log(f(n))", "log(h(n))", "log(f)/log(h)");

        System.out.println("\n[a] Demostración con f(n) = 2n y h(n) = 5n (O(f)=O(h)) ⇒ O(logf)=O(logh)\n");

        for (int n = 10; n <= 100000; n *= 10) {
            double f = 2.0 * n;
            double h = 5.0 * n;
            double logf = Math.log(f);
            double logh = Math.log(h);
            double ratio = logf / logh;

            System.out.printf("%-10d | %-10.0f %-10.0f | %-12.4f %-12.4f | %-15.6f\n",
                    n, f, h, logf, logh, ratio);
        }

        System.out.println("\n[b] Contrademostración con f(n) = n y h(n) = n^2 (O(logf)=O(logh)) ⇒ O(f)≠O(h)\n");

        System.out.printf("\n%-10s | %-10s %-10s | %-12s %-12s | %-15s\n",
                "n", "f(n)", "h(n)", "log(f(n))", "log(h(n))", "log(f)/log(h)");
        for (int n = 10; n <= 100000; n *= 10) {
            double f = (double) n;
            double h = (double) n * n;
            double logf = Math.log(f);
            double logh = Math.log(h);
            double ratio = logf / logh;

            System.out.printf("%-10d | %-10.0f %-10.0f | %-12.4f %-12.4f | %-15.6f\n",
                    n, f, h, logf, logh, ratio);
        }
    }
}
