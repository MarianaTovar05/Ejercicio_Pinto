import java.util.Scanner;
public class segun{
    public static void main(String[] args) {
        Scanner panta = new Scanner(System.in);
        String var;
        int var1 = 0;
        boolean continuar = true;
        do {
            System.out.println("\nDigite el número de cualquier opción (1-23),o 0 para salir:");
            var = panta.nextLine();
            try {
                var1 = Integer.parseInt(var);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                continue;
            }
            if (var1 == 0) {
                continuar = false;
                System.out.println("Programa finalizado.");
                break;
            }
            switch (var1) {
                case 1: {
                    int velocidad, tiempo, distancia;
                    System.out.print("Velocidad constante (m/s): ");
                    velocidad = panta.nextInt();
                    System.out.print("Tiempo (s): ");
                    tiempo = panta.nextInt();
                    distancia = velocidad * tiempo;
                    System.out.println("Distancia Recorrida (m): " + distancia + " metros");
                    break;
                }   case 2:{
                    System.out.print("Primera Nota: ");
                    int nota1 = panta.nextInt();
                    System.out.print("Segunda Nota: ");
                    int nota2 = panta.nextInt();
                    System.out.print("Tercera Nota: ");
                    int nota3 = panta.nextInt();
                    double promedio = (nota1 + nota2 + nota3) / 3;
                    System.out.println("Promedio (P): " + promedio);
                    break;
                    }
                case 3:{
                        System.out.print("Respuestas Correctas: ");
                        int respuestasCorrectas = panta.nextInt();
                        System.out.print("Respuestas Incorrectas: ");
                        int respuestasIncorrectas = panta.nextInt();
                        System.out.print("Respuestas en Blanco: ");
                        int Blanco = panta.nextInt();
                        int puntajeCorrectas = respuestasCorrectas * 4;
                        int puntajeIncorrectas = respuestasIncorrectas * -1;
                        int puntajeFinal = puntajeCorrectas + puntajeIncorrectas+ Blanco;
                        System.out.println("Puntaje por Respuestas Correctas: " + puntajeCorrectas);
                        System.out.println("Penalización por Respuestas Incorrectas: " + puntajeIncorrectas);
                        System.out.println("Puntaje Final: " + puntajeFinal);
                        break;
                } case 4:{
                    System.out.print("Número de Partidos Ganados: ");
                    int PG = panta.nextInt();
                    System.out.print("Número de Partidos Empatados: ");
                    int PE = panta.nextInt();
                    System.out.print("Número de Partidos Perdidos: ");
                    int PP = panta.nextInt();
                    int PPG = PG * 3;
                    int PPE = PE * 1;
                    int PPP = PP * 0;
                    System.out.println("Puntaje de Partidos Ganados: " + PPG);
                    System.out.println("Puntaje de Partidos Empatados: " + PPE);
                    System.out.println("Puntaje de Partidos Perdidos: " + PPP);
                    int PT = PPG + PPE + PPP;
                    System.out.println("Puntaje Total: " + PT);
                    break;
                } case 5:{
                    System.out.print("Horas Laboradas en el mes: ");
                    int hLaboradasPorMes = panta.nextInt();
                    System.out.print("Tarifa por Hora: ");
                    double tarifaPorHora = panta.nextDouble();
                    double planilla = hLaboradasPorMes * tarifaPorHora;
                    System.out.println("Planilla: $" + planilla);
                    break; 
                } case 6:{
                    System.out.print("Longitud del Lado A: ");
                    double LA = panta.nextDouble();
                    System.out.print("Longitud del Lado B: ");
                    double LB = panta.nextDouble();
                    System.out.print("Longitud del Lado C: ");
                    double LC = panta.nextDouble();
                    double LS = (LA + LB + LC) / 2;
                    System.out.println("Longitud del Semiperímetro: " + LS);
                    double AT = Math.sqrt(LS * (LS - LA) * (LS - LB) * (LS - LC));
                    System.out.println("Área del Triángulo: " + AT);
                    break;
                } case 7:{
                    System.out.print("Número de Gigabyte del Disco Duro: ");
                    int GB = panta.nextInt();
                    int MG = GB * 1024;
                    System.out.println("Número de Megabyte del Disco Duro: " + MG);
                    int CD = (int) ((MG / 700.0) + 1);
                    System.out.println("Número de CDs: " + CD);
                    break; 
                } case 8:{
                    System.out.print("Abscisa de A: ");
                    double AA = panta.nextDouble();
                    System.out.print("Ordenada A: ");
                    double OA = panta.nextDouble();
                    System.out.print("Abscisa B: ");
                    double AB = panta.nextDouble();
                    System.out.print("Ordenada B: ");
                    double OB = panta.nextDouble();
                    double D = Math.pow(Math.pow(AB - AA, 2) + Math.pow(OB - OA, 2), 0.5);
                    System.out.println("Distancia: " + D);
                    break;
                } case 9:{
                    int AN,AA,E;
                    System.out.print("Año de nacimiento: ");
                    AN = panta.nextInt();
                    System.out.print("Año actual: ");
                    AA = panta.nextInt();
                    E = AA - AN;
                    System.out.println("Edad: " + E);
                    if (E >= 17) {
                        System.out.println("Debe solicitar su CUIL");
                    } else {
                        System.out.println("No debe solicitar su CUIL aún");
                    }
                    break;
                } case 10:{
                int E1,E2,DE;
                 System.out.print("Edad del primer hermano: ");
                 E1 = panta.nextInt();
                System.out.print("Edad del segundo hermano: ");
                 E2 =panta.nextInt();
                 DE = E1 - E2;
                System.out.println("Diferencia de edad: " + DE + " años");
                if (E1 > E2) {
                System.out.println("El primer hermano es el mayor, por " + DE + " años.");
                } else if (E2 > E1) {
                DE = E2 - E1;
                System.out.println("El segundo hermano es el mayor, por " + DE + " años.");
                } else {
                DE = 0;
                System.out.println("Ambos hermanos tienen la misma edad.");
                 }
                    break;
                } case 11:{
                    int PL, PMa, PMi, PJ, PV, PS,PT;
                    double PP;
                    String MSG;
                    System.out.print("Producción del día Lunes: ");
                    PL = panta.nextInt();
                    System.out.print("Producción del día Martes: ");
                    PMa = panta.nextInt();
                    System.out.print("Producción del día Miércoles: ");
                    PMi = panta.nextInt();
                    System.out.print("Producción del día Jueves: ");
                    PJ = panta.nextInt();
                    System.out.print("Producción del día Viernes: ");
                    PV = panta.nextInt();
                    System.out.print("Producción del día Sábado: ");
                    PS = panta.nextInt();
                    PT = PL + PMa + PMi + PJ + PV + PS;
                    System.out.println("Producción total: " + PT);
                    PP = (double) PT / 6;
                    System.out.println("Promedio de producción: " + PP);
                    if (PP >= 100) {
                        MSG = "Recibirá incentivos.";
                    } else {
                        MSG = "No recibirá incentivos.";
                    }
                    System.out.println(MSG);
                    break;
                } case 12:{
                    int N1, N2, N3;
                    int NM;
                    System.out.print("Primer número entero: ");
                    N1 = panta.nextInt();
                    System.out.print("Segundo número entero: ");
                    N2 = panta.nextInt();
                    System.out.print("Tercer número entero: ");
                    N3 = panta.nextInt();
                    if (N1 > N2 && N1 > N3) {
                        NM = N1;
                    } else {
                        if (N2 > N3) {
                            NM = N2;
                        } else {
                            NM = N3;
                        }
                    }
                    System.out.println("Número mayor: " + NM);
                    break;
                }case 13:{
                int L1, L2, L3;
                String TT;
                System.out.print("Primer lado: ");
                L1 = panta.nextInt();
                System.out.print("Segundo lado: ");
                L2 =panta.nextInt();
                System.out.print("Tercer lado: ");
                L3 = panta.nextInt();
                if (L1 != L2 && L2 != L3 && L1 != L3) {
                TT = "Escaleno";
                } else {
                if (L1 == L2 && L2 == L3) {
                    TT = "Equilátero";
                } else {
                    TT = "Isósceles";
                }}
                System.out.println("Tipo de triángulo: " + TT);
                break;
                }case 14:{
                int NE;
                String ER;
                System.out.print("Número Entero (1 a 10): ");
                NE = panta.nextInt();
                switch (NE) {
                    case 1:
                    ER = "I";
                    break;
                    case 2:
                    ER = "II";
                    break;
                    case 3:
                    ER = "III";
                    break;
                    case 4:
                    ER = "IV";
                    break;
                    case 5:
                    ER = "V";
                    break;
                    case 6:
                    ER = "VI";
                    break;
                    case 7:
                    ER = "VII";
                    break;
                    case 8:
                    ER = "VIII";
                    break;
                    case 9:
                    ER = "IX";
                    break;
                    case 10:
                    ER = "X";
                    break;
                    default:
                    ER = "Número fuera de rango";
                    break;
                    }
                    System.out.println("Equivalente en Romano: " + ER);
                    break;
                }case 15:{
                    double MV;
                    double TB;
                    System.out.print("Monto de venta: ");
                    MV = panta.nextDouble();
                if (MV >= 0 && MV < 1000) {
                    TB = 0;
                } else if (MV >= 1000 && MV < 5000) {
                    TB = (3 * MV) / 100;
                } else if (MV >= 5000 && MV < 20000) {
                    TB = (5 * MV) / 100;
                } else if (MV >= 20000) {
                   TB = (8 * MV) / 100;
                } else {
                   TB = -1; }
                if (TB >= 0) {
                 System.out.println("Total de Bonificación: $" + TB);
                 } else {
                System.out.println("Monto de venta no válido.");
                }
                break;
                }case 16:{
                    int NE;
                    String V;
                    System.out.print("Número entero (1 a 5): ");
                    NE = panta.nextInt();
                    switch (NE) {
                        case 1:
                            V = "A";
                            break;
                        case 2:
                            V = "E";
                            break;
                        case 3:
                            V = "I";
                            break;
                        case 4:
                            V = "O";
                            break;
                        case 5:
                            V = "U";
                            break;
                        default:
                            V = "Valor Incorrecto";
                    }
                    System.out.println("Vocal: " + V);
                    break;
                }case 17:{
                    System.out.print("Número entero de 2 dígitos: ");
                    int NE = panta.nextInt();
                    double D = NE / 10;
                    double U = NE % 10;
                    System.out.println("Número de Decenas: " + D);
                    System.out.println("Número de Unidades: " + U);
                    break;
                }case 18:{
                    int NE;
                    double Q;
                    double R;
                     String MSG;
                      do {
                    System.out.print("Número entero diferente de cero: ");
                    NE = panta.nextInt();
                } while (NE == 0);
                Q = NE / 2;
                R = NE - (Q * 2);
                if (R == 0) {
                MSG = "Es Par";
                } else {
                MSG = "Es Impar";}
                System.out.println("Cociente entero: " + Q);
                System.out.println("Residuo: " + R);
                System.out.println(MSG);
                    break;
                }case 19:{
                    int K;
                     int N;
                     N = 2;
                    for (K = 1; K <= 4; K++) {
                System.out.println("Número: " + N);
                System.out.println("Contador: " + K);
                N = N + 2;}
                break;
                }case 20:{
                    int NE,K;
                    double SE,SS = 0,SP;
                    System.out.print("Número de empleados: ");
                    NE = panta.nextInt();
                    for (K = 1; K <= NE; K++) {
                        System.out.print("Sueldo del empleado " + K + ": ");
                        SE = panta.nextDouble();
                        SS = SS + SE;
                    }
                    SP = SS / NE;
                    System.out.println("Contador: " + K);
                    System.out.println("Suma de sueldos: " + SS);
                    System.out.println("Sueldo promedio: " + SP);
                    break;
                }default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (continuar);
        System.out.println("Programa finalizado.");
        panta.close();
    }
}
