import java.util.Scanner;
public class input{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you name : ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
        System.out.println(name + " Please also tell your age. ");
        int age = input.nextInt();
        System.out.println("Your age is: " + age);
        float va1 = input.nextFloat();
        System.out.println("This is flaot number: " + va1);
        
        System.out.println("---------------------------------------");
        //Challange
        System.out.print("Enter first number : ");
        float num1 = input.nextFloat();
        System.out.print("Enter the second number : ");
        float num2 = input.nextFloat();
        float sum  = num1 + num2;
        System.out.println("The addition of " + num1 + " and " + num2 + " is " + sum);
    
    }
}