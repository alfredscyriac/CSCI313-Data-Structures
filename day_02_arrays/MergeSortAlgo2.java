package day_02_arrays;
import java.util.Arrays;

public class MergeSortAlgo2 {
    public static int[] merge(int[] arr1, int[] arr2){
        int[] combined = new int[arr1.length + arr2.length];
        int combinedIndex = 0;
        int index1 = 0; 
        int index2 =0;
        while(index1<arr1.length && index2<arr2.length){
            if(arr1[index1]<arr2[index2]){
                combined[combinedIndex] = arr1[index1];
                combinedIndex++;
                index1++;
            }
            else{
                combined[combinedIndex] = arr2[index2];
                combinedIndex++;
                index2++;
            }
        }
        while(index1<arr1.length){
            combined[combinedIndex] = arr1[index1];
            combinedIndex++;
            index1++;
        }
        while(index2<arr2.length){
            combined[combinedIndex] = arr2[index2];
            combinedIndex++;
            index2++;
        }
        return combined; 
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr; 
        }
        int midIndex = arr.length/2; 
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(arr, midIndex, arr.length));
        return merge(left,right);
    }
    public static void main(String[] args) {
		int[] arr = {9, 0, -3, 21, 5, 9, 1, -15};
		arr = mergeSort(arr);
		for(int n: arr) {
			System.out.print(n + " ");
		}
	}
}
