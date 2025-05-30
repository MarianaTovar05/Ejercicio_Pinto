import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primera Nota: ");
        int nota1 = scanner.nextInt();

        System.out.print("Segunda Nota: ");
        int nota2 = scanner.nextInt();

        System.out.print("Tercera Nota: ");
        int nota3 = scanner.nextInt();

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Promedio(P): " + promedio);

        scanner.close();
    }
}