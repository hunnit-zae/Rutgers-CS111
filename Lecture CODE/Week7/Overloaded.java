public class Overloaded
{
    
    public static void f(double a, int b) {StdOut.println("f(double, int)");}

    public static void f(int a, double b) {StdOut.println("f(int, double)");}

    public static void f(double a, double b) {StdOut.println("f(double, double)");}
    
    public static void f(int a, int b) {StdOut.println("f(int, int)");}

    public static void main(String[] args)
    {
        f(1.0, 3);
        
        f(3.0, 1.0);

        f(1, 3.0);

        f(12, 3);  // Overloaded.java:15: error: reference to f is ambiguous

    }
}