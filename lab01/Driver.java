/**
 * Tester for Counter class
 *
 * @author Chanelle Mosquera
 * @version Lab 01
 * @version CPE102-15
 * @version Spring 2016
 */

public class Driver
{
   public static void main(String args[])
   {
      // Declare and test a Counter object...
      Counter ct = new Counter();

      /* some sample tests
      System.out.println("Initial count: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Incremented once: " + ct.currentCount());
      */

      /*/ more tests...
      System.out.println("Initial count: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Incremented once: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Incremented once: " + ct.currentCount());
      ct.unReset();
      System.out.println("Unreset: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Incremented once: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Incremented once: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Incremented once: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Incremented once: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Incremented once: " + ct.currentCount());
      ct.reset();
      System.out.println("Reset: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Incremented once: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Incremented once: " + ct.currentCount());
      ct.unReset();
      System.out.println("Unreset: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Incremented once: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Incremented once: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Incremented once: " + ct.currentCount());
      ct.incrementCount();
      System.out.println("Incremented once: " + ct.currentCount());
      */

      Counter c = new Counter(5);
          System.out.println("initial: " + c.currentCount());
      for (int i=0; i<7; i++)
     	  {
          c.incrementCount();
          System.out.println("Incremented once: " + c.currentCount());
          }
      c.reset();
      System.out.println("resetted: " + c.currentCount());
      c.unReset();
      System.out.println("unresetted: " + c.currentCount());
      
   } 
}
