import java.util.Scanner;

public class Program19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 floating point numbers:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        
        float av = (a + b + c + d + e) / 5.0f;
        System.out.println("Average = " + av);
        
        if (av > 50)
        {
            System.out.println("Good");
        }
        else
        {
            System.out.println("Needs Improvement");
        }
    }
}