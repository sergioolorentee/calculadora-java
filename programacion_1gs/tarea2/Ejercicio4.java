package programacion_1gs.tarea2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int i = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica el primer numero entero:");
        int x = entrada.nextInt();

        System.out.println("Indica el segundo numero entero:");
        int y = entrada.nextInt();

        if (x < y) {
            i = x;
            while (i < y - 1) {
                i++;
                System.out.println(i);

            }
        } else if (y < x) {
            i = y;
            while (i < x - 1) {
                i++;
                System.out.println(i);
            }
        } else if (x == y) {
            System.out.println("Los numeros son iguales");
        }
    }

}
