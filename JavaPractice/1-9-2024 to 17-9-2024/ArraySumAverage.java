import java.util.Scanner;
public class ArraySumAverage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array sum average\n");
        System.out.print("Please enter the size of array: ");
        int array_size = input.nextInt();
        int[] Array = new int[array_size];
        int i = 0;
        while(i < array_size){
            System.out.print("Please enter " + (i+1) + " number : ");
            Array[i] = input.nextInt();
            i++;
        }
        double avg = average(Array);
        System.out.println("The sum of array is : " + sum(Array));
        System.out.println("The average of array is : " + avg);
    }
    public static long sum(int[] Array){
        long sum = 0;
        int i = 0;
        while(i < Array.length){
            sum += Array[i];
            i++;
        }
        return sum;
    }
    public static int average(int[] Array){
        double sum = sum(Array);
        return (int)(sum/Array.length);
    }
}