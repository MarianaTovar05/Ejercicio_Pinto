public class Carro {
    public String tipo;
    public int numero;
    public Conductor conductor;

    public Carro(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public void asignarConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public String getInfo() {
        return tipo + " #" + numero + " - Conductor: " + conductor.nombre;
    }
}

