public class SimpleStrings
{
    public static void main(String[] args)
    {
    // We have already been using them... 
    StdOut.println(args[0]);
    
    // Strings as objects
    String s = new String("Hello World!");

    // Use some String methods
    StdOut.println(s.substring(0,5) + " <-- a substring of the string " + s);
    
    // length is a method with Strings - It is an instance variable with arrays
    StdOut.println("The length of the string is " + s.length()); 
    
    // Wrappers
    int solution = 5 + Integer.parseInt(args[0]); 
    StdOut.println(solution);
    
    // Integer as a constructor is deprecated!
    Integer intobj = Integer.valueOf(4);
    StdOut.println(intobj);

    }
}