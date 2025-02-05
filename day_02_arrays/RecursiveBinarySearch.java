package day_02_arrays;

public class RecursiveBinarySearch {
    public static int search(int[] nums, int target){
        return searchHelper(nums, target, 0, nums.length-1);
    }
    public static int searchHelper(int[] nums, int target, int left, int right){
        int middle = (left+right)/2;
        if (left > right) {
            return -1;
        }
        if (nums[middle] == target) {
            return middle;
        }
        else if (nums[middle] < target) {
            left = middle + 1;
            return searchHelper(nums, target, left, right);
        }
        else {
            right = middle - 1;
            return searchHelper(nums, target, left, right);
        }
    }
}
