import java.util.Scanner;

public class MaximumAndMinimumInAnArray {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Greet the user and explain the program's purpose
        System.out.println("Welcome to find maximum and minimum numbers in an array\n");

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size_of_array = input.nextInt();  // Store the input in size_of_array

        // Declare and initialize the array of given size
        int[] array = new int[size_of_array];
        
        // Fill the array with user input values
        int i = 0;
        while (i < array.length) {  // Continue until all elements are filled
            System.out.print("Please enter the " + (i + 1) + " number of the array: ");
            array[i] = input.nextInt();  // Store each value in the array
            i++;  // Move to the next array index
        }

        // Call the function to find the maximum value and print it
        System.out.println("The maximum number in the given array is: " + maximumNumberInArray(array));
        
        // Call the function to find the minimum value and print it
        System.out.println("The minimum number in the given array is: " + minimumNumberInArray(array));

        // Close the Scanner to prevent resource leaks
        input.close();
    }

    // Function to find the maximum number in the array
    public static int maximumNumberInArray(int[] array) {
        // Initialize max to the first element of the array
        int max = array[0];
        
        int i = 1;  // Start checking from the second element
        while (i < array.length) {  // Loop through the array
            if (array[i] > max) {  // If current element is greater than max, update max
                max = array[i];
            }
            i++;  // Move to the next element
        }
        return max;  // Return the maximum value found
    }

    // Function to find the minimum number in the array
    public static int minimumNumberInArray(int[] array) {
        // Initialize min to the first element of the array
        int min = array[0];
        
        int i = 1;  // Start checking from the second element
        while (i < array.length) {  // Loop through the array
            if (array[i] < min) {  // If current element is smaller than min, update min
                min = array[i];
            }
            i++;  // Move to the next element
        }
        return min;  // Return the minimum value found
    }
}
