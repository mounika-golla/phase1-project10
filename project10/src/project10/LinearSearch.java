package project10;

public class LinearSearch {
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
       
        int[] array = {2, 7, 1, 4, 6, 9, 3, 8};
        int targetValue = 6;
        int result = linearSearch(array, targetValue);

        if (result != -1) {
            System.out.println("Target value found at index: " + result);
        } else {
            System.out.println("Target value not found in the array.");
        }
    }
}

