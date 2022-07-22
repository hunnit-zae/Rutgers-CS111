public class Avaerage{
   public static void main(String[] args){
       
   int esum = 0;
   int count = 0;
   int limit = Integer.parseInt(args[0]);
   
   Stdout.println("Sum the Even Num");
   while ( count <= limit)
   {
       if ( count % 2 ==0)
       {
           esum = esum + count;
       }
   }
   Stdout.println("Sum the Even N" + limit + " " + esum);
   }
}