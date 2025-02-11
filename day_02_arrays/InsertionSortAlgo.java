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
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Current element to be inserted in sorted part
            int j = i - 1;

            // Shift elements of the sorted part to the right to make space for key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key at its correct position
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

