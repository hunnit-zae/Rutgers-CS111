/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author:
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

	// WRITE YOUR CODE HERE    
    int walktime = Integer.parseInt(args[0]); 
    int x = 0;
    int y = 0;
    int newx = x;
    int newy = y;
    int count = 0;
    int randomwalk = 0;
    double distance = 0;

    System.out.println("(" + x + " , " + y + ")");

    while(count < walktime)
        {
            randomwalk = (int)(Math.random()*4+1);

            if (randomwalk == 1)//North
                newx += 1;
            else if (randomwalk == 2)//South
                newx -= 1;
            else if (randomwalk == 3)//East
                newy += 1;
            else
                newy -= 1;
        System.out.println("(" + newx + " , " + newy + ")");
        count ++;
        }

        distance = ((newx-x)*(newx-x) + (newy-y)*(newy-y));
        System.out.println("Squared distance = "+ distance);
    }
}