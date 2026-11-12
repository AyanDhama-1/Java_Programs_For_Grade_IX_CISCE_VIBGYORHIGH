import java.util.Scanner;

public class Program_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees:");
        int n = sc.nextInt();

        double totalSalary = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter salary :");
            double salary = sc.nextDouble();
            System.out.printf("salary = %.2f\n", salary);
            totalSalary += salary;
        }

        System.out.printf("The total salary of all the employees = %.2f\n", totalSalary);

       
    }
}
