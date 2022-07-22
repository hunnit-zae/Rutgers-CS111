public class IterativeInputLine{

    public static void main(String[] args){

        while (StdIn.hasNextLine() ) // Ctrl + c is stop loop
        {
            String line = StdIn.readLine();
            System.out.println("The user enetered : " + line);
        }
    }
}