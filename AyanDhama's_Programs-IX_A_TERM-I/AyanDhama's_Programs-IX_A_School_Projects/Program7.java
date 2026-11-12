public class Program7
{
    public static void swap(int n1, int n2)
    {
        System.out.println("Before swapping : ");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("After swapping : ");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
    }
}