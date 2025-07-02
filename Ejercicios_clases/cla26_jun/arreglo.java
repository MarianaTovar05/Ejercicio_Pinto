package cla26_jun;
import java.util.*;
public class arreglo {
    public static void main(String[] args) {
        String[][] mate = new String[3][3];
        Random rand = new Random();
        Scanner teclado = new Scanner(System.in);
        int sumaTotal = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int numero = rand.nextInt(5) + 1;
                mate[i][j] = String.valueOf(numero);
                sumaTotal += numero;
            }
        }
        //Muestro las matriz normal y de manera inversa
        System.out.println("Matriz MCD:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mate[i][j] + " ");
                 
            }
            System.out.println();
        }
        System.out.println("Matriz en orden inverso:");
        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                System.out.print(mate[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Suma total de los valores en la matriz: " + sumaTotal);
        //Para mirar las combinaciones de suma de los valores de la matriz
        
        System.out.print("Ingrese un número: ");
        int num = teclado.nextInt();

        List<int[]> elementos = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int valor = Integer.parseInt(mate[i][j]);
                elementos.add(new int[]{valor, i, j}); 
            }
        }
        boolean hayCoincidencias = false;
        System.out.println("Combinaciones que suman " + num + ":");
        int nop = elementos.size();

        for (int mask = 1; mask < (1 << nop); mask++) {
            int suma = 0;
            List<int[]> combinacion = new ArrayList<>();

            for (int k = 0; k < nop; k++) {
                if ((mask & (1 << k)) != 0) {
                    suma += elementos.get(k)[0];
                    combinacion.add(elementos.get(k));
                }
            }

            if (suma == num) {
                hayCoincidencias = true;
                System.out.print("Valores: ");
                for (int[] elem : combinacion) {
                    System.out.print(elem[0] + " ");
                }
            }
        }
        if (!hayCoincidencias) {
            System.out.println("No hay combinaciones que sumen " + num);
        }

        teclado.close();
    }
}

    