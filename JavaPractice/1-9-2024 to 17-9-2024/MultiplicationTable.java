import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int num = 1;
        while ( num <= 10 )
        {
            int result = num * number;
            System.out.println(number + " * " + num + " = " + result);
            num++;
        }
    }
}