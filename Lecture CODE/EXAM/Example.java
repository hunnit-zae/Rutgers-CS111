import javax.sound.sampled.SourceDataLine;

public class Example{
    public static void main(String[] args){
        
    int foo(int a, int b){
        if(a<b)
         return 0;
        else
         return 1 + foo(a-b, b);
    }

    StdOut.println(foo);
}