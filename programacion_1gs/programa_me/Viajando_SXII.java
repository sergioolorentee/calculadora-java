package programacion_1gs.programa_me;

import java.util.Scanner;

public class Viajando_SXII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el numero de casos: ");
        int n = input.nextInt();
        int i = 0;
        while (i < n){
            System.out.print("Ingresa cuantas personas viajan por tipo1 interior de viaje: ");
            int n1 = input.nextInt();
            System.out.print("Ingresa cuantas personas viajan por tipo1 exterior de viaje: ");
            int n2 = input.nextInt();
            System.out.print("Ingresa cuantas personas viajan por tipo2 interior de viaje: ");
            int n3 = input.nextInt();
            System.out.print("Ingresa cuantas personas viajan por tipo2 exterior de viaje: ");
            int n4 = input.nextInt();

            int suma_peniques = (n1 * 12) + (n2 * 9) + (n3 * 18) + (n4 * 12);
            int libras = (suma_peniques / 240);
            int resto_libras = (suma_peniques % 240);
            int chelin = (resto_libras / 12);
            int resto_chelin = (resto_libras % 12);
            int penique = (resto_chelin);


            System.out.println(libras + "  " + chelin + "  " + penique);
            i++;
        }

    }
}
