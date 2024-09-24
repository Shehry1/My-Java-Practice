import java.util.Scanner;

public class RelationalOperators{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        if(age >= 18 && age < 55)
        {
            System.out.println("You are egligible for driving");
        } else if(age >= 55)
        {
            System.out.println("You are not eligible for driving  because you are adult");

        } else{
            System.out.println("Beta cycle chalao");
        }
    }
}