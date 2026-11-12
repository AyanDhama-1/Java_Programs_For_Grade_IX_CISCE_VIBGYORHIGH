import java.util.Scanner;

public class PG_14
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the diagonal of the square: ");
        double d = sc.nextDouble();

        double side = d / Math.sqrt(2);
        double area = side * side;
        double perimeter = 4 * side;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}