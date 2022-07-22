public class Binary
{
// Recursive solution - R for Recursion
    public static String Rconvert(int N)
   {
      StdOut.println((N%2)); 
      if (N == 1) return "1";
      return Rconvert(N/2) + (N % 2);
      
   }

// Fixed Iterative Solution - I for Iterative
   public static String Iconvert(int N)
{
     String outString = ""; 
     for (int i = N; i > 0; i = i/2) {
            outString = i%2 + outString;
            StdOut.println(i + "  " + i%2);
      }
     return outString;
}

/* // Iterative Solution from slides - B for Bad
public static String Bconvert(int N)
{
     String outString = ""; 
     for (int i= 0; i < N; i++) {
            outString += N%2;
            N = N/2;
     }
     return outString;
} */


   public static void main(String[] args)
   {
      int N = Integer.parseInt(args[0]);
      StdOut.println(Rconvert(N));
      StdOut.println(Iconvert(N));
   }
}