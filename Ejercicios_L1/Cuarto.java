import java.util.Scanner;

public class Cuarto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de Partidos Ganados: ");
        int PG = scanner.nextInt();

        System.out.print("Número de Partidos Empatados: ");
        int PE = scanner.nextInt();

        System.out.print("Número de Partidos Perdidos: ");
        int PP = scanner.nextInt();

        int PPG = PG * 3;
        int PPE = PE * 1;
        int PPP = PP * 0;

        System.out.println("Puntaje de Partidos Ganados: " + PPG);
        System.out.println("Puntaje de Partidos Empatados: " + PPE);
        System.out.println("Puntaje de Partidos Perdidos: " + PPP);

        int PT = PPG + PPE + PPP;
        System.out.println("Puntaje Total: " + PT);

        scanner.close();
    }
}