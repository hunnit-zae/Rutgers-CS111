/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author:
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {

        // WRITE YOUR CODE HERE
        int [] Numbers = new int[5];
        Numbers[0] = Integer.parseInt(args[0]);
        Numbers[1] = Integer.parseInt(args[1]);
        Numbers[2] = Integer.parseInt(args[2]);
        Numbers[3] = Integer.parseInt(args[3]);
        Numbers[4] = Integer.parseInt(args[4]);
        int max = Numbers[0];

        for(int i = 0; i < Numbers.length; i++)
        {
            if(Numbers[i] > max)
            max = Numbers[i];
        }
        System.out.println(max);
    }
}