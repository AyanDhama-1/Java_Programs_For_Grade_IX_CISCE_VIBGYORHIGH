import java.util.Scanner;

public class Program14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd no: ");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd no: ");
        int n3 = sc.nextInt();
        
        int l = Math.max(n1, Math.max(n2, n3));
        int s = Math.min(n1, Math.min(n2, n3));
        
        System.out.println("The largest no is : " + l);
        System.out.println("The smallest no is : " + s);
    }
}