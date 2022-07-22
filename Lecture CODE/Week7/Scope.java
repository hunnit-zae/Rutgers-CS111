public class Scope
{
    public static int showScope(int x)
    {
        int y = 100;
        int z = x * y;
        x++;
        StdOut.println(x + " " + y + " " + z);
        // StdOut.println(a + " " + b);
        return(z);
    }

    public static void main(String[] args)
    {
        int a = 12;
        int b = 7;
        int c = showScope(a);
        StdOut.println(a + " " + b + " " + c);
        // StdOut.println(x + " " + y + " " + z);
    }
}