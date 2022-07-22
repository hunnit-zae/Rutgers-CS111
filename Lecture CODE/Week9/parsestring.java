public class parsestring
{
    public static void main(String[] args)
    {
        // use split to break up a String

        String s = new String(args[0]);
        String[] a = s.split(" ");
        StdOut.println(s + "  " + a[2]);

        for (int i = 0; i < a.length; i++) StdOut.println(a[i]);

    }
}