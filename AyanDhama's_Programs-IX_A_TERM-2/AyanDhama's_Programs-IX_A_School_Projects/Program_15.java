public class Program_15 {
    public static void main(String[] args) {
        int num = 1;
        double sq = 0;

        System.out.println("Squares of the first 5 numbers:");

        for (num = 1; num <= 5; num++) {
            if (num == 0) {
                System.out.println("Number is zero");
            } else {
                sq = num * num;
                System.out.println("Square of " + num + " = " + sq);
            }
        }
    }
}
