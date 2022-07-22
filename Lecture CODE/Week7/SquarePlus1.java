public class SquarePlus1
{
   public static double sqrtp1(double c) 
   {
      // A function that takes the square root of a number and adds 1 to it
      if (c < 0) return Double.NaN;
      return (Math.sqrt(c) + 1);
   }
   
   public static void main(String[] args) 
   {
      // declare and create an array of doubles the size of the list of arguments at command line
      double[] a = new double[args.length];

      // Initialize the double array w the command line arguments as doubles taken from args[]
      for (int i = 0; i < args.length; i++)
         a[i] = Double.parseDouble(args[i]);

      // Print out the Squares plus One with the function sqrtp1()
      for (int i = 0; i < a.length; i++)
         StdOut.println(sqrtp1(a[i]));

   }
}