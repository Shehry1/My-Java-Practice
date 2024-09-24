import java.util.Scanner;
public class PalindromeNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to palindrome number\n");
        System.out.print("Please enter a number : ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println("Your number is a palindrome number");
        }else {
            System.out.println("Your number is not a palindrome Number");
        }
    }

    public static boolean isPalindrome(int num) {
        int reverse = reversedNumber(num);

        return num == reverse;
    }

    public static int reversedNumber(int num) {
        int newNum = 0;
        while(num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }
}