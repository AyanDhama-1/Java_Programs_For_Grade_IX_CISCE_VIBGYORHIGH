import java.util.Scanner;

public class Program_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        do {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        } while (temp > 0);

        if (sum != 0 && num % sum == 0) {
            System.out.println(num + " is a Niven number.");
        } else {
            System.out.println(num + " is not a Niven number.");
        }

        
    }
}
