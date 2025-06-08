package Ejercicios;
import java.util.Arrays;
import java.util.Scanner;

public class arregloejem{
    //Arreglo para numeros
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] arreglo = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite el valor" + (i+1));
            arreglo[i] = teclado.nextInt();
        } 
       Arrays.sort(arreglo);
       for(int a =0;a<10;a++){
           System.out.println(arreglo[a]);
       }
    }
}
    //Arreglo para nombres
    /*public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] arreglo = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe el nombre  " + (i+1));
            arreglo[i] = teclado.nextLine();
        } 
       Arrays.sort(arreglo);
       for(int a =0;a<10;a++){
           System.out.println("Los Nombres son: ")
           System.out.println(arreglo[a]);
       }
    }
}*/

