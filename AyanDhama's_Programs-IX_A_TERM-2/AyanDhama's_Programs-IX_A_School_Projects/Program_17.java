import java.util.Scanner;

public class Program_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int i = 1;
        int count = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        
    }
}
