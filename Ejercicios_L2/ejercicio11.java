package Ejercicios_L2;

public class ejercicio11 {
    public static class Resultado {
        public boolean hallado;
        public int comienzo;
        public int comparaciones;

        public Resultado(boolean hallado, int comienzo, int comparaciones) {
            this.hallado = hallado;
            this.comienzo = comienzo;
            this.comparaciones = comparaciones;
        }
    }
    public static Resultado stringSearch(String A, String B) {
        int N = A.length();
        int M = B.length();
        int limite = N - M + 1;
        boolean encontrado = false;
        int comienzo = 0;
        int comparaciones = 0;
        int com = 0;
        while (!encontrado && com < limite) {
            int i = com;
            int j = 0;

            while (j < M && A.charAt(i) == B.charAt(j)) {
                comparaciones++;
                i++;
                j++;
            }
            if (j < M) {
                comparaciones++; 
            }

            encontrado = (j == M);

            if (!encontrado) {
                com++;
            }
        }

        if (encontrado) {
            comienzo = com;
        } else {
            comienzo = -1; 
        }

        return new Resultado(encontrado, comienzo, comparaciones);
    }
    public static void main(String[] args) {
        String A = "aaa"; 
        String B = "aaaaaab";                    

        Resultado res = stringSearch(A, B);

        System.out.println("Encontrado: " + res.hallado);
        System.out.println("Comienzo: " + res.comienzo);
        System.out.println("Comparaciones realizadas: " + res.comparaciones);
    }
}

