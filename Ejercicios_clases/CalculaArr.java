package Ejercicios;
import java.util.Scanner;
import java.util.Arrays;

public class CalculaArr {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] arreglo = new double[10];

        // Llenar el arreglo
        System.out.println("INGRESA 10 NÚMEROS");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo[i] = teclado.nextDouble();
        }

        int opcion;
        do {
            System.out.println("CALCULADORA DMC");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Ver arreglo ordenado");
            System.out.println("6. Salir");

            System.out.print("Opción: ");
            opcion = teclado.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                // Pedimos las posiciones del arreglo
                System.out.print("Posición 1 (0-9): ");
                int pos1 = teclado.nextInt();
                System.out.print("Posición 2 (0-9): ");
                int pos2 = teclado.nextInt();

                if (pos1 < 0 || pos1 >= 10 || pos2 < 0 || pos2 >= 10) {
                    System.out.println("Índices fuera de rango. Intenta nuevamente.");
                    continue;
                }

                double a = arreglo[pos1];
                double b = arreglo[pos2];

                // Array con nombres de operaciones y resultados
                String[] operaciones = {"Suma", "Resta", "Multiplicación", "División"};
                double[] resultados = {a + b, a - b, a * b, (b != 0) ? a / b : Double.NaN};

                for (int i = 0; i < 4; i++) {
                    if ((i + 1) == opcion) {
                        if (i == 3 && b == 0) {
                            System.out.println("No se puede dividir entre cero.");
                        } else {
                            System.out.println("Resultado de la " + operaciones[i] + ": " + resultados[i]);
                        }
                        break;
                    }
                }
            } else if (opcion == 5) {
                double[] copia = Arrays.copyOf(arreglo, arreglo.length);
                Arrays.sort(copia);
                System.out.println("Arreglo ordenado:");
                for (double v : copia) {
                    System.out.println(v);
                }
            } else if (opcion == 6) {
                System.out.println("Saliendo de la calculadora.");
            } else {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        teclado.close();
    }
}

