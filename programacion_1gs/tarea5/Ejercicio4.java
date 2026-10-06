package programacion_1gs.tarea5;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = leer.nextLine();

        int palabra2 = palabra.length();
        System.out.print("La palabra tiene " +  palabra2 + " caracteres");
    }
}



