public class Paciente extends Persona {
    public static int contador = 0;
    public int id;

    public Paciente(String nombre, String apellido, String celular) {
        super(nombre, apellido, celular);
        this.id = contador++;
    }
    public int getId() {
        return id;
    }
}

