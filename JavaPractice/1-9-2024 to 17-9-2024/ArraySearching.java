import java.util.Scanner;
public class ArraySearching{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("PLease enter a number: ");
        int number = input.nextInt();
        boolean isFound = isFound(myArray, number);
        if(isFound){
            System.out.println("Your number is found in the array");
        } else {
            System.out.println("Your number is not found in the array");
        }
        
        }
    public static boolean isFound(int[] arr, int number ){
        int index = 0;
        while(index < arr.length) {
            if(arr[index] == number){
                return true;
            }
            index++;
        }
        return false;

    }
}
