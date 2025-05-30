import java.util.Scanner;

public class Sexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Longitud del Lado A: ");
        double LA = scanner.nextDouble();

        System.out.print("Longitud del Lado B: ");
        double LB = scanner.nextDouble();

        System.out.print("Longitud del Lado C: ");
        double LC = scanner.nextDouble();

        double LS = (LA + LB + LC) / 2;
        System.out.println("Longitud del Semiperímetro: " + LS);

        double AT = Math.sqrt(LS * (LS - LA) * (LS - LB) * (LS - LC));
        System.out.println("Área del Triángulo: " + AT);

        scanner.close();
    }
}