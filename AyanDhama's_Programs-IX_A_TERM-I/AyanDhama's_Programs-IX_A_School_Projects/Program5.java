public class Program5
{
    public static void result(int r, int m1, int m2, int m3)
    {
        int totalMarks = m1 + m2 + m3;
        double percentage = totalMarks / 3.0;
        
        System.out.println("Student Result");
        System.out.println(" - - - - - - - - - ");
        System.out.println("Roll Number : " + r);
        System.out.println("Marks in Subject 1 : " + m1);
        System.out.println("Marks in Subject 2 : " + m2);
        System.out.println("Marks in Subject 3 : " + m3);
        System.out.println("Total marks : " + totalMarks);
        System.out.println("Percentage : " + percentage);
    }
}