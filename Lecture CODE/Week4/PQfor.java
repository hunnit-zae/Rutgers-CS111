public class PQfor
{
   public static void main(String[] args)
   {
      int f = 0;
      int g = 1;

      for (int i = 0; i <= 10; i++) 
            //컨디션 계속 loop로 이어지는 명령문 
            //for loop는 앞에 ++ 하든 뒤에 ++ 하든 상관없다
            // i = i + 1 도 상관없음
         {          
         System.out.println(f  + " " +  g + " " + i);
         f = f + g;
         g = f - g;
         }
   }
} 