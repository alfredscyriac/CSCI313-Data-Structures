package Exam1;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[10];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(1000000);
        }

        System.out.println("Before: ");
        printArray(nums); 

        mergeSort(nums); 

        System.out.println("\nBefore: ");
        printArray(nums);
    }
    private static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    
}
