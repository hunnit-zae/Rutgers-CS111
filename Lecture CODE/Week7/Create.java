public class Create
{
   public static double[] create(int n) 
   {
      double[] a = new double[n];
      for (int i=0; i < a.length; i++)
         a[i] = i;
      return a;
   }

   public static void main(String[] args) 
   {
      int n = Integer.parseInt(args[0]);

      double[] a = create(n);
   
      for (int i = 0; i < a.length; i++)
         StdOut.println(a[i]);
   }
}