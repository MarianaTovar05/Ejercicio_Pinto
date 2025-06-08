package Ejercicios;

import java.util.Scanner;
public class tallerNombre {
    static Scanner teclado = new Scanner(System.in);
    static String[] nombre = new String[4];
    static String[] ocupacion = new String[4];
    static String[] identificacion = new String[4];
    static String[] RH = new String[4];
    static String[] telefono = new String[4];
    static String[] direccion = new String[4];
    static String[] correo = new String[4];
    public static void main(String[] args) {

        System.out.println("INGRESAR DATOS");
        for (int i = 0; i < 4; i++) {
            System.out.println("\nPersona: " + (i + 1));
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
        int opcion;
        do {
            System.out.println("MENÚ DE BUSQUEDA");
            System.out.println("1. Buscar por nombre");
            System.out.println("2. Buscar por ocupación");
            System.out.println("3. Buscar por identificación");
            System.out.println("4. Buscar por RH");
            System.out.println("5. Buscar por teléfono");
            System.out.println("6. Buscar por dirección");
            System.out.println("7. Buscar por correo");
            System.out.println("8. Salir");
            System.out.print("Opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    buscar(nombre, "nombre");
                    break;
                case 2:
                    buscar(ocupacion, "ocupación");
                    break;
                case 3:
                    buscar(identificacion, "identificación");
                    break;
                case 4:
                    buscar(RH, "RH");
                    break;
                case 5:
                    buscar(telefono, "teléfono");
                    break;
                case 6:
                    buscar(direccion, "dirección");
                    break;
                case 7:
                    buscar(correo, "correo");
                    break;
                case 8:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);

        teclado.close();
    }
    public static void buscar(String[] campo, String campoNombre) {
        System.out.print("Ingresa el " + campoNombre + " que deseas buscar: ");
        String dato = teclado.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < 4; i++) {
            if (campo[i].equalsIgnoreCase(dato)) {
                imprimir(i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ninguna persona con ese " + campoNombre + ".");
        }
    }
    public static void imprimir(int i) {
        System.out.println("DATOS DE LA PERSONA: ");
        System.out.println("Nombre: " + nombre[i]);
        System.out.println("Ocupación: " + ocupacion[i]);
        System.out.println("Identificación: " + identificacion[i]);
        System.out.println("RH: " + RH[i]);
        System.out.println("Teléfono: " + telefono[i]);
        System.out.println("Dirección: " + direccion[i]);
        System.out.println("Correo: " + correo[i]);
    }
}

