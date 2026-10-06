package programacion_1gs.tarea2;

import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica un numero del 1 al 10:");
        int x = entrada.nextInt();

        int i = 1;
        while(i <= 10){
            System.out.println(x + "X" + i + "=" + (x*i));
            i++;
        }

    }
}
