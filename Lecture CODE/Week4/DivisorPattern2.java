public class DivisorPattern2
{
      public static void main(String[] args)
      {
      // Divisior pattern program
      int n = Integer.parseInt(args[0]);

      for (int i = 1; i <= n; i++)
        {
          for (int j = 1; j <= n; j++)
          {              
            System.out.print("* ");              
          }
          System.out.println(i);
        }

      }
}