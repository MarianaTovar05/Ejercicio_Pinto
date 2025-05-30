package Ejercicios_L2;
 import java.util.PriorityQueue;

public class ejercicio12 {

    static class Nodo implements Comparable<Nodo> {
        int valor;
        int origenSecuencia; 

        int indiceDentroSecuencia;

        public Nodo(int valor, int origenSecuencia, int indiceDentroSecuencia) {
            this.valor = valor;
            this.origenSecuencia = origenSecuencia;
            this.indiceDentroSecuencia = indiceDentroSecuencia;
        }
        public int compareTo(Nodo o) {
            return Integer.compare(this.valor, o.valor);
        }
    }
    public static void ordenarBloquesDeDos(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            if (i + 1 < arr.length && arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
    public static int[] mergeGeneralizado(int[] arr) {
        int n = arr.length;
        int k = n / 2;
        int[][] secuencias = new int[k][2];
        for (int i = 0; i < k; i++) {
            secuencias[i][0] = arr[2 * i];
            if (2 * i + 1 < n) {
                secuencias[i][1] = arr[2 * i + 1];
            } else {
                // Caso n impar
                secuencias[i] = new int[]{arr[2 * i]};
            }
        }
        PriorityQueue<Nodo> heap = new PriorityQueue<>();
        int[] indices = new int[k]; 
        for (int i = 0; i < k; i++) {
            if (indices[i] < secuencias[i].length) {
                heap.add(new Nodo(secuencias[i][indices[i]], i, indices[i]));
                indices[i]++;
            }
        }
        int[] resultado = new int[n];
        int pos = 0;
        while (!heap.isEmpty()) {
            Nodo min = heap.poll();
            resultado[pos++] = min.valor;
            int secuencia = min.origenSecuencia;
            int idx = indices[secuencia];
            if (idx < secuencias[secuencia].length) {
                heap.add(new Nodo(secuencias[secuencia][idx], secuencia, idx));
                indices[secuencia]++;
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 7, 6, 2, 4, 1};
        ordenarBloquesDeDos(arr);
        System.out.println("Después de ordenar bloques de tamaño 2:");
        for (int v : arr) System.out.print(v + " ");
        System.out.println();
        int[] arrOrdenado = mergeGeneralizado(arr);
        System.out.println("Después de merge generalizado:");
        for (int v : arrOrdenado) System.out.print(v + " ");
        System.out.println();
    }
}
