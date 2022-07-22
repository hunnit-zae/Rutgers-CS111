public class LoopTests
{
    public static void main(String[] args)
    {
        /*
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int max = 0;

        
        if (a>c)
        {
            if (a>b)
             max = a;
            else
             max =b;
        }
        else
        {
            if (c>b)
             max = c;
            else
             max = b;
        }
    
        System.out.println(max);
    */


    int n = Integer.parseInt(args[0]);
    
    int a = 1;
    while (a <= n)
    {  
        if (a %3 ==0)
        {  
            System.out.println(" : " + a);
        }
        a +=1;
    }

    }
}