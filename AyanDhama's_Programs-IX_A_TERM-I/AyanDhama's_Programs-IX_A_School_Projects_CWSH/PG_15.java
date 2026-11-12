import java.util.*;

public class PG_15
{
    public static void main(String args[])
    {
        String name;
        String address;
        long phoneNo;
        String subject;
        double salary;
        double incomeTax;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input your name : ");
        name = sc.nextLine();

        System.out.print("Input your address : ");
        address = sc.nextLine();

        System.out.print("Input your phone number : ");
        phoneNo = sc.nextLong();

        sc.nextLine();

        System.out.print("Input your subject specialization : ");
        subject = sc.nextLine();

        System.out.print("Input your salary : ");
        salary = sc.nextDouble();

        incomeTax = salary * 5 / 100;

        System.out.println("----------------------------");
        System.out.println("Your name is " + name);
        System.out.println("Your address is " + address);
        System.out.println("Your phone number is " + phoneNo);
        System.out.println("Your subject specialization is " + subject);
        System.out.println("Your salary is ₹" + salary);
        System.out.println("Your income tax is ₹" + incomeTax);
    }
}