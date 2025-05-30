import java.util.Scanner;

public class Décimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int E1;
        int E2;
        int DE;

        System.out.print("Edad del primer hermano: ");
        E1 = scanner.nextInt();

        System.out.print("Edad del segundo hermano: ");
        E2 = scanner.nextInt();

        DE = E1 - E2;
        System.out.println("Diferencia de edad: " + DE + " años");

        if (E1 > E2) {
            System.out.println("El primer hermano es el mayor, por " + DE + " años.");
        } else if (E2 > E1) {
            DE = E2 - E1;
            System.out.println("El segundo hermano es el mayor, por " + DE + " años.");
        } else {
            DE = 0;
            System.out.println("Ambos hermanos tienen la misma edad.");
        }

        scanner.close();
    }
}