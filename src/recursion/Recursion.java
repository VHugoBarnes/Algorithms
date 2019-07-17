package recursion;

/**
 * <h1>¿Qué es la recursión?</h1>
 *
 * El proceso por el cual una función se llama a sí misma directa o indirectamente se
 * llama 'recursión' y la función correspondiente es llamada 'función recursiva'.
 * Al usar un algoritmo de recursión, ciertos problemas pueden ser resueltos más fácil.
 * Ejemplos de éstos problemas son:
 * 1.- Las torres de Hanoi.
 * 2.- Recorrido de árboles inorden, preorden, postorden.
 * 3.- El factorial de un número.
 *
 * <h1>¿Qué es la condición base en recursión?</h1>
 *
 * En el programa recursivo, se proporciona la solución al caso base y la solución del
 * problema más grande se expresa en términos de problemas más grandes.
 *
 *
 * <h1>¿Cómo un problema en particular es resuelto usando la recursividad?</h1>
 * La idea es presentar el problema en términos de uno o más problemas pequeños y añadir
 * uno o más casos base para detener la recursión. Por ejemplo: calculamos el factorial
 * 'n' si sabemos el factorial de 'n-1'. El caso base sería que n=0. Devolvemos 1 cuando
 * n =0.
 * */
public class Recursion {

    /**
     * <h1>Factorial de un número</h1>
     *En ésta función, el caso base es que el numero factorial sea menor o igual que 1.
     * La solución al problema 'más grande' puede ser resuelto convirtiendo el número
     * a un número más pequeño (de 1 en 1) hasta que se llegue al caso base.
     * */
    public int factorial(int factorialNumber) {

        if (factorialNumber <= 1) { // <-- Caso base.
            return 1;
        } else {
            return factorialNumber * factorial(factorialNumber-1);
        }

    }

}
