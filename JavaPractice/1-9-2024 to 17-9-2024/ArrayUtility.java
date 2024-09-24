import java.util.Scanner;
public class ArrayUtility{
    public static int[] array(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers of values will be in your arrray? ");
        int number_values = input.nextInt();
        int[] array = new int[number_values];
        int i = 0;
        while(i < number_values){
            System.out.print("Please enter number " + (i+1) + " value of array: ");
            array[i] = input.nextInt();
            i++; 
        }
        return array;
    }
}