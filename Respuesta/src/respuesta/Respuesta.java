package respuesta;

import java.util.Scanner;

public class Respuesta {

    public void tablero() {
        Dia_7 saldo_numero_1 = new Dia_7();
        Dia_7 saldo_numero_2 = new Dia_7();

        while (true) {
            System.out.println("===================");
            System.out.println("|1.Mostrar          |");
            System.out.println("|2.Suma             |");
            System.out.println("|2.Resta            |");
            System.out.println("|4.Salir            |");
            System.out.println("===================");
            System.out.println("Ingrese un numero: ");
            Scanner a1 = new Scanner(System.in);
            int respuesta = a1.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.println("Su saldo en la primera cuenta es: " + saldo_numero_1.getSaldo_numero());
                    System.out.println("Su saldo en la segunda cuenta es: " + saldo_numero_2.getSaldo_numero());
                    break;
                case 2:
                    Scanner a2 = new Scanner(System.in);
                    System.out.println("En que cuenta quiere agregar, 1 o 2");
                    int caso = a2.nextInt();
                    if (caso == 1) {
                        Scanner suma = new Scanner(System.in);
                        System.out.println("Ingrese la cantidad a agregar");
                        int cantidad = suma.nextInt();
                        saldo_numero_1.setSaldo_numero(saldo_numero_1.getSaldo_numero() + cantidad);

                    } else {
                        Scanner suma2 = new Scanner(System.in);
                        System.out.println("Ingrese la cantidad a agregar");
                        int cantidad2 = suma2.nextInt();
                        saldo_numero_2.setSaldo_numero(saldo_numero_2.getSaldo_numero() + cantidad2);

                    }
                    break;
                case 3:
                    Scanner r1 = new Scanner(System.in);
                    System.out.println("En que cuenta quiere agregar, 1 o 2");
                    int caso2 = r1.nextInt();
                    if (caso2 == 1) {
                        Scanner suma = new Scanner(System.in);
                        System.out.println("Ingrese la cantidad a agregar");
                        int cantidad_1 = suma.nextInt();
                        saldo_numero_1.setSaldo_numero(saldo_numero_1.getSaldo_numero() - cantidad_1);
                    } else {
                        Scanner suma2 = new Scanner(System.in);
                        System.out.println("Ingrese la cantidad a retirar");
                        int cantidad_2 = suma2.nextInt();
                        saldo_numero_2.setSaldo_numero(saldo_numero_2.getSaldo_numero() - cantidad_2);
                    }
                    break;
                case 4:
                    System.exit(respuesta);
            }

        }
    }

    public static void main(String[] args) {
       Respuesta ta = new Respuesta();
       ta.tablero();
        
    }

}
