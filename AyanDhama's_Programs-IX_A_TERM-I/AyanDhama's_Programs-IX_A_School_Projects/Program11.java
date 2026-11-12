import java.util.Scanner;

public class Program11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        
        double r1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
        double r2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
        
        System.out.println("Root 1: " + r1);
        System.out.println("Root 2: " + r2);
    }
}