import java.util.Scanner;

public class Program8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        
        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();
        
        int sum = n1 + n2;
        
        System.out.println("The sum is : " + sum);
    }
}