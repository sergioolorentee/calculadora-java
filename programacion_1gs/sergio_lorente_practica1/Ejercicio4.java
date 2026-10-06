package programacion_1gs.sergio_lorente_practica1;

import java.util.Scanner;

/**
 * En esta clase nos pediran un numero multiplo de 10, y la consola imprimira cuantos billetes tendremos que retirar
 * del cajero.
 */
public class Ejercicio4 {

    /**
     * En este programa utilizaremos un Scanner para escribir por consola un numero multiplo de 10, una vez escribamos
     * por consola el numero multiplo de 10, con el uso de varias varibles definidas mediante formulas matematicas
     * calcularemos los billetes necesarios de 50,20 y 10 euros con divisiones y restos. Finalmente lo imprime de forma
     * visualmente atractiva cuantos billetes tienes que retirar de cada cantidad.
     *
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Inserte la cantidad de efectivo a retirar (MULTIPLO de 10):  ");
        int cantidad = entrada.nextInt();
        int billetes50 = cantidad/50;
        int dinero_restante = cantidad%50;
        int billetes20 = dinero_restante/20;
        int dinero_restante2 = dinero_restante%20;
        int billetes10 = dinero_restante2/10;

        System.out.println(" Billetes              Euros");
        System.out.println("==========            =======");
        System.out.println(("   ") + billetes50 +   ("                    50 "));
        System.out.println(("   ") + billetes20 +   ("                    20 "));
        System.out.println(("   ") + billetes10 +   ("                    10 "));

    }
}
