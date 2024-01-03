package project10;

public class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; 
            }

            else if (arr[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
    
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetValue = 4;

        int result = binarySearch(array, targetValue);

        if (result != -2) {
            System.out.println("Target value found at index: " + result);
        } else {
            System.out.println("Target value not found in the array.");
        }
    }
}
