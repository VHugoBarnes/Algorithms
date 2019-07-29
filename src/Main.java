import divide_and_conquer.DivideAndConquer;
import divide_and_conquer.MergeSort;

public class Main {

    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort();
        int arr [] = {5,26,12,6,1,4,7};
        int n = arr.length;

        System.out.println("Array original:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.println("Array ordenado:");
        mergeSort.sort(arr,0,n-1);
        mergeSort.printArray(arr);
    }
}
