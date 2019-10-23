/**
 * Se ordena por pares y se va repitiendo 1 a 1 hasta que queda totalmente ordenado,
 * es muy iterativo, poco eficiente (por la cantidad de iteraciones), pero muy sencillo
 * de ejecutar.
 * 1.- Comenzamos a hacer la comparación de elementos adyacentes.
 * 2.- Repetimos hasta tener una pasada completa sin ningún 'swap'.
 * */

package searching_and_sorting_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {

    Integer temp;

    /**
     * @param arrayList es el array que se pasará por parámetro para ser ordenado.
     * @param arraySize es la cantidad de espacios en memoria que contiene el array.
     *
     * <h1>bubbleSort()</h1>
     * Éste método se encarga de ordenar un array que es pasado por parámetro.
     * Utiliza una variable temporal/auxiliar para almacenar el dato que será intercambiado.
     * */
    public void bubbleSort(ArrayList<Integer> arrayList, int arraySize) {
        for (int i=1; i<= arraySize-1; i++){
            for (int j=0; j<= arraySize-i-1; j++) {
                if (arrayList.get(j) > arrayList.get(j+1)) {
                    temp = arrayList.get(j);
                    arrayList.set(j,arrayList.get(j+1));
                    arrayList.set(j+1,temp);
                }
            }
        }
        System.out.println();
        System.out.print("[");
        printBubbleSort(arrayList, arraySize);
        System.out.print("]");
    }

    public void reversedBubbleSort(ArrayList<Integer> arrayList, int arraySize){
        for (int i=1; i<=arraySize-1; i++){
            for (int j=0; j <= arraySize-i-1; j++){
                if (arrayList.get(j) < arrayList.get(j+1)) {
                    temp = arrayList.get(j);
                    arrayList.set(j,arrayList.get(j+1));
                    arrayList.set(j+1,temp);
                }
            }
        }
        System.out.println();
        System.out.print("[");
        printBubbleSort(arrayList, arraySize);
        System.out.print("]");
    }

    public void printBubbleSort(ArrayList<Integer> arrayList, int arraySize){
        for (int i=0; i<arraySize;i++){
            System.out.print(arrayList.get(i) + ",");
        }
    }

    public void mainBubbleSort() {
        /*Declaración de variables*/
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayBubble = new ArrayList();
        int tamanoArray;
        int datoArray;

        System.out.println("¿Cuántos elementos tendrá tu arreglo de datos?");
        tamanoArray = scanner.nextInt();

        for (int i=0; i<tamanoArray; i++) {
            System.out.print("Ingresa un número: ");
            System.out.println();
            arrayBubble.add(datoArray = scanner.nextInt());
        }

        System.out.print("El array quedó de la siguiente manera: [");
        for (int i=0; i<tamanoArray; i++){
            System.out.print(arrayBubble.get(i) + ", ");
        }

        System.out.print("]");
        System.out.println();
        System.out.println("El array ordenado queda de la siguiente manera:");
        //bubbleSort(arrayBubble,tamanoArray);
        reversedBubbleSort(arrayBubble,tamanoArray);
    }

}
