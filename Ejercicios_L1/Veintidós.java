import java.util.Scanner;

public class Veintidós {

    public static void main(String[] args) {
        int PN;
        int SN;
        int P = 0;
        int K;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Primer número: ");
            PN = scanner.nextInt();

            System.out.print("Segundo número: ");
            SN = scanner.nextInt();

            for (K = 1; K <= SN; K++) {
                P = P + PN;
            }

            System.out.println("Contador: " + K);
            System.out.println("Producto: " + P);
        }
    }
}