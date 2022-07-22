public class cccc {


    
    //     int[] numbers = new int[args.length];
    //     for (int i = 0; i < args.length; i++) {
    //     numbers[i] = Integer.parseInt(args[i]);
    //     }
    // int sum = 0;
    // double ave = 0;
    // int count = 0;

    // for( int i = 0; i < numbers.length; i++){
    //     if( numbers[i] == 999){
    //         break;
    //     }
    //     else {
    //         if (numbers[i] > 0) {
    //             sum += numbers[i];
    //             count++;
    //         }
    //     }
    // }
    // ave = (double)sum/(double)count;
    // StdOut.println(sum + " " + ave)
   
    // public static int endsInFive(int[][] array, int column){
    //     int count = 0;

    // for ( row = 0; row<array.length; row++){
    //    if( column < array[row].length){
    //      if( array[row][column] % 10 == 5){
    //        count ++;
    //        }
    //      }
    //    }


    // }

        class WordWrapper{
            String str;
            /* constructor to initialize the String str with the input */
            WordWrapper(String input){
                str=input;
            }
            
            /* Converts the string of type "cat" to "CATcatCAT" */
            String sandwich(){
                String newSandStr=""; // make new string
                
                // first append all the capital letters
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                        newSandStr=newSandStr+(char)((str.charAt(i)-32));
                    } else {
                         newSandStr=newSandStr+str.charAt(i);
                    }
                }
                // append all the small letters
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                        newSandStr=newSandStr+(char)((str.charAt(i)+32));
                    } else {
                         newSandStr=newSandStr+str.charAt(i);
                    }
                }
                // lastly, append all the capital letters
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                        newSandStr=newSandStr+(char)((str.charAt(i)-32));
                    } else {
                         newSandStr=newSandStr+str.charAt(i);
                    }
                }
                return newSandStr;
            }
            
            /* return true if the string instance is palindrome
               otherwise false */
            boolean isPal(){
                for(int i=0;i<str.length()/2;i++){
                    if(str.charAt(i)!=str.charAt(str.length()-1-i)) return false;
                }
                return true;
            }
            
            /* tostring() method which will convert the string 
            and concatination of its length */
            String tostring(){
                return str+str.length();
            }
        }
        
        public class Main
        {
                public static void main (String[] args) throws java.lang.Exception
                {
                    // you can take this as input from the user as well
                        WordWrapper obj = new WordWrapper("dog");
                        System.out.println(obj.tostring());
                        System.out.println(obj.sandwich());
                        System.out.println(obj.isPal());
                }
        }
  }
