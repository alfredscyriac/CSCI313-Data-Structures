package day_02_arrays;

public class InsertionSortAlgo {
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 10, 1, 2, 1};

        System.out.println("Original array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("\nSorted array:");
        printArray(arr);
    }

    static void insertionSort(int[] arr) {
        
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

