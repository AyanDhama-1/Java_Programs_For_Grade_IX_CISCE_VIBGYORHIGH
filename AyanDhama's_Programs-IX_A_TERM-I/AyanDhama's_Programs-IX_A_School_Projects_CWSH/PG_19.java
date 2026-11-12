import java.util.*;

public class PG_19
{
    public static void main(String args[])
    {
        double A;
        double B;
        double C;
        double result;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input A: ");
        A = sc.nextDouble();

        System.out.print("Input B: ");
        B = sc.nextDouble();

        System.out.print("Input C: ");
        C = sc.nextDouble();

        result = (1/(A*A)) + (1/(B*B)) + (1/(C*C));

        System.out.println("-----------------------");
        System.out.println("Result = " + result);
    }
}