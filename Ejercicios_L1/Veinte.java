import java.util.Scanner;

public class Veinte {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int NE;
            int K;
            double SE;
            double SS = 0;
            double SP;

            System.out.print("Número de empleados: ");
            NE = scanner.nextInt();

            for (K = 1; K <= NE; K++) {
                System.out.print("Sueldo del empleado " + K + ": ");
                SE = scanner.nextDouble();
                SS = SS + SE;
            }

            SP = SS / NE;
            System.out.println("Contador: " + K);
            System.out.println("Suma de sueldos: " + SS);
            System.out.println("Sueldo promedio: " + SP);
        }
    }
}