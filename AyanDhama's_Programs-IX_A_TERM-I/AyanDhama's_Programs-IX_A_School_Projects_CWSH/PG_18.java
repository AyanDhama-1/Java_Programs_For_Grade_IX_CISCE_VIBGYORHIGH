import java.util.*;

public class PG_18
{
    public static void main(String args[])
    {
        double volume;
        double side;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input Volume of Cube: ");
        volume = sc.nextDouble();

        side = Math.cbrt(volume);

        System.out.println("----------------------");
        System.out.println("Side of Cube = " + side);
    }
}