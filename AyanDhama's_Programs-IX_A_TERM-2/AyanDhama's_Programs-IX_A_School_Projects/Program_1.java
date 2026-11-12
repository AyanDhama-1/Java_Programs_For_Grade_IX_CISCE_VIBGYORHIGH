import java.util.Scanner;
public class Program_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,num,i;
        System.out.print("Enter final value for n : ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
         System.out.println("Enter number : ");
         num = sc.nextInt();
         System.out.println("The number is " +num);
        }
    }
}