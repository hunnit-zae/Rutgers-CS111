public class IterativeInputCharacters{

    public static void main(String[] args){

        while (StdIn.hasNextChar() )
        {
            char c = StdIn.readChar();
            System.out.println("The character entered is " + c);
        }
    }
}