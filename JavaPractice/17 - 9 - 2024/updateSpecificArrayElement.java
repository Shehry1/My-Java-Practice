import java.util.Arrays;  // Import Arrays class to print array elements
import java.util.Scanner;

public class updateSpecificArrayElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to updation of array elements\n");

        // Initial array declaration
        int[] array = {3, 23, 2, 12, 3, 23, 292};
        
        // Display the current array
        System.out.println("Current array: " + Arrays.toString(array));

        // Ask the user for the array value they want to update
        System.out.print("Enter the array value you want to update: ");
        int array_value = input.nextInt();

        // Ask the user for the new value to insert
        System.out.print("Enter the value you want to insert: ");
        int insert_value = input.nextInt();

        // Loop through the array to find and update the specific value
        int i = 0;
        while (i < array.length) {
            if (array_value == array[i]) {
                array[i] = insert_value;  // Update the element
            }
            i++;
        }

        // Display the updated array
        System.out.println("Updated array: " + Arrays.toString(array));

        input.close();  // Close the scanner to prevent resource leaks
    }
}
