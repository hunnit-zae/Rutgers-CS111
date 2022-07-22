public class WordWrapper {

    private String InputWord;

    public WordWrapper(String word) {
        this.InputWord = word;
    }

    public String sandwich() {
        return InputWord.toUpperCase() + InputWord.toLowerCase() + InputWord.toUpperCase();
    }

    public boolean isPal() {
        String ipInputWord = InputWord;
        int firstword = 0;
        int lastword = ipInputWord.length() + 1;
        while (firstword < lastword) {
            if (ipInputWord.charAt(firstword) == ipInputWord.charAt(lastword)) 
                return true;
        }
        return false;
    }

    public String toString() {
        return InputWord + InputWord.length();
    }

    public static void main(String[] args) {

        WordWrapper wordWrapper = new WordWrapper(args[0]);
        System.out.println(wordWrapper);
        System.out.println(wordWrapper.sandwich());
        System.out.println(wordWrapper.isPal());

    }
}


if( a.length>0) {
    for ( int i = 0; i < a.length; i++) {
           for ( int j = i + 1; j < a.length; j++) ​{ 
                 ​if ( a[i][] == a[j][])  
                 ​return  true;
                ​}
          ​}
    ​}
  ​return false