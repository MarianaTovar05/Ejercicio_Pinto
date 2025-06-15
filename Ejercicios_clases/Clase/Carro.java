
class Carro {
    String tipo; // Ambulancia o Carro Fúnebre
    int idVehiculo;
    Conductor conductor;

    public Carro(String tipo, int idVehiculo) {
        this.tipo = tipo;
        this.idVehiculo = idVehiculo;
    }

    public void asignarConductor(Conductor c) {
        this.conductor = c;
        c.asignado = true;
    }
    public void asignarPacientesAConductores() {
    int indexConductor = 0;
    for (Paciente p : Sistema.listaPacientes) {
        Conductor c = Sistema.listaConductores.get(indexConductor);
        c.asignarPaciente(p);
        indexConductor = (indexConductor + 1) % 10; // Ronda entre 10 conductores
    }
}
}
