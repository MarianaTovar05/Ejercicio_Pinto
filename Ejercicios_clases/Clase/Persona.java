
public class Persona { 
    String nombre;
    String apellido;
    String celular;
    public Persona(String nombre, String apellido, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }

    public String toString() {
        return nombre + " " + apellido + " | Cel: " + celular;
    }
}
