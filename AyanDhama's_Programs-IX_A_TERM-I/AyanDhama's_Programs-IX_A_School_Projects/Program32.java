import java.util.Scanner;

public class Program32
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number : ");
        int num = sc.nextInt();
        
        int c = num % 10;            // Last digit
        int b = (num / 10) % 10;     // Middle digit
        int a = num / 100;           // First digit
        
        int sum = a + b + c;
        
        // If the sum is a 2-digit number, reduce it again
        if (sum == 10)
        {
         sum = (sum / 10) + (sum % 10);
         if (sum == 1)
         {
            System.out.println(num + " is a magic number");
         }
         else 
         {
           System.out.println(num + " is not a magic number");
         }
        }
        else if (sum == 1)
        {
         System.out.println(num + " is a magic number");
        }
        else
        {
            System.out.println(num + " is not a magic number");
        }
    }
}