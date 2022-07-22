public class euler6{

    public static int a(int n)
    {
        int a = 0;
        for (int i = 0; i <= n; i++)
        {
            a = (i*i) + a;
        }
        return a;
    }

    public static int b(int n)
    {
        int b = 0;
        for ( int i = 0; i <=10; i++)
        {
            b = i + b;
        }
        return b * b;
    }

    public static void main(String args[])
    {

        int c = 10;

        //sum of square
        System.out.println(a(c));

        //sqaure of the sum        
        System.out.println(b(c));

        //result sqaure of the sum - sum of square
        System.out.println(b(c) - a(c));
    }
}