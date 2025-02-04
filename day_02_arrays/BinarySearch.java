package day_02_arrays;

public class BinarySearch {

	public static boolean binarySearch(int[] arr, int target,int left, int right) {
		while(left<=right){
			int middle = (left + right) / 2; 
            if(arr[middle]==target){
                return true; 
            }
            else if(arr[middle]<target){
                left=middle+1; 
            }
            else if(arr[middle]>target){
                right=middle-1; 
            }
		}
		return false; 
	}	
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 65, 323};
		int n = arr.length - 1;
		int target;
		target = 4;
		System.out.println(binarySearch(arr, target, 0, n));
		target = 10;
		System.out.println(binarySearch(arr, target, 0, n));

	}

}
