import javax.lang.model.util.ElementScanner14;

public class exam {

    public static void main(String[] args){
 
            /*
    int dividend = Integer.parseInt(args[0]);
    int divisor = Integer.parseInt(args[1]);

    if (divisor == 0)
    {
        System.out.println(" Divisor can't be Zero");
    }
    else
    {
        System.out.println("Result is " + (dividend/divisor));
    }
    */

    int x = Integer.parseInt(args[0]);

    if ( x > 100)
    {
        System.out.println("GT");
    }
    else if (x < 100)
    {
        System.out.println("LT");
    }
    else
    {
        System.out.println("EQ");
    }
    }
}
