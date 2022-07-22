public class GrabInput
{
    public static void main(String[] args)
    {
    // Grab some input from the command line and print it

    System.out.println("there are " + args.length + " items.");

    int temp = 0;
    for (int i = 0; i < args.length; i++)
    {
        System.out.print(args[i] + " ");
        temp = temp + Integer.parseInt(args[i]);        
    }

    System.out.println(temp);

    String w = "Lars";
    System.out.println(w);







    
    
    }
}
