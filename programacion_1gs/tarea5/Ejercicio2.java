package programacion_1gs.tarea5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero con decimal: ");
        double n1 = sc.nextDouble();
        System.out.print("Ingrese el numero con decimal: ");
        double n2 = sc.nextDouble();

        if (n1 >= 0 && n1 <= 1 && n2 <= 1 && n2 >= 0){
            System.out.print("Los numeros es correcto el rango de los numeros");
        } else {
            System.out.print("Los numeros no son correctos");
        }
    }
}
