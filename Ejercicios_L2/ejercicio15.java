package Ejercicios_L2;

public class ejercicio15 {
    static int comparaciones;
    public static void maxMin(int[] T, int i, int j, int[] resultado) {
        if (i == j) {
            resultado[0] = T[i]; // Max
            resultado[1] = T[i]; // Min
            return;
        }
        comparaciones++;
        int max, min;
        if (T[i] < T[j]) {
            max = T[j];
            min = T[i];
        } else {
            max = T[i];
            min = T[j];
        }
        if (i + 1 <= j - 1) {
            int[] aux = new int[2];
            maxMin(T, i + 1, j - 1, aux);
            comparaciones++;
            if (max < aux[0]) {
                max = aux[0];
            }
            comparaciones++;
            if (aux[1] < min) {
                min = aux[1];
            }
        }

        resultado[0] = max;
        resultado[1] = min;
    }

    public static void main(String[] args) {
        
        int n = 10;
        int[] T = new int[n];
       
        for (int k = 0; k < n; k++) {
            T[k] = (int) (Math.random() * 100);
        }
        int[] resultado = new int[2];
        comparaciones = 0;
        maxMin(T, 0, n - 1, resultado);
        System.out.println("Vector: ");
        for (int v : T) System.out.print(v + " ");
        System.out.println("\nMax: " + resultado[0] + ", Min: " + resultado[1]);
        System.out.println("Número de comparaciones realizadas: " + comparaciones);
        System.out.printf("Estimación teórica comparaciones: ~ %.1f\n", 1.5 * n);
    }
}

