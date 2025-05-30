import java.util.Scanner;

public class Diecisiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número entero de 2 dígitos: ");
        int NE = scanner.nextInt();

        double D = NE / 10;
        double U = NE % 10;

        System.out.println("Número de Decenas: " + D);
        System.out.println("Número de Unidades: " + U);

        scanner.close();
    }
}