import java.util.Scanner;

public class Program21
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int yr = sc.nextInt();
        
        if ((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0))
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("It is not a leap year");
        }
    }
}