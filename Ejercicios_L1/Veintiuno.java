import java.util.Scanner;

public class Veintiuno {

    public static void main(String[] args) {
        int EP;
        int MAY = 0;
        int MEN = 0;
        int K;

        try (Scanner scanner = new Scanner(System.in)) {

            for (K = 1; K <= 200; K++) {
                System.out.print("Edad de persona " + K + ": ");
                EP = scanner.nextInt();

                if (EP < 18) {
                    MEN = MEN + 1;
                } else {
                    MAY = MAY + 1;
                }
            }

            System.out.println("Contador: " + K);
            System.out.println("Mayores: " + MAY);
            System.out.println("Menores: " + MEN);
        }
    }
}