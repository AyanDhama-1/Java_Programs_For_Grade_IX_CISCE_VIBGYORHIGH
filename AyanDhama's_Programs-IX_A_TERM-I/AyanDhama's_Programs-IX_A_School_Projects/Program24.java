import java.util.Scanner;

public class Program24
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total purchase amount : ");
        double amount = sc.nextDouble();
        
        double discount = 0.0;
        
        if (amount <= 2000)
        {
            discount = amount * (5.0 / 100.0);
        }
        else if (amount <= 5000)
        {
            discount = amount * (25.0 / 100.0);
        }
        else if (amount <= 10000)
        {
            discount = amount * (35.0 / 100.0);
        }
        else
        {
            discount = amount * (50.0 / 100.0);
        }
        
        double netAmount = amount - discount;
        
        System.out.println("Total Amount : ₹" + amount);
        System.out.println("Discount : ₹" + discount);
        System.out.println("Net Amount Payable : ₹" + netAmount);
    }
}