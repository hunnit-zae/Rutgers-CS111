public class Timeit
{
    public static void main(String[] args)
    {
    // Start the clock!
    Stopwatch timerA = new Stopwatch();

    // Place activity to be timed here

    /*int a = Integer.parseInt(args[0]);
    for (int i = 0; i <= a; i++)
    {
        StdOut.println(" Number " + i);
    }*/
    
    // Stop the clock, print the elapsed time!
    StdOut.println("elapsed time = " + timerA.elapsedTime());

    }
}