package divide_and_conquer;

/**
 * Mergesort es un algoritmo tipo Divide y Vencerás. Divide el array ingresado en
 * dos mitades, se llama a sí mismo para las dos mitades y después une las dos
 * mitades ordenadas. La función merge() es usada para unir las dos mitades.
 * El merge(arr,l,m,r) es un proceso clave que asume que arr[l..m] y arr[m+1..r]
 * están ordenados y une las dos mitades en uno.
 *
 * Pasos a seguir:
 *
 * MergeSort(arr[], l, r)
 * if r > 1
 *
 * 1. Encuentra el punto medio para dividir el array en dos mitades:
 *              middle m = (1+r) / 2
 * 2. Llama a mergeSort para la primera mitad:
 *              Llama a mergeSort(arr, l, m)
 * 3. Llama a mergeSort para la segunda mitad:
 *              Llama a mergeSort(arr, m+1, r)
 * 4. Une las dos mitades ordenadas en el paso 2 y 3:
 *              Llama a merge(arr, l, m, r)
 * */
public class MergeSort {

    /**
     * Función central que se encarga de ordenar y unir los array temporales dando
     * por resultado el array ordenado de tamaño n.
     * */
    public void merge(int arr[], int left, int middle, int right) {
        //Encuentra el tamaño de los dos sub-arrays para unirlos.
        int n1 = middle - left + 1;
        int n2 = right - middle;

        //Arrays temporales.
        int leftArray[] = new int [n1];
        int rightArray[] = new int [n2];

        //Copia los datos a los arrays temporales.
        for (int i=0; i<n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j=0; j<n2; j++) {
            rightArray[j] = arr[middle+ j + 1];
        }

        //Une los arrays temporales.

        //Índices inicial del primer y segundo sub-array.
        int i = 0, j = 0;

        //Índice inicial del sub-array.
        int k = left;

        //Ordenamiento.
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        /* Copiar los elementos restantes de leftArray[] */
        while (i < n1)
        {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        /* Copiar los elementos restantes de rightArray[] */
        while (j < n2)
        {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    /**
     * Función principal que ordena el array usando merge.
     * */
    public void sort(int arr[], int left, int right) {
        if (left < right) {
            //Encontrar el punto medio.
            int middle = (left+right) / 2;

            //Ordena la primera y segunda mitad.
            sort(arr, left, middle);
            sort(arr, middle+1, right);

            //Une las mitades ordenadas.
            merge(arr, left, middle, right);

        }
    }

    /**
     * Función de utilidad para imprimir el array de tamaño n.
     * */
    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
