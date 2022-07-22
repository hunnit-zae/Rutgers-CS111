public class SelectionSort{

    public static void selection(int [] a){
        int n = a.length;
        for (int i = 0; i < n; i++){
            int minPos = i;
            for ( int j = i+1; j < n; j++){
                if (a[j] < a[minPos]){
                    minPos = j;
                }
            }
            int temp = a[i];
            a[i] = a[minPos];
            a[minPos] = a[temp]
            printArray(a);
        }
    }

    private static void printArray(int[] a) {
    }
}