public class TwoD
{
    public static void main(String[] args)
    {
    //Work with 2-diemsional arrays
    
    double a[][] = new double [5][5];
    System.out.println(a[3][4]);

    int b[][] = {{ 1, 2, 3, 4, 5},
                 { 6, 7, 8, 9, 10},
                 { 11, 12, 13, 14, 15},
                 {16, 17, 18, 19, 20},
                 {21, 22, 23, 24, 25}};
                 // �̰ŵ� [0][0] �����̴�
    
    System.out.println(b);
    System.out.println(b[3][3]);
    System.out.println(b[3].length);
    System.out.println(b[3]);

    for (int i = 0; i < b.length; i++)
    {
        for (int j = 0; j < b[i].length; j++)
        {
            System.out.print(b[i][j] + "*"); //ln�� �Ⱦ��� ���η� ����� �����ϴ� 
        }
        System.out.println();
    }

    }
}