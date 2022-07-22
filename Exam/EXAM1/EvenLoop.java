public class EvenLoop 
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int x = 2;

        for (int i = 0; i <= n*x; i+=x)
        {
            System.out.println("***" + i);
        
            System.out.println(x + " " + i);
        }
    }

}
