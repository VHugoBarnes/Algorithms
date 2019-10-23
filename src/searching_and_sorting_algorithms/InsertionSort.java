package searching_and_sorting_algorithms;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Insertion sort es un algoritmo simple que ordena individualmente cada valor,
 * como lo harías al ordenar un set de cartas del juego UNO en tu mano.
 * */
public class InsertionSort {

    public void insertionSort(ArrayList<Integer> arrayList, int size) {

        int i;
        int currentValue;
        int j;

        for (i= 1; i<size; i++) {
            currentValue = arrayList.get(i); //Obtenemos el valor actual a comparar.
            j = i-1;

            /*
            * Mueve los elementos del arreglo arrayList[0..i-1], que son mayores que el
            * valor de la posición actual del recorrido, a una posición adelante de su
            * posición actual.
            * */
            while (j >= 0 && arrayList.get(j) > currentValue) {
                arrayList.set(j+1,arrayList.get(j));
                j = j - 1;
            }

            arrayList.set(j+1,currentValue);

        }

        printInsertionSort(arrayList,size);

    }

    public void printInsertionSort(ArrayList<Integer> arrayList, int size) {
        int i;

        System.out.print("[");
        for (i=0; i<size; i++) {
            System.out.print(arrayList.get(i) + ", ");
        }
        System.out.println("]");
    }

    public void mainInsertionSort() {
        /*Declaración de variables*/
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayInsertion = new ArrayList();
        int tamanoArray;
        int datoArray;

        System.out.println("¿Cuántos elementos tendrá tu arreglo de datos?");
        tamanoArray = scanner.nextInt();

        for (int i=0; i<tamanoArray; i++) {
            System.out.print("Ingresa un número: ");
            System.out.println();
            arrayInsertion.add(datoArray = scanner.nextInt());
        }

        System.out.print("El array quedó de la siguiente manera: [");
        for (int i=0; i<tamanoArray; i++){
            System.out.print(arrayInsertion.get(i) + ", ");
        }

        System.out.print("]");
        System.out.println();
        System.out.println("El array ordenado queda de la siguiente manera:");
        insertionSort(arrayInsertion,tamanoArray);

    }
}
