public class ArrayCriteria
{
    public static void main(String[] args)
    {
        // Space to play with some arrays

    int n = Integer.parseInt(args[0]);
    int myArray[];
    myArray = new int[n];

    System.out.println(myArray.length);

    // initialize array 
    for (int i = 0; i < n; i++) 
       {
           myArray[i] = (i+1);
           System.out.println( i + " : " + myArray[i]);
       }
       
       System.out.println("************");

       // Print the even numbers
       for (int i = 0; i < n; ++i) 
       {
           if (myArray[i] % 2 == 0 ) 
           System.out.println( i + " : " + myArray[i]);
       }
     
    }
}
