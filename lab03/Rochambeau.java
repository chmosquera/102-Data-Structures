/**
 * Rochambeau game
 *
 * @author Chanelle Mosquera
 * @version Lab 03
 * @version CPE102-15
 * @version Spring 2016
 */

//import java.lang.Rochambeau;

public class Rochambeau
{
   public static final int ROCK = 0;

   public static final int PAPER = 1;
  
   public static final int SCISSORS = 2;
 
   public static int getWinner(int throw1, int throw2)
   {
      int value; 
     
      if ((throw1 == ROCK && throw2 == SCISSORS) || 
          (throw1 == SCISSORS && throw2 == PAPER) || 
          (throw1 == PAPER && throw2 == ROCK))
          {
             return 1;
          }
      if ((throw2 == ROCK && throw1 == SCISSORS) || 
               (throw2 == SCISSORS && throw1 == PAPER) || 
               (throw2 == PAPER && throw1 == ROCK))
          {
             return -1;
          }
      else return 0;
    
   }


}


