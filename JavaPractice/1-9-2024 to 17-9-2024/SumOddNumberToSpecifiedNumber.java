import java.util.Scanner;
public class SumOddNumberToSpecifiedNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = input.nextInt();
        int result = oddSum(limit);
        System.out.println("The sum of odd numbers is " + result);
    }
    public static int oddSum(int p){
        int sum = 0;
        int i = 1;
        while ( i <= p) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}