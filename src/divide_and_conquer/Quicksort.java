package divide_and_conquer;

/**
 * Tal como Mergesort, Quicksort es un algoritmo de ordenamiento tipo 'Divide y vencerás'
 * Toma un elemento cómo el pivote y particiona el vector dado
 * alrededor del pivote tomado. Hay muchas versiones distintas de quickSort que toman
 * el elemento pivote de diferentes maneras.
 *
 * 1. Siempre toma el primer elemento como pivote.
 * 2. Siempre toma el último elemento como pivote.
 * 3. Toma un elemento aleatorio como pivote.
 * 4. Toma la mediana como pivote.
 *
 * El elemento clave de QuickSort es el método partition().
 * El objetivo de las particiones es, dado un array y un
 * elemento x del array como pivote, colocar x en su posición
 * correcta en un array ordenado y colocar todos los elementos
 * más pequeños (más pequeños que x) antes de x, y poner
 * todos los elementos más grandes (más grandes que x) después de x.
 * dodo ésto debe hacerce en tiempo lineal.
 *
 * @autor Víctor Vázquez
 * 
 * */
public class Quicksort {

    /**
     * Ésta función toma el último elemento como el pivote, coloca
     * el elemento pivote en su posición correcta en el array
     * ordenado, y coloca los elementos pequeños a la izquierda
     * del pivote y los más grandes a la derecha del pivote.
     * */
    public int partition(int arr[], int low, int high) {
        int pivot = arr[high]; //Toma la última posición cómo pivote.
        int i = (low - 1); //Índice del elemento más pequeño.

        for (int j=low; j<high; j++) {

            /*Si el valor actual es más pequeño
            o igual que el pivote*/
            if (arr[j] <= pivot) {
                i++;

                //Intercambia arr[i] por arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //Intercambia arr[i+1] y arr[high] (o el pivote).
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    /**
     * La función principal que implementa quickSort()
     * arr[] --> array a ordenar.
     * low --> Índice inicial.
     * high --> Índice final.
     *
     * */
    public void sort(int arr[], int low, int high) {
        if (low < high) {
            /*
            * pi es 'partition index' (índice de partición).
            * */
            int pi = partition(arr,low,high);

            /*
            * Recursivamente ordena los elementos antes de la
            * partición y después de la partición.
            * */
            sort(arr,low,pi-1);
            sort(arr,pi+1, high);
        }
    }

    /**
     * Función de utilidad para imprimir el array.
     * */
    public void printArray(int arr[]) {
        int n = arr.length;

        for (int i=0; i<n;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
