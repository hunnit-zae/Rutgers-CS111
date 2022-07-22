/*************************************************************************
 *  Compilation:  javac OrderCheck.java
 *  Execution:    java OrderCheck 5 10 15 2
 *
 *  @author:
 *
 *  Prints true if the four integer inputs are in strictly ascending
 *  or descending order, false otherwise
 *
 *  % java OrderCheck 5 10 15 2
 *  false
 *
 *  % java OrderCheck 15 11 9 4
 *  true
 *
 *************************************************************************/

public class OrderCheck {

    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
    int w = Integer.parseInt(args[0]);
    int x = Integer.parseInt(args[1]);
    int y = Integer.parseInt(args[2]);
    int z = Integer.parseInt(args[3]);

    boolean Ascending = (w>x) && (x>y) && (y>z);
    boolean Descending = (w<x) && (x<y) && (y<z);

    boolean TF = Ascending || Descending; //logical or
    
    System.out.println(TF);

    }
}
