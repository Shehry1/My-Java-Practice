import java.util.Arrays;
import java.util.Scanner;
public class DeleteSpecificValueInArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to delete specific value in an array\n");
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while(i < arr.length){
            System.out.print("Enter the value number " + (i+1) + " of the array: ");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.print("Your current array is : " + Arrays.toString(arr) + "\n");
        System.out.print("Enter the value in above array you want to delete: ");
        int delete_value = input.nextInt();
        System.out.println("After delete your given number " + delete_value + " array is : " + Arrays.toString(deleteNumber(arr,delete_value)));
        input.close();
    }
    public static int occurancesOfDeletingNumber(int[] arr, int delete_value){
        int occ = 0;
        int j = 0;
        while(j < arr.length){
            if(arr[j] == delete_value){
                occ++;
            }
            j++;
        }
        return occ;
    }
    public static int[] deleteNumber(int[] arr, int delete_value){
        int new_size = arr.length - occurancesOfDeletingNumber(arr,delete_value);
        int[] newArr = new int[new_size];
        int i = 0;
        int j = 0;
        while(i < arr.length){
            if(delete_value != arr[i]){
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArr; 
    }
}