package programacion_1gs.sergio_lorente_practica2;

/**
 * En esta clase tengo todos los métodos que hacen las operaciones de la calculadora.
 * Todos son static para poder llamarlos directamente desde Calculadora
 * sin tener que crear un objeto (por ejemplo: Operaciones.suma(3, 4)).
 */
public class Operaciones {

    /**
     * Devuelve la suma de los dos números
     */
    public static int suma(int n1, int n2){
        return n1 + n2;
    }

    /**
     * Devuelve la resta del primer número menos el segundo
     */
    public static int resta(int n1, int n2){
        return n1 - n2;
    }

    /**
     *  Devuelve la multiplicación de los dos números
     */
    public static int multiplicar(int n1, int n2){
        return n1 * n2;

    }

    /**
     * Devuelve la división entera del primer número entre el segundo
     * (como trabajo con int, si sale 7/2 el resultado es 3, sin decimales)
     */
    public static int division(int n1, int n2){
        return n1 / n2;

    }

    /**
     *    Devuelve el resto de dividir el primer número entre el segundo
     *    (por ejemplo 7 % 2 = 1)
     */

    public static int resto(int n1, int n2){
        return n1 % n2;

    }

    /**
     * Suma todas las cifras de un número. Ejemplo: 123 -> 1 + 2 + 3 = 6
     */
    public static int suma_cifras(int n1){
        int suma = 0;
        while (n1 != 0) {
            int cifra = n1 % 10;   // con % 10 saco la última cifra
            suma = suma + cifra;   // la sumo al total
            n1 = n1 / 10 ;         // con / 10 quito la última cifra
        } return suma;
    }

    /**
     *  Devuelve la cifra que está en la posición n2 (empezando por 1 desde la izquierda)
     *  Ejemplo: n1 = 4825, n2 = 2 -> devuelve 8
     */
    public static int extraer_crifra(int n1, int n2){
        String s = "" + n1;
        String cifra_extraida = s.substring(n2-1, n2);
        return Integer.parseInt(cifra_extraida);
    }

    /**
     *   Comprueba si un número es primo (solo se puede dividir entre 1 y él mismo)
     *   Devuelve true si es primo y false si no lo es
     */
    public static boolean numeros_primos(int n1){
        if (n1 < 2){
            return false;
        }
        for (int i = 2; i < n1; i++){
            if (n1 % i == 0){
                return  false;
            }
        }
        return true;
    }

    /**
     * Calcula el factorial de un número. Ejemplo: 5! = 5 * 4 * 3 * 2 * 1 = 120
     */
    public static int numero_factorial(int n1){
        int factorial = 1;   // empiezo en 1 porque si empiezo en 0 todo daría 0
        for (int i = n1; i >= 1; i--){
            factorial = factorial * i;
        } return factorial;
    }

    /**
     * Calcula el máximo común divisor (el número más grande que divide a los dos)
     * Ejemplo: mcd(12, 18) = 6
     */
    public static int mcd(int n1, int n2) {
        for (int i = n1; i >= 1; i--){
            if (n1 % i == 0 && n2 % i == 0){
                return  i;
            }
        }
        return 1;
    }
}
