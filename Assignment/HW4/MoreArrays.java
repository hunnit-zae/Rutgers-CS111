public class MoreArrays
{
    public static void main(String[] args)
    {
        /*
        double[] moreNumbers = {2.0, 3.0, 4.0, 5.5, 3.5};
        int n = Integer.parseInt(args[0]);
        System.out.println(moreNumbers[n]);
        */

        int a = Integer.parseInt(args[0]);

        int moreArray[];
        moreArray = new int[a];
        for (int  i = 0; i < a; i++) moreArray[i] = (i+1);

        //Regular print of array
        //for (int i = 0; i < n; i++) System.out.println(i + " " + moreArray[i]);

        //Print the array in reverse 
        //for (int i = (moreArray.length-1); i >= 0; i--) System.out.println(i + " " + moreArray[i]);

        //Actually reverse the array
        for (int i = 0; i < a; i++) System.out.println(moreArray[i] + " ");
        System.out.println("\n*****************");

        //Go into the loop and swap calues on the ends
        for (int i = 0; i < moreArray.length/2; i++)
        {
            int temp = moreArray[i];
            moreArray[i] = moreArray[moreArray.length-i-1];
            moreArray[moreArray.length-i-1] = temp;

        }

        //Using same print command print the newly reversed array
        for (int i = 0; i < a; i++) System.out.println(moreArray[i] + " "); 
    }

}