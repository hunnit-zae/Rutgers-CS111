public class MthRpt
{
    public static void main(String[] args)
    {
        // print the math report

        // Take two Intgers from the command line
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Print header
        MthHF.MHeader();

        // Display their arithmetic relations
        StdOut.println(" Addition : " + (a+b));
        StdOut.println(" Subtraction : " + (a-b));
        StdOut.println(" Multiplication : " + (a*b));
        StdOut.println(" Integer Division : " + (a/b));
        StdOut.println(" Old School Division : " + ((double)(a))/(double)(b));
        StdOut.println(" Remainder Division : " + (a%b));

        // print footer
        MthHF.MFooter();
        
    }
}