
public class Reporte {

    public void generarReporte() {
        System.out.println("==== REPORTE GENERAL ====");
        System.out.println("Conductores registrados: " + Sistema.listaConductores.size());
        System.out.println("Pacientes registrados: " + Sistema.listaPacientes.size());
        System.out.println("Muertos registrados: " + Sistema.listaMuertos.size());
        System.out.println("Vehículos registrados: " + Sistema.listaVehiculos.size());
        System.out.println("Clínicas registradas: " + Sistema.listaClinicas.size());
        System.out.println("Pacientes NO trasladados: " + Sistema.noTrasladados.size());

        if (!Sistema.noTrasladados.isEmpty()) {
            System.out.println("Lista de pacientes no trasladados:");
            for (Paciente p : Sistema.noTrasladados) {
                System.out.println("- " + p.nombre);
            }
        }
    }
}
