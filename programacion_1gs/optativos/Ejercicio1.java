package programacion_1gs.optativos;

import java.util.Scanner;

public class Ejercicio1 {

    public static String producto(String mensaje1) {
        System.out.print(mensaje1);
        Scanner entrada1 = new Scanner(System.in);
        return entrada1.nextLine();
    }

    public static double precio(String mensaje2) {
        System.out.print(mensaje2);
        Scanner entrada2 = new Scanner(System.in);
        return entrada2.nextDouble();
    }

    public static int cantidad(String mensaje3) {
        System.out.print(mensaje3);
        Scanner entrada3 = new Scanner(System.in);
        return entrada3.nextInt();
    }

    public static void main(String[] args){
        String nombre = producto("¿Que producto vas a comprar? :");
        double precio = precio("¿Cuanto cuesta el producto? :");
        int cantidad = cantidad("¿Cuanta cantidad deseas comprar? :");
        System.out.println(" ");
        System.out.println("TICKET REDUCIDO DE LA COMPRA");
        System.out.println("===================================");
        System.out.println("PRODUCTO: " + nombre);
        System.out.println("CANTIDAD: " + cantidad);
        System.out.println("PRECIO UNITARIO SIN IVA: " + precio + "€");
        System.out.println("PRECIO SIN IVA DE LA COMPRA: " + (cantidad*precio) + "€");
        System.out.println("PRECIO DE LA COMPRA CON IVA INCLUIDO: " + ((cantidad*precio) * 1.21 ) + "€");


    }
}
