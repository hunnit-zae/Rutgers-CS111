public class Foreach
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);

        int moreArray[]; //declare
        moreArray = new int[n]; //create
        for (int i = 0; i < n; i++) moreArray[i] = ((i+3)*2); //initialize

        //Print the Array with a for loop
        for (int i = 0;  i < n; i++) System.out.println(i + " " + moreArray[i]);
        
        System.out.println("****");

        //For each loop
        for (int num : moreArray)
        {
            System.out.println(num);
        }
    }
}