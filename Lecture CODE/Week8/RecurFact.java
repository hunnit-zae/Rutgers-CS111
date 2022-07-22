public class RecurFact
{
    public static long Fact(int a)
    {
        if (a == 1) return 1;
        else return (Fact(a-1) * a);
    }

    public static void main(String[] args)
    {
        int num = Integer.parseInt(args[0]);
        StdOut.println(Fact(num));
    }
}