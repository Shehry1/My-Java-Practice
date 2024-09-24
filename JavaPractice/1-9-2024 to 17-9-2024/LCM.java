import java.util.Scanner;
//Least Common Multiple : LCM
public class LCM{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to LCM\n");
        System.out.print("Please enter first number : ");
        int first = input.nextInt();
        System.out.print("Please enter second number : ");
        int second = input.nextInt();
        int result = lcm(first, second);
        System.out.println("The lcm of two numbers is " + result);
    }
    public static int lcm(int first, int second) {
        int i = 1;
        while(true) {
            int factor = first * i;
            if(factor % second == 0) {
                return factor;
            }
            i++;
        }
    }
}