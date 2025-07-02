public class Clinica {
    public int id;
    public String nombre;
    public double distanciaKm;
    
    public Clinica(int id, String nombre, double distanciaKm) {
        this.id = id;
        this.nombre = nombre;
        this.distanciaKm = distanciaKm;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public double getDistanciaKm() {
        return distanciaKm;
    }
    public String toString() {
        return "Clínica " + nombre + " (" + distanciaKm + " km)";
    }
}


