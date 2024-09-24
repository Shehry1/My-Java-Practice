import java.util.Scanner;

public class FahrenheitToCelsius{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Convert from fahrenheit to celsius calculator\n");
        System.out.print("Enter you fahrenheit: ");
        float fah = input.nextFloat();

        float celsius = (fah - 32 ) * 5 / 9;
        System.out.print("The result is : " + celsius); 
    }
}