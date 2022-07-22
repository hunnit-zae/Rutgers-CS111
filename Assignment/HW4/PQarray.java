public class PQarray
{
    public static void main(String[] args)
    {
        int[] a = new int[6];
        int[] b = new int[a.length];

        b = a;

        for (int i = 1; i < b.length; ++i)
            b[i] = i;

        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i] + " ");
        System.out.println();

        for (int i = 0; i < b.length; ++i)
            System.out.print(b[i] + " ");
        System.out.println();

        a[3] = 0;  /* array는 a를 따라서 간다 각 array가 맞는지 확인잘하기 */

        System.out.println("*********************");

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println();

        System.out.println(a + "  " + b);

              
                
    }
}