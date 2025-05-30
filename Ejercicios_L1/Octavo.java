import java.util.Scanner;

public class Octavo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Abscisa de A: ");
            double AA = scanner.nextDouble();
            System.out.print("Ordenada A: ");
            double OA = scanner.nextDouble();
            System.out.print("Abscisa B: ");
            double AB = scanner.nextDouble();
            System.out.print("Ordenada B: ");
            double OB = scanner.nextDouble();

            double D = Math.pow(Math.pow(AB - AA, 2) + Math.pow(OB - OA, 2), 0.5);

            System.out.println("Distancia: " + D);
        }
    }
}