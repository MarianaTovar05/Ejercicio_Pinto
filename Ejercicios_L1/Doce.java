import java.util.Scanner;

public class Doce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1, N2, N3;
        int NM;

        System.out.print("Primer número entero: ");
        N1 = scanner.nextInt();

        System.out.print("Segundo número entero: ");
        N2 = scanner.nextInt();

        System.out.print("Tercer número entero: ");
        N3 = scanner.nextInt();

        if (N1 > N2 && N1 > N3) {
            NM = N1;
        } else {
            if (N2 > N3) {
                NM = N2;
            } else {
                NM = N3;
            }
        }

        System.out.println("Número mayor: " + NM);

        scanner.close();
    }
}