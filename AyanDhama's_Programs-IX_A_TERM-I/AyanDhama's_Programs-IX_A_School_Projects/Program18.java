import java.util.Scanner;

public class Program18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        if (age >= 18)
        {
            System.out.println("You can vote");
        }
        else
        {
            int yl = 18 - age;
            System.out.println("You will be able to vote after " + yl + " year(s)");
        }
    }
}