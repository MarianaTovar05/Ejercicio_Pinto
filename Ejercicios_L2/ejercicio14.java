package Ejercicios_L2;

public class ejercicio14 {
    public static double algoritmoTrivial(int n) {
        return Math.pow(n, 2);
    }
    public static double divideYVenceras(int n) {
        if (n <= 1) return n; // para n=1 o menor
        double log2n = Math.log(n) / Math.log(2);
        return n * Math.pow(log2n, 2);
    }
    public static void main(String[] args) {
        System.out.println("n\tAlgoritmo trivial (n^2)\tDivide y vencerás (n log^2 n)");
        int[] valoresN = {10, 100, 1000, 10000, 100000, 1000000};

        for (int n : valoresN) {
            double tTrivial = algoritmoTrivial(n);
            double tDivideV = divideYVenceras(n);
            System.out.printf("%d\t%.2e\t\t\t%.2e\n", n, tTrivial, tDivideV);
        }
    }
}