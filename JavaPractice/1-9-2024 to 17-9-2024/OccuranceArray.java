import java.util.Scanner;
public class OccuranceArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Occurace of numbers in an array\n");
        int[] array = ArrayUtility.array();
        System.out.print("Now enter the number you want to find: ");
        int number = input.nextInt();
        int Occuraces = occ(array, number);
        System.out.println("You given number repeated " + Occuraces + " times");

    }
    public static int occ(int[] array, int number){
        int occuraces = 0;
        int i = 0;
        while(i < array.length){
            if(array[i] == number){
                occuraces++;
            }
            i++;
        }
        return occuraces;

    }
}