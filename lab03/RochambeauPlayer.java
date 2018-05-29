/**
 * Necessities for the game rochambeau
 *
 * @author Chanelle Mosquera
 * @version Lab 03
 * @version CPE102-15
 * @version Spring 2016
 */

import java.util.Random;

public class RochambeauPlayer
{
   // Instance Variables
   private String name;
   private int seed;
   private int getWins = 0;
   private int curThrow = 10;
   //private boolean throwMade = false;
   private Random num;

   // Constructors
   public RochambeauPlayer(String name)
   {
      this.name = name;
      num = new Random();
   }

   public RochambeauPlayer(String name, int seed)
   {
      this.name = name;
      this.seed = seed;
      num = new Random(seed);
   }

   // Methods
   public String getName() {return name;}

   public int getWins() {return getWins;}

   public String lastThrow() 
   {
      if (curThrow == 0) {return "Rock";}
      if (curThrow == 1) {return "Paper";}
      if (curThrow == 2) {return "Scissors";}
      else {return "No Throw";}
   }

   public String toString()
   {
      return (name + " has " + getWins() + " wins.");
   }

   public void incrementWins()
   {
      getWins += 1;
   }

   public int makeThrow()
   {
      curThrow = num.nextInt(3);
      return curThrow;

   }


   public int makeThrow(int throwType) 
   {
      curThrow = throwType;
      return throwType;
   }
   
}
