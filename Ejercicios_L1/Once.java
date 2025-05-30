import java.util.Scanner;

public class Once {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int PL, PMa, PMi, PJ, PV, PS;
        int PT;
        double PP;
        String MSG;

        System.out.print("Producción del día Lunes: ");
        PL = scanner.nextInt();

        System.out.print("Producción del día Martes: ");
        PMa = scanner.nextInt();

        System.out.print("Producción del día Miércoles: ");
        PMi = scanner.nextInt();

        System.out.print("Producción del día Jueves: ");
        PJ = scanner.nextInt();

        System.out.print("Producción del día Viernes: ");
        PV = scanner.nextInt();

        System.out.print("Producción del día Sábado: ");
        PS = scanner.nextInt();

        PT = PL + PMa + PMi + PJ + PV + PS;
        System.out.println("Producción total: " + PT);
        PP = (double) PT / 6;
        System.out.println("Promedio de producción: " + PP);

        if (PP >= 100) {
            MSG = "Recibirá incentivos.";
        } else {
            MSG = "No recibirá incentivos.";
        }

        System.out.println(MSG);

        scanner.close();
    }
}