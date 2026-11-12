import java.util.Scanner;

public class Program15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        
        if (n < 0)
        {
            System.out.println("The no is negative");
        }
    }
}