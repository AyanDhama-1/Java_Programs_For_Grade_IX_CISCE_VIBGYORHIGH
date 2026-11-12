import java.util.Scanner;

public class Program_16 {

    public static int small(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 0;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        result = small(a, b);
        System.out.println("The smaller number is: " + result);

        
    }
}
