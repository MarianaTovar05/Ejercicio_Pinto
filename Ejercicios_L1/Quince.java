import java.util.Scanner;

public class Quince {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double MV;
        double TB;

        System.out.print("Monto de venta: ");
        MV = scanner.nextDouble();

        if (MV >= 0 && MV < 1000) {
            TB = 0;
        } else if (MV >= 1000 && MV < 5000) {
            TB = (3 * MV) / 100;
        } else if (MV >= 5000 && MV < 20000) {
            TB = (5 * MV) / 100;
        } else if (MV >= 20000) {
            TB = (8 * MV) / 100;
        } else {
            TB = -1;
        }

        if (TB >= 0) {
            System.out.println("Total de Bonificación: $" + TB);
        } else {
            System.out.println("Monto de venta no válido.");
        }

        scanner.close();
    }
}