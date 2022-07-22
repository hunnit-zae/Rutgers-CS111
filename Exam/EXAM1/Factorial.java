public class Factorial
{
    public static void main(String args[])
    {
    // Program to compute the factorial of an integer

    int n = Integer.parseInt(args[0]);
    int result = 1;

    while (n > 1)
    {
        result = result * n;
        n = n - 1;
    }

    // display results
    System.out.println(result);

    }
}