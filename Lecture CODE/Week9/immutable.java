public class immutable
{
    public static void main(String[] args)
    {
        /*/ declare an array and change a value
        int a[] = {12, 13, 14, 15, 16};
        StdOut.println(a[3]);
        // Now change a[3]
        a[3] = 51;
        StdOut.println(a[3]); */

        /*/ declare a string and "try" to change a value
        String s = new String("TESTSTRING");
        StdOut.println(s[3]);
        s[3] = "Z";
        StdOut.println(s[3]); */
        
        // declare a string and "try" to change a value
        String s = new String("TESTSTRING");
        StdOut.println(s.charAt(3));
        
        s.replace(s.charAt(3), 'Z');  
        //strings are not immutable. Can't change the string once you made it.
        
        //StdOut.println(s.charAt(3)); 
        
        /*/Save the result this time
        String s = new String("TESTSTRING");
        String b = s.replace('T', 'Z'); //All T's change Z's
        StdOut.println(s + "  " + b); */

        // Not really what I wanted... try this
        String newstring = s.substring(0,3) + 'Z' + s.substring(4);
        StdOut.println(newstring); 



    }
}