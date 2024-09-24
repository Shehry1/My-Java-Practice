import java.util.Scanner;
public class Numberdetermination{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        if(number < 0)
        {
            System.out.println("It's negative number");
        }else if(number > 0)
        {
            System.out.println("It's positive number");
        }else{
            System.out.println("It's zero");
        }
    }
}