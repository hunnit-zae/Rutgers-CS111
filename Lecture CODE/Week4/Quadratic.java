public class Quadratic
{
    public static void main(String[] args)
    {

        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);


        //Calculate roots of x*x + b*x + c
        double discriminat = b*b - 4.0*c;
        double d = Math.sqrt(discriminat);
        System.out.println(discriminat + " " + d);
        double root1 = (-b +d) / 2.0;
        double root2 = (-b -d) / 2.0;

        System.out.println(root1);
        System.out.println(root2);

    }
}