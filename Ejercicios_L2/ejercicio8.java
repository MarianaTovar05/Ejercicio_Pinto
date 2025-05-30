package Ejercicios_L2;

public class ejercicio8 {
    public static class Resultado {
        public int max;
        public int min;
        public int comparaciones;
        public Resultado(int max, int min, int comparaciones) {
            this.max = max;
            this.min = min;
            this.comparaciones = comparaciones;
        }
    }

    public static Resultado maximoMinimo(int[] arr) {
        int comparaciones = 0;
        int max, min;
        int i;
        if (arr.length % 2 == 0) {
            comparaciones++;
            if (arr[0] > arr[1]) {
                max = arr[0];
                min = arr[1];
            } else {
                max = arr[1];
                min = arr[0];
            }
            i = 2; 
        } else {
            max = arr[0];
            min = arr[0];
            i = 1; 
        }
        while (i < arr.length - 1) {
            comparaciones++;
            int localMax, localMin;
            if (arr[i] > arr[i + 1]) {
                localMax = arr[i];
                localMin = arr[i + 1];
            } else {
                localMax = arr[i + 1];
                localMin = arr[i];
            }
            comparaciones++;
            if (localMax > max) max = localMax;
            comparaciones++;
            if (localMin < min) min = localMin;

            i += 2;
        }
        return new Resultado(max, min, comparaciones);
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 8, 5, 1, 9, 3, 6, 4};
        Resultado res = maximoMinimo(arr);

        System.out.println("Máximo: " + res.max);
        System.out.println("Mínimo: " + res.min);
        System.out.println("Comparaciones realizadas: " + res.comparaciones);
        System.out.println("Comparaciones máximo permitido (3n/2): " + (3 * arr.length / 2));
    }
}
