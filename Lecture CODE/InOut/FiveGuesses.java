public class FiveGuesses {

    public static void main(String[] args){

        // Refirect stadard output to a file when executing a program
        //java FiveGuesses > guesses.txt

        //redirect from a file to stadard when executing a program
        // java FiveGuesses < uesrGuesses.txt
    

        //Generate a number between 1 and 1000000
        int secret = 1 + (int)(Math.random() * 100); // 0.999 - 99999.9

        //The user has 5 tries to guess the correct number
        StdOut.println("I am thingking of a number between 1 and 1000000 ");

        int tries = 0; // used to store the number if tries that user has already guessed
        int guess = 0; // used to store the user's guess

        while ( tries < 5)
        {
            StdOut.print("What is your guess? ");
            guess = StdIn.readInt();
            tries += 1;

            if (guess == secret)
            {
                StdOut.println("You win");
                break; //exit the loop
            }
            else if ( guess < secret)
            {
                StdOut.println("Too low");
            }
            else
            {
                StdOut.println("Too high");
            }
        }
        System.out.println("User tries " + tries + " times");
        System.out.println("The number is " + secret );
    } 
}
