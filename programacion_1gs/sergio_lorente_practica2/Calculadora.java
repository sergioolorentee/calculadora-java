package programacion_1gs.sergio_lorente_practica2;

import java.util.Scanner;

/**
 * Clase principal de la práctica.
 * Muestra un menú con varias operaciones y le pide al usuario que elija una.
 * Las operaciones en sí están hechas en la clase Operaciones.
 */
public class Calculadora {

    public static void main(String[] args) {
        // Creo el Scanner para leer lo que escribe el usuario por teclado
        Scanner input = new Scanner(System.in);

        // Empiezo la opción en 1 para que entre al menos una vez en el bucle
        int opcion = 1;

        // El menú se repite hasta que el usuario elija 0 (Apagar)
        while (opcion != 0) {
            // Muestro el menú de opciones
            System.out.println("MENU DE OPERACIONES");
            System.out.println("===================");
            System.out.println("0. Apagar");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicar");
            System.out.println("4. División");
            System.out.println("5. Resto");
            System.out.println("6. Suma de cifras");
            System.out.println("7. Extraer cifra");
            System.out.println("8. ¿Es primo?");
            System.out.println("9. Factorial");
            System.out.println("10. MCD");
            System.out.print("Elige una opción [0 - 10]: ");

            // Leo la opción que ha elegido el usuario
            opcion = input.nextInt();

            // Según la opción, pido los números que hagan falta
            // y llamo al metodo correspondiente de la clase Operaciones
            if (opcion == 1) {
                // SUMA: pido dos números y los sumo
                System.out.print("Ingresa un numero entero: ");
                int n1 = input.nextInt();
                System.out.print("Ingresa otro numero entero: ");
                int n2 = input.nextInt();
                int resultadoSuma = Operaciones.suma(n1, n2);
                System.out.println("Suma: " + resultadoSuma);
            } else if (opcion == 2) {
                // RESTA: pido dos números y resto el segundo al primero
                System.out.print("Ingresa un numero entero: ");
                int n1 = input.nextInt();
                System.out.print("Ingresa otro numero entero: ");
                int n2 = input.nextInt();
                int resultadoResta = Operaciones.resta(n1, n2);
                System.out.println("Resta: " + resultadoResta);
            } else if (opcion == 3) {
                // MULTIPLICAR: pido dos números y los multiplico
                System.out.print("Ingresa un numero entero: ");
                int n1 = input.nextInt();
                System.out.print("Ingresa otro numero entero: ");
                int n2 = input.nextInt();
                int resultadoMultiplicar = Operaciones.multiplicar(n1, n2);
                System.out.println("Multiplicación: " + resultadoMultiplicar);
            } else if (opcion == 4) {
                // DIVISIÓN: pido dos números y divido el primero entre el segundo
                // (es división entera, así que se pierden los decimales)
                System.out.print("Ingresa un numero entero: ");
                int n1 = input.nextInt();
                System.out.print("Ingresa otro numero entero: ");
                int n2 = input.nextInt();
                int resultadoDivision = Operaciones.division(n1, n2);
                System.out.println("División: " + resultadoDivision);
            } else if (opcion == 5) {
                // RESTO: pido dos números y saco el resto de dividirlos
                System.out.print("Ingresa un numero entero: ");
                int n1 = input.nextInt();
                System.out.print("Ingresa otro numero entero: ");
                int n2 = input.nextInt();
                int resultadoResto = Operaciones.resto(n1, n2);
                System.out.println("Resto: " + resultadoResto);
            } else if (opcion == 6) {
                // SUMA DE CIFRAS: pido un número y sumo todas sus cifras
                System.out.print("Ingresa un numero entero: ");
                int n1 = input.nextInt();
                int resultadoSumaCifras = Operaciones.suma_cifras(n1);
                System.out.println("Suma de cifras: " + resultadoSumaCifras);
            } else if (opcion == 7) {
                // EXTRAER CIFRA: pido un número y la posición de la cifra que quiero
                // (la posición empieza en 1, contando desde la izquierda)
                System.out.print("Ingresa un numero entero: ");
                int n1 = input.nextInt();
                System.out.print("¿Qué posición de cifra quieres extraer?: ");
                int posicion = input.nextInt();
                int resultadoExtraerCifra = Operaciones.extraer_crifra(n1, posicion);
                System.out.println("Cifra extraída: " + resultadoExtraerCifra);
            } else if (opcion == 8) {
                // ¿ES PRIMO?: pido un número y muestro true si es primo o false si no
                System.out.print("Ingresa un numero entero: ");
                int n1 = input.nextInt();
                boolean resultadoEsPrimo = Operaciones.numeros_primos(n1);
                System.out.println("¿Es primo?: " + resultadoEsPrimo);
            } else if (opcion == 9) {
                // FACTORIAL: pido un número y calculo su factorial (n! = n * (n-1) * ... * 1)
                System.out.print("Ingresa un numero entero: ");
                int n1 = input.nextInt();
                int resultadoFactorial = Operaciones.numero_factorial(n1);
                System.out.println("Factorial: " + resultadoFactorial);
            } else if (opcion == 10) {
                // MCD: pido dos números y calculo su máximo común divisor
                System.out.print("Ingresa un numero entero: ");
                int n1 = input.nextInt();
                System.out.print("Ingresa otro numero entero: ");
                int n2 = input.nextInt();
                int resultadoMCD = Operaciones.mcd(n1, n2);
                System.out.println("MCD: " + resultadoMCD);
            } else if (opcion >= 11) {
                // Si el usuario mete una opción que no está en el menú, le aviso
                String fake = "Opcion no válida";
                System.out.println(fake);
            }
        }

        // Cuando sale del bucle es porque ha elegido 0, así que apago la calculadora
        System.out.print("Calculadora apagada... ");
    }
}