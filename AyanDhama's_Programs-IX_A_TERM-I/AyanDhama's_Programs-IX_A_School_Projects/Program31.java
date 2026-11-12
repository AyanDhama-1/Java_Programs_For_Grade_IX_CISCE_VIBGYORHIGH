import java.util.Scanner;

public class Program31
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number : ");
        int num = sc.nextInt();
        
        int c = num % 10;            // Last digit
        int b = (num / 10) % 10;     // Middle digit
        int a = num / 100;           // First digit
        
        int sum = (a * a * a) + (b * b * b) + (c * c * c);
        
        if (sum == num)
        {
            System.out.println(num + " is an Armstrong number");
        }
        else
        {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
