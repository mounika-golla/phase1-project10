package project10;

public class LinearSearch {

    // Function to perform linear search
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }

    public static void main(String[] args) {
        // Example usage
        int[] array = {2, 7, 1, 4, 6, 9, 3, 8};
        int targetValue = 6;

        // Perform linear search
        int result = linearSearch(array, targetValue);

        // Display the result
        if (result != -1) {
            System.out.println("Target value found at index: " + result);
        } else {
            System.out.println("Target value not found in the array.");
        }
    }
}

