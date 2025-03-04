package Exam1;
import java.util.Random;
import java.util.*; 

public class MergeSort {
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
    private static void mergeSort(int[] inputArray){
        int inputLength = inputArray.length; 

        if(inputLength < 2){
            return;
        }

        int middleIndex = inputLength / 2;
        int[] leftHalf = new int[middleIndex];
        int[] rightHalf = new int[inputLength - middleIndex];

        for(int i = 0; i < middleIndex; i++){
            leftHalf[i] = inputArray[i];
        }

        for(int i = middleIndex; i < inputLength; i++){
            rightHalf[i - middleIndex] = inputArray[i];
        }
        
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
    }
    private static void merge(int[] inputArray, int[] left, int[] right) {
        int leftLength = left.length;
        int rightLength = right.length; 

        int leftIndex = 0, rightIndex = 0, mergedIndex = 0; 

        while(leftIndex < leftLength && rightIndex < rightLength) {
            if(left[leftIndex] <= right[rightIndex]){
                inputArray[mergedIndex] = left[leftIndex];
                leftIndex++;
            }
            else {
                inputArray[mergedIndex] = right[rightIndex];
                rightIndex++;
            }
            mergedIndex++;
        }
        while(leftIndex < leftLength) {
            inputArray[mergedIndex] = left[leftIndex];
            leftIndex++; mergedIndex++;

        }
        while(rightIndex < rightLength) {
            inputArray[mergedIndex] = right[rightIndex];
            rightIndex++; mergedIndex++;
        }
    }
    private static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
