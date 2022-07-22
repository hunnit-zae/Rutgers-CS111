import jdk.internal.jshell.tool.StopDetectingInputStream;

public class IterativeInput {
    
    public static void main(String[] args){

        // 1. read n integers from stadard input

        int n = Integer.parseInt((args[0]));
        while ( n > 0)
        {
            System.out.println("Enter an Integer : ");
            int number = StdIn.readInt(); // read an integer fron the stadard input
            System.out.println("The user enterd " + number);
            n -=1;
        }

        // 2. rad as many doubls as the user desires using StdIn.isEmpty
    }
}
