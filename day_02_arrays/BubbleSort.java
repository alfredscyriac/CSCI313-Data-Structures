package day_02_arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        // This algorithm's time complexity is O(n^2)
        // This algoritm's return type is void as it is not creating a copy of an array rather just changing it
        // The algorithm repeatedly swaps adjacent values if they are in the long place until the entire array is sorted
        for(int i=arr.length-1; i>0; i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
		int[] arr = {9, 0, -3, 21, 5, 9, 1, -15};
		bubbleSort(arr);
		for(int n: arr) {
			System.out.print(n + " ");
		}
	}

}
