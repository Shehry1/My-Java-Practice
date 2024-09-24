import java.util.Scanner;
//GCD : Greatest common divisor
public class GCD{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GCD");
        System.out.print("Please enter first number: ");
        int first = input.nextInt();
        System.out.print("Please enter second number: ");
        int second = input.nextInt();
        int result = gcd(first, second);
        System.out.println("The GCD of two numbers is : " + result);

    }

    public static int gcd(int num1, int num2) {
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while(i < least) {
            if(num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int n1, int n2) {
        if(n1 < n2) {
            return n1;
        } else {
            return n2;
        }
    }
}