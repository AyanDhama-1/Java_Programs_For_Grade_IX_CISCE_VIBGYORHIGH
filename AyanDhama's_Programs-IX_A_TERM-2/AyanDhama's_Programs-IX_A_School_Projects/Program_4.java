public class Program_4
{
    public static void main(String[] args)
    {
        int product = 1;
        int i;
        for (i = 1; i <= 5; i++) 
        {
            product = product * i;
        }

        System.out.println("Product of first 5 natural numbers: " + product);
    }
}
