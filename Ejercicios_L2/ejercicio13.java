package Ejercicios_L2;
import java.util.Random;

public class ejercicio13 {
    static int llamadasRecursivas;
    public static boolean PAL(char[] C, int i, int j) {
        llamadasRecursivas++;
        if (i >= j) {
            return true;
        }
        if (C[i] != C[j]) {
            return false;
        }
        return PAL(C, i + 1, j - 1);
    }
    public static char[] generarCadenaAleatoria(int n) {
        Random rand = new Random();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextBoolean() ? 'a' : 'b';
        }
        return arr;
    }
    public static char[] generarCadenaPalindroma(int n) {
        Random rand = new Random();
        char[] arr = new char[n];
        for (int i = 0; i <= (n - 1) / 2; i++) {
            arr[i] = rand.nextBoolean() ? 'a' : 'b';
            arr[n - 1 - i] = arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int n = 20; 
        char[] cadenaPalindroma = generarCadenaPalindroma(n);
        llamadasRecursivas = 0;
        boolean esPalindromo = PAL(cadenaPalindroma, 0, n - 1);
        System.out.println("Cadena palíndroma: " + new String(cadenaPalindroma));
        System.out.println("¿Es palíndromo?: " + esPalindromo);
        System.out.println("Llamadas recursivas (caso peor): " + llamadasRecursivas);
        char[] cadenaAleatoria = generarCadenaAleatoria(n);
        llamadasRecursivas = 0;
        esPalindromo = PAL(cadenaAleatoria, 0, n - 1);
        System.out.println("\nCadena aleatoria: " + new String(cadenaAleatoria));
        System.out.println("¿Es palíndromo?: " + esPalindromo);
        System.out.println("Llamadas recursivas (caso medio aprox.): " + llamadasRecursivas);
    }
}
