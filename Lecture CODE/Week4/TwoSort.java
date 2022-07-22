public class TwoSort
{ 
   public static void main(String[] args)
   {  
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      if (b < a)
      { 
         System.out.println("Swap Needed");
         int t = a;
         a = b;
         b = t;
      }
      else
      {
        System.out.println("Swap Not Needed");
      }

      System.out.println(a);
      System.out.println(b);
   }
}
