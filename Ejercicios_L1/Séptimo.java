import java.util.Scanner;

public class Séptimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de Gigabyte del Disco Duro: ");
        int GB = scanner.nextInt();

        int MG = GB * 1024;
        System.out.println("Número de Megabyte del Disco Duro: " + MG);

        int CD = (int) ((MG / 700.0) + 1);

        System.out.println("Número de CDs: " + CD);

        scanner.close();
    }
}