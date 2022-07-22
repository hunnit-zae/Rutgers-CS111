public class StringCheck
{
    public static void main(String[] args)
    {
    // Check some equivalencies

    String a = new String("Hello");
    String b = new String("Hello");
    String c = b;

    StdOut.println((a==b));
    StdOut.println((b==c));

    StdOut.println(a.equals(b));

    }
}