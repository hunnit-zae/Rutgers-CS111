public class Average
{
   public static void main(String[] args)
   {
      double sum = 0.0;  // cumulative total
      int n = 0;         // number of values
      
      while (!StdIn.isEmpty()) 
      {
         double x = StdIn.readDouble();
         sum = sum + x;
         n++;
      }
      
      StdOut.println(sum / n); // Ctrl + z ^Z is way to calculate the while loop
      
      // windows ways to redirection txt file "cat numin.txt | java Average"
      // input the result of the program "cat numin.txt | java Average > numout.txt" then create numout.txt file include 
      // result of the average
   }
}
