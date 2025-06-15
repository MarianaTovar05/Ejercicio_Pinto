
import java.util.Scanner;

public class Menu{    
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Sistema gestor = new Sistema();
        Reporte reporteador = new Reporte();
        int opcion;
        
        do {
            System.out.println(" MENÚ PRINCIPAL");
            System.out.println("1. Registrar Conductores");
            
            System.out.println("2. Registrar Pacientes");

            System.out.println("3. Registrar Muertos");

            System.out.println("4. Asignar Vehículos y Conductores");

            System.out.println("5. Generar Reporte");
            System.out.println("6. Salir");

            System.out.println("Seleccione una opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1: gestor.registrarConductores(); break;
                case 2: gestor.registrarPacientes(); break;
                case 3: gestor.registrarMuertos(); break; 
                case 4: gestor.asignarVehiculos();
                        gestor.asignarPacientesAConductores();   
                    break;
                case 5: reporteador.generarReporte(); break;
                case 6: System.out.println("Saliendo del sistema..."); break;
                default: System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 6);

        teclado.close();
    }
}
