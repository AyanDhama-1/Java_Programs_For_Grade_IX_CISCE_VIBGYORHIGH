import java.util.Scanner;

public class Program28
{
    public static void main(String[] args)
    {
        int ch;
        float f, c;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("MENU");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice: ");
        ch = sc.nextInt();
        
        switch (ch)
        {
            case 1:
                System.out.print("Enter the temperature in Fahrenheit: ");
                f = sc.nextFloat();
                c = (5.0f / 9.0f) * (f - 32);
                System.out.println("Celsius = " + c);
                break;
                
            case 2:
                System.out.print("Enter the temperature in Celsius: ");
                c = sc.nextFloat();
                f = 1.8f * c + 32;
                System.out.println("Fahrenheit = " + f);
                break;
                
            default:
                System.out.println("Invalid choice");
        }
    }
}