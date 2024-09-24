import java.util.Scanner;

public class SumOfDigitsOfInteger{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to some of digits\n");
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        int result = someOfDigits( num );
        System.out.println("The some of digits is " + result);
        
    }
    public static int someOfDigits( int num ) {
        int sum = 0;
        while ( num > 0) {

            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}