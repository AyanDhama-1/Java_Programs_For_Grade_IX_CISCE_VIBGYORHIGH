import java.util.*;

public class PG_17
{
    public static void main(String args[])
    {
        double L;
        double G;
        double T;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input Length (L): ");
        L = sc.nextDouble();

        System.out.print("Input Acceleration due to Gravity (G): ");
        G = sc.nextDouble();

        T = 2 * (22.0 / 7.0) * Math.sqrt(L / G);

        System.out.println("-----------------------");
        System.out.println("Time Period = " + T + " seconds");
    }
}