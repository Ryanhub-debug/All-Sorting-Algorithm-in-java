import java.util.Scanner;

public class bubble {
    // Function to perform Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened, break (array is sorted)
            if (!swapped) break;
        }
    }

    // Utility function to print array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Take array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print original array
        System.out.println("Original Array:");
        printArray(arr);

        // Sort array using Bubble Sort
        bubbleSort(arr);

        // Print sorted array
        System.out.println("Sorted Array:");
        printArray(arr);

        sc.close();
    }
}
