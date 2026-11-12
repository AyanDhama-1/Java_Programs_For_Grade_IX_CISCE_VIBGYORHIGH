import java.util.Scanner;

public class Program13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();
        
        double d = Math.sqrt(Math.pow(l, 2) + Math.pow(b, 2));
        
        System.out.println("The diagonal is : " + d);
    }
}