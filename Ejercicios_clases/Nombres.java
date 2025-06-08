package Ejercicios;
import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] nombre = new String[4];
        String[] ocupacion = new String[4];
        String[] identificacion = new String[4];
        String[] RH = new String[4];
        String[] telefono = new String[4];
        String[] direccion = new String[4];
        String[] correo = new String[4];

        System.out.println("INGRESAR DATOS");
        for (int i = 0; i < 4; i++) {
            System.out.println("\nPersona " + (i + 1));
            System.out.print("Nombre: ");
            nombre[i] = teclado.nextLine();
            System.out.print("Ocupación: ");
            ocupacion[i] = teclado.nextLine();
            System.out.print("Identificación: ");
            identificacion[i] = teclado.nextLine();
            System.out.print("RH: ");
            RH[i] = teclado.nextLine();
            System.out.print("Teléfono: ");
            telefono[i] = teclado.nextLine();
            System.out.print("Dirección: ");
            direccion[i] = teclado.nextLine();
            System.out.print("Correo: ");
            correo[i] = teclado.nextLine();
        }
        System.out.print("¿Cuál de las personas deseas mostrar? (1 a 4): ");
        int op = teclado.nextInt();
        teclado.nextLine();

        if (op >= 1 && op <= 4) {
            imprimir(op - 1, nombre, ocupacion, identificacion, RH, telefono, direccion, correo);
        } else {
            System.out.println("Opción no válida.");
        }
        teclado.close();
    }
    public static void imprimir(int indice, String[] nombre, String[] ocupacion, String[] identificacion,
                                String[] RH, String[] telefono, String[] direccion, String[] correo) {
        System.out.println("DATOS DE LA PERSONA " + (indice + 1));
        System.out.println("Nombre: " + nombre[indice]);
        System.out.println("Ocupación: " + ocupacion[indice]);
        System.out.println("Identificación: " + identificacion[indice]);
        System.out.println("RH: " + RH[indice]);
        System.out.println("Teléfono: " + telefono[indice]);
        System.out.println("Dirección: " + direccion[indice]);
        System.out.println("Correo: " + correo[indice]);
    }
}
