public class IterativeReadIntoArray {
 
    public static void main(String[] args){

        int [] intArray = StdIn.readAllInts();

        System.out.println("All values are read");
        for (int i = 0; i < intArray.length; i++)
        {
            System.out.println(i + " - " + intArray[i]);
        }
    }
}
