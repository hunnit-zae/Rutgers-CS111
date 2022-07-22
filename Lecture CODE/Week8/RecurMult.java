public class RecurMult
{
    public static int MyMult(int op1, int op2)
    {
        if (op2 == 1) return op1;
        else return (op1 * MyMult(op1, (op2-1)));
    }

    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Use recursive multiplication
        StdOut.println(MyMult(a,b));
    }
}