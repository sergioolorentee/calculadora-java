package programacion_1gs.sergio_lorente_practica1;

import java.util.Scanner;

/**
 * En esta clase la consola nos va a pedir por pantalla una fecha de año mes y dia y nosotros tendremos que trasladarla
 * de 20070607 a -> 2007/6/7 de esta manera quedara bien maquetado y visual
 */
public class Ejercicio3 {

    /**
     * En este programa utilizaremos un Scanner en el que nos pediran la fecha sin maquetar, seguidamente utilizando
     * algunas varibles int ya que siempre seran numeros enteros calcularemos mediante la division y restos (Año/Mes/
     * Fecha), una vez calculados pediremos que saque por pantalla la fecha bien maquetada.
     *
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el la fecha de la opcion: ");
        int fecha = entrada.nextInt();
        int año = fecha/10000;
        int mes_dia = fecha%10000;
        int mes = mes_dia/100;
        int dia = mes_dia%100;
        System.out.println("La fecha de la opcion es: "+ año + "/" + mes + "/" + dia);
    }
}
