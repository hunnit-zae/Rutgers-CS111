public class Facts
{
   public static void main(String[] args)
   {
      long n = Long.parseLong(args[0]);
      for ( int i = 1; i >= 0; i++)
      {  
         while (n % i == 0)
         {  
            int num = i;
            System.out.print(num + " ");
            n = n / i; 
         }
           //System.out.print(i);
           //System.out.print(num);
      }

      if (n > 1) System.out.println(n);
      else       System.out.println();

      //System.out.print(i);
      
    }
    
}