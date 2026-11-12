public class Program_6 {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        System.out.println("First 5 natural numbers:");
        for (i = 1; i <= 5; i++) {
            System.out.print(i + "+");
            sum = sum + i;
        }

        System.out.println("\n The sum of first five natural numbers is : " + sum);
    }
}
