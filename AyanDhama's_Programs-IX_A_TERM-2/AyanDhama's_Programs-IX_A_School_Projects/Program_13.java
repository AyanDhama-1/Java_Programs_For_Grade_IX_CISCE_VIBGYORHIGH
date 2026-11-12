import java.util.Scanner;

public class Program_13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n , sum=0 , digit;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        System.out.print("Sum of digit of " + n + "=");
        do 
        {
         digit = n % 10;
         sum = sum + digit ;
         n = n/10;
        }
        while(n!=0);
        System.out.println(sum);
    }
}