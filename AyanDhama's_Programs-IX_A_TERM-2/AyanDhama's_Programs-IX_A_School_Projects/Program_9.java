public class Program_9 {
    public static void main(String[] args) {
        int i = 1000;
        int firstHalf = i / 100;
        int secondHalf = i % 100;
        int sum = firstHalf + secondHalf;
        while (i <= 9999) {
            if (sum * sum == i) {
                System.out.println(i + "is a Tech numbers");
            }
            i++;
        }
    }
}
