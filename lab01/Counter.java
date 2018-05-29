/**
 * A simmple integer counter.
 *
 * @author Chanelle Mosquera
 * @version Lab 01
 * @version CPE102-15
 * @version Spring 2016
 */

public class Counter
{
   // instance variables
   private int count; //current count
   private int mCount; 
   int resetCount; // count before most recent reset
   boolean resetOccurred;

   /**
    * Default constructor: Create a new Counter, with the count
    * initialized to 0.
    */
   public Counter() 
   {
      count = 0; 
      mCount = 10;
   }

   // Similar to __init__ in Python
   public Counter(int mCount)
   {
      this.mCount = mCount;
   }

   /**
    * The number of items counted.
    */
   public int currentCount() {return count;}

   /**
    * Increment the count by 1.
    */
   public void incrementCount() 
   {
      if (count+1 == mCount)
         {
            count = 0;
         }
      else count += 1;
   }

   /**
    * Reset the count to 0.
    */
   public void reset() 
   {
      resetCount = currentCount();
      resetOccurred = true;
      count = 0;
   }

   /**
    * unReset restores count to the count before most recent reset
    */
   public void unReset() 
   {
      if (resetOccurred == true)
      {   
         count = resetCount;
      }
   }
  


}

