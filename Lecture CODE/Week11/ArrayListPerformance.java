import java.util.ArrayList;

public class ArrayListPerformance {

  public static void printList(ArrayList<Integer> aList) {
    System.out.println ( "Printing ArrayList" );
    for (int elt : aList) {
      System.out.print ( elt + " ");
    }
    System.out.println ( );
  }
  
  public static void printArray(int[] a, int num) {
    System.out.println ( "Printing Array" );
    for(int i = 0; i < num; i++) {
      System.out.print  ( a[i] + " " );
    }
    System.out.println (  );
  }
  
   public static boolean addToArray(int[] arr,int num, int s) {
     if (num < arr.length ) {
       arr[num] = s;
       return true;    
   }
     return false;
   }
   
   //add s to array a in position place if room and returns true; 
   // Otherwise, returns false
   public static boolean addToArr(int[] a, int num, int s, int place ) {
     if (num < a.length) {
       //shifting elements in array one place to the right
       // to make room for item to be added.
       for (int i = num; i >= place; i--) {
         a[i] = a[ i - 1];     
       }
       // adds item to correct position
       a[place] = s;
       return true;
     }
    return false; 
   }
   
   public static boolean removeFromArray(int[] a, int pos, int numInArr) {
     if(pos >= a.length) {
       return false;
     }
     for(int i = pos; i < numInArr - 1; i++) {
       a[i] = a[i + 1];
     }
     a[numInArr - 1] = 0;
     return true;
   }


  // ************************* Main Program ********************************************

  public static void main ( String[] args ) {

    // Test of Regualr Arrays
    Stopwatch timerA = new Stopwatch();

    int size = 150000000;

    // Declare an array of Integers (capacity 10)
    int[ ] arr = new int [ size ];

    // Declare a variable to keep track of the number of 
    //   items in the array    
    int numItems = 0;

    // Add 5 Strings to each data structure
    for (int i = 0; i < size; i++) {
      // add to array
      arr[i] = i;
      numItems++;
    }  

  // call method to print array elts
  //printArray(arr, numItems); 

  System.out.println ( "Adding 6 to end" );
  // call method to add "THOMAS" to the end of the array
  // if method returns true (item added) then increase numItems
  if (addToArray(arr, numItems, 6)) {
    numItems++;
  }
  // call method to print array elts 
  //printArray(arr, numItems);  
  System.out.println ( "Adding 7 to index 1" );

  // call method to add 7 to position 1 in the array
  // if there was room; if item added, increment numItems
  if (addToArr(arr, numItems, 7, 1)) {
    numItems++;
  }
  // call method to print array elts
  //printArray(arr, numItems);
    
  System.out.println ( "Removing from index 2" );
   // add method to remove item in index 2 of array 
  if (removeFromArray(arr,2, numItems)){
    numItems--;
  }
  //printArray(arr, numItems);
  StdOut.println("elapsed time = " + timerA.elapsedTime());
  
  

// ArrayList Performance

// Timer for ArrayList activity
// Test of Regualr Arrays
Stopwatch timerAL = new Stopwatch();

// Declare an ArrayList of String
ArrayList <Integer> list = new ArrayList <Integer>();

// add 5 to ArrayList 
for (int i = 0; i < size; i++)
  {
    list.add(i);
  }

// call method to print ArrayList elts
//printList(list);
//System.out.println (  );

// call method to add "THOMAS" to the end of the ArrayList
System.out.println ( "Adding 6 to end" );
list.add (6); //java.util.ArrayList provides this method

// call method to print ArrayList elts
//printList(list);
//System.out.println (  );

// call method to add 7 to position 1 in the ArrayList
System.out.println ( "Adding 7 to index 1" );
list.add ( 1, 7);

// call method to print ArrayList elts
//printList(list);
//System.out.println (  );

// call method to remove item in index 2 of ArrayList
System.out.println ( "Removing from index 2" );
list.remove(2);

//printList(list);

StdOut.println("elapsed time = " + timerAL.elapsedTime());

}

}

