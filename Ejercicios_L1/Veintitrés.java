public class Veintitrés {

    public static void main(String[] args) {
        int Q, R;

        for (int K = 1; K <= 10; K++) {
            Q = K / 2;
            R = K - (Q * 2);

            if (R == 0) {
                continue;
            }

            System.out.println("Contador: " + K);
            System.out.println("Cociente: " + Q);
            System.out.println("Residuo: " + R);
        }
    }
}