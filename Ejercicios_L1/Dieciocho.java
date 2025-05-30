import java.util.Scanner;

public class Dieciocho {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NE;
        double Q;
        double R;
        String MSG;

        do {
            System.out.print("Número entero diferente de cero: ");
            NE = scanner.nextInt();
        } while (NE == 0);

        Q = NE / 2;
        R = NE - (Q * 2);

        if (R == 0) {
            MSG = "Es Par";
        } else {
            MSG = "Es Impar";
        }

        System.out.println("Cociente entero: " + Q);
        System.out.println("Residuo: " + R);
        System.out.println(MSG);

        scanner.close();
    }
}