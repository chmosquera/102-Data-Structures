/**
 * A simple JUnit test class to test the Project 3.
 *
 * @author Chanelle Mosquera
 * @version 4/11/2016 (Written to JUnit-4.12)
 */

import static org.junit.Assert.*;
import org.junit.*;
import java.lang.reflect.*;
import org.junit.runners.MethodSorters;
import org.junit.rules.*;
import org.junit.runner.Description;
import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.util.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class my_P3Tests
{   
   @Rule
   public TestRule watcher = new TestWatcher() {
      protected void starting(Description description) {
         System.out.print("Starting: " + description.getMethodName() + "...");
      }
   };
   
   @Rule
   public Stopwatch sw = new Stopwatch() {
      protected void finished(long nanos, Description description) {
         System.out.println(" (" + runtime(TimeUnit.MILLISECONDS) + " ms)");
      }
      protected void succeeded(long nanos, Description description) {
         System.out.print("Passed");
      }
      protected void failed(long nanos, Throwable e, Description description) {
         System.out.print("Failed");
      }
   };

   /* ------------------------------ Square Tests ---------------------------*/
   @Test (timeout = 5000)
   public void SquareConstantsTest() //Tests public constants correct value
   {
      Square sq = new Square(false, false, false, false, 0, 0);

      assertEquals(50, sq.SQUARE_SIZE, .0000001);
   }

   @Test (timeout = 5000)
   public void SquareConstructorTest()
   {
      Square sq = new Square(false, false, true, false, 0, 0);

      assertFalse(sq.wall(0));
      assertFalse(sq.wall(1));
      assertTrue(sq.wall(2));
      assertFalse(sq.wall(3));
      assertEquals(0, sq.row());
      assertEquals(0, sq.col());
   }


   

}
/*---------EXAMPLE-------------------------
   @Test (timeout = 5000)
   public void circleConstructorTest()
   {
      Circle c = new Circle(3.2, new Point(0,0), Color.BLACK, false);
      
      assertEquals(3.2, c.getRadius(), .000001);
      assertEquals(new Point(0,0), c.getPosition());
      assertEquals(Color.BLACK, c.getColor());
      assertFalse(c.getFilled());
   }
   */
