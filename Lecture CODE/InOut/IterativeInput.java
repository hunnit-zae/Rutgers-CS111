public class IterativeInput {
    
    public static void main(String[] args){

        // 1. read n integers from stadard input

        /*int n = Integer.parseInt((args[0]));
        while ( n > 0)
        {
            System.out.print("Enter an Integer : ");
            int number = StdIn.readInt(); // read an integer fron the stadard input
            System.out.println("The user enterd " + number);
            n -=1;
        }
        */

        // 2. rad as many doubls as the user desires using StdIn.isEmpty
        
        /*System.out.println("Reading Doubles");
        int count = 0;

        while ( !StdIn.isEmpty() )
        {
            double value = StdIn.readDouble();
            count += 1;
            System.out.println(value + "Count =" + count);
        }
        System.out.println("User enterd " + count + "doubles.");
        */
       
        // 3. read one boolean
        /*System.out.print("Please, enter a boolean: ");
        boolean boolvalue = StdIn.readBoolean();
        System.out.println("The User enterd  " + boolvalue);
        */

        // 4. read ine string
        System.out.print("Please, enter a string : ");
        String sValue = StdIn.readString();
        System.out.println("The user eneterd : " + sValue);
    }
}
