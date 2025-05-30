import java.util.Scanner;

public class Primero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int velocidad;
        int tiempo;
        int distancia;

        System.out.print("Velocidad constante (m/s): ");
        velocidad = scanner.nextInt();

        System.out.print("Tiempo (sg): ");
        tiempo = scanner.nextInt();

        distancia = velocidad * tiempo;

        System.out.println("Distancia Recorrida (m): " + distancia + " metros");

        scanner.close();
    }
}