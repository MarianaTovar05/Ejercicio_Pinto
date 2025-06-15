
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sistema {
    public static List<Conductor> listaConductores = new ArrayList<>();
    public static List<Paciente> listaPacientes = new ArrayList<>();
    public static List<Muerto> listaMuertos = new ArrayList<>();
    public static List<Carro> listaVehiculos = new ArrayList<>();

    Scanner teclado = new Scanner(System.in);

    public void registrarConductores() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese nombre del conductor " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = teclado.next();
            System.out.print("Apellido: ");
            String apellido = teclado.next();
            System.out.print("Celular: ");
            String celular = teclado.next();
            listaConductores.add(new Conductor(nombre, apellido, celular));
        }
        System.out.println("Se registraron los 10 conductores.");
    }

    public void registrarPacientes() {
        String[] nombres = {"Juan", "Ana", "Pedro", "Laura", "Luis", "Sofía", "Carlos", "María", "José", "Elena"};
        String[] apellidos = {"Gómez", "Pérez", "Rodríguez", "Martínez", "López", "Hernández", "Ramírez", "Torres", "Sánchez", "Díaz"};
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            String nombreAleatorio = nombres[random.nextInt(nombres.length)];
            String apellidoAleatorio = apellidos[random.nextInt(apellidos.length)];
            String celular = "3" + String.format("%09d", random.nextInt(1000000000));
            listaPacientes.add(new Paciente(nombreAleatorio, apellidoAleatorio, celular));
        }

        System.out.println("Se generaron 100 pacientes aleatoriamente.");
    }

    public void registrarMuertos() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Ingrese nombre del muerto " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = teclado.next();
            System.out.print("Apellido: ");
            String apellido = teclado.next();
            System.out.print("Celular: ");
            String celular = teclado.next();
            listaMuertos.add(new Muerto(nombre, apellido, celular));
        }
        System.out.println("Se registraron los 15 muertos.");
    }

    public void asignarVehiculos() {
        for (int i = 0; i < 10; i++) {
            Carro ambulancia = new Carro("Ambulancia", i + 1);
            Conductor conductor = listaConductores.get(i);
            ambulancia.asignarConductor(conductor);
            listaVehiculos.add(ambulancia);
        }

        Carro carroFunebre = new Carro("Carro Fúnebre", 1);
        Conductor conductorFunebre = listaConductores.get(7); 
        carroFunebre.asignarConductor(conductorFunebre);
        listaVehiculos.add(carroFunebre);

        System.out.println("Vehículos asignados correctamente.");
    }

    public void asignarPacientesAConductores() {
        int totalConductores = listaConductores.size();
        int indexConductor = 0;

        for (Paciente paciente : listaPacientes) {
            Conductor conductor = listaConductores.get(indexConductor);
            conductor.asignarPaciente(paciente);
            indexConductor = (indexConductor + 1) % totalConductores;
        }
        System.out.println("Pacientes asignados equitativamente a los conductores.");
    }
}
