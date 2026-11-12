public class Program6
{
    public static void main(int n1, int n2)
    {
        System.out.println("Before swapping : ");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        int t = n1;
        n1 = n2;
        n2 = t;

        System.out.println("After swapping : ");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
    }
}