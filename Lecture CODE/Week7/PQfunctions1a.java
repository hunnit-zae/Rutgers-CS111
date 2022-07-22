public class PQfunctions1a
{
   public static int cube(int x)
   {
       x = x * x * x;
       return x;
   }
   public static void main(String[] args)
   {
      int N = Integer.parseInt(args[0]);

      for (int i = 1; i <= N; i++)
         StdOut.println(i + " " + cube(i));
   }
}