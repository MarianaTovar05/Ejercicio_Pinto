import java.util.Scanner;

public class Trece {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int L1, L2, L3;
        String TT;

        System.out.print("Primer lado: ");
        L1 = scanner.nextInt();

        System.out.print("Segundo lado: ");
        L2 = scanner.nextInt();

        System.out.print("Tercer lado: ");
        L3 = scanner.nextInt();

        if (L1 != L2 && L2 != L3 && L1 != L3) {
            TT = "Escaleno";
        } else {
            if (L1 == L2 && L2 == L3) {
                TT = "Equilátero";
            } else {
                TT = "Isósceles";
            }
        }

        System.out.println("Tipo de triángulo: " + TT);

        scanner.close();
    }
}
