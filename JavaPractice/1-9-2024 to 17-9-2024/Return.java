import java.util.Scanner;
public class Return{
    public static void main(String[] args){
        
        int first = number();
        int second = number();

        int result = first + second;
        System.out.println("The sum of given number is : " + result);   
    }
    public static int number(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int num = input.nextInt();
        return num;
    }
}