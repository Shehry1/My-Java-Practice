import java.util.Scanner;

public class FactorialOFGivenNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int result = factorial(num);
        System.out.println("Mulitiplication of factorial of " + num + " is " + result);

    }
    public static int factorial(int numP) {
        long mul = 1;
        int i = 1;
        while ( umPi <= n ) {
            mul *= i;
            i++;
        }
        return mul;
    }
}