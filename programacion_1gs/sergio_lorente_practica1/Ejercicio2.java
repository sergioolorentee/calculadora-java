package programacion_1gs.sergio_lorente_practica1;

import java.util.Scanner;
/**
 * Vamos a hacer un programa en el que el programa se invente un numero aleatorio del 1 al 20 y una vez lo defina
 * nosotros iremos probando numeros y la consola nos dira si es mayor o menor. Si acertamos nos indicara por consola
 * acertaste.
 */
public class Ejercicio2 {

    /**
     * En este programa vamos a definir una varible int con un libreria que genera numeros aleatorios (Math.random),
     * despues generaremos un bucle while en la que tenga un Scanner para poder escribir por consola un numero.
     * Mediante if/else if la consola nos dira por pantalla si el numero que hemos escrito por consola es mayor o menor
     * al numero que definimos en la variable con la libreia de numeros aleatorios. Si el numero del Scanner es igual
     * al de la variable numero saldra que acertamos.
     *
     */
    public static void main(String[] args) {
        int numero = (int) (Math.random() * 20);
        boolean encontrado = false;
        Scanner entrada = new Scanner(System.in);
        while(encontrado == false) {
            System.out.print("Indica la edad de una persona: ");
            int n = entrada.nextInt();
            if(n == numero) {
                encontrado = true;
                System.out.println("Acertaste.");
            } else if (n < numero) {
                System.out.println("El numero es mayor ");
            } else if (n > numero) {
                System.out.println("El numero es menor ");
            }

            }
        }
    }




