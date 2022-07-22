 // Generates and returns an even integer 
 // in the range of 0 to 98 inclusive.   

 public static int generateEven() { 

    //You need to write this code 
    int n = 0;
    int min = 0;
    int max = 98;
    for (int i = 0; i < 99; i++){
        n = (int)(Math.radom()*(max - min));
    }while (n % 2 != 0);
    return n;
 } 

// Generates and returns an odd integer 
// in the range of 1 to 99 inclusive.   

public static int generateOdd() { 

    //You need to write this code  
    int n = 0;
    int min = 1;
    int max = 99;
    for (int i = 0; i < 99; i++){
        n = (int)(Math.radom()*(max - min));
    }while (n % 2 == 0);
    return n; 

} 

  /* This method has two parameters: a String array, 
     players, containing the names of players and an 
     int array, theScores, containing the scores of 
     the players such that players[0] has score 
     theScores[0], players[1] has score 
     theScores[1], etc. 

     This method returns a String array containing the 
     winners of the tournament games for that round. 
     The array that is returned is half the 
     size of the parameter array. The tournament 
     pairings are consecutive array elements (i.e. 
     players[0] and players[1] play against each other; 
     players[2] and players[3] play against each other, 
     etc. 
   */ 

 public static String[] nextRound(int[] theScores, 
      String[] players) { 

    //You need to write this code 
    int allwinners;
    String winner [] = new String[ players / 2];

        for (int i = 0; i < winner.length; i++)
            for (int j = 0; i < winner.length; j += 2){
                if (scores[j] > socres[j+1])
                    winners[i] = players[j];
                else
                    winners[i] = players[j + 1];
            }
        return allwinner;
    }
} 