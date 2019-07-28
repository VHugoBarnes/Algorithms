package divide_and_conquer;

/**
 * Divide y vencerás es un paradigma de algoritmos.
 * Un programa típico de Divide y Vencerás resuelve un problema usando los siguientes
 * tres pasos:
 *
 * Dividir: Rompe el problema en sub-problemas del mismo tipo.
 * Conquistar: Resuelve recursivamente los sub-problemas.
 * Combinar: Combina apropiadamente las respuestas.
 *
 * Un ejemplo clásico de Divide y Vencerás es 'Merge Sort'. En 'Merge Sort', dividimos
 * el arreglo de datos en dos mitades, ordenamos las dos mitades recursivamente,
 * y luego unir las dos mitades.
 * */
public class DivideAndConquer {

    private int menu = 0;
    MergeSort mergeSort = new MergeSort();

    public void dacMenu() {
        System.out.println("Divide and Conquer.");
        System.out.println("1. MergeSort");

        switch (menu) {
            case 1:
                MergeSort mergeSort = new MergeSort();
                System.out.println("Ingresa un vector de 7 elementos:");
                break;
        }
    }

}
