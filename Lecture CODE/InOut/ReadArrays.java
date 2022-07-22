public class ReadArrays
{
    public static void main(String[] args)
    {
    // read data into an array for integers
    // Can use for 
    
    int[] intArray = StdIn.readAllInts();

    for (int i = 0; i < intArray.length; i++)
    {
        StdOut.println(intArray[i]);
    }
    StdOut.println("The fourth item was " + intArray[3]);
    }
}