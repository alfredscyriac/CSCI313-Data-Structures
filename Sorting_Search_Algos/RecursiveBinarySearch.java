package Sorting_Search_Algos;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] ints = {1,2,4,5,7,9,11};
        int high = ints.length - 1;
        System.out.println(binarySearch(ints,0,high,9));
        System.out.println(binarySearch(ints,0,high,8));
    }
    private static int binarySearch(int[] nums, int low, int high, int numberToFind){
        if(low > high) {
            return -1; 
        }
        int middlePosition = (low + high) / 2; 
        int middleNumber = nums[middlePosition];
        if (middleNumber == numberToFind){
            return middlePosition;
        }
        else if (middleNumber < numberToFind) {
            low = middlePosition + 1; 
            return binarySearch(nums, low, high, numberToFind);
        }
        else {
            high = middlePosition - 1; 
            return binarySearch(nums, low, high, numberToFind);
        }
    }
}
