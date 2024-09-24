import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to reverse of an array\n");

        // Input the size of the array
        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        // Input array elements
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter the value of position " + (i + 1) + " in the array: ");
            array[i] = input.nextInt();
            i++;
        }

        // Print the original array
        System.out.println("Your given array is: " + Arrays.toString(array));

        // Print the reversed array
        System.out.println("Your reversed array is: " + Arrays.toString(reversedArray(array)));
        input.close();
    }

    // Function to reverse the array
    public static int[] reversedArray(int[] array) {
        int i = array.length - 1; // Start from the last element (array.length - 1)
        int[] newArray = new int[array.length];
        int j = 0;

        // Loop to reverse the array
        while (i >= 0) {
            newArray[j] = array[i]; // Assign elements in reverse order
            j++;
            i--;
        }
        return newArray; // Return the reversed array
    }
}
