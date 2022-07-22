public class test
{
    public static void main(String[] args)
    {
        int a = 1;
        double b = 1.0;

        int c[] = new int[5];
        int d[] = new int[5];
        
        for(int i = 0; i < 5; i++)
        {
            c[i] = (i+1);
        }
        d = c; //array d is going to array c 

        System.out.println(d + " " + c);
    }
}