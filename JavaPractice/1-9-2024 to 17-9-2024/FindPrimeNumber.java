import java.util.Scanner;
//Wether the give number is prime of not
public class FindPrimeNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to primeNumber: ");
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        boolean result = primeNumber(n);
        if(result) {
            System.out.println("Your number is prime");
        }else {
            System.out.println("Your number is not prime");
        }


    }

    public static boolean primeNumber(int n) {
        int i = 2;
        while(i < n) {
            if(n % i == 0) {
                return false;
            } 
         
            i++;
        }
        return true;
    }
}