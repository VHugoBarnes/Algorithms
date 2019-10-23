package algorithm_introduction.recursion;

import java.util.Scanner;

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
    private long factorial(int factorialNumber) {

        if (factorialNumber <= 1) { // <-- Caso base.
            return 1;
        } else {
            return factorialNumber * factorial(factorialNumber-1);
        }

    }

    /**
     * <h1>Función directa o indirecta</h1>
     *
     * Una función 'fun1' es llamada directamente si se llama a sí misma.
     *
     * Una función 'fun1' es llamada indirectamente si otra función 'fun2'
     * la llama y ésta la llama de vuelta.
     * */
    class RecursividadDirectaIndirecta {
        //Un ejemplo de recursividad directa.
        public void funcion1() {
            //Código...
            funcion1();
            //Código...
        }

        //Un ejemplo de recursividad indirecta.
        public void funcionIndirecta1() {
            //Código...
            funcionIndirecta2();
            //Código...
        }

        public void funcionIndirecta2() {
            //Código...
            funcionIndirecta1();
            //Código...
        }
    }

    /**
     * <h1>reverseString</h1>
     * Se invierte el contenido del String mediante recursión
     * Ejemplo: "Keko kaka"
     *
     * La primera parte de la algorithm_introduction.recursion y las llamadas anidadas del método.
     *
     * 1.-rts = "eko kaka" + K
     * 2.-rts = "ko kaka" + e
     * 3.-rts = "o kaka" + k
     * 4.-rts = " kaka" + o
     * 5.-rts = "kaka" + " "
     * 6.-rts = "aka" + k
     * 7.-rts = "ka" + a
     * 8.-rts = "a" + k
     * 9.-rts = "" + a
     *
     * La segunda parte del método recursivo.
     * El método topa con el 'if' y la llamada al método más 'alta' se retorna
     * automaticamente.
     *
     * 9.- rts " " + a = a
     * 8.- rts "a" + k = ak
     * 7.- rts "ka" + a = aka
     * 6.- rts "aka" + k = akak
     * 5.- rts "kaka" + ' ' = akak
     * 4.- rts " kaka" + o = akak o
     * 3.- rts "o kaka" + k = akak ok
     * 2.- rts "ko kaka" + e = akak oke
     * 1.- rts "eko kaka" + K = akak okeK
     * */
    private String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            String rts = reverseString(str.substring(1)) + str.charAt(0);
            return rts;
        }
    }

    /***/
    public void recursionMenu() {
        Scanner s = new Scanner(System.in);
        int option = -1;

        System.out.println("Basic recursion problems:");
        System.out.println("1.- Factorial number.");
        System.out.println("2.- Reverse given string.");

        option = s.nextInt();

        switch (option) {
            case 1:
                System.out.println("Give the number to show the factorial:");
                int number = s.nextInt();
                System.out.println(factorial(number));
                break;
            case 2:
                System.out.println("Give the string to reverse it:");
                String reverse = s.nextLine();
                reverse = s.nextLine();
                System.out.println(reverseString(reverse));
                break;
            default:
                System.out.println("Wrong option.");
                break;
        }
    }

}
