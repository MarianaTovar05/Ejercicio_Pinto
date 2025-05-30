package ejercicios2;
import java.util.Scanner;
public class impares {
    public static void main(String[] args) {
        int ite;
        int respuesta;
        char res;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite un número:");
            ite = teclado.nextInt();

            while (ite > 300) {
                System.out.println("No puedo hacer tantos.");
                System.out.println("Por favor, ingrese otro valor:");
                ite = teclado.nextInt();
            }
            System.out.println("1. Números pares");
            System.out.println("2. Números impares");
            System.out.println("3. Números primos");
            respuesta = teclado.nextInt();
            // || Es el operador lógico OR
            if (respuesta < 1 || respuesta > 3) {
                System.out.println("Opción inválida.");
            } else {
                System.out.println("Escogiste la respuesta " + respuesta + ":");
                for (int j = 1; j <= ite; j++) {
                    if (respuesta == 1 && j % 2 == 0) {
                        System.out.println(j);
                    } else if (respuesta == 2 && j % 2 != 0) {
                        System.out.println(j);
                    } else if (respuesta == 3 && j > 1) {
                        double limite = Math.sqrt(j);
                        double i;
                        for (i = 2; i <= limite; i++) {
                            if (j % (int) i == 0) {
                                break;
                            }
                        }
                        if (i > limite) {
                            System.out.println(j);
                        }
                    }
                }
            }
            System.out.println("¿Quieres hacer otra operación? (si/no):");
            res = teclado.next().charAt(0);
        } while (res == 's' || res == 'S');
        System.out.println("Programa terminado.");
        teclado.close();
    }
}

