import java.util.*;

public class PG_22
{
    public static void main(String args[])
    {
        String name;
        int marks;
        char grade;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input Student Name: ");
        name = sc.nextLine();

        System.out.print("Input Total Marks: ");
        marks = sc.nextInt();

        if(marks >= 0 && marks < 40)
            grade = 'D';
        else if(marks >= 40 && marks < 70)
            grade = 'C';
        else if(marks >= 70 && marks < 90)
            grade = 'B';
        else
            grade = 'A';

        System.out.println("-----------------------");
        System.out.println("Student Name = " + name);
        System.out.println("Total Marks = " + marks);
        System.out.println("Grade = " + grade);
    }
}