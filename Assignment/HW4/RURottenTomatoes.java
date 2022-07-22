/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		// WRITE YOUR CODE HERE
		int r = Integer.parseInt(args[0]);
		int c = Integer.parseInt(args[1]);
		int tomato [][] = new int [r][c];
		int index = 2;

		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c; j++)
			{
				tomato[i][j] = Integer.parseInt(args[index]);
				index++;
			}
		}

		int highest = 0;
		int result = 0;
		int total = 0;

		for (int i = 0; i < c; i++)
		{
			for (int j = 0; j < r; j++)
			{
				total += tomato[j][i];
			}
			if (total > highest)
			{
				highest = total;
				result = i;
			}
			total = 0;
		}
		System.out.println(result);
	}
}
