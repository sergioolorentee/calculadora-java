package programacion_1gs.tarea5;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        int contar = palabra.length();
        String palabra2 = palabra.substring(0, contar-1 );
        System.out.print(palabra2);
    }
}
