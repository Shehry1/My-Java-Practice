 import java.util.Scanner;
 public class OrderOfOperations{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();

        System.out.println(n1 - n2 * n1);
        System.out.println(n1 * (n2 / n1));
    }
 }