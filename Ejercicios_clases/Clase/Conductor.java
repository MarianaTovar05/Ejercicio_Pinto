
import java.util.ArrayList;
import java.util.List;

class Conductor extends Persona {
    boolean asignado;
     List<Paciente> pacientesAsignados = new ArrayList<>();

    public Conductor(String nombre, String apellido, String celular) {
        super(nombre, apellido, celular);
        this.asignado = false;
    }
     public void asignarPaciente(Paciente p) {
        pacientesAsignados.add(p);
    }
}