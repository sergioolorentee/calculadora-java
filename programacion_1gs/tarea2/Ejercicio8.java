package programacion_1gs.tarea2;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
            int i = 0;
            while (i < 10) {
                Scanner entrada = new Scanner(System.in);
                System.out.println("Introduce numero:");
                int x = entrada.nextInt();

                System.out.println((x-1) + " < " + x + " < " + (x+1));
                i++;

            }
        }
    }
