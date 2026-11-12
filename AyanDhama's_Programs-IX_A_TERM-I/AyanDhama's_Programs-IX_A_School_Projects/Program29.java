import java.util.Scanner;

public class Program29
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("1. One year old car");
        System.out.println("2. Two year old car");
        System.out.println("3. Three year old car");
        System.out.println("4. Four year old car");
        System.out.println("5. More than four year old car");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();
        
        if (choice < 1 || choice > 5)
        {
            System.out.println("Wrong choice! Please select from 1, 2, 3, 4, 5.");
            return;
        }
        
        System.out.print("Enter showroom price: ");
        double price = in.nextDouble();
        double depRate = 0.0;
        
        switch (choice)
        {
            case 1:
                depRate = 10.0;
                break;
            case 2:
                depRate = 20.0;
                break;
            case 3:
                depRate = 30.0;
                break;
            case 4:
                depRate = 50.0;
                break;
            case 5:
                depRate = 60.0;
                break;
        }
        
        double depValue = (price * depRate) / 100.0;
        double amountPaid = price - depValue;
        
        System.out.println("Original Price : " + price);
        System.out.println("Depreciated Value : " + depValue);
        System.out.println("Amount to be paid : " + amountPaid);
    }
}