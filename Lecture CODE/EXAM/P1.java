public class P1{
    public static void main(String [] args){
        int [] a = { 6, 12 ,4 ,7 ,1, 5, 2, 3};
        System.out.println(msteryA(a, 0));

        int [] b = {1, 3, 7, 5, 2, 13};
        System.out.println(msteryA(b, 0));

    }

    public static int msteryA ( int [] array, int n ){
       if ( n == array.length){
           return 0;
       }
       int value = msteryA(array, n+1);

       if ( array[n] % 2 ==0 ){
           return array[n] + value;
       } else{
           return value;
       }
    }
}