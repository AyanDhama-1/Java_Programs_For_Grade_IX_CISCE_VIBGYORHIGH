public class Program_18 {
    public static void main(String[] args) {
        int i = 100;
        int sum = 0;

        for (i = 100; i <= 998; i += 2) {
            sum = sum + i;
        }

        System.out.println("Sum of all three-digit even natural numbers: " + sum);
    }
}
