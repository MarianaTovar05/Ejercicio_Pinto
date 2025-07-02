import java.util.Scanner;

public class arreglito {
    public static void main(String[] args) {

        int[] numero1 = new int[10];
        int[] numero2 = new int[10];
        int[] resultado = new int[10];
        int x=1;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite valor para Posición" + (i + 1) + ":" );
            numero1[i] = teclado.nextInt();
            if (numero1[i]>10) {
                do{
                System.out.print("Digite valor para Posición " + (i + 1) + ":" );
                numero1[i] = teclado.nextInt();  
                if (numero1[i]<10) {
                    x=1;
                }
                }while(x==0);
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite valor para Posición " + (i + 1) + ": ");
            numero2[i] = teclado.nextInt();
        }

        
        for (int i = 0; i < 10; i++) {
            resultado[i] = numero1[i] + numero2[i];
        }
       
        for (int i = 0; i < 10; i++) {
            System.out.println(resultado[i]);
        }

        teclado.close(); 
    }
}

