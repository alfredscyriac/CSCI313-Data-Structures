package Exam1;
public class BinarySearch {
    public static void main(String[] args){
        int[] ints = {1,2,4,5,7,9,11};
        System.out.println(binarySearch(ints,9));
        System.out.println(binarySearch(ints,8));
    }

    // Time Complexity: O(logn)
    private static int binarySearch(int[] numbers,int numberToFind){
        int low = 0; 
        int high = numbers.length - 1;
        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleNumber = numbers[middlePosition]; 
            if(numberToFind == middleNumber){
                return middlePosition;
            }
            else if (numberToFind < middleNumber){
                high = middlePosition - 1;
            } 
            else {
                low = middlePosition + 1; 
            }
        } 
        return -1; 
    }
}
