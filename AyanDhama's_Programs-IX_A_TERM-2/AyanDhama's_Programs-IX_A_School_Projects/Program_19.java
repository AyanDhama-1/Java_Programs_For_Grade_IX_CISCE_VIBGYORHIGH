import java.util.Scanner;

public class Program_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int num = 0;
        int count = 0;

        for (i = 1; i <= 50; i++) {
            System.out.print("Enter number " + i + ": ");
            num = sc.nextInt();

            if (num % 3 == 0) {
                count++;
            }
        }

        System.out.println("Total numbers divisible by 3 = " + count);

    
    }
}
