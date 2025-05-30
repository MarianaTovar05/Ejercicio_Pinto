package Ejercicios_L2;

import java.util.Scanner;
public class ejercicio5 {
        public static boolean esTriangular(int n) {
        int suma = 0;
        int i = 1;

        while (suma < n) {
            suma += i;
            i++;
        }
        return suma == n;
    }
    public static void main(String[] args) {
        Scanner pantalla = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo (n ≥ 1): ");
        int n = pantalla.nextInt();

        if (n < 1) {
            System.out.println("El número debe ser mayor o igual a 1.");
        } else if (esTriangular(n)) {
            System.out.println(n + " es un número triangular.");
        } else {
            System.out.println(n + " NO es un número triangular.");
        }

        pantalla.close();
    }
}
