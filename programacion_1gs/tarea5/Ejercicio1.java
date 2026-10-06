package programacion_1gs.tarea5;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese un numero entero: ");
        int n2 = sc.nextInt();
        System.out.print("Ingrese un numero entero: ");
        int n3 = sc.nextInt();
        System.out.print("Ingrese un numero entero: ");
        int n4 = sc.nextInt();

        if (n1 == n2 && n1 == n3 && n1 == n4){
            System.out.print("Los numeros son iguales:" + n1);
        } else  {
            System.out.print("Erroneo");
        }
    }
}
