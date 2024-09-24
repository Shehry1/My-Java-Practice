import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to is sorted\n");

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        // Fill the array with user input values
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter the value of position " + (i + 1) + " in the array: ");
            arr[i] = input.nextInt();
            i++;
        }

        // Check if the array is sorted in increasing or decreasing order
        boolean isIncreasing = checkIncreasingOrder(arr);
        boolean isDecreasing = checkDecreasingOrder(arr);

        if (isIncreasing || isDecreasing) {
            System.out.println("Your array is a sorted array.");
        } else {
            System.out.println("Your array is not a sorted array.");
        }

        input.close(); // Close the Scanner to prevent resource leaks
    }

    // Function to check if the array is sorted in increasing order using a while loop
    public static boolean checkIncreasingOrder(int[] arr) {
        int i = 1; // Start from the second element
        while (i < arr.length) {
            if (arr[i] < arr[i - 1]) { // If the current element is less than the previous one
                return false; // Array is not in increasing order
            }
            i++;
        }
        return true; // Array is in increasing order
    }

    // Function to check if the array is sorted in decreasing order using a while loop
    public static boolean checkDecreasingOrder(int[] arr) {
        int i = 1; // Start from the second element
        while (i < arr.length) {
            if (arr[i] > arr[i - 1]) { // If the current element is greater than the previous one
                return false; // Array is not in decreasing order
            }
            i++;
        }
        return true; // Array is in decreasing order
    }
}
