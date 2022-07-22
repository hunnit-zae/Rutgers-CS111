public class Hint 
{
    public static void main(String[] args)
    {

        //Hints and tips
        //How do I pick Apart a number?
        int a = Integer.parseInt(args[0]);

        //grab the last digit
        int b = a % 10;
        int c = a / 10;
        System.out.println(a + " " + b + " " + c);
    }
}
