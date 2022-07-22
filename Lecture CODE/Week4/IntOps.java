public class IntOps
{
   public static void main(String[] args)
   {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);

      int sum  = a + b;
      int prod = a * b;

      System.out.println(a + " + " + b + " = " + sum);
      System.out.println(a + " * " + b + " = " + prod);
      if (b != 0)
      {
         System.out.println(a + " / " + b + " = " + a / b); 
      }
      else 
      {
         System.out.println("No Div by Zero"); 
      }
            
      //System.out.println(a + " % " + b + " = " + a % b);
      
   }
}