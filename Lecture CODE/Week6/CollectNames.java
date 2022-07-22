public class CollectNames
{
    public static void main(String[] args)
    {
        // collect some names from the user

        StdOut.println("Type the first name: ");
        String x = StdIn.readString();
        StdOut.println("Type the second names: ");
        String y = StdIn.readString();
        StdOut.println(x + " " + y); 

        StdOut.print("Type a boolean value: ");
        Boolean z = StdIn.readBoolean();
        StdOut.println(z);

    }
}