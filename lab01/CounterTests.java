/**
 * A sample JUnit test class to test the Lab 01 Counter.java class
 * Note: This class is incomplete!  Your code will be tested
 *       with much more rigorous tests. 
 *
 * @author Paul Hatalsky
 * @version 3/31/2016 (Written to JUnit-4.12)
 */

import static org.junit.Assert.*;
import org.junit.*;

public class CounterTests
{   
   /* Simple increment test */
   @Test public void incrementTest()
   {
      Counter c = new Counter();

      for (int i=0; i<7; i++)
         c.incrementCount();
      
      assertEquals(7, c.currentCount());
   }   
   
   /* Simple reset test */
   @Test public void resetTest()
   {
      Counter c = new Counter();

      for (int i=0; i<7; i++)
         c.incrementCount();
      
      assertEquals(7, c.currentCount());
      
      c.reset();
      assertEquals(0, c.currentCount());
   }
   
   /* Simple unReset test */
   @Test public void unResetTest()
   {
      Counter c = new Counter();

      for (int i=0; i<7; i++)
         c.incrementCount();
      
      assertEquals(7, c.currentCount());
      
      c.reset();
      assertEquals(0, c.currentCount());
      
      c.unReset();
      assertEquals(7, c.currentCount());
   }
   @Test public void createModulusCounter()
   {
      Counter c = new Counter(5);

      for (int i=0; i<7; i++)
         c.incrementCount();
      
      assertEquals(2, c.currentCount());
   }
}
