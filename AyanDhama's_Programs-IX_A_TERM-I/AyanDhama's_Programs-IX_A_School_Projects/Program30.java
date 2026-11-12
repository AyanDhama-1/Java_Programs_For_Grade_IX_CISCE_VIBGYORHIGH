import java.util.Scanner;

public class Program30
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        String result = (num % 2 == 0) ? "Even number" : "Odd number";
        
        System.out.println(result);
    }
}