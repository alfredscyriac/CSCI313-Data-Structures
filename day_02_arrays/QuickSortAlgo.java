package day_02_arrays;


public class QuickSortAlgo {

	static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            
        }
    }

    static int partition(int[] arr, int low, int high) {
        return -1;
    }

    private static void swap(int[] arr, int i, int j) {
        
    }

    public static void main(String[] args) {
        int[] arr = {0,9,1,8,3,7,4,6,1,0};
        int n = arr.length;

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        quicksort(arr, 0, n - 1);

        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
