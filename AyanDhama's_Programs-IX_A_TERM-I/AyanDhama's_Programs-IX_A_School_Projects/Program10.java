import java.util.Scanner;

public class Program10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int s = n * n;
        System.out.println("Square : " + s);
    }
}