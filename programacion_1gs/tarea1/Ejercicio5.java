package programacion_1gs.tarea1;
/**
 *
 */

import java.util.Scanner;
public class Ejercicio5 {
    /**
     *
     */
    public static int preguntar1(String mensaje1) {
        System.out.print(mensaje1);
        Scanner entrada1 = new Scanner(System.in);
        return entrada1.nextInt();
    }

    public static int preguntar2(String mensaje2) {
        System.out.print(mensaje2);
        Scanner entrada2 = new Scanner(System.in);
        return entrada2.nextInt();
    }

    public static void main(String[] argumentos) {
        int x = preguntar1("Numero entero 1: ");
        int y = preguntar2("Número entero 2: ");
        System.out.println("x+y=  " + (x + y));
        System.out.println("x-y=  " + (x - y));
        System.out.println("x*y=  " + (x * y));
        System.out.println("x/y=  " + ((double) x / y));
        System.out.println("x%y=  " + (x % y));

    }
}
