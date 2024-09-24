import java.util.Scanner;

public class PatternLoop{
    public static void main(String[] args)
    {
        pattern1();
    }
    public static void pattern1(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows you want ");
        int number_of_rows = input.nextInt();
        int rows = 0;
        while ( rows < number_of_rows ) {
            System.out.print("*");
            int i = 0;
            while ( i < rows ) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
        input.close(); // To close Scanner. It's best practice
    }
}
