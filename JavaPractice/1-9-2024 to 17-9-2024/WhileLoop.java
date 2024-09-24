import java.util.Scanner;

public class WhileLoop{
    public static void main(String[] args)
    {
        // int num = 0;//initialization
        // while(num < 10)//Condition
        // {
        //     System.out.println(num);
        //     num += 1;//updation
        // }

        // //It will print numbers from 1000 to 801
        // int count = 1000;
        // while(count > 800)
        // {
        //     System.out.println(count);
        //     count = count - 1;
        // }

        Scanner input = new Scanner(System.in);
        int n = 1;
        while(n < 6)
        {
            int Input = input.nextInt();
            System.out.println("Number is " + Input);
            n++;
        }

    }
}