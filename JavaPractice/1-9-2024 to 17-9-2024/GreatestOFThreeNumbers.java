import java.util.Scanner;
public class GreatestOFThreeNumbers{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number to find the greatest: \n");
        System.out.print("Please enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Please enter third number: ");
        int num3 = input.nextInt();

        if(num1 > num2)
        {
            if(num1 > num3)
            {
                System.out.println(num1 + " is greater");
            }else{
                System.out.println(num3 + " is greater");
            }
        }else if(num2 > num1 && num2 > num3)
        {
            System.out.println(num2 + " is greater");
        }else {
            System.out.println(num3 + " is greater");
        }
    }
}