import java.util.Scanner;
public class OddOrEven{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to know either the given number is odd or even: ");
        int n1 = input.nextInt();
        float operation = n1%2;

        if(operation == 0)
        {
            System.out.println("This number is even");
        }else{
            System.out.println("This number is odd");
        }
    }
}