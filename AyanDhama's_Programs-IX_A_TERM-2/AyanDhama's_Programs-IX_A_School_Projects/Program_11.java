import java.util.Scanner;

public class Program_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        long fact = 1;
        int i = 1;

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            if (n > 0) {
                do {
                    fact = fact * i;
                    i++;
                } while (i <= n);
            }
            System.out.println("Factorial of " + n + " = " + fact);
        }

    }
}
