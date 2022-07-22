public class Sum
{
   public static double mysum(double[ ] x) 
   {
      double accum = 0.0;
      for (int i=0; i < x.length; i++) accum += x[i];
      return accum;
   }

   public static void main(String[] args) 
   {
      double[] a = new double[args.length];

      for (int i = 0; i < args.length; i++)
         a[i] = Double.parseDouble(args[i]);

      //for (int i = 0; i < a.length; i++)
      StdOut.println(mysum(a));

      // mysum(a);
   }
}