import java.util.ArrayList;
import java.util.List;

public class Conductor extends Persona {
    public int cantidadRecorridos = 0;
    public double kmRecorridos = 0;
    public List<Paciente> pacientesAsignados = new ArrayList<>();

    public Conductor(String nombre, String apellido, String celular) {
        super(nombre, apellido, celular);
    }

    public void asignarPaciente(Paciente paciente) {
        pacientesAsignados.add(paciente);
    }

    public boolean puedeHacerRecorrido() {
        return cantidadRecorridos < 8;
    }

    public boolean puedeHacerKm(double km) {
        return (kmRecorridos + km) <= 400;
    }

    public void incrementarRecorrido() {
        cantidadRecorridos++;
    }

    public void sumarKm(double km) {
        kmRecorridos += km;
    }
}
