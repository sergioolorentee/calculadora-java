package programacion_1gs.sergio_lorente_practica1;

import java.util.Scanner;

/**
 * Vamos a crear un programa que pedira el la consola nos pedira por pantalla indicar una edad
 * y si es menor de 18 años nos pedira seguir probando de lo cotrario nos indicara que somos mayor de edad.
 */
public class Ejercicio1 {

    /**
     * Hemos creado un Scanner para poner la edad por consola y dos varibles que son bolean e int una para que
     * si la edad es menor se siga repitiendo el bucle y la otra para la edad que ponemos.
     *
     */
    public static void main(String[] args) {
        boolean encontrado = false;
        Scanner entrada = new Scanner(System.in);
        while(encontrado == false) {
            System.out.print("Indica la edad de una persona: ");
            int n = entrada.nextInt();
            if(n >= 18) {
                encontrado = true;
                System.out.println("¡Ohhh eres mayor de edad...!");
            }else {
                System.out.println("Sigue probando con otra edad... ");
            }
        }
    }
}