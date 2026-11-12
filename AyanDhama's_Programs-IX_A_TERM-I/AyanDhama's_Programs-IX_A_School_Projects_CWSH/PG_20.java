import java.util.*;

public class PG_20
{
    public static void main(String args[])
    {
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input Age: ");
        age = sc.nextInt();

        if(age >= 18)
            System.out.println("Eligible to Vote");

        System.out.println("Thank You");
    }
}