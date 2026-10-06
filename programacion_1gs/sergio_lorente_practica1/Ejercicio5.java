package programacion_1gs.sergio_lorente_practica1;

import java.util.Scanner;

/**
 * En este programa daremos un numero entero entre el 1 al 10 y lo transcribira a numeros romanos.
 */
public class Ejercicio5 {

    /**
     * En esta clase utilizaremos un Scanner que nos pedira por consola que escribamos un numero del 1 al 10, cuando
     * nosotros se lo demos por consola el programa mediante la varible int que queda definida con el numero que demos
     * buscara en if/else if el numero que tenga esa condicion y los transcribira automaticamente.
     *
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero del 1 al 10 : ");
        int numero = entrada.nextInt();

        if(numero == 1){
            System.out.println("1 = I");
        }else if(numero == 2){
            System.out.println("2 = II");
        }else if(numero == 3){
            System.out.println("3 = III");
        } else if (numero == 4) {
            System.out.println("4 = IV");
        } else if (numero == 5) {
            System.out.println("5 = V");
        } else if (numero == 6) {
            System.out.println("6 = VI");
        }else if (numero == 7) {
            System.out.println("7 = VII");
        }else if (numero == 8) {
            System.out.println("8 = VIII");
        }else if (numero == 9) {
            System.out.println("9 = IX");
        }else if (numero == 10) {
            System.out.println("10 = X");
        }
    }
}
