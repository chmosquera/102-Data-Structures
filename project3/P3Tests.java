/**
 * A simple JUnit test class to test the Project 3 Maze Game.
 *
 * @author Julie Workman
 * @version 4/25/2016 (Written to JUnit-4.12)
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
import java.awt.event.KeyEvent;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class P3Tests
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
   
   /* ------------------------------ Basic Maze Tests ---------------------------*/
   
   /* Maze test */
   @Test (timeout = 5000)
   public void mazeTest()
   {
      Square[][] mazeSquares = new Square[5][5];
      Maze maze;
      Explorer ex;
      
      /*     -------------
       *     |       |   |
       *     |       |   |
       *     -----   -   |
       *     |   |       |
       *     |   |       |
       *     |   -   -   |
       *     |       |   |
       *     |       |   |
       *     -------------
       */
    
      mazeSquares[0][0] = new Square(true, false, true, true, 0, 0);
      mazeSquares[0][1] = new Square(true, true, false, false, 0, 1);
      mazeSquares[0][2] = new Square(true, true, false, true, 0, 2);
      mazeSquares[1][0] = new Square(true, true, false, true, 1, 0);
      mazeSquares[1][1] = new Square(false, false, false, true, 1, 1);
      mazeSquares[1][2] = new Square(false, true, false, false, 1, 2);
      mazeSquares[2][0] = new Square(false, false, true, true, 2, 0);
      mazeSquares[2][1] = new Square(false, true, true, false, 2, 1);
      mazeSquares[2][2] = new Square(false, true, true, true, 2, 2);
      
      maze = new Maze(mazeSquares, 3, 3);
      ex = new Explorer(mazeSquares[0][0], maze, "Super Chris");
      
      assertEquals(mazeSquares[0][0], ex.location());
      assertEquals("Super Chris", ex.name());
      assertTrue(mazeSquares[0][0].inView());
      assertTrue(mazeSquares[0][1].inView());
      assertFalse(mazeSquares[0][2].inView());
      assertFalse(mazeSquares[1][0].inView());
      assertTrue(mazeSquares[1][1].inView());
      assertFalse(mazeSquares[1][2].inView());
      assertFalse(mazeSquares[2][0].inView());
      assertFalse(mazeSquares[2][1].inView());
      assertFalse(mazeSquares[2][2].inView());
   }

   /* ------------------------------ Basic Square Tests ---------------------------*/

   /* Square test */
   @Test (timeout = 5000)
   public void squareTest()
   {/*  _0__1__
       |sq1|sq2|
      0|___|___|
       |sq3|sq4|
      1|___|___| */

      // Constructors
      Square sq1 = new Square(true, false, false, true, 0, 0); 
      Square sq2 = new Square(true, true, false, false, 0, 1);
      Square sq3 = new Square(false, false, true, true, 1, 0);
      Square sq4 = new Square(false, true, true, false, 1, 1);

      // initialize maze (to help test Square)
      Square[][] mazeSquares = new Square[2][2];
      Maze maze = new Maze(mazeSquares, 2, 2);

      mazeSquares[0][0] = sq1;
      mazeSquares[0][1] = sq2;
      mazeSquares[1][0] = sq3;
      mazeSquares[1][1] = sq4;

      // .wall() -> boolean
      assertTrue(sq1.wall(0));
      assertFalse(sq1.wall(1));
      assertFalse(sq1.wall(2));
      assertTrue(sq1.wall(3));

      // .row() -> int
      assertEquals(0, sq1.row());
      assertEquals(0, sq2.row());
      assertEquals(1, sq3.row());
      assertEquals(1, sq4.row());

      // .col() -> int
      assertEquals(0, sq1.col());
      assertEquals(1, sq2.col());
      assertEquals(0, sq3.col());
      assertEquals(1, sq4.col());

      // .x() -> int
      assertEquals(0, sq1.x());
      assertEquals(50, sq2.x());
      assertEquals(0, sq3.x());
      assertEquals(50, sq4.x());

      // .y() -> int
      assertEquals(0, sq1.y());
      assertEquals(0, sq2.y());
      assertEquals(50, sq3.y());
      assertEquals(50, sq4.y());

      // .setInView(boolean inView) -> void
      // .seen() -> boolean
      // .inView() -> boolean
      assertEquals(false, sq1.seen());
      assertEquals(false, sq1.inView());
      sq1.setInView(true); 
      assertEquals(true, sq1.seen());
      assertEquals(true, sq1.inView());

      // .setTreasure(Treasure t) -> void
      // .treasure() -> Treasure
      assertEquals(null, sq1.treasure());
      Treasure t = new Treasure(maze);
      sq1.setTreasure(t); //*
      assertEquals(t, sq1.treasure());

      // .enter() -> void
      assertFalse(t.found());
      sq1.enter(); //*
      assertTrue(t.found());
   }

   /* ------------------------------ Basic Occupant Tests ---------------------------

   /* Occupant test 
   @Test (timeout = 5000)
   public void occupantTest()
   {
      Square sq1 = new Square(true, true, false, false, 0, 0);
      Square sq2 = new Square(true, true, false, false, 1, 0);

      Occupant oc1 = new Occupant(sq1);

      // .location() -> Square
      // .moveTo() -> void
      assertEquals(sq1, oc1.location());
      oc1.moveTo(sq2);
      assertEquals(sq2, oc1.location());
      
      
   }

   /* ------------------------------ Basic Explorer Tests ---------------------------*/

   /* Explorer test */
   @Test (timeout = 5000)
   public void explorerTest()
   {/* _0__1__
       |sq1|sq2|
      0|___|___|
       |sq3|sq4|
      1|___|___| */

      Square[][] mazeSquares = new Square[5][5];
      mazeSquares[0][0] = new Square(true, false, true, true, 0, 0);
      mazeSquares[0][1] = new Square(true, true, false, false, 0, 1);
      mazeSquares[1][0] = new Square(true, true, false, true, 1, 0);
      mazeSquares[1][1] = new Square(false, false, false, true, 1, 1);
      
      Maze maze = new Maze(mazeSquares, 2, 2);

      // Constructor
      Explorer e1 = new Explorer(mazeSquares[0][0], maze, "Yogurt");

      // .name() -> String
      assertEquals( "Yogurt", e1.name());
      
      // .move(int key) -> void 
      assertEquals(224, KeyEvent.VK_KP_UP);
      assertEquals(227, KeyEvent.VK_KP_RIGHT);
      assertEquals(225, KeyEvent.VK_KP_DOWN);
      assertEquals(226, KeyEvent.VK_KP_LEFT);
      assertEquals(38, KeyEvent.VK_UP);
      assertEquals(39, KeyEvent.VK_RIGHT);
      assertEquals(40, KeyEvent.VK_DOWN);
      assertEquals(37, KeyEvent.VK_LEFT);
      
      
   }

}
