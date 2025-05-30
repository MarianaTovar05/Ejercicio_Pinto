import java.util.Scanner;

public class Dieciséis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NE;
        String V;

        System.out.print("Número entero (1 a 5): ");
        NE = scanner.nextInt();

        switch (NE) {
            case 1:
                V = "A";
                break;
            case 2:
                V = "E";
                break;
            case 3:
                V = "I";
                break;
            case 4:
                V = "O";
                break;
            case 5:
                V = "U";
                break;
            default:
                V = "Valor Incorrecto";
        }

        System.out.println("Vocal: " + V);

        scanner.close();
    }
}