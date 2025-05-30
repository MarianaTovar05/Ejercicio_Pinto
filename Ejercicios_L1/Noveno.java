import java.util.Scanner;

public class Noveno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int AN;
        int AA;
        int E;

        System.out.print("Año de nacimiento: ");
        AN = scanner.nextInt();

        System.out.print("Año actual: ");
        AA = scanner.nextInt();

        E = AA - AN;
        System.out.println("Edad: " + E);

        if (E >= 17) {
            System.out.println("Debe solicitar su CUIL");
        } else {
            System.out.println("No debe solicitar su CUIL aún");
        }

        scanner.close();
    }
}