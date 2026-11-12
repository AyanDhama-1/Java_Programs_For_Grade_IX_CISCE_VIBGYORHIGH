import java.util.Scanner;

public class Program25
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        
        System.out.print("Enter third number : ");
        int c = sc.nextInt();
        
        int smallest;
        
        if (a <= b)
        {
            if (a <= c)
            {
                smallest = a;
            }
            else
            {
                smallest = c;
            }
        }
        else
        {
            if (b <= c)
            {
                smallest = b;
            }
            else
            {
                smallest = c;
            }
        }
        
        System.out.println("The smallest number is : " + smallest);
    }
}