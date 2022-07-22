public class Triangle
{
  public static void main(String[] args)
  {
  double average = 0.0;
  int count = 0;

  for ( int i = 0; i < args.length; i++)
  {
    average = average + Double.parseDouble(args[0]);
    count++;
  }
  System.out.println("display an average of " + (average/count));
  }
}