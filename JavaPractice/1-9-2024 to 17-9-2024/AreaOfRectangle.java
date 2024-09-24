import java.util.Scanner;
public class AreaOfRectangle{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Area of rectangle \n");

        System.out.print("Please enter height of Rectangle : ");
        float height = input.nextFloat();

        System.out.print("Please enter base of Rectangle : ");
        float base = input.nextFloat();

        float result = (height * base) / 2;//it is formula of area of rectangle
        System.out.println("The area of rectangle is : " + result + "cm2");

    }
}