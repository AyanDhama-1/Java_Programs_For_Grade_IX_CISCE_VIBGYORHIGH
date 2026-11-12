import java.util.*;

public class PG_16
{
    public static void main(String args[])
    {
        char code;
        int price;
        int quantity;
        double netCost;
        double totalCost;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input Code : ");
        code = sc.next().charAt(0);

        System.out.print("Input Price : ");
        price = sc.nextInt();

        System.out.print("Input Quantity : ");
        quantity = sc.nextInt();

        System.out.println("----------------------");

        netCost = price * quantity;
        totalCost = netCost + (netCost * 12 / 100);

        System.out.println("Cash Memo");
        System.out.println("Net Cost = " + netCost);
        System.out.println("Total Cost = " + totalCost);
        System.out.println("Code is = " + code);
    }
}