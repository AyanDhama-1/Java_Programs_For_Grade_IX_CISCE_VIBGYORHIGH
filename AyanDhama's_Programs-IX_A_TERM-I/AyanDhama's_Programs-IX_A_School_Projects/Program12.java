import java.util.Scanner;

public class Program12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double no = sc.nextDouble();
        
        double sq = Math.pow(no, 2);
        double cb = Math.pow(no, 3);
        
        System.out.println("Square is : " + sq);
        System.out.println("Cube is : " + cb);
    }
}