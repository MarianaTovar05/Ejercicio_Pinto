   package Ejercicio;
import java.util.Scanner;
public class calculadora {
    public static double num1,num2,resultado;
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        do {
        System.out.println("CALCULADORA DMC");
        System.out.println("Elige una operación: ");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.División");
        System.out.println("5.Salir");
        op = teclado.nextInt();
         switch (op) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicación();
                break;
            case 4:
                divide();
                break;
            case 5:
                System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
                break;
            default:
                System.out.println("Operación no válida.");
        }
    } while (op != 5);
        teclado.close();
    }
    public static void suma() {
        datos();
        resultado = num1 + num2;
        System.out.println("Resultado: " + resultado);
    }
    public static void resta() {
        datos();
        resultado = num1 - num2;
        System.out.println("Resultado: " + resultado);
    }
    public static void multiplicación() {
        datos();
        resultado = num1*num2;
        System.out.println("Resultado: " + resultado);
    }
    public static void divide() {
        datos();
        if (num2 != 0) {
            resultado = num1/num2;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }
    public static void datos(){
        System.out.println("Ingresa el primer número: ");
        num1 = teclado.nextInt(); 
        System.out.println("Ingresa el segundo número: ");
        num2 = teclado.nextInt();
    }
}
        
 

