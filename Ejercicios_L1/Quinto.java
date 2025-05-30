import java.util.Scanner;

public class Quinto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de Horas Laboradas en el mes: ");
        int horasLaboradasPorMes = scanner.nextInt();

        System.out.print("Tarifa por Hora: ");
        double tarifaPorHora = scanner.nextDouble();

        double planilla = horasLaboradasPorMes * tarifaPorHora;

        System.out.println("Planilla: $" + planilla);

        scanner.close();
    }
}