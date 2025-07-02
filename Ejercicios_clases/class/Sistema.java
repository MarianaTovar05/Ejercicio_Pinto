import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sistema {
    public static List<Conductor> listaConductores = new ArrayList<>();
    public static List<Paciente> listaPacientes = new ArrayList<>();
    public static List<Muerto> listaMuertos = new ArrayList<>();
    public static List<Carro> listaVehiculos = new ArrayList<>();
    public static List<Clinica> listaClinicas = new ArrayList<>();
    public static List<Paciente> noTrasladados = new ArrayList<>();

    Scanner teclado = new Scanner(System.in);

    public void registrarConductores() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese datos del conductor " + (i + 1));
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
            System.out.println("Ingrese datos del muerto " + (i + 1));
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
        Conductor conductorFunebre = listaConductores.get(7); // arbitrario
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

    public void registrarClinicas() {
        listaClinicas.add(new Clinica(1, "Clínica La Rosita", 55));
        listaClinicas.add(new Clinica(2, "Clínica Pedro Pony", 35));
        listaClinicas.add(new Clinica(3, "Clínica MC", 45));
        System.out.println("Clínicas registradas con éxito.");
    }

    public void solicitarTrasladoPaciente(Clinica clinica, Paciente paciente) {
        double distancia = clinica.getDistanciaKm();
        boolean trasladado = false;

        for (Conductor conductor : listaConductores) {
            if (conductor.puedeHacerRecorrido() && conductor.puedeHacerKm(distancia)) {
                conductor.incrementarRecorrido();
                conductor.sumarKm(distancia);
                System.out.println("Paciente " + paciente.nombre + " fue trasladado por " + conductor.nombre + " a " + clinica.nombre);
                trasladado = true;
                break;
            }
        }

        /*if (!trasladado) {
            noTrasladados.add(paciente);
            System.out.println("NO se pudo trasladar al paciente: " + paciente.nombre);
        }*/
    }

    public void solicitarTrasladoMuerto(Clinica clinica, Muerto muerto) {
        double distancia = 15;
        boolean trasladado = false;

        for (Conductor conductor : listaConductores) {
            if (conductor.puedeHacerRecorrido() && conductor.puedeHacerKm(distancia)) {
                conductor.incrementarRecorrido();
                conductor.sumarKm(distancia);
                System.out.println("Muerto " + muerto.nombre + " fue trasladado por " + conductor.nombre
                        + " desde " + clinica.getNombre() + " a la Funeraria.");
                trasladado = true;
                break;
            }
        }

       /* if (!trasladado) {
            System.out.println("NO se pudo trasladar al muerto: " + muerto.nombre);
        } */
    }

    public void trasladoSolicitadoPorClinicaPacientes() {
        if (listaClinicas.isEmpty() || listaPacientes.isEmpty()) {
            System.out.println("No hay clínicas o pacientes disponibles.");
            return;
        }

        for (Paciente paciente : listaPacientes) {
            Clinica clinica = seleccionarClinica(paciente.getId());
            solicitarTrasladoPaciente(clinica, paciente);
        }
    }

    public void trasladoSolicitadoPorClinicaMuertos() {
        if (listaClinicas.isEmpty() || listaMuertos.isEmpty()) {
            System.out.println("No hay clínicas o muertos disponibles.");
            return;
        }

        int i = 0;
        for (Muerto muerto : listaMuertos) {
            Clinica clinica = listaClinicas.get(i % listaClinicas.size());
            solicitarTrasladoMuerto(clinica, muerto);
            i++;
        }
    }

    public Clinica seleccionarClinica(int idPaciente) {
        return listaClinicas.get(idPaciente % listaClinicas.size());
    }

    public void mostrarNoTrasladados() {
        System.out.println("✘ PACIENTES NO TRASLADADOS:");
        for (Paciente p : noTrasladados) {
            System.out.println("- " + p.nombre);
        }
    }
}

