import java.util.Scanner;
public class CheckEvenOrOddUsingBitWiseOperators{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to check either the number is even or odd: ");
        int number = input.nextInt();

        if((number & 1) == 0)
        {
            System.out.println(number + " is even ");
        }else{
            System.out.println(number + " is odd");
        }
    }
}