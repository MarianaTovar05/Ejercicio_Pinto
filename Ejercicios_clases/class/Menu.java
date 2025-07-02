import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Sistema gestor = new Sistema();
        Reporte reporteador = new Reporte();
        int opcion;

        do {
            System.out.println("==== MENÚ PRINCIPAL ====");
            System.out.println("1. Registrar Conductores");
            System.out.println("2. Registrar Pacientes");
            System.out.println("3. Registrar Muertos");
            System.out.println("4. Asignar Vehículos y Conductores");
            System.out.println("5. Registrar Clínicas");
            System.out.println("6. Traslado de Pacientes (Solicitado por Clínica)");
            System.out.println("7. Traslado de Muertos (Solicitado por Clínica)");
            System.out.println("8. Ver No Trasladados");
            System.out.println("9. Generar Reporte");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1: gestor.registrarConductores(); break;
                case 2: gestor.registrarPacientes(); break;
                case 3: gestor.registrarMuertos(); break;
                case 4: gestor.asignarVehiculos(); break;
                case 5: gestor.registrarClinicas(); break;
                case 6: gestor.trasladoSolicitadoPorClinicaPacientes(); break;
                case 7: gestor.trasladoSolicitadoPorClinicaMuertos(); break;
                case 8: gestor.mostrarNoTrasladados(); break;
                case 9: reporteador.generarReporte(); break;
                case 10: System.out.println("SALIDA"); break;
                default: System.out.println("Opción no válida."); break;
            }

        } while (opcion != 10);
        
        teclado.close();
    }
}

